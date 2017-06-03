package com.dac.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PostClass {

	private String post;
	private int like_count;
	private int dislike_count;
	private int superlike;

	public String getPost() {
		return post;
	}

	@JsonProperty("POST")
	public void setPost(String post) {
		this.post = post;
	}

	public int getLike_count() {
		return like_count;
	}
	@JsonProperty("LIKE_COUNT")
	public void setLike_count(int like_count) {
		this.like_count = like_count;
	}

	public int getDislike_count() {
		return dislike_count;
	}
	@JsonProperty("DISLIKE_COUNT")
	public void setDislike_count(int dislike_count) {
		this.dislike_count = dislike_count;
	}

	public int getSuperlike() {
		return superlike;
	}
	@JsonProperty("SUPER_LIKE_COUNT")
	public void setSuperlike(int superlike) {
		this.superlike = superlike;
	}

}
