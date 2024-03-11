package org.example;

import org.example.calculate.Calculator;
import org.example.calculate.PositiveNumber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/calculate")
// public class CalculatorServlet implements Servlet {
// public class CalculatorServlet extends GenericServlet {
public class CalculatorServlet extends HttpServlet {
    private static final Logger log = LoggerFactory.getLogger(CalculatorServlet.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("service");
        int operand1 = Integer.parseInt(request.getParameter("operand1"));
        String operator = request.getParameter("operator");
        int operand2 = Integer.parseInt(request.getParameter("operand2"));

        int result = Calculator.calculate(new PositiveNumber(operand1), operator, new PositiveNumber(operand2));

        PrintWriter writer = response.getWriter();
        writer.println(result);
    }

    // : GenericServlet 추상 클래스의 경우
    // @Override
    // public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
    //     log.info("service");
    //     int operand1 = Integer.parseInt(request.getParameter("operand1"));
    //     String operator = request.getParameter("operator");
    //     int operand2 = Integer.parseInt(request.getParameter("operand2"));
    //
    //     int result = Calculator.calculate(new PositiveNumber(operand1), operator, new PositiveNumber(operand2));
    //
    //     PrintWriter writer = response.getWriter();
    //     writer.println(result);
    // }

    // : Servlet 인터페이스의 경우
    // private ServletConfig servletConfig;

    // Servlet 인터페이스의 경우
    // @Override
    // public void init(ServletConfig servletConfig) throws ServletException {
    //     log.info("init");
    //     this.servletConfig = servletConfig;
    // }

    // : Servlet 인터페이스의 경우
    // @Override
    // public void destroy() {
    //     log.info("destroy");
    // }

    // : Servlet 인터페이스의 경우
    // @Override
    // public ServletConfig getServletConfig() {
    //     return this.servletConfig;
    // }


    // : Servlet 인터페이스의 경우
    // @Override
    // public String getServletInfo() {
    //     return null;
    // }
}
