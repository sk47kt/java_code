package ��ü����;

import java.util.Scanner;

class system{
	int balance=0;
	public void withdraw(int withdraw)
	{
		balance+=withdraw;
		System.out.println(withdraw+"���� �ԱݵǾ����ϴ� �����ܾ� : "+balance);
	}
	public void deposit(int deposit)
	{
		if (deposit > balance || deposit == 0)
		{
			System.out.println("�ܾ��� �����մϴ� �����ܾ� : "+balance);
		}
		else
		{
			balance-=deposit;
			System.out.println(deposit+"���� �ԱݵǾ����ϴ� �����ܾ� : "+balance);
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
		System.out.println("1.�Ա� 2.��� 3.�ܾ�Ȯ��");
		int main=maininput.nextInt();
		switch(main)
		{
		case 1:
			System.out.println("�󸶸� �Ա��Ͻðڽ��ϱ�?");
			Scanner withdrawin = new Scanner(System.in);
			int withdrawinput=withdrawin.nextInt();
			system.withdraw(withdrawinput);
			break;
		case 2:
			System.out.println("�󸶸� ����Ͻðڽ��ϱ�?");
			Scanner depositin = new Scanner(System.in);
			int depositinput=depositin.nextInt();
			system.deposit(depositinput);
			break;
		case 3:
			System.out.println("���� �ܾ��� "+system.balance+" �� �Դϴ�");
			break;
			}
		}
	}
}
