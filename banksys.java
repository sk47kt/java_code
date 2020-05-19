package 객체지향;

import java.util.Scanner;

class system{
	int balance=0;
	public void withdraw(int withdraw)
	{
		balance+=withdraw;
		System.out.println(withdraw+"원이 입금되었습니다 현재잔액 : "+balance);
	}
	public void deposit(int deposit)
	{
		if (deposit > balance || deposit == 0)
		{
			System.out.println("잔액이 부족합니다 현재잔액 : "+balance);
		}
		else
		{
			balance-=deposit;
			System.out.println(deposit+"원이 입금되었습니다 현재잔액 : "+balance);
		}
	}
	public int balance(int balance)
	{
		return balance;
	}
}

public class banksys {

	public static void main(String[] args) {
		Scanner maininput = new Scanner(System.in);
		system system = new system();
		while(true)
		{
		System.out.println("1.입금 2.출금 3.잔액확인");
		int main=maininput.nextInt();
		switch(main)
		{
		case 1:
			System.out.println("얼마를 입금하시겠습니까?");
			Scanner withdrawin = new Scanner(System.in);
			int withdrawinput=withdrawin.nextInt();
			system.withdraw(withdrawinput);
			break;
		case 2:
			System.out.println("얼마를 출금하시겠습니까?");
			Scanner depositin = new Scanner(System.in);
			int depositinput=depositin.nextInt();
			system.deposit(depositinput);
			break;
		case 3:
			System.out.println("현재 잔액은 "+system.balance+" 원 입니다");
			break;
			}
		}
	}
}
