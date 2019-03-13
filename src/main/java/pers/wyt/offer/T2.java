package pers.wyt.offer;

/**
 * @Author: wanyutong
 * @Date: 2019/3/5
 * @Description:
 */
public class T2 {

    public String replaceSpace(StringBuffer str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                sb.append("%20");
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
