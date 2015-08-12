package servlet.director;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bussines.DirectorStub;
import bussines.DirectorStub.IngresarMedico;
import bussines.DirectorStub.IngresarMedicoResponse;
import bussines.DirectorStub.IngresarPaciente;
import bussines.DirectorStub.IngresarPacienteResponse;

/**
 * Servlet implementation class SIngresarPaciente
 */
public class SIngresarPaciente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SIngresarPaciente() {
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

		DirectorStub dSt = new DirectorStub();
		IngresarPaciente stIngresarPaciente = new IngresarPaciente();
		stIngresarPaciente.setNombres(nombres);
		stIngresarPaciente.setApellidos(apellidos);
		stIngresarPaciente.setRut(rut);
		stIngresarPaciente.setF_nac(f_nac);
		stIngresarPaciente.setTelefono(telefono);
		stIngresarPaciente.setDireccion(direccion);
		stIngresarPaciente.setCiudad(ciudad);
		stIngresarPaciente.setEmail(email);
		stIngresarPaciente.setActivo(activo);

		IngresarPacienteResponse ingresarPacienteResp = dSt
				.ingresarPaciente(stIngresarPaciente);

		String s = ingresarPacienteResp.get_return();

		request.setAttribute("ingresarPaciente", s);

		response.getWriter().append(s);
		//getServletContext().getRequestDispatcher("/d_IngresarPaciente.jsp")
				//.forward(request, response);
	}

}
