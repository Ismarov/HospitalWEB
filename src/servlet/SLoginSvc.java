package servlet;

import java.io.IOException;

import javax.mail.Session;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginSvc
 */
public class SLoginSvc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SLoginSvc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		if(request.getParameter("logout") != null){
			request.setAttribute("logged", "false");
		}
		else{
			String email = request.getParameter("email");
			String passw = request.getParameter("pass");
			String type = request.getParameter("type");
			
			String name = null;
			int id = 0;
			if(email.equals("medico1@localhost") && passw.equals("med1") && type.equals("m")){
				id = 1;
				name = "Medico1";
			}

			if(email.equals("medico2@localhost") && passw.equals("med2") && type.equals("m")){
				id = 2;
				name = "Medico2";
			}
			
			if(email.equals("paciente1@localhost") && passw.equals("pac1") && type.equals("p")){
				id = 1;
				name = "Paciente1";
			}
			
			if(email.equals("director1@localhost") && passw.equals("dir1") && type.equals("d")){
				id = 1;
				name = "Director1";
			}
			
			if(name != null){
				request.setAttribute("logged", "true");
				request.setAttribute("name", name);
				request.setAttribute("id", String.valueOf(id));
				request.setAttribute("type", type);
			}
			else{
				request.setAttribute("logged", "false");
			}
			
		}
		
		getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
		
	}

}
