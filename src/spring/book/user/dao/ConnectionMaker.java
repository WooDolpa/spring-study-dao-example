package spring.book.user.dao;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * packageName : spring.book.user.dao
 * className : ConnectionMaker
 * user : jwlee
 * date : 2022/09/12
 */
public interface ConnectionMaker {

    public Connection makeNewConnection() throws ClassNotFoundException, SQLException;

}
