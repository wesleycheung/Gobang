package Gobang;
import java.util.Random;
import java.util.Scanner;
public class  gobang
{
	public static void main(String[] args)
	{
		chessboard cb=new chessboard();
		Scanner scan=new Scanner();
		System.out.println("��ӭ������������Ϸϵͳ����ִ�������֣���ǰ����Ϊ15��15����");
		
		cb.showBoard;
		public int x,y;

		try{
		System.out.println()"�����������ӵ�����");
		
		x=scan.nextInt();
		y=scan.nextInt();
		if(cb.getChess(x,y)!="+")
			{
			throw new Exception("��λ���Ѿ�������");
			}
			gb.setChess(x,y);
		}
		catch (Exception e)
		{
			System.out,println("����������겻�Ϸ�");
			continue;
		}




	}
		

}
