package homework.whileloops;

    public class DoWhile2 {
        public static void main(String[] args) {
            int i = 1;
            do {
                if (i % 10 == 0) {
                    System.out.println(i + " ");
                }
                i++;
            } while (i <= 1000);
        }
    }

