package day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class PostDao {
	private DataSource dataSource;
	protected JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void readAll() {

		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		String url = "jdbc:mysql://localhost:3306/DAC2017";
		try {

			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager.getConnection(url, "root", "");
			String query = "SELECT * FROM POST";
			st = conn.createStatement();
			rs = st.executeQuery(query);
			while (rs.next()) {

				String post = rs.getString("POST");
				System.out.println(post);

			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				rs.close();
				st.close();
				conn.close();

			} catch (Exception e2) {

				// TODO: handle exception
			}
		}

	}

	public void readAllWithSpring() {
		
		String sql = "SELECT * FROM POST";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
		System.out.println(list);
		
	}
	
	public void updatePost() {
		String sql = "UPDATE POST SET POST=? WHERE ID=?";
		String updatePostValue = "WINTER IS COMING";
		int id = 1;
		jdbcTemplate.update(sql, updatePostValue, id);
	}
	
	
	
	
	
}
