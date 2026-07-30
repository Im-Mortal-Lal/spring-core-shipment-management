package com.Taskday30;

import org.springframework.stereotype.Component;

@Component
public class DTDC implements  IShipment {

	private String trackingId;
	
	public void setTrackingId(String trackingId) {
		this.trackingId = trackingId;
	}



	@Override
	public boolean verifyShipment() {

		String[] parts = trackingId.split("/");

		if (parts.length != 3) {
			return false;
		}
			return parts[0].equals("DTDC") && parts[1].length() == 3 && parts[2].length() == 8;
	}
}
