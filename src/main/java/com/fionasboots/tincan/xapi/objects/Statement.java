package com.fionasboots.tincan.xapi.objects;


import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

import com.fionasboots.tincan.xapi.objects.Object;


/**
 * A xAPI Statement that encapsulates experience.
 * 
 * @author Fiona Bianchi 
 */
@JsonSerialize(include=Inclusion.NON_NULL)
public class Statement extends CommonFields {

	private Object actor;
	private Object verb;
	private Object object;
	private Object context;
	private Datetime timestamp;
	private Datetime stored;
	private Object authority;
	private Version version;
	private Object[] attachments;
		
	/**
	 * @return the actor
	 */
	public Object getActor() {
		return actor;
	}
	/**
	 * @param actor the actor to set
	 */
	public void setActor(Object actor) {
		this.actor = actor;
	}
	/**
	 * @return the verb
	 */
	public Object getVerb() {
		return verb;
	}
	/**
	 * @param verb the verb to set
	 */
	public void setVerb(Object verb) {
		this.verb = verb;
	}
	/**
	 * @return the object
	 */
	public Object getObject() {
		return object;
	}
	/**
	 * @param object the object to set
	 */
	public void setObject(Object object) {
		this.object = object;
	}
	/**
	 * @return the context
	 */
	public Object getContext() {
		return context;
	}
	/**
	 * @param context the context to set
	 */
	public void setContext(Object context) {
		this.context = context;
	}
	/**
	 * @return the timestamp
	 */
	public Datetime getTimestamp() {
		return timestamp;
	}
	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(Datetime timestamp) {
		this.timestamp = timestamp;
	}
	/**
	 * @return the stored
	 */
	public Datetime getStored() {
		return stored;
	}
	/**
	 * @param stored the stored to set
	 */
	public void setStored(Datetime stored) {
		this.stored = stored;
	}
	/**
	 * @return the authority
	 */
	public Object getAuthority() {
		return authority;
	}
	/**
	 * @param authority the authority to set
	 */
	public void setAuthority(Object authority) {
		this.authority = authority;
	}
	/**
	 * @return the version
	 */
	public Version getVersion() {
		return version;
	}
	/**
	 * @param version the version to set
	 */
	public void setVersion(Version version) {
		this.version = version;
	}
	/**
	 * @return the attachments
	 */
	public Object[] getAttachments() {
		return attachments;
	}
	/**
	 * @param attachments the attachments to set
	 */
	public void setAttachments(Object[] attachments) {
		this.attachments = attachments;
	}

}
