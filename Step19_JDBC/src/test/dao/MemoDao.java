package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.MemoDto;
import test.util.DBConnect;

public class MemoDao {
	//자신이 참조값을 저장할 private 필드
		private static MemoDao dao;
		
		//외부에서 객체 생성하지 못하도록 한다.
		private MemoDao() {}
			
		//참조값을 리턴해주는 메소드
		public static MemoDao getInstance() {
			if(dao==null) {//최초 호출되면 null이므로//최초 한번 호출 될때 new 되고 그 다음 호출할때 에는 new가 생성 되지 않고 MemberDao를 리턴 한다.
				dao=new MemoDao();//객체 생성해서 static 필드에 담는다
			}
			return dao;
		}//!!!  작성 할수 있어야 한다. 시험.!
		//회원 한명의 정보를 리턴해주는 메소드
		public MemoDto getData(int num) {
			MemoDto dto=null;
			
			Connection conn=null;
			PreparedStatement pstmt=null;
			ResultSet rs=null;
			
			try {
				conn=new DBConnect().getConn();
				String sql="SELECT content"
						+ " FROM memo"
						+ " WHERE num=?";
				pstmt=conn.prepareStatement(sql);
				pstmt.setInt(1, num);
				rs=pstmt.executeQuery();
				while(rs.next()) {
					String content=rs.getString("content");
					String regdate=rs.getString("regdate");
					dto=new MemoDto(num, content, regdate);
					dto.setNum(num);
					dto.setContent(rs.getString("content"));
					dto.setRegdate(rs.getString("regdate"));
				}
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(rs!=null)rs.close();
					if(pstmt!=null)pstmt.close();
					if(conn!=null)conn.close();
				}catch (Exception e) {}
		}
			return dto;
			}
		//회원 목록을 리턴해주는 메소드
		public List<MemoDto> getList(){
			List<MemoDto> list=new ArrayList<>();
			Connection conn=null;
			PreparedStatement pstmt=null;
			ResultSet rs=null;
			try {
				//DBConnect 객체를 이용해서 Connection 객체의 참조값을 얻어온다.
				conn=new DBConnect().getConn();
				//실행할 sql 문
				String sql="SELECT * FROM memo"
						+ " ORDER BY num ASC";
				pstmt=conn.prepareStatement(sql);
				rs=pstmt.executeQuery();
				
				while(rs.next()) {
					int num=rs.getInt("num");
					String content=rs.getString("content");
					String regdate=rs.getString("regdate");
					
					MemoDto dto=new MemoDto(num, content, regdate);
					dto.setNum(num);
					dto.setContent(content);
					dto.setRegdate(regdate);
					list.add(dto);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
					// 객체를 사용했던 순서 역순으로 닫아준다.
					if(rs!=null)rs.close();
					if(pstmt!=null)pstmt.close();
					if(conn!=null)conn.close();
				}catch(Exception e) {}
			}
			return list;
		}
		//회원 한명의 정보를 DB에서 삭제하는 메소드
		public boolean delete(int num) {
			Connection conn=null;
			PreparedStatement pstmt=null;
			int flag=0;
			try {
				conn=new DBConnect().getConn();
				String sql="DELETE FROM memo"
						+ " WHERE num=?";
				pstmt=conn.prepareStatement(sql);
				pstmt.setInt(1, num);
				flag=pstmt.executeUpdate();
				System.out.println("회원정보를 삭제 했습니다.");			
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(pstmt!=null)pstmt.close();
					if(conn!=null)conn.close();
				}catch (Exception e) {}
		}
			if(flag>0) {
				return true;
			}else {
				return false;
			}
			}
		//회원정보를 DB에 저장하는 메소드(작업의 성공 여부가 bolean으로 리턴된다.)
		public boolean insert(MemoDto dto) {
			Connection conn=null;
			PreparedStatement pstmt=null;
			int flag=0;
			try {
				conn=new DBConnect().getConn();
				String sql="INSERT INTO memo"
						+ " (num, content, regdate)"
						+ " VALUES(member_seq.NEXTVAL, ?, to_char)";
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1, dto.getContent());
				pstmt.setString(2, dto.getRegdate());
				//sql 문을 수행하고 변화된 row의 갯수를 리턴 받는다. (1)
				flag=pstmt.executeUpdate();
				System.out.println("회원 정보를 추가 했습니다.");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch (Exception e) {
			}
			if(flag>0) {
				return true; //작업 성공 이란 의미에서 true를 리턴한다.
			}else {
				return false; //작업 실패라는 의미에서 false를 리턴한다.
			}
		}
	}
		//회원정보를 DB에 수정하는 메소드
		public boolean update(MemoDto dto) {
			Connection conn=null;
			PreparedStatement pstmt=null;
			int flag=0;
			try {
				conn=new DBConnect().getConn();
				String sql="UPDATE member"
						+ " SET content = ?"
						+ " WHERE num = ?" ;
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1, dto.getContent());
				pstmt.setInt(3, dto.getNum());
				//update 된 row의 갯수가 반환된다.
				flag=pstmt.executeUpdate();
				System.out.println("정보 수정!");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch (Exception e) {
			}
			if(flag>0) {
				return true;
			}else {
				return false;
			}
			}
		}
	}
