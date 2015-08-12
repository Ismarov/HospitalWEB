package servlet.director;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bussines.DirectorStub;
import bussines.PacienteStub;
import bussines.DirectorStub.IngresarMedico;
import bussines.DirectorStub.IngresarMedicoResponse;
import bussines.PacienteStub.ReservarHoraAps;
import bussines.PacienteStub.ReservarHoraApsResponse;

/**
 * Servlet implementation class SIngresarMedico
 */
public class SIngresarMedico extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SIngresarMedico() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nombres = request.getParameter("nombres");
		String apellidos = request.getParameter("apellidos");
		String rut = request.getParameter("rut");
		@SuppressWarnings("deprecation")
		Date f_nac = new Date(request.getParameter("f_nac"));
		String telefono = request.getParameter("telefono");
		String direccion = request.getParameter("direccion");
		String ciudad = request.getParameter("ciudad");
		String email = request.getParameter("email");
		int activo = Integer.parseInt(request.getParameter("activo"));
		int idEspecialidad = Integer.parseInt(request
				.getParameter("idEspecialidad"));

		DirectorStub dSt = new DirectorStub();
		IngresarMedico stIngresarMedico = new IngresarMedico();
		stIngresarMedico.setNombres(nombres);
		stIngresarMedico.setApellidos(apellidos);
		stIngresarMedico.setRut(rut);
		stIngresarMedico.setF_nac(f_nac);
		stIngresarMedico.setTelefono(telefono);
		stIngresarMedico.setDireccion(direccion);
		stIngresarMedico.setCiudad(ciudad);
		stIngresarMedico.setEmail(email);
		stIngresarMedico.setActivo(activo);
		stIngresarMedico.setIdEspecialidad(idEspecialidad);

		IngresarMedicoResponse ingresarMedicoResp = dSt
				.ingresarMedico(stIngresarMedico);

		String s = ingresarMedicoResp.get_return();

		request.setAttribute("ingresarMedico", s);

		response.getWriter().append(String.valueOf(s));
		//getServletContext().getRequestDispatcher("/d_IngresarMedico.jsp")
				//.forward(request, response);

	}

}
