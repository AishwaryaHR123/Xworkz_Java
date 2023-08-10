package com.xworkz.Encapsulation;

public class Amazon {
	private String userName;
	private String loginId;
	private boolean shoping;
	private String paytype;
	private boolean offer;
	private String qualtityOfProduct;
	private int noOfUsers;
	private boolean primeSubscription;
	private String theme;
	private boolean cart;
	private boolean order;
	private String qos;
	private boolean notification;
	private double amount;

	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getLoginId() {
		return this.loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public int getNoOfUsers() {
		return this.noOfUsers;
	}

	public void setNoOfUsers(int noOfUsers) {
		this.noOfUsers = noOfUsers;
	}

	public String getPaytype() {
		return this.paytype;
	}

	public void setPaytype(String paytype) {
		this.paytype = paytype;
	}

	public String getQos() {
		return this.qos;
	}

	public void setQos(String qos) {
		this.qos = qos;
	}

	public String getQualtityOfProduct() {
		return this.qualtityOfProduct;
	}

	public void setQualtityOfProduct(String qualtityOfProduct) {
		this.qualtityOfProduct = qualtityOfProduct;
	}

	public String getTheme() {
		return this.theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public boolean isCart() {
		return this.cart;
	}

	public void setCart(boolean cart) {
		this.cart = cart;
	}

	public boolean isNotification() {
		return this.notification;
	}

	public void setNotification(boolean notification) {
		this.notification = notification;
	}

	public boolean isOffer() {
		return this.offer;
	}

	public void setOffer(boolean offer) {
		this.offer = offer;
	}

	public boolean isOrder() {
		return this.order;
	}

	public void setOrder(boolean order) {
		this.order = order;
	}

	public boolean isPrimeSubscription() {
		return this.primeSubscription;
	}

	public void setPrimeSubscription(boolean primeSubscription) {
		this.primeSubscription = primeSubscription;
	}

	public boolean isShoping() {
		return this.shoping;
	}

	public void setShoping(boolean shoping) {
		this.shoping = shoping;
	}

}
