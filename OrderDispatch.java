package com.Taskday30;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.day31.IPaytment;


@Component("dispatch")
public class OrderDispatch {

	
	IShipment Shippingservice;
	
	@Autowired
	public void setShippingservice(IShipment Shippingservice) {
			this.Shippingservice = Shippingservice;
		}
	
	public void dispatchOrder() {
		if(Shippingservice.verifyShipment() && !this.type().isBlank()) {
			System.out.println("Order dispatched via "+ this.type());
		}
		else {
			System.out.println("Shipment details invalid, please recheck tracking ID");
		}
	}

	private String type() {
		if(Shippingservice instanceof DTDC) {
			return "DTDC";
		}
		else if(Shippingservice instanceof fedexDomestic) {
			return "FedexDometic";
		}
		else if(Shippingservice instanceof fedexInternational) {
			return "fedexInternational";
		}

		else if(Shippingservice instanceof Delhivery) {
			return "Delhivery";
		}
		else if(Shippingservice instanceof Bluedart) {
			return "Bluedart";
		}
		return "";
		
	}
		
}
	

