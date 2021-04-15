class snake_Ladder 
{
	public static final int No_Play=0;
	public static final int Ladder=1;
	public static final int Snake=2;
	public static final int first_Player=0;
	public static final int second_Player=1;

	public static void main(String[] args) 
	{
		int first_Player_position=0;
		int second_Player_position=0;

		System.out.println("Player at start position " + first_Player_position);
		
		//repeat till get winner
		while(first_Player_position<100 &&  second_Player_position<100)
		{
			//roll the dice
			int Player_roll=(int)Math.floor(Math.random()*6)+1;

			//which will play first or second
			int player_Play=(int)Math.floor(Math.random()*2);
			
			if(player_Play==first_Player)
			{
				//check for no play,Ladder or snake_Ladder_UC3
				int check_Play=(int)Math.floor(Math.random()*10)%3;
			
				switch(check_Play)
				{
					case No_Play:
						System.out.println("First Player at "+first_Player_position);
						break;
					case Ladder:
						first_Player_position+=Player_roll;
						//ensure the player get exact 100 for winning
						if(first_Player_position>100)
							first_Player_position-=Player_roll;
						System.out.println("First Player at "+first_Player_position);
						break;
					case Snake:
						first_Player_position-=Player_roll;
						if(first_Player_position<0)
							first_Player_position=0;
						System.out.println("First Player at "+first_Player_position);
						break;
				}
			}
			else
			{
				//check for no play,Ladder or snake_Ladder_UC3
				int check_Play=(int)Math.floor(Math.random()*10)%3;
				
				switch(check_Play)
				{
					case No_Play:
						System.out.println("Second Player at "+second_Player_position);
					break;
					case Ladder:
						second_Player_position+=Player_roll;
						//ensure the player get exact 100 for winning
						if(second_Player_position>100)
							second_Player_position-=Player_roll;
						System.out.println("Second Player at "+second_Player_position);
						break;
					case Snake:
						second_Player_position-=Player_roll;
						if(second_Player_position<0)
							second_Player_position=0;
						System.out.println("Second Player at "+second_Player_position);
						break;
					}
				}
		}
		if(first_Player_position==100)
			System.out.println("First Player is Winner");
		else
			System.out.println("Second Player is Winner");
	}
}