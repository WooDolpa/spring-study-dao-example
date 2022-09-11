package spring.book.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * packageName : spring.book.user.dao
 * className : DConnectionMaker
 * user : jwlee
 * date : 2022/09/12
 */
public class DConnectionMaker implements ConnectionMaker{

    // D 사의 독자적인 방법으로 Connection 을 생성하는 코드
    public Connection makeNewConnection() throws ClassNotFoundException, SQLException {

        Class.forName("org.mariadb.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mariadb://19341.synology.me:3306/springbook",
                "jwlee", "Epsltm1124!");
        return c;

    }
}
