public class main1 {
    public static void main(String[] args) {
        String str = "abraka dabra";
        char char = 'a';
        int count = count(str, char);
        System.out.println(char  + count);
    }

    public static int count(String str, char targetChar) {
        if (str.length() == 0) {
            return 0;
        }



/*we have string,using recursive
abraka dabra, how many times a showed  in these words
*/