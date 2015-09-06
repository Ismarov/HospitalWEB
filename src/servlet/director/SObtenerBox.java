package servlet.director;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servicios.DirectorStub;
import servicios.DirectorStub.ObtenerBoxes;
import servicios.DirectorStub.ObtenerBoxesResponse;

/**
 * Servlet implementation class ObtenerBox
 */
public class SObtenerBox extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SObtenerBox() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DirectorStub dst = new DirectorStub();
		
		ObtenerBoxes stObtenerBox = new ObtenerBoxes();
		   
		ObtenerBoxesResponse obBoxResponse = dst.obtenerBoxes(stObtenerBox);
		
		String s= obBoxResponse.get_return();
		   request.setAttribute("boxes", s);
		   response.getWriter().append(s);
		   //getServletContext().getRequestDispatcher("/dBoxs.jsp").forward(request, response);
	}

}
