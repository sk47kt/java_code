package pratice;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner test2 = new Scanner (System.in);
		System.out.println("입력");
		String instr = test2.nextLine();
		String[] test = {"안","녕","하","세","요"};
			for (int x=0;x<test.length;x++)
			{
				if ( test[x].equals(instr))
				{
					System.out.println("해당 데이터를 찾았습니다! : "+x+" 번 인덱스");
				}
			}
		}
	}
