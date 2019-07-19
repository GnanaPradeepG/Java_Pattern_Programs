class  Pattern4
{
	public static void main(String[] args) 
	{
		
		int value=16;
		int length=0;
		for (int i=1;i<=5 ;i++ )
		{
			length++;
			for (int j=1;j<=length ;j++ )
			{
				value--;
				System.out.print(value+" ");
			}
			System.out.println();
		}
	}
}
