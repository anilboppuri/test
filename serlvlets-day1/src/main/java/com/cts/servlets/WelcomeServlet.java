package com.cts.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeServlet
 */
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public WelcomeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		ServletConfig config = getServletConfig();

		String username = config.getInitParameter("username");
		String pwd = config.getInitParameter("password");

		ServletContext context = getServletContext();

		Integer countCtx = (Integer) context.getAttribute("count");

		Integer countReqCtx = (Integer) request.getAttribute("count");
		String url = context.getInitParameter("url");

		String name = request.getQueryString();

		response.encodeURL("encoded with reponse");

		//response.getWriter().append("Served at: ").append(request.getContextPath() + " USERNAME " + username
		//		+ "PASSWORD IS " + pwd + " URL " + url + "Name = " + name + "  count = "+ countCtx  + " req count "+ countReqCtx);
	
		RequestDispatcher dispatcher =  context.getRequestDispatcher("/ProcessComplete.jsp");
		dispatcher.forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
