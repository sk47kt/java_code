package pratice;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner test2 = new Scanner (System.in);
		System.out.println("�Է�");
		String instr = test2.nextLine();
		String[] test = {"��","��","��","��","��"};
			for (int x=0;x<test.length;x++)
			{
				if ( test[x].equals(instr))
				{
					System.out.println("�ش� �����͸� ã�ҽ��ϴ�! : "+x+" �� �ε���");
				}
			}
		}
	}
