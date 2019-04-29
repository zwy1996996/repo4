import com.itheima.dao.IAccountDao;
import com.itheima.dao.IUserDao;
import com.itheima.domain.Account;
import com.itheima.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {
    private InputStream in;
    private SqlSessionFactory factory;
    private SqlSession session;
    private IAccountDao accountDao;
    private IUserDao userDao;
    @Before
    public void Init() throws IOException {
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        factory = new SqlSessionFactoryBuilder().build(in);
        session = factory.openSession();
        accountDao = session.getMapper(IAccountDao.class);
        userDao = session.getMapper(IUserDao.class);
        }
    @After
    public void dectory() throws IOException {
        session.commit();
        session.close();
        in.close();

    }
    @Test
    public void test(){
        List<User> users = userDao.findAll();
        for (User user : users) {

            System.out.println(user);
            System.out.println(user.getAccounts());
            }

    }




}
