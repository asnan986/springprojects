package com.controller;

import java.util.HashMap;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.model.Ticket;
import com.service.TicketService;

@Controller
public class TicketController {

	@Autowired
	private TicketService ticketService;

	@RequestMapping("/showpage")
	public String showPage(@ModelAttribute("ticket") Ticket ticket) {

		return "showpage";
	}

	@RequestMapping(value = "/calculateCost", method = RequestMethod.POST)
	public String calculateTotalCost(@ModelAttribute("ticket") Ticket ticket, BindingResult result, ModelMap model) {

		if (result.hasErrors())
			return "showpage";
		else {
			model.addAttribute("cost", ticketService.calculateTotalCost(ticket, buildState()));
			return "result";
		}
	}

	@ModelAttribute("circleList")
	public Map<String, String> buildState() {

		Map<String, String> circleList = new HashMap<String, String>();
		circleList.put("250", "Queen");
		circleList.put("150", "King");

		return circleList;
	}

}
