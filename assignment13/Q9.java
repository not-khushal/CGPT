package assignment13;

import java.util.Scanner;

public class Q9 {
    private static String getComputerChoice() {
        int choice = (int)(Math.random() * 3);
        switch(choice) {
            case 0: return "rock";
            case 1: return "paper";
            case 2: return "scissors";
            default: return "rock";
        }
    }
    
    private static String findWinner(String playerChoice, String computerChoice) {
        if(playerChoice.equals(computerChoice)) {
            return "tie";
        }
        if((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
           (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
           (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
            return "player";
        }
        return "computer";
    }
    
    private static String[][] calculateStats(String[] results, int games) {
        int playerWins = 0;
        int computerWins = 0;
        int ties = 0;
        
        for(String result : results) {
            if(result.equals("player")) playerWins++;
            else if(result.equals("computer")) computerWins++;
            else ties++;
        }
        
        double playerPercentage = (playerWins * 100.0) / games;
        double computerPercentage = (computerWins * 100.0) / games;
        double tiePercentage = (ties * 100.0) / games;
        
        return new String[][] {
            {"Player", String.valueOf(playerWins), String.format("%.2f%%", playerPercentage)},
            {"Computer", String.valueOf(computerWins), String.format("%.2f%%", computerPercentage)},
            {"Ties", String.valueOf(ties), String.format("%.2f%%", tiePercentage)}
        };
    }
    
    private static void displayResults(String[] results, String[][] stats) {
        System.out.println("\nGame Results:");
        for(int i = 0; i < results.length; i++) {
            System.out.println("Game " + (i+1) + ": " + results[i]);
        }
        
        System.out.println("\nStatistics:");
        System.out.printf("%-10s %-10s %-10s%n", "Player", "Wins", "Percentage");
        System.out.println("--------------------------------");
        for(String[] row : stats) {
            System.out.printf("%-10s %-10s %-10s%n", row[0], row[1], row[2]);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of games to play: ");
        int games = scanner.nextInt();
        scanner.nextLine();
        
        String[] results = new String[games];
        
        for(int i = 0; i < games; i++) {
            System.out.print("\nEnter your choice (rock/paper/scissors): ");
            String playerChoice = scanner.nextLine().toLowerCase();
            String computerChoice = getComputerChoice();
            
            System.out.println("Computer chose: " + computerChoice);
            results[i] = findWinner(playerChoice, computerChoice);
        }
        
        String[][] stats = calculateStats(results, games);
        displayResults(results, stats);
        
        scanner.close();
    }
}
