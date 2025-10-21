public class lps1 {

    // Step 1: Construct LPS array
    public static int[] computeLPSArray(String pat) {
        int m = pat.length();
        int[] lps = new int[m];
        int len = 0;
        int i = 1;

        while (i < m) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else if (len != 0) {
                len = lps[len - 1];
            } else {
                lps[i] = 0;
                i++;
            }
        }
        return lps;
    }

    // Step 2: KMP search
    static int[] search(String txt, String pat) {
        int n = txt.length();
        int m = pat.length();

        int[] lps = computeLPSArray(pat);
        int[] res = new int[n]; // temporary storage
        int count = 0;

        int i = 0, j = 0;
        while (i < n) {
            if (txt.charAt(i) == pat.charAt(j)) {
                i++;
                j++;
            }

            if (j == m) { // full match
                res[count++] = i - j; // store index
                j = lps[j - 1];       // continue search
            } 
            else if (i < n && txt.charAt(i) != pat.charAt(j)) {
                if (j != 0) {
                    j = lps[j - 1]; // jump using LPS
                } else {
                    i++;            // move in text
                }
            }
        }

        // Trim result to correct size
        int[] ans = new int[count];
        for (int k = 0; k < count; k++) {
            ans[k] = res[k];
        }
        return ans;
    }

    // Main
    public static void main(String[] args) {
        String txt = "aabaaca";
        String pat = "aaba";

        int[] result = search(txt, pat);
        System.out.print("Pattern found at indexes: ");
        for (int idx : result) {
            System.out.print(idx + " ");
        }
    }
}
