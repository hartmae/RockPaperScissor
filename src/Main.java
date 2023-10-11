import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String pA = "";
        String pB = "";
        String choice = "";
        boolean doneA = false;
        boolean doneB = false;
        boolean doneC = false;
        boolean again = true;
        String trash = "";

        do {
            do {
                System.out.print("Player 1, Rock = R, Paper = P, Scissors = S : ");
                if (in.hasNext()) {
                    pA = in.next();
                    if (pA.equals("R") || pA.equals("r") || pA.equals("P") || pA.equals("p") || pA.equals("S") || pA.equals("s")) {
                        doneA = true;
                    }
                } else {
                    trash = in.nextLine();
                    System.out.print("Player 1, Rock = R, Paper = P, Scissors = S : ");
                }
            }
            while (!doneA);
            do {
                System.out.print("Player 2, Rock = R, Paper = P, Scissors = S : ");
                if (in.hasNext()) {
                    pB = in.next();
                    if (pB.equals("R") || pB.equals("r") || pB.equals("P") || pB.equals("p") || pB.equals("S") || pB.equals("s")) {
                        doneB = true;
                    }
                } else {
                    trash = in.nextLine();
                    System.out.print("Player 1, Rock = R, Paper = P, Scissors = S : ");
                }
            }
            while (!doneB);
//ties
            if ((pA.equals("R") || pA.equals("r")) && (pB.equals("R") || pB.equals("r"))) {
                System.out.print("Rock, Paper, Scissors, Shoot!  Rock vs. Rock, It is a Draw...");
            }
            if ((pA.equals("S") || pA.equals("s")) && (pB.equals("S") || pB.equals("s"))) {
                System.out.print("Rock, Paper, Scissors, Shoot!  Scissors vs. Scissors, It is a Draw...");
            }
            if ((pA.equals("P") || pA.equals("p")) && (pB.equals("P") || pB.equals("p"))) {
                System.out.print("Rock, Paper, Scissors, Shoot!  Paper vs. Paper, It is a Draw...");
            }
//Wins
            if ((pA.equals("R") || pA.equals("r")) && (pB.equals("S") || pB.equals("s"))) {
                System.out.print("Rock, Paper, Scissors, Shoot!  Rock Crushes Scissors! Player 1 wins...");
            }
            if ((pA.equals("S") || pA.equals("s")) && (pB.equals("R") || pB.equals("r"))) {
                System.out.print("Rock, Paper, Scissors, Shoot!  Rock Crushes Scissors! Player 2 wins...");
            }

            if ((pA.equals("P") || pA.equals("p")) && (pB.equals("R") || pB.equals("r"))) {
                System.out.print("Rock, Paper, Scissors, Shoot!  Paper Covers Rock! Player 1 wins...");
            }
            if ((pA.equals("R") || pA.equals("r")) && (pB.equals("P") || pB.equals("p"))) {
                System.out.print("Rock, Paper, Scissors, Shoot!  Paper Covers Rock! Player 2 wins...");
            }

            if ((pA.equals("S") || pA.equals("s")) && (pB.equals("P") || pB.equals("p"))) {
                System.out.print("Rock, Paper, Scissors, Shoot!  Scissors Cuts Paper! Player 1 wins...");
            }
            if ((pA.equals("P") || pA.equals("p")) && (pB.equals("S") || pB.equals("s"))) {
                System.out.print("Rock, Paper, Scissors, Shoot!  Scissors Cuts Paper! Player 2 wins...");
            }
            do {
                System.out.print("Play Again? Y/N ");
                if (in.hasNext()) {
                    choice = in.next();
                    if (choice.equals("Y") || choice.equals("y")) {
                        again = true;
                        doneC = true;
                    } else if (choice.equals("N") || choice.equals("n")) {
                        again = false;
                        doneC = true;
                    }
                } else {
                    trash = in.nextLine();
                    System.out.print("Play Again? Y/N ");
                    doneC = false;
                }
            } while (!doneC);
        } while (again);
    }
}