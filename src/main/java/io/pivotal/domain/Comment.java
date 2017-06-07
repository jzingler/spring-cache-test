package io.pivotal.domain;

public class Comment {
	private long id;
	private String testComment;
	
	public Comment(long id2) {
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
