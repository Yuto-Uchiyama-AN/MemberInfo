package jp.co.aforce.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import jp.co.aforce.bean.Info;
import jp.co.aforce.servret.Member;

public class InfoDAO extends DAO {

	public ArrayList<Info> search(String member_id)
			throws Exception {
		ArrayList<Info> list = new ArrayList<>();

		Connection con = getConnection();

		PreparedStatement st = con.prepareStatement(
				"select * from menber_info where member_id like '%" + member_id + "%'");
		st.setString(1, "%" + member_id + "%");
		ResultSet rs = st.executeQuery();

		while (rs.next()) {
			Info p = new Info();
			p.setMember_Id(rs.getString("member_id"));
			p.setLast_Name(rs.getString("last_name"));
			p.setFirst_Name(rs.getString("first_name"));
			p.setSex(rs.getString("sex"));
			p.setBirth_Year(rs.getInt("birth_year"));
			p.setBirth_Month(rs.getInt("birth_month"));
			p.setBirth_Day(rs.getInt("birth_day"));
			p.setPhone_Number(rs.getString("phone_number"));
			p.setMail_Address(rs.getString("mail_address"));
			p.setJob(rs.getString("job"));
			list.add(p);
		}

		st.close();
		con.close();
		return list;
	}

	public int insert(Info info) throws Exception {
		Connection con = getConnection();

		Member m = new Member();
		String str = m.time();

		PreparedStatement st = con.prepareStatement(
				"insert into menber_info values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

		st.setString(1, "A"+ str);
		st.setString(2, info.getLast_Name());
		st.setString(3, info.getFirst_Name());
		st.setString(4, info.getSex());
		st.setInt(5, info.getBirth_Year());
		st.setInt(6, info.getBirth_Month());
		st.setInt(7, info.getBirth_Day());
		st.setString(9, info.getPhone_Number());
		st.setString(10, info.getMail_Address());
		st.setString(8, info.getJob());

		int line = st.executeUpdate();

		st.close();
		con.close();
		return line;

	}

	public int search(String last_name, String first_name, String sex, int birth_year,
			int birth_month, int birth_day, String job, String phone_number, String mail_address)
			throws Exception {

		Connection con = getConnection();

		PreparedStatement st;
		st = con.prepareStatement(
				"select count(*) from menber_info where last_name=? and first_name=? and sex=? and birth_year=? and birth_month=? and birth_day=? and job=? and phone_number=? and mail_address=? ");
		st.setString(1, last_name);
		st.setString(2, first_name);
		st.setString(3, sex);
		st.setInt(4, birth_year);
		st.setInt(5, birth_month);
		st.setInt(6, birth_day);
		st.setString(7, job);
		st.setString(8, phone_number);
		st.setString(9, mail_address);
		ResultSet rs = st.executeQuery();


		int count = 0;
		while (rs.next()) {

			count = rs.getInt("count(*)");

		}
		st.close();
		con.close();
		return count;
	}


	}

