import java.util.Scanner;
public class FoodApp {
    public static void main(String[] args){
        System.out.println("Hello, welcome to the food app");

        //PASSWORD CREATION
        System.out.println("Please enter a password");
        Scanner scan = new Scanner(System.in);
        scan.close();
        
        String password = scan.next();
        //stores value of inputted password

        System.out.println("Your password is now "+ password);

        System.out.println("Please enter your password: ");
        String pass1 = scan.next();
        //confirms second inputted password is correct

        while(!pass1.equals(password)){
            System.out.println("Incorrect password, please try again!");
            pass1 = scan.next();
        }// while loop to confirm password is correct

        System.out.println("ACCESS GRANTED");

        //FOOD ORDER
        System.out.println("Are you hungry? Yes or No");
        String ans1 = scan.next();

        if(ans1.equals("yes")){
            System.out.println("Here's our menu, choose: \nfish, pizza, burger, chips");
            String ans2 = scan.next();

            while(
                !ans2.equals("fish")&&  !ans2.equals("pizza")&&  !ans2.equals("burger")&&  !ans2.equals("chips")
                ){
                System.out.println("Sorry, we do not have it, what would you like between fish, burger and chips ?");
                ans2 = scan.next();
            }

            if(
                ans2.equals("fish")||
                ans2.equals("pizza")||
                ans2.equals("burger")||
                ans2.equals("chips")) {
                System.out.println("Do you want something to drink? Yes or no");

                String ans3 = scan.next();

                while(!ans3.equals("yes")&&!ans3.equals("no")){
                    System.out.println("Wrong command, please try again");

                    ans3 = scan.next();
                }
                if(ans3.equals("yes")){
                    System.out.println("What would you like? Coke / juice");
                    String ans4 = scan.next();

                    while(!ans4.equals("coke")&&!ans4.equals("juice")){
                        System.out.println("Sorry we dont have it, what would you like between coke and juice");
    
                        ans4 = scan.next();
                }
                if(
                    ans4.equals("coke")||ans4.equals("juice"))
                    {System.out.println("Great you have ordered " + ans2 + " and" + ans4);
                }
                System.out.println("Please confirm your password");
                pass1 = scan.next();

                while(!pass1.equals(password)){
                    System.out.println("Incorrect password, please try again!");
                    pass1 = scan.next();
                }// while loop to confirm password is correct

                System.out.println("Thank you for your order! It will arrive soon:)");
            }

        }

        }else{
            System.out.println("Have a good day :)");
        }
}
}
