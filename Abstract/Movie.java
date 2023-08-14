package com.xworkz.Abstract;

public abstract class Movie {
	public void audio() {
		System.out.println("invoking audio in movie");
	}

	public void vedio() {
		System.out.println("invoking vedio in movie");
	}

	public void dialogue() {
		System.out.println("invoking dialogue in Movie");
	}

	public boolean theme() {
		System.out.println("invoking theme in Movie");
		return true;
	}

	public void climax() {
		System.out.println("invoking Story in Movie");
	}

	public abstract void song();

	public abstract boolean dance();

	public abstract void display();

	public abstract int releaseDate();

	public abstract boolean entertain();

}
