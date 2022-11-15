
import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();

        System.out.println("Team:");
        String team = scan.nextLine();
        int games = 0;
        int wins = 0;
        int losses = 0;

        try (Scanner newFile = new Scanner(Paths.get(file))) {
            while(newFile.hasNextLine()) {
                String line = newFile.nextLine();

                String [] parts = line.split(",");
                String teamName1 = parts[0];
                String teamName2 = parts[1];
                int scoreTeam1 = Integer.valueOf(parts[2]);
                int scoreTeam2 = Integer.valueOf(parts[3]);

                if (teamName1.equals(team)) { //|| teamName2.equals(team)) {
                    games++;
                    if (scoreTeam1 > scoreTeam2) {
                        wins++;
                    } else {
                        losses++;
                    }
                } else if (teamName2.equals(team)) {
                    games++;
                    if (scoreTeam2 > scoreTeam1) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }
        }

        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}
