//WAJP to create a Userdefined exception "InvalidAgeException" by using throw and Throws.
class InvalidAgeException extends Exception
{
   InvalidAgeException(String msg)
{
  //System.out.println(msg);
super(msg);
}
}

class UserDefinedException1
{
 public static void main(String args[])
{
  try
{
  vote(15);
}
 catch(Exception e)
{
  System.out.println(e);
}
}
public static void vote(int age)throws InvalidAgeException
{
 if(age<18)
{
throw new InvalidAgeException("Not eligible for voting");
}
else
{
 System.out.println("Eligible for voting");
}
}
}