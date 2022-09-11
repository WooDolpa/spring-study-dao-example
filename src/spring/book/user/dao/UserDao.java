package spring.book.user.dao;

import spring.book.user.domain.User;

import java.sql.*;

/**
 * packageName : spring.book.user.dao
 * className : UserDao
 * user : jwlee
 * date : 2022/09/11
 */
public abstract class UserDao {

    public void add(User user) throws ClassNotFoundException, SQLException {

        Connection c = getConnection();

        PreparedStatement ps = c.prepareStatement("insert into users(id, name, password) values(?,?,?)");
        ps.setString(1, user.getId());
        ps.setString(2, user.getName());
        ps.setString(3, user.getPassword());

        ps.executeUpdate();

        ps.close();
        c.close();
    }

    public User get(String id) throws ClassNotFoundException, SQLException {

        Connection c = getConnection();

        PreparedStatement  ps = c.prepareStatement("select * from users where id = ?");
        ps.setString(1, id);

        ResultSet rs = ps.executeQuery();
        rs.next();
        User user = new User();
        user.setId(rs.getString("id"));
        user.setName(rs.getString("name"));
        user.setPassword(rs.getString("password"));

        rs.close();
        ps.close();
        c.close();

        return user;
    }

    /**
     * 구현코드는 제거되고 추상 메소드로 바뀌었다.
     * 메소드의 구현은 서브클래스가 담당
     *
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public abstract Connection getConnection() throws ClassNotFoundException, SQLException;

}
