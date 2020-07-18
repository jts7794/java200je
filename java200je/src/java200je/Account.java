package java200je;

public class Account {
	
	private double money=500; 		//명시적 초기화
	
	public Account(double money) {	//생성자에 의한 초기화 생성자는 객체를 생성할 때 단 한 번 호출
		this.money=money;
	}
	
	public Account() {  			//default 생성자에 의한 초기화		
	}
	
	public double getMoney() {		//현재 잔금
		return money;
	}
	
	//-500원과 같이 음수 돈을 출금하거나, 잔금보다 많은 돈을 출금 못하게
	// 하면서 원하는 돈을 출금
	
	public void withdraw(double amount) { //출금
		if((amount>0)&&(money-amount>=0)) {
			money-=amount;
		}
	}
	
	//-500원과 같이 음수 돈을 입금 못하게
	//하면서 원하는 돈을 입금
	public void deposit(double amount) { //입금
		if(amount>0) {
			money+=amount;
		}
	} 
	
	
	
	
	
	
	
	
	
}
