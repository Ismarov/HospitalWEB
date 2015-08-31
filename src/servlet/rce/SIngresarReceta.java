package servlet.rce;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bussines.RceStub;
import bussines.RceStub.IngresarRceResponse;
import bussines.RceStub.IngresarReceta;
import bussines.RceStub.IngresarRecetaResponse;

/**
 * Servlet implementation class SIngresarReceta
 */
public class SIngresarReceta extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SIngresarReceta() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String desc = request.getParameter("desc");
		byte p_cron = request.getParameter("p_cron") != null ? (byte)Integer.parseInt(request.getParameter("p_cron")) : -1;
		byte p_ges = request.getParameter("p_ges") != null ? (byte)Integer.parseInt(request.getParameter("p_ges")) : -1;
		byte p_pges = request.getParameter("p_pges") != null ? (byte)Integer.parseInt(request.getParameter("p_pges")) : -1;
		
		if( p_cron >= 0 && p_ges >= 0 && p_pges >= 0 && desc != null){
			RceStub rce = new RceStub();
			IngresarReceta stReceta = new IngresarReceta();
			stReceta.setDesc(desc);
			stReceta.setId(0);
			stReceta.setPaciente_cronico(p_cron);
			stReceta.setPaciente_ges(p_ges);
			stReceta.setPatologia_ges(p_pges);
			IngresarRecetaResponse res = rce.ingresarReceta(stReceta);
			response.getWriter().append(res.get_return());
		}
		else{
			log("ingresarReceta: faltan parametros");
			response.getWriter().append("null");
		}
		
	}

}
