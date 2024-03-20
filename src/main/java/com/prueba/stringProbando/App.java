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
        
        Familias padre = bean.getBean("padre",Familias.class);
        
        padre.enviar(" Juan");
        System.out.println(padre.decirProfesion());
        
        bean.close();
    }
}
