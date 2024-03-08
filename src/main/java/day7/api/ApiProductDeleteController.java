package day7.api;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ApiProductDeleteController implements Controller {

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String pcode = request.getParameter("pcode");
		//dao 실행해서 삭제하기

		//응답은 post 처리 참고하세요
	}

}
