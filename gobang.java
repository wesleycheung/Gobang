package Gobang;
import java.util.Random;
import java.util.Scanner;
public class  gobang
{
	public static void main(String[] args)
	{
		chessboard cb=new chessboard();
		Scanner scan=new Scanner(System.in);
		System.out.println("欢迎来到五子棋游戏系统，您执黑棋先手，当前棋盘为15×15棋盘");
		Random rand=new Random();

		cb.showBoard();
		 int x,y;
		while(true)
		{
		try{
		System.out.println("请输入您落子的坐标，以空格隔开");
		
		x=scan.nextInt();
		y=scan.nextInt();
		if(cb.getChess(x,y)!="+")
			{
			throw new Exception("该位置已经有棋子");
			}
			cb.setChess(x,y);
		}
		catch (Exception e)
		{
			System.out.println("您输入的坐标不合法");
			continue;
		}
		cb.setChess(x,y);
		if(cb.win())
			{
			System.out.println("恭喜您获得胜利");
			break;
			}

		int x1=rand.nextInt(15);
		int y1=rand.nextInt(15);
		cb.comSetChess(x1,y1);
		System.out.println("电脑落子,此时棋盘为");
		cb.showBoard();
		if(cb.win())
			{
			System.out.println("您输了！");
			break;
			}
		}
		System.out.println("此时的结果是：");
		cb.showBoard();
		scan.close();





	}
		

}
