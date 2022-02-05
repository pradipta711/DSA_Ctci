public class URLify_3 {

    public static void main(String[] args) {
        char[] array = {'M', 'r', ' ', 'J', 'o', 'h', 'n', ' ', 'S', 'm', 'i', 't', 'h', ' '};
        int l = 13;
        System.out.println(Urlify(array, l));

    }

    static char[] Urlify(char[] sentence, int length) {
        int spacecount = 0;
        for (int i = 0; i < length; i++) {
            if (sentence[i] == ' ') {
                spacecount++;

            }
        }
        int newlength = length + 2 * spacecount;   //one space is already available in the array, two required hence
                                                    //multiplied by 2
        char[] newsentence = new char[newlength];
        int j = 0;
        for (int i = 0; i < length; i++) {
            if (sentence[i] == ' ') {
                newsentence[j] = '%';
                newsentence[j + 1] = '2';
                newsentence[j + 2] = '0';
                j += 3;

            } else {
                newsentence[j] = sentence[i];
                j++;

            }
        }
        return newsentence;


    }
}