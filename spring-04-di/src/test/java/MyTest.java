import com.it.pojo.Student;
import com.it.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");

        System.out.println(student.toString());
        /*
        * Student{name='哈哈',
        *              address=Address{address='广西'},
        *              books=[红楼梦, 水浒传, 西游记, 三国],
        *              hobbys=[听歌, 敲代码, 看电影],
        *              card={身份证=1111111111111111,
        *              银行卡=2222222222222222, =},
        *              games=[CSGO, COD, PUBG],
        *              wife='null',
        *              info={studentID=2019014,
        *              password=123456,
        *              gender=male,
        *              username=root}
        * }*/
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user1 = context.getBean("user2", User.class);
        User user2 = context.getBean("user2", User.class);

        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user1==user2);

    }
}
