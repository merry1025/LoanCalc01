package com.adamyin.simplequiz;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "First servlet example", urlPatterns = {"/Result"})
public class Result extends HttpServlet {
    
        /**
     * Servlet that just says Hello
     * 
     * @param request
     * @param response
     * @throws javax.servlet.ServletException
     * @throws java.io.IOException
     */
            private static final String TITLE = "Display Monthly Payment";
            
         
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

           String monthlyPaymentFormatted = request.getParameter("answer"); 
            
        
        // Define the type of content that will appear in the http response
        response.setContentType("text/html");
  try ( 

            PrintWriter out = response.getWriter()) {
            out.println("<html>");
            
            // head section
            out.println("<head>");
            out.println("<meta charset='utf-8'>");
            out.println("<title>" + TITLE + "</title>");
            out.println("<link rel='stylesheet' href='/ServletsWeek02/styles/main.css' type='text/css'/>");
            out.println("</head>");
            
            // body section
            out.println("<body><h1>" + TITLE + "</h1>");
            out.println("<p>");
            out.println("monthly payment is: " + monthlyPaymentFormatted);
            //out.println("The Monthly Payment is:" + monthlyPaymentFormatted);
            out.println("</p>");
            out.println("</body>");
            out.println("</html>");
            
                      
            } catch (Exception ex){
                ex.printStackTrace();
                }
        }
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException {
        
    }
    


}
