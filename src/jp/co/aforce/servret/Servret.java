package jp.co.aforce.servret;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.aforce.DAO.InfoDAO;
import jp.co.aforce.bean.Info;

@WebServlet(urlPatterns = { "/jp.co.aforce.servret/Servret" })
public class Servret extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response
			)throws ServletException, IOException {

		String last_name = request.getParameter("last_name");
		String first_name = request.getParameter("first_name");
		String sex = request.getParameter("sex");
		int birth_year = Integer.parseInt(request.getParameter("birth_year"));
		int birth_month = Integer.parseInt(request.getParameter("birth_month"));
		int birth_day = Integer.parseInt(request.getParameter("birth_day"));
		String job = request.getParameter("job");
		String phone_number = request.getParameter("phone_number");
		String mail_address = request.getParameter("mail_address");

		System.out.println(last_name + first_name + sex + birth_year + birth_month + birth_day + job + phone_number + mail_address);
		Info i = new Info();
		i.setLast_Name(last_name);
		i.setFirst_Name(first_name);
		i.setSex(sex);
		i.setBirth_Year(birth_year);
		i.setBirth_Month(birth_month);
		i.setBirth_Day(birth_day);
		i.setJob(job);
		i.setPhone_Number(phone_number);
		i.setMail_Address(mail_address);

		InfoDAO dao = new InfoDAO();
		try {

			int info = dao.search(last_name, first_name, sex, birth_year, birth_month, birth_day, job, phone_number, mail_address);
			if(info >= 1) {
				request.setAttribute("message", "すでに登録されています。");
				request.getRequestDispatcher("../views/insert.jsp").forward(request, response);

		} else {
			try {
				dao.insert(i);
				request.setAttribute("message", "登録に成功しました。");
				request.getRequestDispatcher("../views/insert.jsp").forward(request, response);
			}catch(Exception e) {
				request.setAttribute("message", "登録に失敗しました。");
				request.getRequestDispatcher("../views/insert.jsp").forward(request, response);
				e.printStackTrace();
			}

		}

		} catch (Exception e) {

			e.printStackTrace();
		}




	}

}
