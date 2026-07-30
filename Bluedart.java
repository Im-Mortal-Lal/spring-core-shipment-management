package com.Taskday30;

import org.springframework.stereotype.Component;

@Component
public class Bluedart implements  IShipment {

	private String trackingId;
	
	public void setTrackingId(String trackingId) {
		this.trackingId = trackingId;
	}



	@Override
	public boolean verifyShipment() {
			
		String value = trackingId.substring(0, trackingId.indexOf('#'));
		return value.equals("BD");
					
	}
	
	
	
	
}
