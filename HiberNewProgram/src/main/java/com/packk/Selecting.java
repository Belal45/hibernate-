package com.packk;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Selecting {
	public  static void main(String args[]) {
		Configuration cfgg=new Configuration();
        cfgg.configure("hibernate.cfg.xml");
        SessionFactory fact=cfgg.buildSessionFactory();
        Session ssss= fact.openSession();
        Emoloyee dd=(Emoloyee)ssss.load(Emoloyee.class, 1);
        System.out.println(dd);
        ssss.close();
        fact.close();
	}
}
