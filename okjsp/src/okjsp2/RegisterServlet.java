package okjsp2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register.do")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = new User();
		user.setId(request.getParameter("id"));
		user.setPassword(request.getParameter("password"));
		user.setConfirmPassword(request.getParameter("confirmPassword"));
		// check password and confirmPassword
		if (!user.getPassword().equals(user.getConfirmPassword())) {
			request.setAttribute("msg", "password not matched!");
			request.getRequestDispatcher("register.jsp").forward(request, response);
			return;
		}
		// check id duplication
		// save()
		UserDAO.save(user);
		// to finish page 
		response.sendRedirect("registerFinished.jsp");
		
		// Dispatcher 로 할 경우, register.jsp 에서 새로고침시 계속 size 가 늘어나나, sendRedirect 는 그렇지 않다.
//		request.getRequestDispatcher("resigter.jsp").forward(request, response);
	}

}
