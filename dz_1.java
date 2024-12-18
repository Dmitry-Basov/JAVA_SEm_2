import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class dz_1 {
    public static void main(String[] args) {
        int[] array = {5, 1, 4, 2, 8};
        Logger logger = Logger.getLogger(dz_1.class.getName());
        FileHandler fh;

        try {
            fh = new FileHandler("BubbleSortLog.txt");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

            BubbleSort(array, logger);
        } catch (SecurityException | IOException e){
            e.printStackTrace();
        }
    }

    public static void BubbleSort(int[] array,Logger logger){
        int n = array.length;
        for(int i = 0; i < n -1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j +1];
                    array[j +1] = temp;
                }
            }
            logger.info("Итерация " + (i+ 1) + ": " + arrayToString(array));
        }
    }
    
        public static String arrayToString(int[] array){
            StringBuilder sb = new StringBuilder();
            for(int i: array){
                sb.append(i).append(" ");
            }
            return sb.toString().trim();
        }
}



       
