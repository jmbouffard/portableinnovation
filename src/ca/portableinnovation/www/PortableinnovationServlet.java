package ca.portableinnovation.www;
import java.io.IOException;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "PortableinnovationServlet",
			value = "/servlet",
			initParams = {
				@WebInitParam(name = "default_lang", value = "en"),
			})
public class PortableinnovationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		//String default_lang = getServletConfig().getInitParameter("lang");
		String lang = req.getParameter("lang");
		resp.setContentType("text/plain");
		resp.getWriter().println("lang: "+lang);
		resp.getWriter().println(getInfo());
	}
	
	public static String getInfo() {
	    return "Version: " + System.getProperty("java.version")
	          + " OS: " + System.getProperty("os.name")
	          + " User: " + System.getProperty("user.name");
	}
	
	/*private void generatePage(HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter(); 
		writer.println("");
		writer.println("");
		writer.println("");
	}*/
}
