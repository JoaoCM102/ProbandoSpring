package com.prueba.stringProbando;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prueba.stringProbando.Entidades.Familia.FamiliaConfiguracion;
import com.prueba.stringProbando.Entidades.Familia.Familias;
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext bean = new AnnotationConfigApplicationContext(FamiliaConfiguracion.class);
        
        Familias padre = bean.getBean("padre",Familias.class);
        
        padre.enviar("Pedro");
        
        System.out.println(padre.decirProfesion());
        bean.close();
    }
}
