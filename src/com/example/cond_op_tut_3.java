package com.example;

public class cond_op_tut_3
    {
        public static void main(String[] args)
        {
          String name = "Harshang";
            System.out.println(name.equalsIgnoreCase("harshang"));

            switch (name) {
                case "ronak" :{
                    System.out.println("You are goint to become an Adult!");
                }
                case "shubham" : {
                    System.out.println("You are goint to get a job!");
                                   }
                case "Harshang" : {

                    System.out.println("You are Experienced");
                }

                case "darshan" : {
                    System.out.println("You are goint to be retired!");
                    break;
                }
                default : {
                    System.out.println("Enjoy your life");
                    break;
                }
            }

            System.out.println("Thanks for using my java code!");
            /*int age;
            System.out.println("Enter your age:");
            Scanner sc = new Scanner(System.in);
            age = sc.nextInt();
            switch (age) {
                case 18: {
                    System.out.println("You are goint to become an Adult!");
                    break;
                }

                case 23: {
                    System.out.println("You are goint to get a job!");
                    break;
                }

                case 46: {
                    System.out.println("You are Experienced");
                    break;
                }

                case 60: {
                    System.out.println("You are goint to be retired!");
                    break;
                }

                default: {
                    System.out.println("Enjoy your life");
                    break;
                }
            }*/
        }

}
