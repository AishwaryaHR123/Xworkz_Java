package com.xworkz.Encapsulation;

public class Netflix {
	private boolean subcription;
	private String theme;
	private String accountName;
	private String language;
	private String accountPrivacy;
	private String streamQuality;
	private int noOfusers;
	private String loginId;
	private String content;
	private boolean offlineViewing;
	private boolean download;
	private double amount;
	private String password;
	private String founder;

	public boolean isSubcription() {
		return this.subcription;
	}

	public void setSubcription(boolean subcription) {
		this.subcription = subcription;
	}

	public String getTheme() {
		return this.theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getAccountPrivacy() {
		return this.accountPrivacy;
	}

	public void setAccountPrivacy(String accountPrivacy) {
		this.accountPrivacy = accountPrivacy;
	}

	public String getStreamQuality() {
		return this.streamQuality;
	}

	public void setStreamQuality(String streamQuality) {
		this.streamQuality = streamQuality;
	}

	public int getNoOfusers() {
		return this.noOfusers;
	}

	public void setNoOfusers(int noOfusers) {
		this.noOfusers = noOfusers;
	}

	public String getLoginId() {
		return this.loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public boolean isOfflineViewing() {
		return this.offlineViewing;
	}

	public void setOfflineViewing(boolean offlineViewing) {
		this.offlineViewing = offlineViewing;
	}

	public boolean isDownload() {
		return this.download;
	}

	public void setDownload(boolean download) {
		this.download = download;
	}

	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFounder() {
		return this.founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}
}
