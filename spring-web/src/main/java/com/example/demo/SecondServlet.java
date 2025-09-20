package com.example.demo;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

    public SecondServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    	
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    	 String user = request.getParameter("username");
         String pass = request.getParameter("password");

         response.setContentType("text/html");
         if ("admin".equals(user) && "1234".equals(pass)) {
             response.getWriter().println("<h1>Login riuscito!</h1>");
         } else {
             response.getWriter().println("<h1>Login fallito!</h1>");
         }
    }
	

}
