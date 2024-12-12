public class UniqueCharacters {
    public static boolean isUniqueChars(String str) {
        if (str.length() > 128) return false; // More than 128 characters is not possible for ASCII
        
        boolean[] charSet = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (charSet[val]) {
                return false; // Character already seen
            }
            charSet[val] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isUniqueChars("abcdef")); // true
        System.out.println(isUniqueChars("abcdeff")); // false
    }
}
