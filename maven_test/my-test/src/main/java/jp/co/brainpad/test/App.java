package jp.co.brainpad.test;

/**
 * Hello world!
 *
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
public class App 
{
    /* public static void main( String[] args ) */
    /* { */
    /*     System.out.println( "Hello World!" ); */
    /* } */
    public static void main( String[] args ){
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        context.getBean(HelloWorldPrinter.class).run();
    }
}
