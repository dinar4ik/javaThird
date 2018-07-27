import java.util.Arrays;

public class Lesson2_1 {

    public static void main(String[] args) {


        // boolean equalsIgnoreCase(String anotherString) Сравнивает данную строку с другой строкой, игнорируя регистр букв.

//        String d1 = "Dinara";
//
//        String d2 = "DiNaRa";
//
//        boolean result = d1.equalsIgnoreCase(d2);
//
//        System.out.println(result);

        // byte getBytes() Возвращает представление строки в виде массива байт.

//        String helloWorld = "Hello World!";
//        byte[] helloByte = helloWorld.getBytes();
//        System.out.println(Arrays.toString(helloByte));


        //void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) Копирует символы из этой строки в массив символов назначения.
        // srcBegin - индекс первого символа в строке для копирования.
        // srcEnd - индекс после последнего символа в строке для копирования
        // dest - массив назначения символов, в котором копируются символы из String.
        // destBegin - индекс в массиве, начиная с того, где символы будут помещены в массив.

//        String helloWorld = "Hello World!";
//
//        char [] str = {'9','5','d','i','n','a','r','a','a','i','t','b','a','y'};
//        helloWorld.getChars(3,10, str, 5);
//
//        System.out.println(str);


       // int hashCode() Возвращает хэш-код для этой строки.

//            String d1 = "Dinara";
//        System.out.println(d1.trim());

        // int indexOf(int ch)  Возвращает индекс первого вхождения указанного символа в данной строке.
        // int indexOf(int ch, int fromIndex) Возвращает индекс первого вхождения указанного символа в данной строке, начиная поиск с указанного индекса.
        // int indexOf(String str) Возвращает индекс первого вхождения указанной подстроки в данной строке.
        // int indexOf(String str, int fromIndex) Возвращает индекс первого вхождения указанной подстроки в данной строке, начиная с указанного индекса.

//        String d1 = "use computer";
//        String d2 = "compile error in hidden module ";
//        String d3 = "JavaScript often abbreviated as JSc";
//        System.out.println(d3.indexOf('S'));
//        System.out.println(d3.indexOf('e'));
//        System.out.println(d1.indexOf('m',3));
//        System.out.println(d1.indexOf('e',4));
//        System.out.println(d2.indexOf("or",3));
//        System.out.println(d3.indexOf("Sc",5));
//        System.out.println(d3.indexOf("Sc"));


        // String intern() Возвращает каноническое представление для строкового объекта

        System.out.println("123" == "123" ); // true
        System.out.println(("12" + "3").intern() == "123"); // true
        System.out.println( new String("123") == new String("123") ); // false
        System.out.println( new String("123") == "123"); // false
        System.out.println( new String("123").intern() == "123" );    // true
    }


    }


