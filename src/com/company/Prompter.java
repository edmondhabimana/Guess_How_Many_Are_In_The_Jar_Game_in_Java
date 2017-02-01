package com.company;

import java.util.Scanner;

/**
 * Created by edmon on 1/31/2017.
 */
public class Prompter {
    public static Scanner scanner = new Scanner(System.in);
    private Jar jar;

    public Prompter(Jar jar){
        this.jar = jar;
    }

    public static void input(){

        System.out.println("SETUP THE GAME");
        System.out.println("==============");
        System.out.println("What type of item should go in the jar: ");
        String nameItem = scanner.nextLine();
        System.out.println("What is the maximum number of" + nameItem +" the jar can hold: ");
        int maximumNumber = scanner.nextInt();


        Jar jar = new Jar(nameItem, maximumNumber);
        int randomNumber = jar.fill();
        int count = 0;
        boolean guessRight;
        System.out.println("\nPLAYER");
        System.out.println("=======");
        System.out.println("How many " + jar.getName() + " are in the jar?");
        do{
            System.out.printf("Pick a number between 1 and %s", jar.getMAX_ITEMS() + "\n");
            int guessNumber = scanner.nextInt();
            scanner.nextLine();
            if(guessNumber > jar.getMAX_ITEMS()){
                System.out.println("Your guess must be less than " + jar.getMAX_ITEMS());
            }else{
                if(guessNumber > randomNumber){
                    System.out.println("Your guess is too high.");
                }else if(guessNumber < randomNumber){
                    System.out.println("Your guess is too low.");
                }
            }
            guessRight = randomNumber == guessNumber;

            if(guessRight){
                System.out.println("Congratulation!!");
                System.out.println("You guess that there are " + randomNumber + " " + jar.getName() + " in the jar!!");
                count++;
                if(count == 1){
                    System.out.println("You got it in " + count + " attempt!!");
                }else{
                    System.out.println("You got it in " + count + " attempts.");
                }

            }else{
                count++;
            }
        }while(!guessRight);
    }
}
