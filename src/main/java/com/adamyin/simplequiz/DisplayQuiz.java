package com.adamyin.simplequiz;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "First servlet example", urlPatterns = {"/DisplayQuiz"})
public class DisplayQuiz extends HttpServlet {
    
        /**
     * @Author
     * Jian Yin (Adam)
     * 
     * @param request
     * @param response
     * @throws javax.servlet.ServletException
     * @throws java.io.IOException
     */
            private static final String TITLE = "Interest Calculator";
            
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

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
            out.println("<form action='Evaluate' method =post>");
            out.println("<table>");
            
            // Get principal amount
            out.println("<tr>");
            out.println("<td>Enter Principal Amount:</td>");
            out.println("<td><input type='text' name='principal'></td>");
            out.println("</tr>");
            
             // Get interest rate (annual)
            out.println("<tr>");
            out.println("<td>Enter Interest rate:</td>");
            out.println("<td><input type='text' name='interest'></td>");
            out.println("</tr>");
            
            // Get length of the term.
            out.println("<tr>");
            out.println("<td>How many years:</td>");
            out.println("<td><select name='term'>");
            out.println("<option>1</option>");
            out.println("<option>2</option>");
            out.println("<option>3</option>");
            out.println("<option>4</option>");
            out.println("<option>5</option>");
            out.println("<option>6</option>");
            out.println("<option>7</option>");
            out.println("<option>8</option>");
            out.println("<option>9</option>");
            out.println("<option>10</option>");
            out.println("<option>11</option>");
            out.println("<option>12</option>");
            out.println("<option>13</option>");
            out.println("<option>14</option>");
            out.println("<option>15</option>");
            out.println("</select></td>");
            out.println("</tr>");
            
            // reset + submit
            out.println("<tr>");
            out.println("<td>&nbsp;</td>");
            out.println("<td><input type='reset'/>" + "<input type='submit'/></td>");
            out.println("</tr>");
            
            out.println("</table>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
            
                      
            } catch (Exception ex){
                ex.printStackTrace();
                }
  
        }
}
