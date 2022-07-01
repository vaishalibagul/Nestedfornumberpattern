//pattern 4
/*1
12345
1234
123
12
1
1
12
123
1234
12345
1*/


class  nestedforpattern4
{
public static void main(String[]args)
{
int i,j;
	for(i=5;i>=1;i--)
	   {
	       for(j=1;j<=i;j++)
	           {
	             System.out.print(j+"");
                                 }
                            System.out.println(" ");
                         }
                    

                    for( i=1;i<=5;i++)
                      {
                          for(  j=1;j<=i;j++)
                            {
                                System.out.print( j+"");
                            }

                         System.out.println(" ");
                     }
}
}
