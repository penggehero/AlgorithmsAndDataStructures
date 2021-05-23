package AimToOffer;

/**
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 *  
 */
public class Offer05替换空格 {
    /**
     * replace直接替换
     *
     * @param s
     * @return
     */
    public String replaceSpace1(String s) {
        return s.replace(" ", "%20");
    }

    /**
     * 数组扩容
     *
     * @param s
     * @return
     */
    public String replaceSpace2(String s) {
        int length = s.length();
        char[] array = new char[length * 3];
        int size = 0;
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                array[size++] = '%';
                array[size++] = '2';
                array[size++] = '0';
            } else {
                array[size++] = c;
            }
        }
        String newStr = new String(array, 0, size);
        return newStr;
    }


}
