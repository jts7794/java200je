package java200je;

public class AccountsMain {

	public static void main(String[] args) {
		Account acc1 = new Account(1000); //계좌 생성
		acc1.deposit(3000); //저축
		acc1.deposit(2000); //저축
		acc1.withdraw(500); //출금
		System.out.println(acc1.getMoney()); //현재 잔금 
	}

}

/*
 * 현실 객체(은행)에서 소프트웨어 객체를 추출(은행 업무와 관련된 모든 객체 분석 - analysis)하여 객체 간의 관계(modeling)를 만든다.
 * 이렇게 찾아낸 객체는 추상화(abstraction)단계를 거쳐 클래스가 된다. 클래스는 객체에 대한 설계도, 거푸짐, 붕어빵틀, 템플릿 이라고 말하기도 한다.
 * 이렇게 만든 클래스를 사용하려고 메모리에 올리는 과정이 인스턴스화(instantiation)과정이다. 인스턴스화는 키워드 new 를 사용한다. 
 * 클래스를 인스턴스화시켜 생성된 객체를 인스턴스(instance)라 한다.
 */