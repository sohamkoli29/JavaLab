package Lab;

import java.util.Scanner;

public class Lab01 {
    static int a,b,res;
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("1.Calci");
        System.out.println("2.Fact");
        System.out.println("3.Fibo");
        System.out.println("4.Roots");
        System.out.println("5.Exit");
        System.out.println("Enter your choice :");
        Scanner scanner = new Scanner(System.in);
        int ch = scanner.nextInt();
        System.out.println("Your Choice - "+ch);

        switch (ch)
        {
            case 1:
                System.out.println("Calci");
                System.out.println("1.Sum");
                System.out.println("2.Sub");
                System.out.println("3.Mul");
                System.out.println("4.Div");
                System.out.println("5.Exit");
                System.out.println("Enter your choice :");
                int calch =scanner.nextInt();
                switch (calch)
                {
                    case 1:
                        System.out.println("Sum");
                        System.out.println("enter the first number :");
                        a = scanner.nextInt();
                        System.out.println("enter the second number :");
                        b = scanner.nextInt();
                        res = a+b;
                        System.out.println("the sum of "+a+" and "+b+" is :"+res);


                        break;
                    case 2:
                        System.out.println("Sub");
                        System.out.println("Sum");
                        System.out.println("enter the first number :");
                        a = scanner.nextInt();
                        System.out.println("enter the second number :");
                        b= scanner.nextInt();
                        res= a-b;
                        System.out.println("the sub of "+a+" and "+b+" is :"+res);
                        break;
                    case 3:
                        System.out.println("Mul");
                        System.out.println("enter the first number :");
                        a = scanner.nextInt();
                        System.out.println("enter the second number :");
                        b= scanner.nextInt();
                        res= a*b;
                        System.out.println("the mul of "+a+" and "+b+" is :"+res);
                        break;

                    case 4:
                        System.out.println("Div");

                        System.out.println("enter the first number :");
                        a = scanner.nextInt();
                        System.out.println("enter the second number :");
                        b= scanner.nextInt();
                        res= a/b;
                        System.out.println("the div of "+a+" and "+b+" is :"+res);
                        break;

                    case 5:
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("Happy New Year");
                }
                break;

            case 2:
                System.out.println("Fact");
                System.out.println("Enter your fact number :");
                a=scanner.nextInt();
                int fact =1;
                while (a!=0)
                {
                    fact=fact*a;
                    a--;
                }
                System.out.println(fact);
                break;
            case 3:
                System.out.println("Fibo");
                System.out.println("Enter your series :");
                res=scanner.nextInt();
                b=1;
                int n3;
                System.out.println(a+" "+b);
                for(int i=2;i<res;++i)
                {
                    n3=a+b;
                    System.out.println(" "+n3);
                    a=b;
                    b=n3;
                }


                break;
            case 4:
                System.out.println("1.Square");
                System.out.println("2.Cube");
                System.out.println("enter the number :");
                a= scanner.nextInt();

                switch(a){
                    case 1:
                        System.out.println("enter the number :");
                        res= scanner.nextInt();
                        System.out.println("number inserted= "+res);
                        if(res==0){
                            System.out.println("square is zero");
                        }
                        else{
                            b=res*res;
                            System.out.println("square is "+b);
                        }
                        break;
                    case 2:
                        System.out.println("enter the number :");
                        res= scanner.nextInt();
                        System.out.println("number inserted= "+res);
                        if(res==0){
                            System.out.println("cube is zero");
                        }
                        else{
                            b=res*res*res;
                            System.out.println("cube is "+b);
                        }
                        break;
                }

                break;
            case 5:
                break;

            default:
                System.out.println("happy new year:");
        }

    }
}