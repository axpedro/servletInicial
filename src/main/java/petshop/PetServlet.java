package petshop;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/PetServlet")
public class PetServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException{
		String titulo = req.getParameter("titulo");
	
		PrintWriter writer = resp.getWriter();
		writer.print("Titulo:"+ titulo);
		
		writer.close();
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException{
		
		PrintWriter writer = resp.getWriter();
		writer.print("Post ok");
		writer.close();
		
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException{
		
		PrintWriter writer = resp.getWriter();
		writer.print("Put ok");
		writer.close();
		
	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException{
		
		PrintWriter writer = resp.getWriter();
		writer.print("Delete Ok");
		writer.close();
		
	}
	
	}
	
	
	


