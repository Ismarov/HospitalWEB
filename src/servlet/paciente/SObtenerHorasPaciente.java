package servlet.paciente;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servicios.PacienteStub;
import servicios.PacienteStub.ObtenerHorasPaciente;
import servicios.PacienteStub.ObtenerHorasPacienteResponse;

/**
 * Servlet implementation class SObtenerHorasPaciente
 */
public class SObtenerHorasPaciente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SObtenerHorasPaciente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = request.getParameter("id") != null ? Integer.parseInt(request.getParameter("id")) : 0;
		if(id > 0){
			PacienteStub pac = new PacienteStub();
			ObtenerHorasPaciente stHoras = new ObtenerHorasPaciente();
			stHoras.setIdPaciente(id);
			ObtenerHorasPacienteResponse res = pac.obtenerHorasPaciente(stHoras);		
			response.getWriter().append(res.get_return());
		}
		else{
			response.getWriter().append("null");
		}

	}

}
