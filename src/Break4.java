public class Break4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            one: {
            two: {
            three: {
                System.out.println("\n i равно " +i);
                if (i == 1) break one; // переход по метке
                if (i == 2) break two;
                if (i == 3) break three;
                if (i == 4) break;
                // Эта строка кода никогда не будет достигнута
                System.out.println("Не будет выведено");
            }
                System.out.println("После блока three");
            }
                System.out.println("После блока two");
            }
                System.out.println("После блока one");

        }
        System.out.println("После блока for");
    }
}
