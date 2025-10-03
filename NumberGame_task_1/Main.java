import java.util.*;

class Main
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      Random random=new Random();
      System.out.println("Let's Play a game!!!");
      int c=0;
      int totalScore=0;
      while(true)
      {
         c++;
         int randomNumber=random.nextInt(100)+1;
         boolean flag=true;
         int attempts=10;
         int score=100;
         while(flag)
         {
           System.out.println("Enter a number(1-100):");
           int num=sc.nextInt();
           if(num==randomNumber)
           {
              System.out.println("Your Guess is correct..");
              System.out.println("Your Score :"+score+"/"+100);
              System.out.println("Do you want to play again?:");
              System.out.println("Select Your Choice :1.YES 2.NO");
              int ch=sc.nextInt(); 
              if(ch==1)
              {
                 System.out.println("Let's go!!!");
                 flag=false;
                 continue;
              }
              else if(ch==2)
              {
                 System.out.println("Thank You for playing.....");
                 System.exit(0);
              }
              else
              {
                 System.out.println("Invalid Choice");
                 System.out.println("Thank You for playing.....");
                 System.exit(0);
              }

            }
            else if(num<randomNumber)
            {
               System.out.println("Your Guess is too low!!");
               score-=10;
            }
            else
            {
               System.out.println("Your Guess is too high!!");
               score-=10;
            }
            attempts-=1;
            if(attempts!=0)
                 System.out.println("Remaining Attempts:"+attempts);
            if(attempts==0)
            { 
              System.out.println("Your Attempts are over...The Number is "+randomNumber);
              System.out.println("Your Score :"+score+"/"+100);
              System.out.println("Better Luck Next Time...");
              System.out.println("Do you want to play again?:");
              System.out.println("Select Your Choice :1.YES 2.NO");
              int ch=sc.nextInt(); 
              if(ch==1)
              {
                 System.out.println("Let's go!!!");
                 flag=false;
              }
              else if(ch==2)
              {
                 System.out.println("Thank You for playing.....");
                 System.exit(0);
              }
              else
              {
                 System.out.println("Invalid Choice");
                 System.out.println("Thank You for playing.....");
                 System.exit(0);
              }
           }
         }
       }
   }
}
   