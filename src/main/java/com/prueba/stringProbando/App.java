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
        Familias madre = bean.getBean("madre",Familias.class); 
        padre.enviar(" Juan");
        System.out.println(padre.decirProfesion());
        
        madre.enviar(" Juan");
        System.out.println(madre.decirProfesion());
        
        bean.close();
    }
}
