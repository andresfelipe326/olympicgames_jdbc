package co.edu.udem.olympicgames.jdbc.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edu.udem.olympicgames.jdbc.entities.News;

public class NewsDAOImplTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFindNewsInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindNews() {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");

	    // Se obtiene el servicio que implementa los servicios de la base de datos
	    NewsDAO sesionDAO = (NewsDAO) context.getBean("newsDAO");

	    // Se realiza el insert
	    List<News> newsList = sesionDAO.findNews();
	    for (News news2 : newsList) {
	    	News news = news2;
	    	System.out.println(news.getId() + " " + news.getTitle() + " " + news.getDescription() + " " + news.getNewsurl() + " " + news.getImage());
			
		}
	}

}
