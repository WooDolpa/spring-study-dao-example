package spring.book.user.dao;

/**
 * packageName : spring.book.user.dao
 * className : DaoFactory
 * user : jwlee
 * date : 2022/09/12
 */
public class DaoFactory {

    /**
     * 팩토리 메소드는 UserDao 타입의 오브젝트를 어떻게 만들고, 어떻게 준비시킬지 결정
     *
     * @return
     */
    public UserDao userDao() {
        return new UserDao(connectionMaker());
    }

    public AccountDao accountDao() {
        return new AccountDao(connectionMaker());
    }
    public MessageDao messageDao() {
        return new MessageDao(connectionMaker());
    }

    public ConnectionMaker connectionMaker() {
        return new DConnectionMaker();
    }

}
