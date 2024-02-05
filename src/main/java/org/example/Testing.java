package org.example;
import java.util.Scanner;
import java.util.Random;
public class Testing {
    //1. Ask the user for their name
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter your full name: ");
        String name = scanner.nextLine();
        //2. Print a personalized welcome message on the screen
            System.out.println("Welcome to the Maths Skill Tester " + name + "!");

            int score = 0;
            for(int i = 1; i<=5; i++){
                int num1 = random.nextInt(10) + 1;
                int num2 = random.nextInt(10) + 1;
                int calculation = random.nextInt(4);

                double rightAnswer = 0;
                String question = "Question " + i + ": ";
                switch (calculation) {
                    case 0: //Addition
                        rightAnswer = num1 + num2;
                        question += num1 + " + " + num2;
                        break;
                    case 1: //subtraction;
                        rightAnswer = num1 - num2;
                        question += num1 + " - " + num2;
                        break;
                    case 2: //multiplication
                        rightAnswer = num1 * num2;
                        question += num1 + " x " + num2;
                        break;
                    case 3:
                       // num2 = (num2 == 0) ? 1 : num2;
                        rightAnswer = (double)num1 / num2;
                        question += num1 + " / " + num2;
                        break;
                }
                System.out.println(question);
                System.out.println("Your answer is: ");
                double userAnswer = scanner.nextInt();

                if(userAnswer == rightAnswer){
                    System.out.println("You are correct!");
                    score++;

                }else{
                    System.out.println("Wrong answer! The correct answer is: " + rightAnswer);
                }
            }
        System.out.println(name + " your score is: " + score + "/5");
        }
    }
