package com.codecool.web.servlet;

import com.codecool.web.model.Subscription;
import com.codecool.web.service.SubscriptionService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/subscriptionServlet")
public class SubscriptionServlet extends HttpServlet {

    private final SubscriptionService service = new SubscriptionService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Subscription sub = new Subscription(req.getParameter("name"), req.getParameter("email"));

        if (sub.getName().equalsIgnoreCase("") && sub.getEmail().equalsIgnoreCase("")) {
            req.setAttribute("subscription", service.notSubscripting());
            req.getRequestDispatcher("subscription.jsp").forward(req, resp);
        } else {
            req.setAttribute("subscription", service.subscripting());
            req.getRequestDispatcher("subscription.jsp").forward(req, resp);
        }
    }
}
