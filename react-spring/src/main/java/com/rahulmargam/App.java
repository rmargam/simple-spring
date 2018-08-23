package com.rahulmargam;

import com.rahulmargam.configuration.OrgConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(OrgConfig.class);
        Organization org = (Organization) ctx.getBean("organization");
        System.out.println(org.corporateService());
        System.out.println(org.toString());
        System.out.println(org.corporateSlogan());
    }
}
