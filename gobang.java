package Gobang;
import java.util.Random;
import java.util.Scanner;
public class  gobang
{
	public static void main(String[] args)
	{
		chessboard cb=new chessboard();
		Scanner scan=new Scanner(System.in);
		System.out.println("��ӭ������������Ϸϵͳ����ִ�������֣���ǰ����Ϊ15��15����");
		Random rand=new Random();

		cb.showBoard();
		 int x,y;
		while(true)
		{
		try{
		System.out.println("�����������ӵ����꣬�Կո����");
		
		x=scan.nextInt();
		y=scan.nextInt();
		if(cb.getChess(x,y)!="+")
			{
			throw new Exception("��λ���Ѿ�������");
			}
			cb.setChess(x,y);
		}
		catch (Exception e)
		{
			System.out.println("����������겻�Ϸ�");
			continue;
		}
		cb.setChess(x,y);
		if(cb.win())
			{
			System.out.println("��ϲ�����ʤ��");
			break;
			}

		int x1=rand.nextInt(15);
		int y1=rand.nextInt(15);
		cb.comSetChess(x1,y1);
		System.out.println("��������,��ʱ����Ϊ");
		cb.showBoard();
		if(cb.win())
			{
			System.out.println("�����ˣ�");
			break;
			}
		}
		System.out.println("��ʱ�Ľ���ǣ�");
		cb.showBoard();
		scan.close();





	}
		

}
