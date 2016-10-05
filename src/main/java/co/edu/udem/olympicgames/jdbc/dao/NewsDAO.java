package co.edu.udem.olympicgames.jdbc.dao;

import java.util.List;

import co.edu.udem.olympicgames.jdbc.entities.News;

public interface NewsDAO {
	
	public News findNews(int id);
	
	public List<News> findNews();

}
