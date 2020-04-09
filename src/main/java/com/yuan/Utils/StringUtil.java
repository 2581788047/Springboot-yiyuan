package com.yuan.Utils;

public class StringUtil {

    /**
     * 判断字符串是否为空
     *
     * @author: 杨远远
     * @Date: 2020/4/9
     * @Param: [str]
     * @return: boolean
     */
    public static boolean isNullOrEmpty(String str) {
        //判断字符串是否为null/“null”/""
        if (str == null || str.isEmpty() || "null".equals(str)) {
            return true;
        }
        //循环字符串，有一个字符不为' '返回false 字符串有可能为 str = "     "
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != ' ') {
                return false;
            }
        }
        return false;
    }

    /**
     * 格式化字符串,避免出现null,将null转换为""
     * @author: 杨远远
     * @Date: 2020/4/9
     * @param s 需要格式化的字符串
     * @return 格式化后的字符串
     */
    public static String normalizeString(String s) {
        return ((s == null) ? "" : s.trim());
    }


}
