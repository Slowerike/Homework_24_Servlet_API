package by.tms.lesson24;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;


@WebServlet(name = "MinskTime", value = "/minsk")
public class MinskTime extends HelloServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        LocalTime localTime = LocalTime.now();
        String timeInMinsk = String.format("Время в Минске -%02d:%02d", localTime.getHour(), localTime.getMinute());
        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");  // Установка мета-тега для HTML страницы
            out.println("<title>Time in Minsk</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>" + timeInMinsk + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
