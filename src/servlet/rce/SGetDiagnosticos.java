package servlet.rce;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servicios.RceStub;
import servicios.RceStub.ObtenerDiagnosticos;
import servicios.RceStub.ObtenerDiagnosticosResponse;

/**
 * Servlet implementation class SGetDiagnosticos
 */
public class SGetDiagnosticos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SGetDiagnosticos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RceStub rce = new RceStub();
		ObtenerDiagnosticos stGetDiagnosticos = new ObtenerDiagnosticos();
		ObtenerDiagnosticosResponse res = rce.obtenerDiagnosticos(stGetDiagnosticos);
		
		response.getWriter().append(res.get_return());
	}

}
