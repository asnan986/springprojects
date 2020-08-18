package org.dxc.royalcourier.bo;

import java.util.Map;

import org.dxc.royalcourier.model.Courier;

public class CourierBO {

	public double calculateCourierCharge(Courier cObj, String city) {

		float courierCharge = cObj.getWeight() * cObj.getChargePerkg();
		for (Map.Entry<String, Float> entry : cObj.getServiceCharge().getLocationServicecharge().entrySet()) {
			if (entry.getKey().equals(city)) {
				courierCharge = cObj.getWeight() * cObj.getChargePerkg();
				courierCharge = courierCharge + entry.getValue();
				break;

			}

		}
		return courierCharge;

	}
}
