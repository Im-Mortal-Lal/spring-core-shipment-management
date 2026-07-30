package com.Taskday30;

import org.springframework.stereotype.Component;

@Component
public class fedexDomestic implements IShipment {

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

        return (vendorCode.equals("FEDEX-IN"))
                && trackingNumber.length() == 10;
    }
}
