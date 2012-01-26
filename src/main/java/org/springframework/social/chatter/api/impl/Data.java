package org.springframework.social.chatter.api.impl;

import java.net.URL;

public class Data {
	private String id;
	private String versionId;
	private String title;
	private String description;
	private String fileType;
	private int fileSize;
	private URL downloadUrl;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getVersionId() {
		return versionId;
	}
	public void setVersionId(String versionId) {
		this.versionId = versionId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public int getFileSize() {
		return fileSize;
	}
	public void setFileSize(int fileSize) {
		this.fileSize = fileSize;
	}
	public URL getDownloadUrl() {
		return downloadUrl;
	}
	public void setDownloadUrl(URL downloadUrl) {
		this.downloadUrl = downloadUrl;
	}
}
