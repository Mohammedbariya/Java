import java.util.Random;
import java.util.Scanner;
public class Rock_paper_Scissor {
    public static void main(String[] args) {
        Random S = new Random();
        int comp = S.nextInt(1,4);
        
        Scanner p = new Scanner(System.in);
        Scanner Y = new Scanner(System.in);
        System.out.println("Welcome to ROCK PAPER SCISSOR GAME");
        int i =0;
        int play = 0;
        int com = 0;
        while (i<3){
            ++i;
            System.out.println("\nChoose one option from following");
            System.out.println("Rock-1\nPaper-2\nScissor-3");
            System.out.print("Enter your option(Enter a number): ");
            int player = p.nextInt();
        
            if(comp ==1){
                System.out.println("Computer choose Rock");
                if(player==1){
                    System.out.println("Game tie");}
                else if (player == 2){
                    System.out.println("You win");
                        ++play;}
                else if(player == 3){
                    System.out.println("You loss");
                        ++com;}
                System.out.println("play again");          
            }
            else if(comp == 2){
                System.out.println("Computer choose Paper");
                if(player==1){
                    System.out.println("You loss");
                        ++com;}
                else if (player == 2){
                    System.out.println("Game tie");}
                else if(player == 3){
                    System.out.println("You win");
                        ++play;}
                System.out.println("play again");                          

            }
            else if(comp == 3){
                System.out.println("Computer choose Scisor");
                if(player==1){
                    System.out.println("You Win");
                        ++play;}
                else if (player == 2){
                    System.out.println("You loss");
                        ++com;}
                else if(player == 3){
                    System.out.println("Game tie");}  
            System.out.println("play again");              
            }
        
        }
        if (com > play ){
            System.out.println("Computer win the game");
        }
        else if (play > com){
            System.out.println("Congrats! You win the game");

        }
        else if (play == com){
            System.out.println("The game is tie");
        }


    }
}
