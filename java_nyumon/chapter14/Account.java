public class Account {
	private String accountNumber;
	private int balance;

	public String toString() {
		return "\\" + this.balance + "（口座番号:" + this.accountNumber + "）";
	}

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o instanceof Account) {
			Account a = (Account) o;
			if (this.accountNumber.equals(a.accountNumber.trim())) {
				return true;
			} 
		}
		return false;
	}
}