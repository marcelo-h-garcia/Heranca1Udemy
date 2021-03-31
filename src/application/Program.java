package application;

import entities.Account;
import entities.BusinesAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Account acc = new Account(1001, "Alex", 0.0);
		BusinesAccount bacc = new BusinesAccount(1002, "Maria", 0.0, 500.0);

		//UPCASTING
		Account acc1 = bacc;
		Account acc2 = new BusinesAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		//DOWNCASTING
		BusinesAccount acc4 = (BusinesAccount)acc2; //a conversão da subclasse para superclasse tem que ser feita manualmente
		acc4.loan(100.0); //permite que acc2 que e account(superclasse) acesse loan que é da BusinessAcount(subclasse)										
		
		//BusinesAccount acc5 = (BusinesAccount)acc3; //da erro em tempo de execução pq não pode ser convertido. São classes do mesmo nível
		if(acc3 instanceof BusinesAccount) {
			BusinesAccount acc5 = (BusinesAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
			
		}
	}

}
