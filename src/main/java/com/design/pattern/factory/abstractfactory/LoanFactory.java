package com.design.pattern.factory.abstractfactory;

public class LoanFactory extends AbstractFactory {

	@Override
	public Bank getBank(BankType bankType) {
		System.out.println("Not Implemented");
		return null;
	}

	@Override
	public Loan getLoan(LoanType loanType) {
		if(loanType == LoanType.PERSONAL_LOAN) {
			return new PersonalLoan();
		}else if(loanType == LoanType.HOME_LOAN) {
			return new HomeLoan();
		}
		return null;
	}

}
