import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getLogger("main");
        logger.info("Введите исходную строку");
        String s = scanner.next(); 
        int[] array = new int[s.length()];
        for(int i= 0; i<s.length(); i++){
            logger.info("Введите значение индекса массива");
            array[i] = scanner.nextInt();
        }
        char[] result = new char[s.length()];

        for(int i = 0; i<array.length;i++){
            char temp = s.charAt(i);
            int tempindex = array[i];
            result[tempindex - 1] = temp;
        }
        logger.info((Arrays.toString(result)));
    }
}
