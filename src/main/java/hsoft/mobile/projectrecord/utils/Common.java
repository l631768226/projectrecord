package hsoft.mobile.projectrecord.utils;

import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Common {

    //本地测试时为true
    public static boolean localtest = true;

    /**
     * 生成MD5
     * @param md5 待加密的字符串
     * @return 加密后的字符串
     */
    public static String toMD5(String md5){
        if(md5 == null || "".equals(md5)){
            return "";
        }
        byte[] bytes = md5.getBytes();
        return toMD5(bytes);
    }

    /**
     * 将字节数组转换成字符串
     * @param bytes 字节数组
     * @return md5加密的字符串
     */
    public static String toMD5(byte[] bytes){
        char hexDigits[]={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        try {
            MessageDigest messagedigest = MessageDigest.getInstance("MD5");
            messagedigest.update(bytes);
            byte[] messbytes = messagedigest.digest();

            int len = messbytes.length;
            StringBuffer stringbuffer = new StringBuffer(2 * len);
            for (int i = 0; i < len; i++) {
                byte bt = messbytes[i];
                stringbuffer.append(hexDigits[(bt & 0xf0) >> 4]);
                stringbuffer.append(hexDigits[bt & 0xf]);
            }
            return stringbuffer.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 将逗号分隔的字符串转换成List
     * @param str 逗号分隔的字符串
     * @return list
     */
    public static List<String> strToList(String str){
        try {
            List<String> list = Arrays.asList(str.split(","));
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<String>();
        }
    }

    /**
     * 校验字符串是否为空
     * @param str 传入的字符串
     * @return true空/false非空
     */
    public static boolean checkNull(String str){
        if(str == null || "".equals(str.trim())){
            return true;
        }
        return false;
    }
}
