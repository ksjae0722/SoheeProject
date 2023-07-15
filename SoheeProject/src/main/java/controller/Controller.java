package main.java.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.dto.CustomerDTO;

public class Controller extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String RequestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = RequestURI.substring(contextPath.length());
		
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
	
		if (command.equals("/cart.do")) {	// 장바구니 페이지
				requestCart(request);
				RequestDispatcher rd = request.getRequestDispatcher("./jsp/cart.jsp");
				rd.forward(request, response);				
		} else if (command.equals("/checkout.do")) {	// 결제 페이지
				requestCheckout(request);
				RequestDispatcher rd = request.getRequestDispatcher("./jsp/checkout.jsp");
				rd.forward(request, response);						
		} else if (command.equals("/contact.do")) {		// 문의 페이지
				requestContact(request);
				RequestDispatcher rd = request.getRequestDispatcher("./jsp/contact.jsp");
				rd.forward(request, response);						
		} else if (command.equals("/detail.do")) { 		// 제품 상세 페이지
				requestDetail(request,response);
				RequestDispatcher rd = request.getRequestDispatcher("./jsp/detail.jsp");
				rd.forward(request, response);	
		} else if (command.equals("/login.do")) {	// login페이지
				requestLogin(request);
				RequestDispatcher rd = request.getRequestDispatcher("./jsp/login.jsp");
				rd.forward(request, response);
		} else if (command.equals("/register.do")) { 	// 회원가입 페이지
				requestRegister(request, response);
				RequestDispatcher rd = request.getRequestDispatcher("./jsp/register.do");
				rd.forward(request, response);
		} else if (command.equals("/shop.do")) { 	// 상품 페이지
				requestShop(request);
				RequestDispatcher rd = request.getRequestDispatcher("./jsp/shop.do");
				rd.forward(request, response);				
		} else if (command.equals("/heart.do")) { 	// 찜 페이지
			requestShop(request);
			RequestDispatcher rd = request.getRequestDispatcher("./jsp/heart.do");
			rd.forward(request, response);				
		} 
	}

	private void requestShop(HttpServletRequest request) {
		
		
	}

	public void requestRegister(HttpServletRequest request, HttpServletResponse response) {
		CustomerDTO c = new CustomerDTO();
		
		
		
	}

	private void requestDetail(HttpServletRequest request, HttpServletResponse response) {
		
		
	}

	private void requestContact(HttpServletRequest request) {
		// TODO Auto-generated method stub
		
	}

	private void requestCheckout(HttpServletRequest request) {
		// TODO Auto-generated method stub
		
	}

	private void requestCart(HttpServletRequest request) {
		// TODO Auto-generated method stub
		
	}

	private void requestLogin(HttpServletRequest request) {
		// TODO Auto-generated method stub
		
	}
}