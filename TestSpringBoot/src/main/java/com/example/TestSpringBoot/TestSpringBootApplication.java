package com.example.TestSpringBoot;

import com.example.TestSpringBoot.dao.CommitteesDAO;
import com.example.TestSpringBoot.entities.Committees;
import org.apache.naming.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@SpringBootApplication
public class TestSpringBootApplication {

	public static void main(String[] args) {

		/*
		ApplicationContext appContext = SpringApplication.run(TestSpringBootApplication.class, args);
		Outfit dress = appContext.getBean(Outfit.class);
		dress.wear();
		GirlFriend girlFriend = appContext.getBean(GirlFriend.class);
		System.out.println(girlFriend);
		System.out.println(girlFriend.outfit);
		girlFriend.outfit.wear();
		*/

		/* //XML
		ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
		Shirt shirt = context.getBean(Shirt.class);
		shirt.wear();
		*/

		/* //Bean Factory
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
		reader.loadBeanDefinitions(new ClassPathResource("app.xml"));
		Shirt shirt = beanFactory.getBean(Shirt.class);
		shirt.wear();
		*/

		/*
		// loading xml file into spring container, create instance of bean and load it into container
		ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("app.xml");

		//close container, invoke destroy method
		cap.close();
		 */

		/*
		// singleton
		Employee employee = appContext.getBean(Employee.class);
		employee.setName("An");
		Employee employee1 = appContext.getBean(Employee.class);
		System.out.println(employee1.getName());

		//prototype
		PrototypeTest pt1 = appContext.getBean(PrototypeTest.class);
		pt1.setName("A");
		System.out.println(pt1.getName());
		PrototypeTest pt2 = appContext.getBean(PrototypeTest.class);
		pt2.setName("B");
		System.out.println(pt2.getName());
		*/
//		CommitteesDAO a = new CommitteesDAO();
//		a.save(new Committees("Nam"));
//		List<Committees> list = a.findAll();
//		list.f
//		orEach(committees -> System.out.println(committees.getName()));
//		a.close();
		demoInsert();
		CommitteesDAO committeesDAO = new CommitteesDAO();
		//committeesDAO.close();
	}
	public static void demoInsert() {
		CommitteesDAO customerDAO = new CommitteesDAO();
		customerDAO.save(new Committees("Kai2"));
		customerDAO.save(new Committees("Kai1"));
		customerDAO.save(new Committees("Kai3"));
		customerDAO.save(new Committees("Kai4"));
		customerDAO.save(new Committees("Kai5"));
		customerDAO.save(new Committees("Kai6"));
	}
}
