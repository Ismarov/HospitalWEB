package servlet.paciente;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servicios.PacienteStub;
import servicios.PacienteStub.ObtenerEspecialidades;
import servicios.PacienteStub.ObtenerEspecialidadesResponse;

/**
 * Servlet implementation class ObtenerEspecialidades
 */
//(at)WebServlet(name = "ObtenerEspecialidades", urlPatterns = { "/paciente/ObtenerEspecialidades" })
public class SObtenerEspecialidades extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SObtenerEspecialidades() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PacienteStub pSt = new PacienteStub();
		
		ObtenerEspecialidades stObtenerEsp = new ObtenerEspecialidades();
		
		ObtenerEspecialidadesResponse obtenerEspResponse = pSt.obtenerEspecialidades(stObtenerEsp);
		
		String s =  obtenerEspResponse.get_return();
		
		response.getWriter().append(s);
	}

}
