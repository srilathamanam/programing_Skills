package jsp_dynamic_example;

public class MVCBean {
	private String username, userpassword;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpassword() {
		return userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	public boolean validate() {
		  if (userpassword.equals("abc")) {
		   return true;
		  } else {
		   return false;
		  }
	}
}
