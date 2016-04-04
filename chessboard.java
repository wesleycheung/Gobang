package Gobang;
class  chessboard
{
	private String[][] board=new String[15][15];
	public  chessboard()
	{
		for(int i=0;i<15;i++)
		{
			for(int j=0;j<15;j++)
			{
				this.board[i][j]="+";
			}
		}
	}
	public void setChess(int X,int Y)
	{
		this.board[X-1][Y-1]="¡ñ";
		
	}
	public void comSetChess(int X,int Y)
	{
		this.board[X][Y]="¡ð";
		
	}
	public String[][] getBoard()
	{
		return this.board;
	}
	public void showBoard()
	{
		for(int i=0;i<15;i++)
		{
			for(int j=0;j<15;j++)
			{
				System.out.print(board[i][j]);
			}
			System.out.println(" ");
		}
	}
	public boolean win()
	{
		boolean judge=false;
		String [][] temp=new String[25][25];
		for(int i=0;i<23;i++)
		{
			for(int j=0;j<23;j++)
			{
				temp[i][j]="+";
			}
		}
		for(int i=0;i<15;i++)
		{
			for(int j=0;j<15;j++)
			{
				temp[i+4][j+4]=this.board[i][j];
			}
		}
		for(int i=4;i<19;i++)
		{
			for(int j=4;j<19;j++)
			{
				if((temp[i][j]==temp[i][j+1])
					&&(temp[i][j]==temp[i][j+2])
					&&(temp[i][j]==temp[i][j+3])
					&&(temp[i][j]==temp[i][j+4])
					&&((temp[i][j]=="¡ñ")||(temp[i][j]=="¡ð")))
				{
					judge=true;
				}
				if((temp[i][j]==temp[i+1][j+1])
					&&(temp[i][j]==temp[i+2][j+2])
					&&(temp[i][j]==temp[i+3][j+3])
					&&(temp[i][j]==temp[i+4][j+4])
					&&((temp[i][j]=="¡ñ")||(temp[i][j]=="¡ð")))
				{
					judge=true;
				}
				if((temp[i][j]==temp[i+1][j])
					&&(temp[i][j]==temp[i+2][j])
					&&(temp[i][j]==temp[i+3][j])
					&&(temp[i][j]==temp[i+4][j])
					&&((temp[i][j]=="¡ñ")||(temp[i][j]=="¡ð")))
				{
					judge=true;
				}
				
			}
		}
		return judge;
	}
	public String getChess(int x,int y)
	{
		return this.board[x][y];
	}






	

}
