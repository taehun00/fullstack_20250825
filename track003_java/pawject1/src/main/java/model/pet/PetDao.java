package model.pet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PetDao {
	public List<PetDto> getPetsByUserId(int userid) {
	    List<PetDto> resultList = new ArrayList<>();
		String sql = "SELECT * FROM pet WHERE userid = ?";
		
		Connection conn = null;  PreparedStatement pstmt = null;   ResultSet  rset = null;
		String driver   = "oracle.jdbc.driver.OracleDriver";
		String url      = "jdbc:oracle:thin:@localhost:1521:xe";
		String user     = "system"; 
		String pass = "1234";
		
		try {
			Class.forName(driver);
			
			conn = DriverManager.getConnection(url, user, pass);
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, userid);
			
			rset = pstmt.executeQuery();
			
			while (rset.next()) {
				PetDto dto = new PetDto();
	            dto.setPetid(rset.getInt("petid"));
	            dto.setUserid(rset.getInt("userid"));
	            dto.setPetname(rset.getString("petname"));
	            dto.setPetbreed(rset.getString("petbreed"));
	            dto.setBirthdate(rset.getString("birthdate"));
	            dto.setPettypeid(rset.getInt("pettypeid"));
	            dto.setCreatedat(rset.getTimestamp("createdat").toLocalDateTime());

	            resultList.add(dto);
			}
			System.out.println("[PetDao] 펫 정보 로딩 완료: " + resultList.size() + "마리");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(rset != null) try { rset.close(); } catch (SQLException e) { e.printStackTrace(); }
			if(pstmt != null) try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); }
			if (conn != null) try { conn.close(); } catch (SQLException e) { e.printStackTrace(); }
		}
		
		return resultList;
	}
	
	
}
