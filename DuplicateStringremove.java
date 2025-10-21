public class DuplicateStringremove {
    public static void remove(String str, int idx, StringBuilder newStr, boolean[] map) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            // If character already seen, skip it
            remove(str, idx + 1, newStr, map);
        } else {
            // Mark character as seen
            map[currChar - 'a'] = true;
            remove(str, idx + 1, newStr.append(currChar), map);
        }
    }
     public static void main(String[] args) {
        String str = "ankan";
        boolean[] map = new boolean[26]; // For a-z characters
        remove(str, 0, new StringBuilder(""), map);
    }
}
