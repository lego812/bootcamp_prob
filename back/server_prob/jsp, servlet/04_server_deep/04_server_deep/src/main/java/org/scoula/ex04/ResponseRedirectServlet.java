package org.scoula.ex04;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/response_redirect")
public class ResponseRedirectServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username=(String)req.getAttribute("username");
        String useraddress=(String)req.getAttribute("useraddress");

        req.setAttribute("username",username);
        req.setAttribute("useraddress",useraddress);

        req.getRequestDispatcher("/redirect_response.jsp").forward(req, resp);
    }
}

// request 속성은 현재 요청 객체에만 유효.
// but! sendRedirect()는 클라이언트에게 새로운 요청을 하라고 지시하므로, 기존 request 객체는 사라짐
//때문에 request 스코프의 username과 useraddress는 전달되지 않음.