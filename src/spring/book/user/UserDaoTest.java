package spring.book.user;

import spring.book.user.dao.DaoFactory;
import spring.book.user.dao.UserDao;
import spring.book.user.domain.User;

import java.sql.SQLException;

/**
 * packageName : spring.book.user
 * className : UserDaoTest
 * user : jwlee
 * date : 2022/09/12
 */
public class UserDaoTest {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        UserDao userDao = new DaoFactory().userDao();

        User user = new User();
        user.setId("jwlee");
        user.setName("이정우");
        user.setPassword("1234");

        userDao.add(user);
        System.out.println(user.getId() + "등록 성공");

        System.out.println(user.getId());

        User user2 = userDao.get(user.getId());
        System.out.println(user2.getName());
        System.out.println(user2.getPassword());

        System.out.println(user2.getId() + "조회 성공");

    }

}
