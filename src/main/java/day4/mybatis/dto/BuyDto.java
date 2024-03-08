package day4.mybatis.dto;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

//웹에서는 vo 단어 대신 dto 많이 씁니다. 
//data transfer object. db , 서블릿(컨트롤러), jsp(뷰) 사이에서 데이터를 전달해주는 역할.

//마이바티스에서 매핑 할때 객체는 기본생성자가 있으면 기본생성자로 없으면 커스텀 생성자로 객체 생성.
@Getter
@ToString
@AllArgsConstructor	
@NoArgsConstructor		//ObjectMapper 에서 객체 매핑에 필요합니다
@EqualsAndHashCode
public class BuyDto {
	private int buyIdx;
	private String pcode;
	private String customid;
	private int quantity;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm" , timezone = "Asia/Seoul")
	private Date buyDate;
}






