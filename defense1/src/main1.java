public class main1 {
    public static void main(String[] args) {
        String str = "abraka dabra";
        char chr = 'a';
        int count = count(str, chr);
        System.out.println(chr  + count);
    }

    public static int count(String str, char chr) {
        if (str.length() == 0) {
            return 0;
        };



/*we have string,using recursive
abraka dabra, how many times a showed  in these words
*/