package Problems.Easy.数组;

/**
 * @Description 拼写单词
 * @Author jia_h
 * @Date 2021/2/27 9:24
 * @Version 1.0
 */
public class LeetCode_1160 {

    /**
     * url:https://leetcode-cn.com/problems/find-words-that-can-be-formed-by-characters/
     * */
    public static void main(String[] args) {
        String[] words = {"dyiclysmffuhibgfvapygkorkqllqlvokosagyelotobicwcmebnpznjbirzrzsrtzjxhsfpiwyfhzyonmuabtlwin","ndqeyhhcquplmznwslewjzuyfgklssvkqxmqjpwhrshycmvrb","ulrrbpspyudncdlbkxkrqpivfftrggemkpyjl","boygirdlggnh","xmqohbyqwagkjzpyawsydmdaattthmuvjbzwpyopyafphx","nulvimegcsiwvhwuiyednoxpugfeimnnyeoczuzxgxbqjvegcxeqnjbwnbvowastqhojepisusvsidhqmszbrnynkyop","hiefuovybkpgzygprmndrkyspoiyapdwkxebgsmodhzpx","juldqdzeskpffaoqcyyxiqqowsalqumddcufhouhrskozhlmobiwzxnhdkidr","lnnvsdcrvzfmrvurucrzlfyigcycffpiuoo","oxgaskztzroxuntiwlfyufddl","tfspedteabxatkaypitjfkhkkigdwdkctqbczcugripkgcyfezpuklfqfcsccboarbfbjfrkxp","qnagrpfzlyrouolqquytwnwnsqnmuzphne","eeilfdaookieawrrbvtnqfzcricvhpiv","sisvsjzyrbdsjcwwygdnxcjhzhsxhpceqz","yhouqhjevqxtecomahbwoptzlkyvjexhzcbccusbjjdgcfzlkoqwiwue","hwxxighzvceaplsycajkhynkhzkwkouszwaiuzqcleyflqrxgjsvlegvupzqijbornbfwpefhxekgpuvgiyeudhncv","cpwcjwgbcquirnsazumgjjcltitmeyfaudbnbqhflvecjsupjmgwfbjo","teyygdmmyadppuopvqdodaczob","qaeowuwqsqffvibrtxnjnzvzuuonrkwpysyxvkijemmpdmtnqxwekbpfzs","qqxpxpmemkldghbmbyxpkwgkaykaerhmwwjonrhcsubchs"};
        String chars = "usdruypficfbpfbivlrhutcgvyjenlxzeovdyjtgvvfdjzcmikjraspdfp";
        int res = countCharacters(words, chars);
        System.out.println(res);
    }

    public static int countCharacters(String[] words, String chars) {
        if (words == null) {
            return 0;
        }
        if (chars == null || "".equals(chars)) {
            return 0;
        }
        int res = 0;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int temp = 0;
            String tempChar = chars;
            for (char c : word.toCharArray()) {
                String value = String.valueOf(c);
                if (tempChar.indexOf(value) == -1) {
                    break;
                } else {
                    tempChar = tempChar.replaceFirst(value, "");
                    ++temp;
                }
            }
            if (temp == word.length()) {
                res += temp;
            }
        }
        return res;
    }
}
