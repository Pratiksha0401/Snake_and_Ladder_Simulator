class snake_Ladder 
{
	public static final int No_Play=0;
	public static final int Ladder=1;
	public static final int Snake=2;

	public static void main(String[] args) 
	{
		int first_Player_position=0;
		int second_Player_position=0;
		int player_Number;
		//repeat till get winner
		while(first_Player_position<100 &&  second_Player_position<100)
		{
      //first player playing
      first_Player_position=player(1,first_Player_position);
     
      //second player playing
      second_Player_position=player(2,second_Player_position);
    }

    //to get winner
		if(first_Player_position==100)
			System.out.println("First Player is Winner");
		else
			System.out.println("Second Player is Winner");

	}
   static int player(int player_Number,int Player_position)
      {
			// the dice roll by First Player
			int Player_roll=(int)Math.floor(Math.random()*6)+1;
			System.out.println('\n'+" dice number"+ Player_roll);
			
			//check for no play,Ladder or snake_Ladder_UC3
			int check_Play=(int)Math.floor(Math.random()*10)%3;
			
				switch(check_Play)
				{
					case No_Play:
						System.out.println(" Player "+player_Number+" at "+ Player_position);
						break;
					case Ladder:
						Player_position+=Player_roll;
						//ensure the player get exact 100 for winning
						if(Player_position>100)
							Player_position-=Player_roll;
						System.out.println(" Player "+player_Number+" at "+ Player_position);
						player(player_Number,Player_position);
						break;
					case Snake:
						Player_position-=Player_roll;
						 //ensure the position must not below 0  
						if(Player_position<0)
							Player_position=0;
						System.out.println(" Player "+player_Number+" at "+ Player_position);
						break;
				}
        return Player_position;
      } 
}