package basic;

//import java.io.IOException;
//import java.io.PrintWriter;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.Statement;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//public class MyFirst extends HttpServlet {
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	
//	response.getWriter().append("Served at: ").append(request.getContextPath());
//
//		
//		String name = request.getParameter("name");
//        String fatherName = request.getParameter("fatherName");
//		String email = request.getParameter("email");
//        String password = request.getParameter("password");
//        String department=request.getParameter("department");
//        String dob=request.getParameter("dob");
//        String mobile = request.getParameter("mobile");
//        String address=request.getParameter("address");
//   
//        Connection conn = null;
//        PreparedStatement ps = null;
//
//        try {
//            // Load the JDBC driver
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//            // Establish the database connection
//            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","Sama0788");
//
//            // SQL query to insert data into the database
//            String sql = "INSERT INTO register(name, father_name, email, password,department, dob,mobile, address) VALUES (?, ?, ?, ?, ?, ?, ?,?)";
//            ps = conn.prepareStatement(sql);
//            ps.setString(1, name);
//            ps.setString(2, fatherName);
//            ps.setString(3, email);
//            ps.setString(4, password);
//            ps.setString(5, department);
//            ps.setString(6, dob);
//            ps.setString(7, mobile);
//            ps.setString(8, address);
//
//            // Execute the query
//            ps.executeUpdate();
//        
//		response.setContentType("text/html");
//		PrintWriter out=response.getWriter();
//		out.println("<html><body>");
//		out.println("<h2>User Details</h2>");
//		out.println("<p>Name: " + name + "</p>");
//        out.println("<p>Father's Name: " + fatherName + "</p>");
//        out.println("<p>password:"+password+"</p>");
//        out.println("<p>department:"+department+"</p>");
//        out.println("<p>Date Of Birth:"+dob+"</p>");
//        out.println("<p>Mobile: " + mobile + "</p>");
//        out.println("<p>Address: " + address + "</p>");   
//		out.println("</body></html>");
//        }
//        
//              catch (Exception e) {
//             System.out.println(e);
//            }
//    //    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//            String nameToDelete = request.getParameter("nameToDelete");
//
//         
//            PreparedStatement psDelete = null;
//
//            try {
//                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/register", "root", "Sama0788");
//
//                String deleteSql = "DELETE FROM register WHERE name = ?";
//                psDelete = conn.prepareStatement(deleteSql);
//                psDelete.setString(1, nameToDelete);
//
//                int rowsAffected = psDelete.executeUpdate();
//
//                response.setContentType("text/html");
//                PrintWriter out = response.getWriter();
//                out.println("<html><body>");
//                out.println("<h2>Delete Operation</h2>");
//
//                if (rowsAffected > 0) {
//                    out.println("<p>Data for " + nameToDelete + " deleted successfully.</p>");
//                } else {
//                    out.println("<p>No data found for " + nameToDelete + ".</p>");
//                }
//
//                out.println("</body></html>");
//
//            } catch (Exception e) {
//                System.out.println(e);
//            } finally {
//                // Close connections and resources
//            }
//                    }
//    
//	
//            
//            }
//        
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirst extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	//response.getWriter().append("Served at: ").append(request.getContextPath());
//		switch (action) {
//        case "insert":
//            insertData(request, response);
//            break;
//        case "delete":
//            displayData(request, response);
//            break;
//        default:
//            response.getWriter().println("Invalid action");
		
		String name = request.getParameter("name");
        String fatherName = request.getParameter("fatherName");
		String email = request.getParameter("email");
        String password = request.getParameter("password");
        String department=request.getParameter("department");
        String dob=request.getParameter("dob");
        String mobile = request.getParameter("mobile");
        String address=request.getParameter("address");
   
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the database connection
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","Sama0788");

            // SQL query to insert data into the database
            String sql = "INSERT INTO register(name, father_name, email, password,department, dob,mobile, address) VALUES (?, ?, ?, ?, ?, ?, ?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, fatherName);
            ps.setString(3, email);
            ps.setString(4, password);
            ps.setString(5, department);
            ps.setString(6, dob);
            ps.setString(7, mobile);
            ps.setString(8, address);

            // Execute the query
            ps.executeUpdate();
        
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html><body>");
		out.println("<h2>User Details</h2>");
		out.println("<p>Name: " + name + "</p>");
        out.println("<p>Father's Name: " + fatherName + "</p>");
        out.println("<p>password:"+password+"</p>");
        out.println("<p>department:"+department+"</p>");
        out.println("<p>Date Of Birth:"+dob+"</p>");
        out.println("<p>Mobile: " + mobile + "</p>");
        out.println("<p>Address: " + address + "</p>");   
		out.println("</body></html>");
        }
        
              catch (Exception e) {
             System.out.println(e);
            }
	}
}