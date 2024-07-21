package petshop;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet
public class PetServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException{
		String titulo = req.getParameter("titulo");
		String peso = req.getParameter("peso");
		String altura = req.getParameter("altura");
		PrintWriter writer = resp.getWriter();
		writer.print("Titulo:"+ titulo);
		writer.print("peso:"+ peso);
		writer.print("altura:"+ altura);
		writer.close();
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException{
		
		PrintWriter writer = resp.getWriter();
		writer.print("Deu certo");
		writer.close();
		
	}
	
	
	}
	
	
	


