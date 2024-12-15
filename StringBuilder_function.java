// создание пустого StringBuilder или с начальной строкой

// public class StringBuilder_function {
//     public static void main(String[] args) {
//         // Создание пустого StringBuilder
//         StringBuilder sb1 = new StringBuilder();
//         System.out.println("Пустой StringBuilder: " + sb1.toString());

//         // Создание StringBuilder  с начальной старокой
//         StringBuilder sb2 = new StringBuilder("Hello");
//         System.out.println("StringBuilder  с начальной строкой: " + sb2.toString());
//     }
// }



// // Добавление строк с помощью .append()

// public class StringBuilder_function {
//         public static void main(String[] args) {
//             StringBuilder sb = new StringBuilder("Hello");

//             // Добавление строки
//             sb.append(",World!");
//             System.out.println(sb.toString());
//         }
//     }


// Вставка строк с помощью .insert()

// public class StringBuilder_function {

//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("Hello World");

//         // Вставка строкиs
//         sb.insert(6 , "My ");
//         System.out.println(sb.toString());
//     }
// }



// Замена содержимого с помощью replace()

// public class StringBuilder_function {

//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("Hello world");

//         // Замена содержимого
//        sb.replace(6,11, "Java");
//        System.out.println(sb.toString());
//     }
// }



// Удаление содержмого с помощью delete() и deleteCharAt()

// public class StringBuilder_function {

//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("Hello world");

//         // Удаление части строки
//         sb.delete(5, 11);
//         System.out.println(sb.toString());

//         // Удаление одного символа
//         sb.deleteCharAt(0);
//         System.out.println(sb.toString());
//     }
// }



//ПОлучение длины и емкости с помощью length() и capacity()
// public class StringBuilder_function {

//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("Hello world");
//         // длина строки
//         int length = sb.length();
//         System.out.println(length);

//         // емкость
//         int capacity = sb.capacity();
//         System.out.println((capacity));
//     }
// }



// Преобразование в строку с помощью toString()

public class StringBuilder_function {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello world");

        // преобразование в строку
        String finaString = sb.toString();
        System.out.println((finaString));
    }
}