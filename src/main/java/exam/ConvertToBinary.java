package exam;

public class ConvertToBinary {

  public String toBinary(final int n) {
    for( int i=31;i>=0;i--)
    {
      int k=n>>i;
      if((k & 1)>0)
         System.out.print(" 1 ");
      else
        System.out.print(" 0 ");
      
    }
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    return "";
  }
}
class Abc
{
public static void main(String[] args)
{
  ConvertToBinary c = new ConvertToBinary();
  int n =35;
  c.toBinary(n);
}
}
