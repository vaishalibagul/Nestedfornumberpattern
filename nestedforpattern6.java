//pattern 6
/*1
1    2
1    2   3
1   2   3   4
1  2   3   4   5
1*/


class  nestedforpattern6
{
public static void main(String[]args)
{
int i,j,k;
	for(i=1;i<=5;i++)
	   {
	       for(j=5;j>=i;j--)
	           {
	            
                                 System.out.print("  ");
                            
                         }
                    

                    for( k=1;k<=i;k++)
                      {
                          
                            
                                System.out.print( k+ "   ");
                            }

                         System.out.println();
                     } 
}
}
