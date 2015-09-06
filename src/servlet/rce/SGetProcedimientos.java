package servlet.rce;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servicios.RceStub;
import servicios.RceStub.ObtenerProcedimientos;
import servicios.RceStub.ObtenerProcedimientosResponse;

/**
 * Servlet implementation class SGetProcedimientos
 */
public class SGetProcedimientos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SGetProcedimientos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RceStub rce = new RceStub();
		ObtenerProcedimientos stGetProcedimientos = new ObtenerProcedimientos();
		ObtenerProcedimientosResponse res = rce.obtenerProcedimientos(stGetProcedimientos);
		
		response.getWriter().append(res.get_return());
	}

}
