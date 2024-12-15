// Задание3
// посчитайте сколько "драгоценных камней " в куче "обычных камней"
// пример: jewels = "aB", stones = "aaaAbbbB"
// Результат: "a3B1"

import java.io.EOFException;
import java.util.Scanner;
import java.util.logging.Logger;

public class task3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner((System.in));
        Logger logger = Logger.getLogger("main");
        logger.info("Введите значения драгоценностей");
        String javels = scanner.next();
        logger.info("Введите строку содержащую обычные камни");
        String stones = scanner.next();
        if(javels.length() == 0){
            throw new EOFException("Не введен ни один символ соответствующий драгоценностям");
        }
        if(stones.length() == 0){
            throw new EOFException("Не введен ни один символ соответствующий драгоценностям");

        }
        int Counter = 0;
        StringBuilder sb = new StringBuilder();
        for(char c1 : javels.toCharArray()){
            for(char c2: stones.toCharArray()){
                if(c1 == c2){
                    Counter++;
                }
            }
                sb.append(c1)
                        .append(":")
                        .append(Counter)
                        .append(" ");
                Counter = 0;
            }
            logger.info(sb.toString());
        }
    }   

