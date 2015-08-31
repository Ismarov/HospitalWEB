package servlet.rce;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bussines.RceStub;
import bussines.RceStub.ObtenerCierre_tipo;
import bussines.RceStub.ObtenerCierre_tipoResponse;
import bussines.RceStub.ObtenerDiagnostico;
import bussines.RceStub.ObtenerDiagnosticoResponse;

/**
 * Servlet implementation class SGetTiposCierre
 */
public class SGetTiposCierre extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SGetTiposCierre() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RceStub rce = new RceStub();
		ObtenerCierre_tipo stGetTiposCierre = new ObtenerCierre_tipo();
		ObtenerCierre_tipoResponse res = rce.obtenerCierre_tipo(stGetTiposCierre);
		
		response.getWriter().append(res.get_return());
	}

}
