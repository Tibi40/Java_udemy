public class MethodChallenge {

    public static void main(String[] args) {

        int highScorePosition = calculateHihScorePosition( 1500);
        /* prin "int highScorePosition" definesc o noua variabila */

        /*O metoda/o clasa sau un alt aloritm = o idee/o solutie*/

        displayHighScorePosition("Tiberiu", highScorePosition);

        highScorePosition = calculateHihScorePosition( 800);
        displayHighScorePosition("Expectopatronam", highScorePosition);


        highScorePosition = calculateHihScorePosition( 30);
        displayHighScorePosition("Mark", highScorePosition);

        highScorePosition = calculateHihScorePosition( 400);
        displayHighScorePosition("Bob", highScorePosition);

        /* doua variabile se pot numi la fel, dar doar una (cea cu tipul ei in fata) poate
        fi veritabila, iar valorea celei de a doua, trebuie sa respecte tipul primei varibile
         */

        /* De ce highScorePosition este ilocuit cu 1/2/3/4, daca acest cuvant nici macar nu
        a fost folosit in metoda in care 1/2/3/4 se afla
         */
    }

    public static void displayHighScorePosition(String playerName, int highschoolPosition) {
        System.out.println(playerName + " managed to get to the " + highschoolPosition + " position!");
    }

    public static int calculateHihScorePosition(int playerScore) {

        if (playerScore >= 1000) {
            return 1; //return1 = System.out.println(1)
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}
