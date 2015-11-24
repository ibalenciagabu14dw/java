package examen3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

/**
 * Servlet implementation class Anadir
 */
public class AnadirMatricula extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnadirMatricula() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{ 
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/matriculaciones","root","zubiri");
			response.setContentType("text/html;charset=UTF-8");
			
		PrintWriter out = response.getWriter();
	
		out.println("<html>");
		out.println("<head><title>MATRICULACIONES</title></head>");
		out.println("<body>");
		
		Statement st = con.createStatement();
		
		st.executeUpdate("CREATE DATABASE IF NOT EXISTS matriculaciones");
		
		st.executeUpdate("CREATE TABLE IF NOT EXISTS ALUMNO(dni VARCHAR(10) NOT NULL, nombre VARCHAR(50) ,  apellido VARCHAR(50) ,  fecha VARCHAR(50), PRIMARY KEY ( DNI ))");
		
		st.executeUpdate("INSERT INTO ALUMNO (dni, nombre, apellido, fecha) VALUES ("+request.getParameter("dni")+",'"+request.getParameter("nombre")+"','"+request.getParameter("apellido")+"',"+request.getParameter("fecha")+"')");
		
		ResultSet rs = st.executeQuery("SELECT * FROM matriculaciones");
		
		out.print("<html>");
        out.print("<head><title>MATRICULACIONES</title></head>");
        out.println("<table>");
        out.println("<tr>");
	    out.println("<td>DNI</td>");
	    out.println("<td>NOMBRE</td>");
	    out.println("<td>APELLIDO</td>");
	    out.println("<td>FECHA</td>");
	    out.println("</tr>");
	      
	    while (rs.next()) {
	
	      out.println("<tr>");
	      out.println("<td>" + rs.getInt("dni") + "</td>");
	      out.println("<td>" + rs.getInt("nombre") + "</td>");
	      out.println("<td>" + rs.getInt("apellido") + "</td>");
	      out.println("<td>" + rs.getInt("fecha") + "</td>");
	      out.println("</tr>");
	    }
	    
	    rs.close();
	    
	    out.println("</table");
	    out.print("</body>");
	    out.print("</html>");
		}
	    catch (SQLException se)
	    {
	      se.printStackTrace();
		} 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
