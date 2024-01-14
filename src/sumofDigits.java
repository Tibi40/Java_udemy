public class sumofDigits {

    public static void main(String[] args) {

        sumDigits(121);
    }

    public static int sumDigits (int number) {

        if (number > 0) {
            while (number > 0) {
                int lastNumber = number % 10;
                int sum = lastNumber * 10 + lastNumber;
                int remainedNumbers = number / 10;
                number++;
                System.out.println(sum);
            }
        } else {
            return -1;
        }
        return number;
    }
 }
