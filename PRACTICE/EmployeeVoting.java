

import java.util.Scanner;

public class EmployeeVoting {
    //constants for categories
    static final int MANAGING_DIRECTOR=1;
    static final int ASSISTANT_MANAGER = 2;
    static final int CHIEF_EXECUTIVE = 3;
    static final int DEPARTMENT_HEAD = 4;
    static final int TREASURER = 5;
    static final int BRANCH_HEAD = 6;

    //vote counters for each category
    static int[] votesForMD = new int[5];
    static int[] votesForAM = new int[5];
    static int[] votesForCE = new int[5];
    static int[] votesForDH = new int[5];
    static int[] votesForTR = new int[5];
    static int[] votesForBH = new int[5];


    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);

      System.out.println("enter the number of employees voting");
      int numEmployees=sc.nextInt();
      
      for(int i=1;i<numEmployees;i++){
        System.out.println("for employee"+i+" :");
        System.out.println("input category to vote (1-6): ");
        int category=sc.nextInt();

        System.out.println("Vote (1-4):");
        int vote=sc.nextInt();
        sc.close();
        if(vote<1 || vote>4){
            System.out.println("invalid vote entered ");
            continue;
        }
        switch (category) {
            case MANAGING_DIRECTOR: votesForMD[vote]++;
                break;
            case ASSISTANT_MANAGER: votesForAM[vote]++;
                break;
            case CHIEF_EXECUTIVE: votesForCE[vote]++;
                break;
            case DEPARTMENT_HEAD: votesForDH[vote]++;
                break;
            case TREASURER: votesForTR[vote]++;
                break;
            case BRANCH_HEAD: votesForBH[vote]++;
                break;
            default :   System.out.println("invalid category");
        }

      }
          // Find and display winners for each category
          System.out.println("Election Results:");
          displayWinner("Managing Director", votesForMD);
          displayWinner("Assistant Manager", votesForAM);
          displayWinner("Chief Executive", votesForCE);
          displayWinner("Department Head", votesForDH);
          displayWinner("Treasurer", votesForTR);
          displayWinner("Branch Head", votesForBH);
    }
    public static void displayWinner(String categoryName, int[] votes) {
        int maxVotes = 0;
        int winner = -1;
        for (int i = 1; i < votes.length; i++) {
            if (votes[i] > maxVotes) {
                maxVotes = votes[i];
                winner = i;
            }
        }

        if (winner == -1) {
            System.out.println("No votes were cast for " + categoryName);
        } else {
            System.out.println("Winner in " + categoryName + " category: Candidate " + winner + " with " + maxVotes + " votes.");
        }
    }
}
