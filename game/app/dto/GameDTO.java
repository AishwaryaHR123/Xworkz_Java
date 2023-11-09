package com.xworkz.game.app.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

public class GameDTO implements Serializable,Comparable<GameDTO>{
	private Integer id;
	private String name;
	private Integer participants;
	private Integer points;
	private LocalDate eventDate;
	private String winner;
	private String runnerUp;
	private LocalTime duration;
	public GameDTO() {
	}

	public GameDTO(Integer id, String name, Integer participants, Integer points, LocalDate eventDate, String winner,
			String runnerUp, LocalTime duration) {
		super();
		this.id = id;
		this.name = name;
		this.participants = participants;
		this.points = points;
		this.eventDate = eventDate;
		this.winner = winner;
		this.runnerUp = runnerUp;
		this.duration = duration;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getParticipants() {
		return participants;
	}

	public Integer getPoints() {
		return points;
	}

	public LocalDate getEventDate() {
		return eventDate;
	}

	public String getWinner() {
		return winner;
	}

	public String getRunnerUp() {
		return runnerUp;
	}

	public LocalTime getDuration() {
		return duration;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setParticipants(int participants) {
		this.participants = participants;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	public void setEventDate(LocalDate eventDate) {
		this.eventDate = eventDate;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}

	public void setRunnerUp(String runnerUp) {
		this.runnerUp = runnerUp;
	}

	public void setDuration(LocalTime duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "GameDTO [id=" + id + ", name=" + name + ", participants=" + participants + ", points=" + points
				+ ", eventDate=" + eventDate + ", winner=" + winner + ", runnerUp=" + runnerUp + ", duration="
				+ duration + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((duration == null) ? 0 : duration.hashCode());
		result = prime * result + ((eventDate == null) ? 0 : eventDate.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + participants;
		result = prime * result + points;
		result = prime * result + ((runnerUp == null) ? 0 : runnerUp.hashCode());
		result = prime * result + ((winner == null) ? 0 : winner.hashCode());
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
		GameDTO other = (GameDTO) obj;
		if (duration == null) {
			if (other.duration != null)
				return false;
		} else if (!duration.equals(other.duration))
			return false;
		if (eventDate == null) {
			if (other.eventDate != null)
				return false;
		} else if (!eventDate.equals(other.eventDate))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (participants != other.participants)
			return false;
		if (points != other.points)
			return false;
		if (runnerUp == null) {
			if (other.runnerUp != null)
				return false;
		} else if (!runnerUp.equals(other.runnerUp))
			return false;
		if (winner == null) {
			if (other.winner != null)
				return false;
		} else if (!winner.equals(other.winner))
			return false;
		return true;
	}

	@Override
	public int compareTo(GameDTO arg) {
		return this.id.compareTo(arg.id);
	}

}
