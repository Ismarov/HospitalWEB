package servlet.rce;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bussines.RceStub;
import bussines.RceStub.ObtenerPacientePorRut;
import bussines.RceStub.ObtenerPacientePorRutResponse;

/**
 * Servlet implementation class SGetPacienteRut
 */
public class SGetPacienteRut extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SGetPacienteRut() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String rut = request.getParameter("rut");
		RceStub rce = new RceStub();
		ObtenerPacientePorRut stPaciente = new ObtenerPacientePorRut();
		stPaciente.setRutIngresado(rut);
		ObtenerPacientePorRutResponse res = rce.obtenerPacientePorRut(stPaciente);
		response.getWriter().append(res.get_return());		
	}

}
