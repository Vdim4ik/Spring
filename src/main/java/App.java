import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld helloWorldBeen = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean == helloWorldBeen);

        Cat catBeen1 = (Cat) applicationContext.getBean("cat");
        Cat catBeen2 = (Cat) applicationContext.getBean("cat");

        System.out.println(catBeen1 == catBeen2);
    }
}