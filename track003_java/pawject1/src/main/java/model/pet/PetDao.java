package model.pet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PetDao {
	public PetDto getPetByUserId(int userid) {
		PetDto result = null;
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
			
			if(rset.next()) {
				result = new PetDto();
				result.setPetid(rset.getInt("petid"));
				result.setUserid(rset.getInt("userid"));
				result.setPetname(rset.getString("petname"));
				result.setPetbreed(rset.getString("petbreed"));
				result.setBirthdate(rset.getString("birthdate"));

				result.setPettypeid(rset.getInt("pettypeid"));
				result.setCreatedat(rset.getTimestamp("createdat").toLocalDateTime());
				
				System.out.println("[PetDao] 펫 정보 로딩 완료: " + result.getPetname());
			} else {
			    System.out.println("[PetDao] rset.next() 실패 → result는 null");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(rset != null) try { rset.close(); } catch (SQLException e) { e.printStackTrace(); }
			if(pstmt != null) try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); }
			if (conn != null) try { conn.close(); } catch (SQLException e) { e.printStackTrace(); }
		}
		
		return result;
	}
	
	
}
