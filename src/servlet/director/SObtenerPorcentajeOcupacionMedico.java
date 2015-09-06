package servlet.director;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servicios.DirectorStub;
import servicios.DirectorStub.ObtenerPorcentajeOcupacionMedico;
import servicios.DirectorStub.ObtenerPorcentajeOcupacionMedicoResponse;

/**
 * Servlet implementation class ObtenerPorcentajeOcupacionMedico
 */
public class SObtenerPorcentajeOcupacionMedico extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SObtenerPorcentajeOcupacionMedico() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		@SuppressWarnings("deprecation")
		Date f1 = new Date(request.getParameter("fecha1"));
		@SuppressWarnings("deprecation")
		Date f2 = new Date(request.getParameter("fecha2"));
		int idMed = Integer.parseInt(request.getParameter("idMed"));

		DirectorStub dst = new DirectorStub();

		ObtenerPorcentajeOcupacionMedico stObtenerPorMed = new ObtenerPorcentajeOcupacionMedico();

		stObtenerPorMed.setF1(f1);
		stObtenerPorMed.setF2(f2);
		stObtenerPorMed.setMedicoId(idMed);

		ObtenerPorcentajeOcupacionMedicoResponse obPorMedResponse = dst
				.obtenerPorcentajeOcupacionMedico(stObtenerPorMed);

		int s = obPorMedResponse.get_return();
		request.setAttribute("obtenerPorMed", s);
		response.getWriter().append(String.valueOf(s));
	}

}
