interface BankInterface{
	void getBalance();
	void getInterestRate();
}
class BankA implements BankInterface{
	public void getBalance()
	{
		System.out.println("Bank A Deposit:10000");
	}
	public void getInterestRate()
	{
		System.out.println("Bank A interest rate 7%");
		double bal=1.07*10000;
		System.out.println("Bank A balance:"+bal);
		System.out.println("_________________________________________");
	}
}
class BankB implements BankInterface{
	public void getBalance()
	{
		System.out.println("Bank B Deposit:150000");
	}
	public void getInterestRate()
	{
		System.out.println("Bank B interest rate 7.4%");
		double bal=1.074*150000;
		System.out.println("Bank B balance:"+bal);
		System.out.println("_________________________________________");
	}
}
class BankC implements BankInterface{
	public void getBalance()
	{
		System.out.println("Bank C Deposit:200000");
	}
	public void getInterestRate()
	{
		System.out.println("Bank C interest rate 7.9%");
		double bal=1.079*200000;
		System.out.println("Bank C balance:"+bal);
	}
}
class Lab5Program1{
	public static void main(String[] args) {
		BankA obj1=new BankA();
		obj1.getBalance();
		obj1.getInterestRate();
		BankB obj2=new BankB();
		obj2.getBalance();
		obj2.getInterestRate();
		BankC obj3=new BankC();
		obj3.getBalance();
		obj3.getInterestRate();
	}
}