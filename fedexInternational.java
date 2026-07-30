package com.Taskday30;

public class fedexInternational implements IShipment{

	 private String vendorCode;
	    private String trackingNumber;

	    public void setVendorCode(String vendorCode) {
	        this.vendorCode = vendorCode;
	    }

	    public void setTrackingNumber(String trackingNumber) {
	        this.trackingNumber = trackingNumber;
	    }

	    @Override
	    public boolean verifyShipment() {

	        return (vendorCode.equals("FEDEX-US"))
	                && trackingNumber.length() == 10;
	    }
	    
}
