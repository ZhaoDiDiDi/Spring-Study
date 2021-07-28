import com.it.config.MyConfig;
import com.it.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
//        User getUser = context.getBean("user",User.class);
        User getUser = context.getBean("getUser",User.class);
        System.out.println(getUser.getName());
    }
}
