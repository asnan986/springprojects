package org.dxc.royalcourier.service;

import org.dxc.royalcourier.bo.CourierBO;
import org.dxc.royalcourier.exception.InvalidParcelWeightException;
import org.dxc.royalcourier.model.Courier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CourierService {

	private CourierBO cBoObj;

	public double calculateCourierCharge(int courierId, int weight, String city) {
		double couriercharge = 0;
		try {
			if (weight > 0 && weight < 1000) {
				ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
				Courier courier = (Courier) context.getBean("courier");
				courier.setCourierId(courierId);
				courier.setWeight(weight);
				couriercharge = cBoObj.calculateCourierCharge(courier, city);

			} else
				throw new InvalidParcelWeightException();

		} catch (InvalidParcelWeightException e) {

			System.out.println(e);
		}
		return couriercharge;

	}
	public void setCBoObj(CourierBO cBoObj) {
		this.cBoObj = cBoObj;
	}

}
