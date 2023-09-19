public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("Helena", 200);
        System.out.println(newScore);

        calculateScore(90);

        calculateScore();
    }

    public static int calculateScore(String playername, int score) {
        System.out.println("Player " + playername + " scored " + score);
        return score * 1000;
    }

    public static int calculateScore(int score) {
        /*System.out.println("Unnamed player scored " + score);
        return score * 1000;*/
        return calculateScore("Anonymous", score);
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }
}