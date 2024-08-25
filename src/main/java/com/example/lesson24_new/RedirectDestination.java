package by.tms.lesson24;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RedirectDestination", urlPatterns = "/redirect-servlet")
public class RedirectDestination extends HelloServlet{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String destination = request.getParameter("destination");
        switch (destination) {
            case "Minsk" -> response.sendRedirect("/webapp/minsk");
            case "Beijing" -> response.sendRedirect("/webapp/beijing");
            case "Washington" -> response.sendRedirect("/webapp/washington");
            default -> response.sendRedirect("/webapp/welcome");
        }
    }
}
