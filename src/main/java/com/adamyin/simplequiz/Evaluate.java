/*
 * Basic templet of a servlet.
 */
package com.adamyin.simplequiz;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "First servlet example", urlPatterns = {"/Evaluate"})
public class Evaluate extends HttpServlet {

    /**
     * Servlet that just says Hello
     *
     * @param request
     * @param response
     * @throws javax.servlet.ServletException
     * @throws java.io.IOException
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Define the type of content that will appear in the http response
        response.setContentType("text/html");

        try (PrintWriter out = response.getWriter()) {

            //Get user's input for the 2 numbers as String.
            String principalAsString = request.getParameter("principal");
            String annualInterestAsString = request.getParameter("interest");
            String termAsString = request.getParameter("term");

            //Convert String to Double.
            double principal = Double.parseDouble(principalAsString);
            double annualInterest = Double.parseDouble(annualInterestAsString);
            int term = Integer.parseInt(termAsString) * 12;
            double monthlyPayment;

            //Get monthly interest rate
            double monthlyInterest = annualInterest / 12;

            monthlyPayment = (principal * monthlyInterest)
                    / (1 - Math.pow(1 + monthlyInterest, -term));

            NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
            String monthlyPaymentFormatted = currencyFormat.format(monthlyPayment);

            // Forward result to Result.java
            response.sendRedirect("Result?answer=" + monthlyPaymentFormatted);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    @Override
    
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException {
        
    }

}
