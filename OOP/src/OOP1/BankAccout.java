package OOP1;

public class BankAccout {
	private String CustomerName;
	private long AccountNumber;
	private long AccountBalance;
	private String Email;
	private long PhoneNumber;
	
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		this.CustomerName = customerName;
	}
	public long getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(long accountNumber) {
	this.AccountNumber = accountNumber;
	}
	public long getAccountBalance() {
		return AccountBalance;
	}
	public void setAccountBalance(long accountBalance) {
		this.AccountBalance = accountBalance;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		this.Email = email;
	}
	public long getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.PhoneNumber = phoneNumber;
	}
	

	public void Wuthdraw(long amount) {
		if(AccountBalance<=0|| amount >AccountBalance) {
			System.out.println("your balance is not enough to withdraw");
		}
		
		else {
			AccountBalance-=amount;
			System.out.println("you have "+AccountBalance+" left  after Withdrawing "+ amount );
		}
		
		
		
	}
	
	public void Deposit(long amt) {
		AccountBalance+=amt;
		System.out.println("you've deposited "+amt);
		System.out.println("yours total balamce is "+AccountBalance);
		
	}

}
