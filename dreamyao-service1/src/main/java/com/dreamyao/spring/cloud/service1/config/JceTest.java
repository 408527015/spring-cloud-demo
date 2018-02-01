package com.dreamyao.spring.cloud.service1.config;

import javax.crypto.Cipher;
import java.security.NoSuchAlgorithmException;
import java.security.Security;

/**
 * @author BruceLong
 * @version 1.0.0
 * @date 2017/12/28
 */
public class JceTest {

//    static {
//        KeyGenerator generator = KeyGenerator.getInstance("AES/CBC/PKCS5PADDING");
//        generator.init(256);
//        SecretKey key = generator.generateKey();
//    }

    /**
     * 根据密钥{@link #getKey()}对指定的明文
     plainText
     进行加密.
     *
     * @param plainText 明文
     * @return 加密后的密文.
     */
//    public static final String encrypt(String plainText) {
//        Key secretKey = getKey();
//        try {
//            Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
//            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
//            byte[] p = plainText.getBytes("UTF-8");
//            byte[] result = cipher.doFinal(p);
//            BASE64Encoder encoder = new BASE64Encoder();
//            String encoded = encoder.encode(result);
//            return encoded;
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }

    /**
     * 根据密钥{@link #getKey()}对指定的密文
     cipherText
     进行解密.
     *
     * @param cipherText 密文
     * @return 解密后的明文.
     */
//    public static final String decrypt(String cipherText) {
//        Key secretKey = getKey();
//        try {
//            Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
//            cipher.init(Cipher.DECRYPT_MODE, secretKey);
//            BASE64Decoder decoder = new BASE64Decoder();
//            byte[] c = decoder.decodeBuffer(cipherText);
//            byte[] result = cipher.doFinal(c);
//            String plainText = new String(result, "UTF-8");
//            return plainText;
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
    public static void main(String[] args) throws NoSuchAlgorithmException {
        int i = Cipher.getMaxAllowedKeyLength("AES/CBC/PKCS5Padding");
        System.out.println(i);
        System.out.println("==============");
//        Security.setProperty("crypto.policy", "unlimited");
//        int j = Cipher.getMaxAllowedKeyLength("AES/CBC/PKCS5Padding");
//        System.out.println(j);
    }
}
