package al223jw;

/**
 * Created by Johanna on 2016-10-22.
 */
public class test {

    public static void main(String[] args) {
        String s = "Hello World!";
        String sub = "lo";

        System.out.println(hasSubsecuense(s, sub));
    }

    public static boolean hasSubsecuense(String str, String sub) {

        boolean hasSub = false;

        char[] c = str.toCharArray();
        char[] s = sub.toCharArray();

        for (int i = 0; i < c.length; i++) {
            if (c[i] == s[0]) {
                hasSub = false;
                for (int j = 0; j < s.length; j++) {
                    if (c[i + j] == s[j]) {
                        hasSub = true;
                    }
                    else
                    {
                        hasSub = false;
                        break;
                    }
                }
                if (hasSub) {
                    return true;
                }
            }
        }
        return hasSub;
    }
}
