package com.design.pattern.factory.abstractfactory;

public abstract class AbstractFactory {

	public abstract Bank getBank(BankType bankType);

	public abstract Loan getLoan(LoanType loanType);
}
