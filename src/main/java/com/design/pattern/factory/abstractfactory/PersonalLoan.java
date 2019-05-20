package com.design.pattern.factory.abstractfactory;

public class PersonalLoan implements Loan {

	@Override
	public float getInterestRate() {
		return 14.00f;
	}

}
