package com.Taskday30;

import org.springframework.stereotype.Component;

@Component
public class Delhivery implements  IShipment {

	private String trackingId;
	
	public void setTrackingId(String trackingId) {
		this.trackingId = trackingId;
	}

	@Override
	public boolean verifyShipment() {
			
		String courierCode = trackingId.substring(0, 2);
		String stateCode = trackingId.substring(2, 4);
		String shipmentNumber = trackingId.substring(5);
		
		return courierCode.equals("DL") && stateCode.length() == 2
	            && shipmentNumber.length() == 12;
					
		
	}
	
}
