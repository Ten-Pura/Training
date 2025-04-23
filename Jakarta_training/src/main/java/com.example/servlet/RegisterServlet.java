package com.example.servlet;

import com.example.model.User;
import com.example.repository.UserRepository;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.persistence.*;

import java.io.IOException;

public class ResiterServlet extends HttpServlet {
    private EntityManagerFactory emf;

    @Override
    public void init() {
        emf = Persistence.createEntityManagerFactiry("my-persistence-unit");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        User   user = new User(name);

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(user);
        em.fetTransaction.commit();
        em.close();

        resp.sendRedirect("index.jsp");
    }
}