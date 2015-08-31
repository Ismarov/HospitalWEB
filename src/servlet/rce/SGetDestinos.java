package servlet.rce;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bussines.RceStub;
import bussines.RceStub.ObtenerCierre_destino;
import bussines.RceStub.ObtenerCierre_destinoResponse;

/**
 * Servlet implementation class SGetDestinos
 */
public class SGetDestinos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SGetDestinos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RceStub rce = new RceStub();
		ObtenerCierre_destino stGetTiposDestino = new ObtenerCierre_destino();
		ObtenerCierre_destinoResponse res = rce.obtenerCierre_destino(stGetTiposDestino);
		
		response.getWriter().append(res.get_return());
	}

}
