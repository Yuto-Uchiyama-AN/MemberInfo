package jp.co.aforce.bean;

public class Info implements java.io.Serializable {

	private String member_id;
	private String last_name;
	private String first_name;
	private String sex;
	private int birth_year;
	private int birth_month;
	private int birth_day;
	private String job;
	private String phone_number;
	private String mail_address;

	public String getMember_Id() {
		return member_id;
	}

	public String getLast_Name() {
		return last_name;
	}

	public String getFirst_Name() {
		return first_name;
	}

	public String getSex() {
		return sex;
	}

	public int getBirth_Year() {
		return birth_year;
	}

	public int getBirth_Month() {
		return birth_month;
	}

	public int getBirth_Day() {
		return birth_day;
	}

	public String getPhone_Number() {
		return phone_number;
	}

	public String getMail_Address() {
		return mail_address;
	}

	public String getJob() {
		return job;
	}

	public void setMember_Id(String member_id) {
		this.member_id = member_id;
	}

	public void setLast_Name(String last_name) {
		this.last_name = last_name;
	}

	public void setFirst_Name(String first_name) {
		this.first_name = first_name;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setBirth_Year(int birth_year) {
		this.birth_year = birth_year;
	}

	public void setBirth_Month(int birth_month) {
		this.birth_month = birth_month;
	}

	public void setBirth_Day(int birth_day) {
		this.birth_day = birth_day;
	}

	public void setPhone_Number(String phone_number) {
		this.phone_number = phone_number;
	}

	public void setMail_Address(String mail_address) {
		this.mail_address = mail_address;
	}

	public void setJob(String job) {
		this.job = job;
	}

}
