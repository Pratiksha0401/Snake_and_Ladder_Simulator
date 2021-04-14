class snake_Ladder 
{
	public static final int No_Play=0;
	public static final int Ladder=1;
	public static final int Snake=2;

	public static void main(String[] args) 
	{
		int first_Player_position=0;
		System.out.println("Player at start position " + first_Player_position);
		
		
		//repeat till get wiiner
		while(first_Player_position<100)
		{
			//rolls the die
			int first_Player_roll=(int)Math.floor(Math.random()*6)+1;

			//check for no play,Ladder or snake_Ladder_UC3
			int check_Play=(int)Math.floor(Math.random()*10)%3;
			switch(check_Play)
			{
				case No_Play:
				break;
				case Ladder:
					first_Player_position+=first_Player_roll;
					if(first_Player_position>100)
						first_Player_position=100;
					break;
				case Snake:
					first_Player_position-=first_Player_roll;
					if(first_Player_position<0)
						first_Player_position=0;
					break;
			}
		}
		System.out.println("Player at position " + first_Player_position + " and also winner");
	}
}