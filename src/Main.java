public class Main {
    public static void main(String[] args) {

        int int2 = 5;

        int highScore = 50;

        if (highScore > 25) {
            highScore = highScore + 1000;
        }

        int health = 100;

        if ((health < 25) && (highScore > 1000)) {
            highScore = highScore - 1000;
        }

        int finalScore = calculateScore(true, 10000, 8, 200);
        System.out.println("The final score is: ");
        /*int finalScore = calculateScore(true, 5000, 8, 300);
        System.out.println("The final score is: ");*/


            boolean gameOver = true;
            int score = 10000;
            int levelCompleted = 8;
            int bonus = 200;

            //int finalScore = score;

        if (gameOver == true) {
            finalScore += (levelCompleted + bonus);
            System.out.println("Your final score was " + finalScore);
        }

        //System.out.println("Hello world!");
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

       int finalScore = score;

        if (gameOver == true) {
            finalScore += (levelCompleted + bonus);
        }

        return finalScore;

        //cand definim tipul de metoda int/boolean/String "numeMetoda"
        //ne trbuie un return al unei varialbile de acleasi tip
        //pe aceasta variabila o v-m chema (scrie si executa in metoda pricipala)
        //si ii v-om da valoarea = (numele) functiei secundare, impreuna cu valorile pramaterilor
        //pe care i-am definim in paranteaza ei, varibila care va avea valorea/rezultatul operatiei
        //scrise in functia sedundara
    }


}