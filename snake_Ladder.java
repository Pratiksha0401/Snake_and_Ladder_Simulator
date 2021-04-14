class snake_Ladder 
{
	public static void main(String[] args) 
	{
		int first_Player_position=0;
		System.out.println("First Player at start position " + first_Player_position);
		//rolls the die
		int first_Player_roll=(int)Math.floor(Math.random()*6)+1;
		first_Player_position=first_Player_roll+first_Player_position;
		System.out.println("After rolls the die, first Player at position " + first_Player_position);
	}
}