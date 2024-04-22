/**
 * This program determines the user's grade through two different methods. The first is through if statements where the score is validated and then the grade is determined. The second
 * is through a switch statement, however, it is assumed that the user inputs a valid score.
 *
 * Kylie Heiland
 * 
 * Project03
 * 
 * 2/13/2022
 */

import java.util.Scanner;

public class KylieHeiland_Project03{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your score (0-100): ");
        int score = input.nextInt(); //Most final scores are doubles, but for the sake of this program, we are assuming that the scores are integers.
        
        //Ensures user is inputting a valid score.
        /*
        if(!(score >= 0 && score <= 100)){
            System.out.println("Illegal score. Exiting program.");
            System.exit(1);
        } //Requirement 4: Do not validate user's input (for the switch statement).
        */
        
        System.out.print("Your grade is: ");
        
        /*if(score >= 90 && score <= 100){
            System.out.println("A");
        }
        else if(score >= 80 && score < 90){
            System.out.println("B");
        }
        else if(score >= 70 && score < 80){
            System.out.println("C");
        }
        else if(score >= 65 && score < 70){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        } */
        
        switch (score){ // I was going to make this (score/10) so that the first digit of the number would determine what case to use, however, I have it where anything below the score 65 is 
                        // considered an "F," which would give me the incorrect result if I made it: (score/10).
            case 100: 
            case 99:
            case 98:
            case 97:
            case 96:
            case 95:
            case 94:
            case 93:
            case 92:
            case 91:
            case 90:
                System.out.println("A");
                break;
            case 89:
            case 88:
            case 87:
            case 86:
            case 85:
            case 84:
            case 83:
            case 82:
            case 81:
            case 80:
                System.out.println("B");
                break;
            case 79:
            case 78:
            case 76:
            case 75:
            case 74:
            case 73:
            case 72:
            case 71:
            case 70:
                System.out.println("C");
                break;
            case 69:
            case 68:
            case 67:
            case 66:
            case 65:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
                break;
            }
        
    }
}


/* OUTPUT:
 
IF ELSE TESTS:
  
Enter your score (0-100): 2
Your grade is: 
F

Enter your score (0-100): 103
Illegal score. Exiting program.

Enter your score (0-100): 92
Your grade is: 
A

SWITCH STATEMENT TESTS:

Enter your score (0-100): 86
Your grade is: 
B

Enter your score (0-100): 78
Your grade is: 
C

Enter your score (0-100): 67
Your grade is: 
D

 */
