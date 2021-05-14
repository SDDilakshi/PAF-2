package com;

import java.io.IOException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.security.DigestException;

import com.sun.net.httpserver.HttpServer;



/**
 * Servlet implementation class PaymentsAPI
 */
@WebServlet("/PaymentsAPI")
public abstract class PaymentsAPI extends HttpServer {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public PaymentsAPI() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @param paymentObj 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpRequest request, HttpResponse response, Object paymentObj) throws DigestException, IOException {
		// TODO Auto-generated method stub
		
		String output = paymentObj.insertPayment(((Object) request).getParameter("paymentType"), 
				 ((Object) request).getParameter("paymentAmount"), 
		((Object) response).getWriter().append("Served at: ").append(((Object) request).getContextPath());
		((Object) response).getWriter().append("Served at: ").append(((Object) request).getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpRequest request, HttpResponse response) throws DigestException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpRequest request, HttpResponse response) throws DigestException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpRequest request, HttpResponse response) throws DigestException, IOException {
		// TODO Auto-generated method stub
	}

}
