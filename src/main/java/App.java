import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
            new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
            (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
            (HelloWorld) applicationContext.getBean("helloworld");
        Cat cat_bean = (Cat) applicationContext.getBean("cat");
        Cat cat_bean2 = (Cat) applicationContext.getBean("cat");

        System.out.println(bean.getMessage());
        System.out.println("hwbean eq: " + bean.equals(bean2));
        System.out.println("catbean eq: " + cat_bean.equals(cat_bean2));

    }
}