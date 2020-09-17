package com.goose.zhongkai.entity;

public class Page {
	private int currentP;
	
	private int previousP;
	
	private int nextP;

	private int totalP;
	
	private int totalAmount;
	
	public Page() {
		super();
		this.currentP = 1;
		this.previousP = -1;
		this.nextP = 2;
		this.totalP = 1;
		this.totalAmount=0;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	
	public int getCurrentP() {
		return currentP;
	}

	public void setCurrentP(int currentP) {
		this.currentP = currentP;
	}

	public int getPreviousP() {
		return previousP;
	}

	public void setPreviousP(int previousP) {
		this.previousP = previousP;
	}

	public int getNextP() {
		return nextP;
	}

	public void setNextP(int nextP) {
		this.nextP = nextP;
	}

	public int getTotalP() {
		return totalP;
	}

	public void setTotalP(int totalP) {
		this.totalP = totalP;
	}
}
