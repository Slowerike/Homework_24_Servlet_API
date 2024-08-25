package by.tms.lesson24;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
//@WebServlet(name = "AdultOrNotServlet",value ="/adult")
public class AdultOrNotServlet extends HelloServlet{//localhost:8080/webapp/adult?age=12

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String ageString=request.getParameter("age");
        int age=Integer.parseInt(ageString);
        String adultsOrNot="Not";
        if (age>=18){
            adultsOrNot="Yes";
        }
        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");  // Установка мета-тега для HTML страницы
            out.println("<title>Совершеннолетний или нет?</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>" + adultsOrNot + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
