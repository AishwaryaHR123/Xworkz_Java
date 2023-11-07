package com.xworkz.pendrive.app.dto;

public class RobotDTO implements Comparable<RobotDTO>{
	private String robotName;
	private double cost;
	private boolean safety;
	private String mobility;
	public RobotDTO() {
	}
	public RobotDTO(String robotName, double cost, boolean safety, String mobility) {
		super();
		this.robotName = robotName;
		this.cost = cost;
		this.safety = safety;
		this.mobility = mobility;
	}
	public String getRobotName() {
		return robotName;
	}
	public double getCost() {
		return cost;
	}
	public boolean isSafety() {
		return safety;
	}
	public String getMobility() {
		return mobility;
	}
	public void setRobotName(String robotName) {
		this.robotName = robotName;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public void setSafety(boolean safety) {
		this.safety = safety;
	}
	public void setMobility(String mobility) {
		this.mobility = mobility;
	}
	@Override
	public String toString() {
		return "RobotDTO [robotName=" + robotName + ", cost=" + cost + ", safety=" + safety + ", mobility=" + mobility
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((mobility == null) ? 0 : mobility.hashCode());
		result = prime * result + ((robotName == null) ? 0 : robotName.hashCode());
		result = prime * result + (safety ? 1231 : 1237);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RobotDTO other = (RobotDTO) obj;
		if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
			return false;
		if (mobility == null) {
			if (other.mobility != null)
				return false;
		} else if (!mobility.equals(other.mobility))
			return false;
		if (robotName == null) {
			if (other.robotName != null)
				return false;
		} else if (!robotName.equals(other.robotName))
			return false;
		if (safety != other.safety)
			return false;
		return true;
	}
	@Override
	public int compareTo(RobotDTO argument) {
		RobotDTO current=this;
		return current.robotName.compareTo(argument.robotName);
		
	}

}
