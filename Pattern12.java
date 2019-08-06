class Pattern12 
{

	public static void main(String[] args) 
	{
	
		/*
		space();
		space2();
		star();
		
		space2();
		star();
		space2();
		space2();
		star();
		*/
		for (int i=1;i<=5 ;i++ )
		{
			for (int j=1;j<=5 ;j++ )
			{
				System.out.print(" ");
			}
		}

	}

	public static void space2()
	{
		int space=5;
		for (int i=1;i<=5 ;i++ )
		{
			space--;
			for (int j=1;j<=space ;j++ )
			{
				System.out.print(" ");
			}
			System.out.println();
			
		}
	}
	
	public static void star()
	{
		int star=0;
			for (int i=1;i<=5 ;i++ )
			{
				star++;
				for (int k=1;k<=star ;k++ )
				{
					System.out.print("* ");
				}
				System.out.println();
			}	
	}

}
