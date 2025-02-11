package main.java.com.example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/team")
public class TeamServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html lang='uk'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        out.println("<title>Наша Бригада</title>");
        out.println("<link rel='stylesheet' href='./css/style.css'>");
        out.println("</head>");
        out.println("<body>");

        out.println("<header class='header'>");
        out.println("<div class='container'>");
        out.println("<div class='header-container'>");
        out.println("<nav class='header-nav'>");
        out.println("<h1>Ми Бригада</h1>");
        out.println("<ul class='header-menu'>");
        out.println("<li><a class='link' href='index.html'>Головна</a></li>");
        out.println("<li><a class='link' href='about.html'>Про нас</a></li>");
        out.println("<li><a class='link' href='services.html'>Послуги</a></li>");
        out.println("<li><a class='link' href='contacts.html'>Контакти</a></li>");
        out.println("</ul>");
        out.println("</nav>");
        out.println("</div>");
        out.println("</div>");
        out.println("</header>");

        out.println("<main>");
        out.println("<section class='team-section'>");
        out.println("<h2>Наша команда</h2>");
        out.println("<ul class='teammate-list'>");
        out.println("<li class='teammate'><h3>Денчик - Розробник</h3></li>");
        out.println("<li class='teammate'><h3>Маргошка - Дизайнер</h3></li>");
        out.println("<li class='teammate'><h3>Сашка - Тестувальник</h3></li>");
        out.println("</ul>");
        out.println("</section>");
        out.println("</main>");

        out.println("</body>");
        out.println("</html>");
    }
}
