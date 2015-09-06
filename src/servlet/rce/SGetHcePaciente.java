package servlet.rce;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servicios.RceStub;
import servicios.RceStub.ObtenerHceDeUnPaciente;
import servicios.RceStub.ObtenerHceDeUnPacienteResponse;

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
		ObtenerHceDeUnPaciente stHcePaciente = new ObtenerHceDeUnPaciente();
		stHcePaciente.setIdPaciente(Integer.parseInt(request.getParameter("id")));
		ObtenerHceDeUnPacienteResponse res = rce.obtenerHceDeUnPaciente(stHcePaciente);
		
		response.getWriter().append(res.get_return());
	}

}
