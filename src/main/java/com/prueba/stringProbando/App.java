package com.prueba.stringProbando;

/**
 * Hello world!
 *
 */

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prueba.stringProbando.Entidades.Familia.Familias;
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext bean = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        Familias hijo = bean.getBean("Hijo",Familias.class);
        
        hijo.enviar("Pedro");
        
        System.out.println(hijo.decirProfesion());
        bean.close();
    }
}
