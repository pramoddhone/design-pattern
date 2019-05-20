package com.design.pattern.factory.abstractfactory;

public class BankFactory extends AbstractFactory {

	@Override
	public Bank getBank(BankType bankType) {
		if (bankType == BankType.CITI) {
			return new CITI();
		} else if (bankType == BankType.ICICI) {
			return new ICICI();
		}

		return null;
	}

	@Override
	public Loan getLoan(LoanType bankType) {
		System.out.println("Not Implemeted");
		return null;
	}

}
