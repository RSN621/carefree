package com.nz.util;
import java.util.Random;
import java.util.UUID;

public class GeneralUtil {

    public static Random random = new Random();

    //生成UUID
    public static String getUUID() {
        String uuid = UUID.randomUUID().toString().replaceAll("-","");
        return uuid;
    }

    //生成4位验证码
    public static String generateCode(){
        String str = "abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int length = str.length();
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<4;i++){
            int index = random.nextInt(length);
            char c = str.charAt(index);
            sb = sb.append(c);
        }
        return sb.toString();
    }
}
