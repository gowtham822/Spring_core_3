package com.tcs.in;

public class DebitCard implements IPayment {

	DebitCard() {
		System.out.println("DebitCard :: 0-param Constructor");
	}

	@Override
	public void pay() {

          System.out.println("DEBIT CARD PAYMENT");

	}

}
