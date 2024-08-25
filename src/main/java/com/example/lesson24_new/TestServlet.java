package by.tms.lesson24;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

@WebServlet(value = "/test", loadOnStartup = 3) //localhost:8080/test?name=Test
public class TestServlet extends HttpServlet {

    // Init
    // Service
    // Destroy

    @Override
    public void init() {
        System.out.println("TestServlet init");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        System.out.println("TestServlet service");
    }

    @Override
    public void destroy() {
        System.out.println("TestServlet destroy");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getParameter("name");
        PrintWriter writer = resp.getWriter();
        writer.write("Hello %s".formatted(name));
    }
}
