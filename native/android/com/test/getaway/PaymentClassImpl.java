package com.test.getaway;

public class PaymentClassImpl {
    public void createGateway() {
        Gateway gateway = new Gateway();
gateway.setMerchantId("TEST");
gateway.setRegion(Gateway.Region.YOUR_REGION);
    }

    public boolean isSupported() {
        return true;
    }

}
