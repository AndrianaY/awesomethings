package mentor.salad.test;

import mentor.salad.daopattern.dao.DaoFactory;
import mentor.salad.daopattern.dao.UserDao;
import mentor.salad.daopattern.domain.User;
import mentor.salad.daopattern.mysql.MySqlDaoFactory;
import org.junit.Assert;
import org.junit.Test;


import java.sql.Connection;
import java.util.List;

/**
 * Created by Andriana on 12.10.2016.
 */

public class TestUserDao{
@Test
public void testGetAll() throws Exception {
        DaoFactory daoFactory = new MySqlDaoFactory();
        List<User> list;
        try (Connection con = daoFactory.getConnection()) {
        UserDao dao = daoFactory.getUserDao(con);
        list = dao.getAll();
        }
        Assert.assertNotNull(list);
        Assert.assertTrue(list.size() > 0);
        }
}