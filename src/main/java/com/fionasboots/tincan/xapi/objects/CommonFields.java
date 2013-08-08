package com.fionasboots.tincan.xapi.objects;

/**
 * The common fields that all xAPI objects can
 * contain
 * 
 * @author Fiona Bianchi
 */
public class CommonFields {
	
	private UUID id;

	/**
	 * @return the id
	 */
	public UUID getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(UUID id) {
		this.id = id;
	}	
}
