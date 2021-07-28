import com.it.mapper.UserMapper;
import com.it.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper bean = context.getBean(UserMapper.class);
        /*List<User> users = bean.selectUser();
        for (User user : users) {
            System.out.println(user);
        }*/

//        bean.addUser(new User(6,"沙和尚","55555"));
        bean.deleteUser(1);
    }
}
