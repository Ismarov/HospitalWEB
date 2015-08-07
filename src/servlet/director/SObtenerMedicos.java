package servlet.director;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bussines.DirectorStub;
import bussines.DirectorStub.*;

/**
 * Servlet implementation class ObtenerMedico
 */
public class SObtenerMedicos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SObtenerMedicos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DirectorStub dSt = new DirectorStub();
		ObtenerMedico obtMedico = new ObtenerMedico();
		
		ObtenerMedicoResponse respObtMedico = dSt.obtenerMedico(obtMedico);
		
		String s =  respObtMedico.get_return();
		
		request.setAttribute("Especialidades", s);
		getServletContext().getRequestDispatcher("/pEspecialidades.jsp").forward(request, response);
	}

}
