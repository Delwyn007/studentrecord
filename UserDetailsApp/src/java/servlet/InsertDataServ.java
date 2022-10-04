/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author L2S-4
 */
public class InsertDataServ extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet InsertDataServ</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet InsertDataServ at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            JSONArray data = new JSONArray();
            
            
            PrintWriter out = response.getWriter ( ) ;
           // Connection con = null;
            Statement stmt = null ;
           // String n="" ,p= "" ;
            //n = request.getParameter ( " textuname " ) ;
            //p = request.getParameter ( " txtupass " ) ;
            try
            {
             Class.forName("org.postgresql.Driver");
             Connection con=DriverManager.getConnection("jdbc:postgresql://192.168.1.24:5432/sharan","postgres","L2s2b2s");
             stmt=con.createStatement();
             ResultSet rs=stmt.executeQuery("SELECT * FROM public.name;");
             while(rs.next()){
//                String usrdata=rs.getString(1)+":"+rs.getString(2)+":"+rs.getString(3);
//                                out.println("<br>");
                JSONObject row = new JSONObject();
                row.put("empid",rs.getInt(1));
                row.put("first_name",rs.getString(3));
                row.put("last_name",rs.getString(2));
                data.add(row);
                          
             }
              out.println(data);
            
            }
            catch(ClassNotFoundException | SQLException e)
            {
                out.println(e);
            } 
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
//Connection con=DriverManager.getConnection("jdbc:postgresql://192.168.1.24:5432/sharan","postgres","L2s2b2s");
  //      Statement st=con.createStatement();
    //    ResultSet rs=st.executeQuery(query);
      //  while(rs.next()){
        // String userdata=rs.getString(1)+":"+rs.getString(2)+":"+rs.getString(3);
         //System.out.println(userdata);