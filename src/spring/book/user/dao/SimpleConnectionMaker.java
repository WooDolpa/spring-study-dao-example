package spring.book.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * packageName : spring.book.user.dao
 * className : SimpleConnectionMaker
 * user : jwlee
 * date : 2022/09/12
 */

/**
 * 더이상 상속을 이용한 확장 방식을 사용할 필요가 없으니 추상 클래스로 만들 필요가 없음
 */
public class SimpleConnectionMaker {

    public Connection makeNewConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.mariadb.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mariadb://19341.synology.me:3306/springbook",
                "jwlee", "Epsltm1124!");
        return c;
    }

}
