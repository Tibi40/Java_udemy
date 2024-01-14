public class WhileLoop2 {

        public static void main(String[] args) {

            int number = 4;
            int X = 20;

            while (number <= X) {
                number++;
                if (!isEvenNumber(number)) {
                    continue;
                }
                System.out.println("Even number: " + number);
            }



        }

        public static boolean isEvenNumber (int number) {

            if (number % 2 == 0) {
                return true;
            } else {
                return false;
            }

        }
    }

   /* public static void findNumbers (int number) {
        int savedNumbers = 0;

        if ((number == 5) && (number <= 20)) {
            while (number % 2 == 0) {
               number++;
            }
        }*/




