package servlet.rce;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bussines.RceStub;
import bussines.RceStub.ObtenerRceDeUnPaciente;
import bussines.RceStub.ObtenerRceDeUnPacienteResponse;

/**
 * Servlet implementation class SGetHcePaciente
 */
public class SGetHcePaciente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SGetHcePaciente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RceStub rce = new RceStub();
		ObtenerRceDeUnPaciente stRcePaciente = new ObtenerRceDeUnPaciente();
		stRcePaciente.setIdPaciente(Integer.parseInt(request.getParameter("id")));
		ObtenerRceDeUnPacienteResponse res = rce.obtenerRceDeUnPaciente(stRcePaciente);
		
		response.getWriter().append(res.get_return());
	}

}
