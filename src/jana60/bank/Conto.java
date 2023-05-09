package jana60.bank;

public class Conto {
	private String accountNumber;
	private String name;
	private float amount;
	
	public Conto(String accountNumber, String name) {
		amount = 0;
		this.accountNumber = accountNumber;
		setName(name);
	}
	
//	account number GET
	public String getAccountNumber() {
		return this.accountNumber;
	}
//	amount GET
	public double getAmount() {
		return this.amount;
	}
//	name GET SET
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	Add and withdraw
	public void addMoney(float amountToAdd) {
		this.amount += amountToAdd;
	}
	public void withdraw(float amountToWithdraw) {
		amount -= amountToWithdraw;
	}
	
	@Override
	public String toString() {
		return "Nome : " + getName()
		+ "\n Account number : " + getAccountNumber()
		+ "\n Saldo attuale : " + getAmount() + " euro";
	}

}
