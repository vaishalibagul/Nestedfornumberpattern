//pattern 3
/*1
12
123
1234
12345
12345
1234
123
12
1*/


class  nestedforpattern3
{
public static void main(String[]args)
{
int i,j;
	for(i=1;i<=5;i++)
	   {
	       for(j=1;j<=i;j++)
	           {
	             System.out.print(j+"");
                                 }
                            System.out.println(" ");
                         }
                    

                    for( i=5;i>=1;i--)
                      {
                          for(  j=1;j<i;j++)
                            {
                                System.out.print( j+"");
                            }

                         System.out.println(" ");
                     }
}
}
