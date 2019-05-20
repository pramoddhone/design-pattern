package com.design.pattern.factory.abstractfactory;

public class LoanAndBankFactoryCreator {
	
	public static AbstractFactory getFactory(Factory factory) {
		if (factory == Factory.BANK) {
			return new BankFactory();
		}else if(factory == Factory.LOAN){
			return new LoanFactory();
		}
		return null;
	}
	
	public static void main(String[] args) {
		AbstractFactory bankFactory = LoanAndBankFactoryCreator.getFactory(Factory.BANK);
		System.out.println(bankFactory.getBank(BankType.ICICI).getDetails());
		AbstractFactory loanFactory = LoanAndBankFactoryCreator.getFactory(Factory.LOAN);
		System.out.println(loanFactory.getLoan(LoanType.HOME_LOAN).getInterestRate());
	}

}
