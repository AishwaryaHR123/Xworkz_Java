package com.xworkz.Equals;

public class Sniper {
	private String bulletType;
	private int speed;
	private String clothType;
	private int bulletWeight;
	private int distance;
	private boolean spotterSkill;

	public Sniper() {
	}

	public Sniper(String bulletType, int speed, String clothType, int bulletWeight, int distance,
			boolean spotterSkill) {
		super();
		this.bulletType = bulletType;
		this.speed = speed;
		this.clothType = clothType;
		this.bulletWeight = bulletWeight;
		this.distance = distance;
		this.spotterSkill = spotterSkill;
	}

	@Override
	public String toString() {
		return "bulletType=" + bulletType + ", speed=" + speed + ", clothType=" + clothType + ", bulletWeight="
				+ bulletWeight + ", distance=" + distance + ", spotterSkill=" + spotterSkill + "";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoking equals in Sniper");
		if (obj != null) {
			System.out.println("object is not null");
			if (obj instanceof Sniper) {
				System.out.println("object is a Sniper");
				Sniper casted = (Sniper) obj;
				Sniper currentInstance = this;
				if (casted.bulletType.equals(currentInstance.bulletType) && casted.speed == currentInstance.speed
						&& casted.clothType.equals(currentInstance.clothType)) {
					System.out.println("bulletType,speed,clothType are same");
					return true;
				}

				else {
					System.err.println("bulletType,speed,clothType are not same");
				}

			}
		} else {
			System.err.println("object is null");
		}
		return super.equals(obj);
	}

}
