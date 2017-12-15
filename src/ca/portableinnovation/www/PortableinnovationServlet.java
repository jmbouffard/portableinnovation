package ca.portableinnovation.www;
import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class PortableinnovationServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		//String lang = req.getParameter("lang");
		String lang = getServletConfig().getInitParameter("lang");
		resp.setContentType("text/plain");
		resp.getWriter().println("Page in "+lang);
	}
	
	/*private void generatePage(HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter(); 
		writer.println("");
		writer.println("");
		writer.println("");
	}*/
}
