package org.scoula.ex04;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/request")
public class RequestServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username="홍길동";
        String userAddress="서울";

        req.setAttribute("username", "홍길동");
        req.setAttribute("userAddress", "서울");

        req.getRequestDispatcher("request.jsp").forward(req, resp);
    }
}
