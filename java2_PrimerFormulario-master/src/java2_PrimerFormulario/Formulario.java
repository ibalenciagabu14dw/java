package java2_PrimerFormulario;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Obra
 */
public class Formulario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Formulario() {
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
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String dni = request.getParameter("dni");
		String aficiones = request.getParameter("aficiones");
		
		System.out.println("ESTOS SON LOS DATOS DE LA OBRA");
		System.out.println("NOMBRE : " + nombre);
		System.out.println("APELLIDO : " + apellido);
		System.out.println("DNI : " + dni);
		System.out.println("AFICIONES : " + aficiones);
		out.print("<html>");
		out.print("<head><title></title>");
		out.print("</head>");
		out.print("<body>");

		out.print("<br/>");
 		out.print(" TITULO : "+ request.getParameter("nombre"));
 		out.print("<br/>");
 		out.print(" ARTISTA "+request.getParameter("apellido"));
 		out.print("<br/>");
 		out.print(" A�O DE EDICION "+request.getParameter("dni"));
 		out.print("<br/>");
 		out.print(" TIPO DE OBRA "+request.getParameter("aficiones"));
 		out.print("<br/>");
		out.print("</body>");
		out.print("</html>");
		
		//request.getRequestDispatcher("welcome.jsp").forward(request, response);
		
	}

}