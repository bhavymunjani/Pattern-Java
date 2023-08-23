class Pattern30
{
	public static void main(String args[])
	{
		int k=0,x=0;
		for(int i=1;i<=21;i++)
		{
			if(i<=11)
			{
				k++;
			}
			else
			{
				k--;
			}
			if(i<=10)
			{
			x=i-1;
			}
			else if(i==11)
			{
				x=0;
			}
			else
			{
				x=21-i;
			}
			for(int j=1;j<=21;j++)
			{
				if(j<=11-k||j>=11+k)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(x);
					if(j<10)
					{
						//if(x==9)
						//{
							//x=0;
						//}
						//else
						//{
						//	x++;
						//}
						 if(x<=9)
						{
							if(x==9)
								x=0;
							else
								x++;
						}
						else
						{
							if(x==9)
								x=0;
							else
								x--;
						} 
					}
					else 
					{
						
						if(x>=9)
						{
							if(x==9)
								x=0;
							else
								x--;
						}
						else
						{
							if(x==9)
								x=0;
							else
								x++;
						}
						
						
					}
				}
			}
			System.out.println();
		}
		
		
	}
}
