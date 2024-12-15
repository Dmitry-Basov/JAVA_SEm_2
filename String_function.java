// функция concat - объединяет 2 строки

// public class String_function {
//     public static void main(String[] args) {
//         String str1 = "Hello";
//         String str2 = "world";
//         String concatenated = str1.concat((" ").concat(str2));  
//         System.out.println(concatenated);      
//     }
// }



// Функция valueof() - преобразует переданное значение в строку
// На примере мы преобразуем целое число в строку

// public class String_function {

//     public static void main(String[] args) {
//         int number = 123;
//         String s = String.valueOf(number);
//         System.out.println(s);
//     }
// }



// Функция join() - объединяет элементы массива или коллекции с заданным разделителем
// в данном примере мы объеденим строки с разделителем
// public class String_function {

//     public static void main(String[] args) {
       
//         String s = String.join(", ","java", "python", "c++");
//         System.out.println(s);
//     }
// }



// Функция charAat() - возвращает символ в строке по указанному индексу

// public class String_function {

//     public static void main(String[] args) {
//         String str1 = "Hello";
//         char ch = str1.charAt(1);
//         System.out.println(ch);
//     }
// }


// Функция indexof()- возвращает индекс первого вхождения указанного символа
// в данном примере мы находим индекс первого появления 'W' в строке str1
// public class String_function {

//     public static void main(String[] args) {
//         String str1 = "Hello";
//         int index = str1.indexOf('o');
//         System.out.println(index);
//     }
// }



// // Функция isEmpty - проверяет является ли строка пустой
// public class String_function {

//   public static void main(String[] args) {
//     String str = "";
//     boolean  isEmpty = str.isEmpty();
//     System.out.println(isEmpty);
//   }  
// } 



// функция equals() - сравнивает две строки на равенство с учетом регистра

// public class String_function {

//     public static void main(String[] args) {
//         String str1 = "Hello";
//         String str2 = "hello";
//         boolean eq = str1.equals(str2);
//         System.out.println(eq);

//     }
// }



// функция compareTo() сравнивает две строки лексикографически

// public class String_function {

//     public static void main(String[] args) {
//         String str1 = "Hello";
//         String str2 = "hello";
//         int comparison = str1.compareTo(str2);
//         System.err.println(comparison);
//     }
// }
    


// Функция split() разбивавет строку на массив строк по заданному разделителю
// в данном примере мы разбиваем строку sentense на слова, используя пробел в качестве
// разделителя

public class String_function {

    public static void main(String[] args) {
        String sintense = "Java is a powerful language";
        String[] words = sintense.split(" ");
        System.err.println("результат split: ");
        for(String word: words){
            System.out.println(word + " ");
        }
    }
}
