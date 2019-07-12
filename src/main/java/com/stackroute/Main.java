package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("file:src/beans.xml");
        Movie beanA=context.getBean("movieA", Movie.class);
        beanA.showActorInfo();

        Movie beanB=context.getBean("movie", Movie.class);
        beanB.showActorInfo();

    }
}