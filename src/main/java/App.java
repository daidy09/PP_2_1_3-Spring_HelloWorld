import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(bean.getMessage());
        HelloWorld bean1 = applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(bean1.getMessage());
        System.out.println(bean == bean1);

        Cat catBean = applicationContext.getBean("cat", Cat.class);
        System.out.println(catBean.getMessage());
        Cat catBean1 = applicationContext.getBean("cat", Cat.class);
        System.out.println(catBean1.getMessage());
        System.out.println(catBean == catBean1);
    }
}