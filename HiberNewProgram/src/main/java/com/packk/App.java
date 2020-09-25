package com.packk;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	 System.out.println( "Hello World!" );
         Configuration cfgg=new Configuration();
         cfgg.configure("hibernate.cfg.xml");
         SessionFactory fact=cfgg.buildSessionFactory();
         System.out.println(fact);
         System.out.println(fact.isClosed());
        
        Person pp=new Person();
        pp.setName("faraz");
        pp.setProfile("buniness");
        
        Emoloyee ee=new Emoloyee();
        ee.setId(70);
        ee.setAddress("india");
        ee.setName("modi");
        ee.setOpen(true);
        ee.setX(199.9);
        ee.setAdddate(new Date());
        
        FileInputStream fis=new FileInputStream("src/main/java/billu.jpg");
        byte[] bb=new byte[fis.available()];
        fis.read(bb);
        ee.setImage(bb);
        
        Session sess=fact.openSession();
        
        Transaction tt = sess.beginTransaction();
        sess.save(pp);
        sess.save(ee);
        tt.commit();
        sess.close();
        System.out.println("done");
    }
}
