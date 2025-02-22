import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] teams = {"Manama", "Sitra", "Muharraq", "AlAhli", "Riffa"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the team name to search");
        String team = scan.nextLine();
        int index = -1;
        for (int i = 0; i < teams.length; i++) {
            if (teams[i].equalsIgnoreCase(team)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println(team + " has been won in the last 5 years");
        } else {
            System.out.println(team + " has not been won in the last 5 years");
        }
    }
}