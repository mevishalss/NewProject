package dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDetails {
	@Id
	@Column(name="u_id")
	private String userid;
	private String pass;
	public UserDetails(String userid) {
		super();
		this.userid = userid;
	}
	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public UserDetails(String userid, String pass) {
		super();
		this.userid = userid;
		this.pass = pass;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}

}
