package Gobang;
import java.util.Random;
import java.util.Scanner;
public class  gobang
{
	public static void main(String[] args)
	{
		chessboard cb=new chessboard();
		Scanner scan=new Scanner();
		System.out.println("欢迎来到五子棋游戏系统，您执黑棋先手，当前棋盘为15×15棋盘");
		
		cb.showBoard;
		public int x,y;

		try{
		System.out.println()"请输入您落子的坐标");
		
		x=scan.nextInt();
		y=scan.nextInt();
		if(cb.getChess(x,y)!="+")
			{
			throw new Exception("该位置已经有棋子");
			}
			gb.setChess(x,y);
		}
		catch (Exception e)
		{
			System.out,println("您输入的坐标不合法");
			continue;
		}




	}
		

}
