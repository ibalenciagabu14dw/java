package com.zubiri.jsp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zubiri.parking.Coche;
import com.zubiri.parking.ParkingVehiculos;

/**
 * Servlet implementation class Borrarcoche
 */
public class Borrarcoche extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Borrarcoche() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType( "text/html; charset=iso-8859-1" );
		PrintWriter out = response.getWriter();
		
		ArrayList<Coche>lista = Insertarcoche.getListaCoches();
		
		
		String matricula = request.getParameter("matricula");
		System.out.println("la matricula es:" + matricula);
		System.out.println("en estos momentos hay:" + lista.size());	
		ParkingVehiculos.borrarVehiculo(matricula, lista);
		System.out.println("cuantos coches quedan despues de borrar:" + lista.size());
		
		out.print("<html>");
		out.print("<head><title></title>");
		out.print("</head>");
		out.print("<body>");
		 out.println("<table align='center' width='40%' border='10' >  ");
		
		out.println("<td> Matricula del coche </td>");
		out.println("<td> Numero de Ruedas </td>");
		out.println("<td> Motor </td>");
		out.println("<td> Marca </td>");
		out.println("<td> Automatico </td>");
		out.println("<td> Consumo 100km </td>");
		out.println("</tr>");
		for(int i=0; i< lista.size(); i++){
			Coche coche = lista.get(i); 
		out.println("<tr>");
		out.println("<td>" + coche.getMatricula() + "</td>");
		out.println("<td>" + coche.getNumRuedas()+ "</td>");
		out.println("<td>" + coche.getMotor()+ "</td>");
		out.println("<td>" + coche.getMarca()+ "</td>");
		out.println("<td>" + coche.getAutomatico()+ "</td>");
		out.println("<td>" + coche.getConsumo100km()+ "</td>");
		out.println("</tr>");
		}
		out.println("</table");
		out.print("</body>");
		out.print("</html>");
		System.out.println(lista.size());
	

	}

}
