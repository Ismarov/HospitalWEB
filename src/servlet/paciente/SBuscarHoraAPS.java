package servlet.paciente;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bussines.PacienteStub;
import bussines.PacienteStub.BuscarHoraAps;
import bussines.PacienteStub.BuscarHoraApsResponse;

/**
 * Servlet implementation class BuscarHoraAPS
 */
public class SBuscarHoraAPS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SBuscarHoraAPS() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		@SuppressWarnings("deprecation")
		Date f1 = new Date(request.getParameter("fecha1"));
		@SuppressWarnings("deprecation")
		Date f2 = new Date(request.getParameter("fecha2"));
		int idMedico = Integer.parseInt(request.getParameter("idMedico"));
		
		PacienteStub pSt = new PacienteStub();
		
		BuscarHoraAps stBuscarHoraAps = new BuscarHoraAps();
		
		stBuscarHoraAps.setF1(f1);
		stBuscarHoraAps.setF2(f2);
		stBuscarHoraAps.setIdMedico(idMedico);
		
		BuscarHoraApsResponse buscarHoraApsResp = pSt.buscarHoraAps(stBuscarHoraAps);
		
		String s = buscarHoraApsResp.get_return();
		
		//request.setAttribute("Especialidades", s);
		//getServletContext().getRequestDispatcher("/pEspecialidades.jsp").forward(request, response);
		response.getWriter().append(s);
		
	}

}
