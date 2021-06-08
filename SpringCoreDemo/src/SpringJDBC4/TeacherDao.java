package SpringJDBC4;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class TeacherDao {

	
	@Autowired
	DataSource dataSource;
	
	private JdbcTemplate jdbctemplate= new JdbcTemplate();
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		
		this.jdbctemplate=new JdbcTemplate(dataSource);
		this.dataSource = dataSource;
	}

	public String getTeacherName(int teacherid)
	{
		String sql="select tname from teacher where tid=?";
		return jdbctemplate.queryForObject(sql, new Object[] {teacherid}, String.class);
	}
	
	public int getTeacherCount()
	{
		String sql="Select count(*) from teacher";
		return jdbctemplate.queryForObject(sql,null, Integer.class);
		
	}
	
	public Teacher getTeacherObject(int teacherid)
	{
		String sql="select * from teacher where tid=?";
		return jdbctemplate.queryForObject(sql, new Object[] {teacherid},new TeacherMapper() );
	}

	public static final class TeacherMapper implements RowMapper<Teacher>
	{

		@Override
		public Teacher mapRow(ResultSet rs, int rowNum) throws SQLException {
			Teacher teacher= new Teacher(rs.getInt("tid"),rs.getString("tname"),rs.getString("taddress"));
			return teacher;
		}
		
	}
	
	
	

		
		
		
	

}
