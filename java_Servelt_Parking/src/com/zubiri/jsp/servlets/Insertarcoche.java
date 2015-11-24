package com.zubiri.jsp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zubiri.parking.Coche;

/**
 * Servlet implementation class Insertarcoche
 */
public class Insertarcoche extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	
	private static ArrayList<Coche> listaCoches = new ArrayList<Coche>();
    
    public static ArrayList<Coche> getListaCoches() {
		return listaCoches;
	}



	public void setListaCoches(ArrayList<Coche> listaCoches) {
		Insertarcoche.listaCoches = listaCoches;
	}
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Insertarcoche() {
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

		
		String matricula = request.getParameter("matricula");
		System.out.println("en estos momentos la matricula es" + matricula);
		String numRuedas2 = request.getParameter("numRuedas");
		int numRuedas = Integer.parseInt(numRuedas2);
		String motor2 = request.getParameter("motor");
		boolean motor = Boolean.parseBoolean(motor2);
		String marca = request.getParameter("marca");
		String automatico2 = request.getParameter("automatico");
		boolean automatico = Boolean.parseBoolean(automatico2);
		String consumo100km2 = request.getParameter("consumo100km");
		int consumo100km = Integer.parseInt(consumo100km2);
		
			
			
			
			
			
				Coche coche = new Coche(matricula, numRuedas, motor, marca, automatico, consumo100km);
				if( coche.getMatricula() == null){
					
					out.print("<html>");
					out.print("<head><title></title>");
					out.print("</head>");
					out.print("<body>");
					out.print("no has metido bien la matricula: la matricula son CUATRO NUMEROS+TRES LETRAS");
					out.print("</body>");
					out.print("</html>");
					
				} else {
					
					listaCoches.add(coche);
					

					System.out.println("ESTOS SON LOS DATOS DEL COCHE");
					System.out.println("Matricula : " + matricula);
					System.out.println("numRuedas : " + numRuedas);
					System.out.println("motor : " + motor);
					System.out.println("marca : " + marca);
					System.out.println("automatico : " + automatico);
					System.out.println("consumo100km : " + consumo100km);
					
					
				
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
					for(int i=0; i< listaCoches.size(); i++){
						coche = listaCoches.get(i); 
						// metodo no puede ser estatico.
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
					System.out.println("en estos momento hay " + listaCoches.size() + " " + "coche");
				
			
			}
				}
				
				
		
}