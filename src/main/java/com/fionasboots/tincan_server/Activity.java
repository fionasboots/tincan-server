package com.fionasboots.tincan_server;

public class Activity {
	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}
	/**
	 * @return the activity
	 */
	public String getActivity() {
		return activity;
	}
	/**
	 * @param activity the activity to set
	 */
	public void setActivity(String activity) {
		this.activity = activity;
	}
	/**
	 * @return the when
	 */
	public String getWhen() {
		return when;
	}
	/**
	 * @param when the when to set
	 */
	public void setWhen(String when) {
		this.when = when;
	}
	
	
	private String user;
	private String activity;
	private String when;
}
