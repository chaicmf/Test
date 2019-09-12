import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Test{
        @SuppressWarnings("resource")
        public static void main(String[] args) throws IOException {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
            context.start();
            System.in.read();
        }
}
