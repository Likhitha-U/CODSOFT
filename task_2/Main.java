import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Student Name:");
        String name=sc.nextLine();
        System.out.print("Enter number of subjects:");
        int n=sc.nextInt();
        int sum=0;
        int total=n*100;
        String grade="";
        boolean fail=false;
        int m[]=new int[n];
        for(int i=0;i<n;i++)
        {
              System.out.print("Enter marks for subject "+(i+1)+"(out of 100):");
              int marks=sc.nextInt();
              if(marks<0||marks>100)
              {
                System.out.println("Invaild Marks!Please Enter valid marks(0-100)");
                i--;
                continue;
              }
              if(marks<40)
              {
                 fail=true;
                 grade="F";
              }
              m[i]=marks;
              sum=sum+marks;
        }
        double avg=(sum*100.0/total);
        if(!fail)
        {
            if(avg>=90.0)
               grade="S";
            else if(avg<90&&avg>=80)
               grade="A";
            else if(avg<80&&avg>=70)
               grade="B";
            else if(avg<70&&avg>=60)
               grade="C" ;
            else if(avg<60&&avg>=50)
               grade="D";
            else if(avg<50&&avg>=40)
               grade="E";
            else
               grade="F";
        }
        System.out.println("Student Name: "+name);
        System.out.println("Total Subjects: "+n);
        for(int i=0;i<n;i++)
        {
            System.out.println("Subject "+(i+1)+" Marks: "+m[i]);
        }
        System.out.println("Total Marks: "+sum);
        System.out.printf("Average Percentage: %.2f%%%n",avg);
        System.out.println("Grade: "+grade);

    }
}