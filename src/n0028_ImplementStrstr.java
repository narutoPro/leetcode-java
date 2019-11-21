/**
 * @author: chende
 * @date: 2019/11/21 19:25
 * @description: kmp
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2
Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1
 */
public class n0028_ImplementStrstr {
    //jdk8 String indexOf()源码也是这样  kmp算法构造next串
    // O(m*n)
    public int strStr(String haystack, String needle) {

        if(needle==null || needle.length()==0) return 0;
        if (haystack==null) return -1;
        if (haystack.length()<needle.length()) return -1;

        for (int i=0;i<haystack.length();i++){
            int j=0;
            for ( ;j<needle.length();j++){
                if (i+j>=haystack.length()  ||haystack.charAt(i+j)!=needle.charAt(j))
                    break;
            }
            if (j==needle.length()) return i;
        }
        return -1;
    }

    class ElegantSolution{
        public int strStr(String haystack, String needle) {
            for (int i = 0; ; i++) {
                for (int j = 0; ; j++) {
                    if (j == needle.length()) return i;
                    if (i + j == haystack.length()) return -1;
                    if (needle.charAt(j) != haystack.charAt(i + j)) break;
                }
            }
        }
    }
}
