package com.bitlabs;

public class UserLoin {
	private int id;
    private String name;
    private String pass;
    private String emal; 
	public UserLoin(int id, String name, String pass, String emal) {
		super();
		this.id = id;
		this.name = name;
		this.pass = pass;
		this.emal = emal;
	}
	
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPass() {
			return pass;
		}
		public void setPass(String pass) {
			this.pass = pass;
		}
		public String getEmal() {
			return emal;
		}
		public void setEmal(String emal) {
			this.emal = emal;
		}
}
