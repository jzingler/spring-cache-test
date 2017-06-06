package io.pivotal.domain;

public class Cache {
	private long id;
	private String testComment;
	
	public Cache(long id2) {
		this.id = id2;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTestComment() {
		return testComment;
	}
	public void setTestComment(String testComment) {
		this.testComment = testComment;
	}
}
