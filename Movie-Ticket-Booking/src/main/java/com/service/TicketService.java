package com.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.model.Ticket;

@Service
public class TicketService {

	public double calculateTotalCost(Ticket ticket, Map<String, String> map) {
		double totalCost = 0;
		for (Map.Entry<String, String> entry : map.entrySet())
			if (ticket.getCircleType().equals(entry.getValue()))
				totalCost = Integer.parseInt(entry.getKey()) * ticket.getNoOfTickets();
		return totalCost;

	}
}