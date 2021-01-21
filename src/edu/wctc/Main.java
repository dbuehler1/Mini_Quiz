package edu.wctc;
import java.sql.SQLOutput;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        //I reuse the UserResponse variable by not only using the "1" and "2" as selection options-
        // but also as part of the calculation instead of 0s and 1s.
        //The user will always enter at least a 1, so if all answers were 1 then they would end up at 0
        //same concept if they answer all 2s will cause a score of 6
        int Total = -6;
        Scanner reader = new Scanner(System.in);
        int UserResponse = 0;
        String [] Questions = {
                "(1)Chocolate Chip Cookies or (2)Strawberries",
                "(1)Cheesecake or (2)Carrots",
                "(1)Candies or (2)Roasted Corn",
                "(1)Pumpkin Pie or (2)Chicken Pot Pie",
                "(1)Chocolate Cake or (2)Salad",
                "(1)Ice Cream or (2)Mushroom Soup"
        };

        System.out.println("Eating habits quiz! \n " +
                "Please enter either a \"1\" or a \"2\" to respond to each question\n " +
                "Answer numbers are displayed.");
        int x = 1;
        for(int i = 0; i < Questions.length; i++){
            x = 1;
            System.out.println(Questions[i]);
            UserResponse = reader.nextInt();

            for(int j = 0; j < x; j++){
                if(UserResponse != 1 && UserResponse !=2){
                    x++;
                    System.out.println("Invalid Response: Expecting a response of \"1\" or \"2\" for selection");
                    System.out.println(Questions[i]);
                    UserResponse = reader.nextInt();
                }
                else {
                    Total += UserResponse;
                }
            }
        }
        if(Total > 3){
            System.out.println("You are a very healthy eater");
        }
        else if(Total == 3){
            System.out.println("You are a balanced eater");
        }
        else{
            System.out.println("You are an unhealthy eater");
        }
    }
}
