public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        System.out.println(" ");

        //1
        String words = "GR Shehan Malinda Jayasooriya";
        int countWords = words.split(" ").length;
        System.out.println(countWords);

        System.out.println(" ");


        //2
        String original = "hello";
        String reversed = "";

        for(int i = original.length()-1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        System.out.println(reversed);

        System.out.println(" ");


        //3
        String original_1 = "Hello World";
        String reversed_1 = "";

        for(int i = 0 ; i < original_1.length(); i++) {
            reversed_1 = original_1.charAt(i) + reversed_1;
        }
        System.out.println(reversed_1);

        System.out.println(" ");


        //4
        String string = "Hello World";
        char[] chars = string.toCharArray();

        for(char c : chars) {
            System.out.println(c);
        }


        System.out.println(" ");

        //5
        String string_1 = "HelloWorld";
        char[] chars_1 = new char[string_1.length()];

        for (int i = 0; i < string_1.length(); i++) {
            chars_1[i] = string_1.charAt(i);
            System.out.println(chars_1[i]);
        }


        System.out.println(" ");

        //6
        int ages [] = {28,27,28,30,26,35};
        int lowestAge = ages[0];

        for(int age : ages){
            if(lowestAge > age)
                lowestAge = age;
        }
        System.out.println(lowestAge);


        System.out.println(" ");

        //7

    }
}