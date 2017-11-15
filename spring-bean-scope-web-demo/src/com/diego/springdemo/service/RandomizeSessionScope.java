package com.diego.springdemo.service;

public class RandomizeSessionScope {
	private int randomNumber = 10;
	
	public int getRandomNumber() {
		return this.randomNumber;
	}
	
	public void generateRandomNumber() {
		this.randomNumber = (int) (Math.random() * 99999);
	}
}
