package com.tcs.in;

public class BillPay {
	
	private IPayment pay;

	
	
	public BillPay(IPayment pay) {
		super();
		this.pay = pay;
	}







	public void Pay_bill()
	{
		pay.pay();
	}

}
