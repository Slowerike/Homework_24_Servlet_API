package by.tms.lesson24;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@WebServlet( value = "/washington")
public class WashingtoneTime extends HelloServlet {


    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ZoneId WSTimeZoneId = ZoneId.of("America/New_York");
        ZonedDateTime zonedDateTime = ZonedDateTime.now(WSTimeZoneId);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String WSTime = String.format("Время в Вашингтоне-%s", zonedDateTime.format(formatter));
        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");  // Установка мета-тега для HTML страницы
            out.println("<title>Time in WS</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>" + WSTime + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }

    }
}
