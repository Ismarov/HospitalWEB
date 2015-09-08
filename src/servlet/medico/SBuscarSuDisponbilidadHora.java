package servlet.medico;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servicios.MedicoStub;
import servicios.MedicoStub.BuscarSuDisponibilidadHora;
import servicios.MedicoStub.BuscarSuDisponibilidadHoraResponse;

/**
 * Servlet implementation class BuscarSuDisponbilidadHora
 */
public class SBuscarSuDisponbilidadHora extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SBuscarSuDisponbilidadHora() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int idMedico = Integer.parseInt(request.getParameter("idMedico"));
		@SuppressWarnings("deprecation")
		Date f1 = new Date(request.getParameter("fecha1"));
		@SuppressWarnings("deprecation")
		Date f2 = new Date(request.getParameter("fecha2"));
		
		MedicoStub mst = new MedicoStub();

		BuscarSuDisponibilidadHora stObtenerDispHor = new BuscarSuDisponibilidadHora();

		stObtenerDispHor.setIdMedico(idMedico);
		stObtenerDispHor.setF1(f1);
		stObtenerDispHor.setF2(f2);

		BuscarSuDisponibilidadHoraResponse obDispHorResponse = mst.buscarSuDisponibilidadHora(stObtenerDispHor);

		String s = obDispHorResponse.get_return();
		request.setAttribute("obDispHor", s);
		response.getWriter().append(s);
	}

}
