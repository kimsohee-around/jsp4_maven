package day4.mybatis.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import day4.mybatis.dto.BuyDto;
import day4.mybatis.dto.CustomerDto;
import mybatis.SqlSessionBean;

public class MybatisCustomerDao {

	private SqlSessionFactory sessionFactory = SqlSessionBean.getSessionFactory();
	
	public MybatisCustomerDao() {
		//테스트 db 연결 : 나중에는 지웁니다.
		//SqlSession sqlSession = sessionFactory.openSession();
		//System.out.println("db 연결 및 sql 실행 객체 : " + sqlSession);
	}
	
	public List<CustomerDto> selectAll(){
		SqlSession sqlSession = sessionFactory.openSession();
		List<CustomerDto> list = sqlSession.selectList("tblcustomer.selectAll");
		sqlSession.close();
		return list;
	}
	
	//마이바티스는 auto commit 이 아닙니다.
	public int insert(CustomerDto vo) {
		SqlSession sqlSession = sessionFactory.openSession();
		
		int result = sqlSession.insert("tblcustomer.insert",vo);
		sqlSession.commit();
		sqlSession.close();
		return result;
	}
	
	public int update(CustomerDto dto) {
		SqlSession sqlSession = sessionFactory.openSession();
		int result = sqlSession.update("tblcustomer.update",dto);
		sqlSession.commit();
		sqlSession.close();
		return result;
	}
	
	public int delete(String customId) {
		SqlSession sqlSession = sessionFactory.openSession();
		int result = sqlSession.delete("tblcustomer.delete",customId);
		sqlSession.commit();
		sqlSession.close();
		return result;
	}
	
	public CustomerDto getCustomer(String customId ) {
		SqlSession sqlSession = sessionFactory.openSession();
		CustomerDto dto = sqlSession.selectOne("tblcustomer.getCustomer",customId);
		sqlSession.close();
		return dto;
	}
	
	public List<CustomerDto> selectByNameAge(Map<String,Object> map){
		SqlSession sqlSession = sessionFactory.openSession();
		List<CustomerDto> list 
			= sqlSession.selectList("tblcustomer.selectByNameAge",map);
		sqlSession.close();
		return list;
	}
}








