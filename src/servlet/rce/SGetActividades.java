package servlet.rce;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bussines.RceStub;
import bussines.RceStub.ObtenerActividad;
import bussines.RceStub.ObtenerActividadResponse;;
/**
 * Servlet implementation class SGetActividades
 */
public class SGetActividades extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SGetActividades() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RceStub rce = new RceStub();
		ObtenerActividad stGetActividades = new ObtenerActividad();
		ObtenerActividadResponse res = rce.obtenerActividad(stGetActividades);
		
		response.getWriter().append(res.get_return());
	}

}
