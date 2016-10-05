package co.edu.udem.olympicgames.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import co.edu.udem.olympicgames.jdbc.entities.News;

public class NewsDAOImpl implements NewsDAO {
	
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public News findNews(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<News> findNews() {
		
		List <News> lista = new ArrayList<News>();
		
		String sql = "SELECT * FROM news";
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				News news= new News();
				news.setTitle(rs.getString("title"));
				news.setDescription(rs.getString("description"));
				news.setImage(rs.getString("image"));
				news.setNewsurl(rs.getString("newsurl"));
				lista.add(news);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (ps != null) {
					ps.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

		return lista;
	}

}
