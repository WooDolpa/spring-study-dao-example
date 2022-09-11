package spring.book.user;

import spring.book.user.dao.ConnectionMaker;
import spring.book.user.dao.DConnectionMaker;
import spring.book.user.dao.UserDao;

import java.sql.SQLException;

/**
 * packageName : spring.book.user
 * className : UserDaoTest
 * user : jwlee
 * date : 2022/09/12
 */
public class UserDaoTest {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        ConnectionMaker connectionMaker = new DConnectionMaker();
        UserDao userDao = new UserDao(connectionMaker);
    }

}
