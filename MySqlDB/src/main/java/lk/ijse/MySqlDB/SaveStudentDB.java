package lk.ijse.MySqlDB;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 7/9/2023
 * Time : 12:20 AM
 */

public class SaveStudentDB extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("got");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // get value from frontend request
        String name = req.getParameter("name");
        String city = req.getParameter("city");

        // get value from deployment descriptor ( web.xml / dd )
        String dbName = getServletContext().getInitParameter("db-name");
        String dbPassword = getServletContext().getInitParameter("db-password");
        String dbDriver = getServletContext().getInitParameter("mysql-driver");
        String dbUrl = getServletContext().getInitParameter("db-url");

        // JDBC
        try {

            Class.forName(dbDriver);
            Connection connection = DriverManager.getConnection(dbUrl, dbName, dbPassword);

            PreparedStatement ptm = connection.prepareStatement("INSERT INTO student VALUES (?,?)");
            ptm.setString(1, name);
            ptm.setString(2, city);
            ptm.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
