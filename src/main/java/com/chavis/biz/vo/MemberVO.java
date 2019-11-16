package com.chavis.biz.vo;

public class MemberVO {
	private int member_no;
	private String member_id;
	private String member_pw;
	private String member_mname;
	private String member_phonenumber;
	private int car_no;
	private String car_id;
	private String car_type;
	private String car_color;

	public MemberVO() {
		super();

	}

	public MemberVO(int member_no, String member_id, String member_pw, String member_mname, String member_phonenumber,
			int car_no, String car_id, String car_type, String car_color) {
		super();
		this.member_no = member_no;
		this.member_id = member_id;
		this.member_pw = member_pw;
		this.member_mname = member_mname;
		this.member_phonenumber = member_phonenumber;
		this.car_no = car_no;
		this.car_id = car_id;
		this.car_type = car_type;
		this.car_color = car_color;
	}

	public int getMember_no() {
		return member_no;
	}

	public void setMember_no(int member_no) {
		this.member_no = member_no;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getMember_pw() {
		return member_pw;
	}

	public void setMember_pw(String member_pw) {
		this.member_pw = member_pw;
	}

	public String getMember_mname() {
		return member_mname;
	}

	public void setMember_mname(String member_mname) {
		this.member_mname = member_mname;
	}

	public String getMember_phonenumber() {
		return member_phonenumber;
	}

	public void setMember_phonenumber(String member_phonenumber) {
		this.member_phonenumber = member_phonenumber;
	}

	public int getCar_no() {
		return car_no;
	}

	public void setCar_no(int car_no) {
		this.car_no = car_no;
	}

	public String getCar_id() {
		return car_id;
	}

	public void setCar_id(String car_id) {
		this.car_id = car_id;
	}

	public String getCar_type() {
		return car_type;
	}

	public void setCar_type(String car_type) {
		this.car_type = car_type;
	}

	public String getCar_color() {
		return car_color;
	}

	public void setCar_color(String car_color) {
		this.car_color = car_color;
	}

	@Override
	public String toString() {
		return "MemberVO [member_no=" + member_no + ", member_id=" + member_id + ", member_pw=" + member_pw
				+ ", member_mname=" + member_mname + ", member_phonenumber=" + member_phonenumber + ", car_no=" + car_no
				+ ", car_id=" + car_id + ", car_type=" + car_type + ", car_color=" + car_color + "]";
	}

}