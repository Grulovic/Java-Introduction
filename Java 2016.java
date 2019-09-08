/* ------------------------------------------------------------------ *
 * Stefan Grulovic 
 * DATE: 12.1.2016.
 * TITLE: Computer Science Final Project
 * DESCRIPTION: Program with 6 menu options: 
 *              Option 1:  Calculate Sum, Average and Product from 5 numbers you choose.
 *              Option 2:  Calculate the Factorail from the smallest number of 5 you choose.
 *              Option 3:  Find the n-th number of Fibonacci sequence.
 *              Option 4:  Game where you guess the random number."
 *              Option 5:  Program that displays Pythagorean Triples between 0-100.
 *              Option 6:  EXIT the program!
 * COPYRIGHT: Releases as open source code under the GNU public license agreement.
 * CONTACT: stefan.grulovic@gmail.com 
 * ------------------------------------------------------------------ */

import java.io.*;              // Importing all the commands of the io Java package
import java.util.Random;       // Required for random number generation.
public class CS_final_project_Stefan_Grulovic {
    public static void main(String[] args) throws IOException     // Declares that an error (exception) may occur
    {
        // Prepare for input
        InputStreamReader isr = new InputStreamReader(System.in); // Variable (object) reading the keystrokes
        BufferedReader br = new BufferedReader(isr);              // Variable (object) transalting the input stream
        String inData;                                            // Text variable to receive the user's input

        // Declaring of all the Variables
        //menu
        double choice=0, decimalRemainderMenu=0;
        //all choices error trapping
        double decimalRemainder=0;
        //Choice-1
        double[] num = new double[5];
        int sum=0, average=0, product=1;
        //Choice-2
        long factorial=1; 
        int smallest=0;
        double[] num2 = new double[5];
        //Choice-3
        long numb = 0,fibonacci, numb2 = 1;
        int loop;
        double n=0;
        //Choice-4
        int randomNum=0, range=0, guesses=0;
        double  user=0;
        // Declare the random number generator (new object called "random")
        Random random = new Random();
        //Choice-5
        int[] aArray = new int[51];
        int[] bArray = new int[51];
        int[] cArray = new int[51];
        int j=0;

        // PROGRAM STARTS HERE!
        do{
            System.out.println();
            System.out.println();
            System.out.println("\t\t" + "*Enter one of the following commands*");
            System.out.println("______________________________________________________________________");
            System.out.println();
            System.out.println("1 - Calculate Sum, Average and Product from 5 numbers you choose.");
            System.out.println("2 - Calculate the Factorail from the smallest number of 5 you choose.");
            System.out.println("3 - Find the n-th number of Fibonacci sequence.");
            System.out.println("4 - Game where you guess the random number.");
            System.out.println("5 - Program that displays Pythagorean Triples between 0-100.");
            System.out.println("6 - EXIT the program!");
            System.out.println("______________________________________________________________________");

            System.out.println();
            System.out.print("Enter \"1\", \"2\", \"3\", \"4\", \"5\" or \"6\":  ");
            inData = br.readLine(); // Reads the user's input and stores it in variable 'inData'                
            choice = Double.parseDouble(inData);

            decimalRemainderMenu = choice - (int)choice; //traps a double when aksed for integer
            decimalRemainder=0; //resets it to original state (beacuse its used multiple times), if the user choses to run the program again

            if (choice < 1 || choice > 6 || decimalRemainderMenu!=0 ) {
                System.out.println();
                decimalRemainderMenu =0;
                do{
                    System.out.println("There is no such and option please enter again: ");
                    inData = br.readLine(); // Reads the user's input and stores it in variable 'inData'                
                    choice = Double.parseDouble(inData);
                }while(choice < 1 || choice > 6 || decimalRemainderMenu!=0 );
            }
            if (choice < 1 || choice > 6) {
            }
            else if(choice == 1) {
                System.out.print("\n");
                System.out.print("You have chosen option 1!\n\n");
                System.out.println();

                for(int i=0; i<=4; i++){ //resets array num to 0
                    num[i]=0;
                }
                sum=0;        //resets it to original state, if the user choses to run the program again
                average=0;    //resets it to original state, if the user choses to run the program again
                product=1;    //resets it to original state, if the user choses to run the program again

                for(int i=0; i<=4; i++){       //Stores the 5 numbers that user entered in array "num"
                    do{
                        System.out.println("Enter a number:");
                        inData = br.readLine(); // Reads the user's input and stores it in variable 'inData'                
                        num[i] = Double.parseDouble(inData);

                        decimalRemainder = num[i] - (int)num[i]; //traps a double when aksed for integer
                        if( num[i] < 0 ){
                            System.out.println("You have entered a number less then 0. Please enter again! ");
                        }
                        else if( decimalRemainder!=0 ){
                            System.out.println("You have not entered an integer. Please enter again! ");
                        }
                    }while( num[i]<0 || num[i]>20 || decimalRemainder!=0 );   //checks if user entered the correct number
                    sum+=num[i];          //calculates the sum
                    average= sum/5;       //calculates the average
                    product*=num[i];      //calculates the product
                }

                System.out.println();
                System.out.println("The Sum is: " + sum);              //displays sum
                System.out.println("The Average is: " + average);      //displays average
                System.out.println("The Product is: " + product);      //displays product
                System.out.println();
            }
            else if(choice == 2) {
                System.out.print("\n");
                System.out.print("You have chosen option 2!\n\n");
                System.out.println();

                smallest=0;      //resets it to original state, if the user choses to run the program again
                factorial=1;     //resets it to original state, if the user choses to run the program again
                for(int i=0; i<=4; i++){  //resets array num2 to 0
                    num2[i]=0;
                }

                System.out.println("Please enter a number between 0-20! ");    //tells the user what to do
                for(int i=0; i<=4; i++){       //stores user entered numbers in array "num2"
                    do{     //check if the user entered number bigger then 20 or smaller then 0 and asks the user to enter the number again
                        System.out.println("Enter a number: ");
                        inData = br.readLine(); // Reads the user's input and stores it in variable 'inData'                
                        num2[i] = Double.parseDouble(inData);

                        decimalRemainder = num2[i] - (int)num2[i]; //traps a double when aksed for integer
                        if( num2[i] < 0 ){
                            System.out.println("You have entered a number less then 0. Please enter again! ");
                        }
                        else if( num2[i] > 20 ){
                            System.out.println("You have entered a number bigger then 20. Please enter again! ");
                        }
                        else if( decimalRemainder!=0 ){
                            System.out.println("You have not entered an integer. Please enter again! ");
                        }
                    }while( num2[i]<0 || num2[i]>20 || decimalRemainder!=0);   //checks if user entered the correct number
                }

                smallest=(int)num2[0];    //sets the first number of the array as the smallest
                for(int i=0; i<=4; i++){    //checks for each one which is the smallest and stores it in variable "smallest"
                    if(smallest>=num2[i]){
                        smallest=(int)num2[i];
                    }
                }
                for ( int c = 1 ; c <= smallest ; c++ )   //calculates the factorial
                    factorial*=c;

                System.out.println("Factorial of the smallest number(" + (int)smallest +") is: " + factorial);   //displays the factorial
                System.out.println();
            }

            else if(choice == 3) {
                System.out.print("\n");
                System.out.print("You have chosen option 3!\n\n");
                System.out.println();

                numb=0;           //resets it to original state, if the user choses to run the program again
                fibonacci=0;      //resets it to original state, if the user choses to run the program again
                numb2=1;          //resets it to original state, if the user choses to run the program again

                do{
                    System.out.println("Enter the n-th number of Fibonacci sequence you want: ");
                    inData = br.readLine(); // Reads the user's input and stores it in variable 'inData'                
                    n = Double.parseDouble(inData);

                    decimalRemainder = n - (int)n; //traps a double when aksed for integer
                    if( n < 0 ){
                        System.out.println("You have entered a number less then 0. Please enter again! ");
                    }
                    else if( decimalRemainder!=0 ){
                        System.out.println("You have not entered an integer. Please enter again! ");
                    }
                    else if( n>92 ){
                        System.out.println("This program can only calculate to the 92th sequence!");
                    }
                }while( n<0 || decimalRemainder!=0 || n>92 ); //checks if user entered the correct number
                for (loop=0; loop < n; loop++)  //calculates one by one until it reaches the nth series
                {
                    fibonacci = numb + numb2;
                    numb = numb2;
                    numb2 = fibonacci;
                }
                System.out.println("The n-th number you were looking for is: " + numb );   //displays the nth series

                System.out.println();
            }
            else if(choice == 4) {
                System.out.print("\n");
                System.out.print("You have chosen option 4!\n\n");
                System.out.println();

                range = (int)(100 - 0 + 1);
                randomNum =  ((int)(range * random.nextDouble()) + 0);
                //System.out.println( randomNum );

                do{
                    System.out.println("Guess the number:");
                    inData = br.readLine(); // Reads the user's input and stores it in variable 'inData'                
                    user = Double.parseDouble(inData);

                    decimalRemainder = user - (int)user;   //traps a double when aksed for integer
                    guesses++;     //calculates the number of guesses the user had

                    //helps the user to find the random number by telling if their guess is higher or lower then the random one 
                    // and error traps if user entered bigger then 100, lower then 0 or have not entered an integer
                    if(user > randomNum && user<100 && decimalRemainder==0){   
                        System.out.println("The number you entered is HIGHER then one looking for.");
                    }
                    else if( user < randomNum && user>0 && decimalRemainder==0){
                        System.out.println("The number you entered is LOWER then one looking for.");
                    }
                    else if ( user <= 0 ){
                        System.out.println("You have entered a number less then 0. Please enter again! ");
                    }
                    else if( user >= 100 ){
                        System.out.println("You have entered a number bigger then 1000. Please enter again! ");
                    }
                    else if( decimalRemainder!=0 ){
                        System.out.println("You have not entered an integer. Please enter again! ");
                    }
                }while( user!=randomNum || decimalRemainder!=0 || user<=0 || user>=100 ); //checks if user entered the correct number
                System.out.println();
                System.out.println("BRAVO you have found the number we were looking for (" + randomNum + ")! "); 
                System.out.println("And you had " + guesses+ " guesses.");
                //congratulates the user for guessing the number correct and displys the number oif guesess user had

                System.out.println();
            }
            else if(choice == 5) {
                System.out.print("\n");
                System.out.print("You have chosen option 5!\n\n");
                System.out.println();

                j=0;    //resets it to original state, if the user choses to run the program again
                for(int i=0; i<=50; i++){  //resets array aArray, bArray, cArray to 0
                    aArray[i]=0;
                    bArray[i]=0;
                    cArray[i]=0;
                } 
                for(int a=1; a<=99; a++){            //3 loops that go through every single possible combination of a,b,c
                    for(int b=1; b<=99; b++){
                        for(int c=1; c<=99; c++){
                            if(  a<b && b<c && c*c==a*a+b*b ){
                                j++; //count how many arrays are used, help so the following loop works good
                                aArray[j]=a;
                                bArray[j]=b;
                                cArray[j]=c;
                            }
                        }
                    }
                }

                System.out.println("The pythagorean triples between 0-100 are: ");
                for(int i=0; i<=j; i++){     //loop to find all triple excluding the repeating ones by dividing them with prime numbers
                    if (aArray[i]%2==0 && bArray[i]%2==0 && cArray[i]%2==0){
                    }
                    else if
                    (aArray[i]%3==0 && bArray[i]%3==0 && cArray[i]%3==0) {
                    }
                    else if
                    (aArray[i]%5==0 && bArray[i]%5==0 && cArray[i]%5==0) {
                    }
                    else if
                    (aArray[i]%7==0 && bArray[i]%7==0 && cArray[i]%7==0){
                    }
                    else if
                    (aArray[i]%11==0 && bArray[i]%11==0 && cArray[i]%11==0){
                    }
                    else if
                    (aArray[i]%13==0 && bArray[i]%13==0 && cArray[i]%13==0){
                    }
                    else if
                    (aArray[i]%17==0 && bArray[i]%17==0 && cArray[i]%17==0){
                    }
                    else if
                    (aArray[i]%19==0 && bArray[i]%19==0 && cArray[i]%19==0){
                    }
                    else{
                        System.out.println("(" + aArray[i] + ", "+ bArray[i] + ", " + cArray[i] + ")");
                    }
                }
                System.out.println();
            }  
            else if(choice == 6) {
                //...exit program
                System.out.print("\n");
                System.out.print("You have chosen option 6!\n\n");
                System.out.print("The program will now Exit, GOODBYE!");
                System.exit(0);
            }
        }  while (choice != 6);
    }   
}