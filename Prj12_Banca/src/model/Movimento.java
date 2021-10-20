package model;

import java.time.LocalDateTime;

public class Movimento {

	private LocalDateTime marcaTemporale;
	private double amount;
	private String description;
	/**
	 * @param amount
	 * @param description
	 */
	public Movimento(double amount, String description) {
		this.marcaTemporale = LocalDateTime.now();
		this.amount = amount;
		this.description = description;
	}
	
	double getAmount() {
		return this.amount;
	}
	
	@Override
	public String toString() {
		return "[" + marcaTemporale + " - " + description + " € " + amount
				+ "]";
	}
	
	
	
}
