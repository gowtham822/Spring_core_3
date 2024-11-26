package com.tcs.in;

public class UpiPay implements IPayment {

	UpiPay() {
		System.out.println("UpiPay :: 0-param Constructor ");
	}

	@Override
	public void pay() {
		
		System.out.println("UPI PAYMENT DONE");

	}

}
