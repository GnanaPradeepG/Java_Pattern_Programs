/*

    A
   CCC
  EEEEE
 GGGGGGG
IIIIIIIII

*/
class Pattern10
{
	public static void main(String[] args) 
	{
		char n='A';
		int space=5;
		int star=-1;
		for (int i=1;i<=5 ;i++ )
		{
			space--;
			star+=2;
			for (int j=1;j<=space ;j++ )
			{
				System.out.print(" ");
			}
			for (int k=1;k<=star ;k++ )
			{
				
				System.out.print(n);
				
			}
			n+=2;
			System.out.println();
		}
	}
}