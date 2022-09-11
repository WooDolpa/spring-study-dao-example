package spring.book.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * packageName : spring.book.user.dao
 * className : NUserDao
 * user : jwlee
 * date : 2022/09/11
 */
public class NUserDao extends UserDao{

    public Connection getConnection() throws ClassNotFoundException, SQLException{
        Class.forName("org.mariadb.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mariadb://19341.synology.me:3306/springbook",
                "jwlee", "Epsltm1124!");
        return c;
    }

}
