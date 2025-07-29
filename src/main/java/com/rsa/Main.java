package com.rsa;

import javax.crypto.Cipher;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;

public class Main {

    public static void main(String[] args) throws Exception {
        // 1. Generar par de claves
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048);
        KeyPair parClaves = keyPairGenerator.generateKeyPair();
        PublicKey publicKey = parClaves.getPublic();
        PrivateKey privateKey = parClaves.getPrivate();

        // 2. Mensaje original
        String mensajeOriginal = "Hola, este es un mensaje secreto.";
        System.out.println("Mensaje original: " + mensajeOriginal);

        // 3. Cifrar con la clave pública
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        byte[] encryptMessage = cipher.doFinal(mensajeOriginal.getBytes());
        String encryptMessageBase64 = Base64.getEncoder().encodeToString(encryptMessage);
        System.out.println("Mensaje cifrado (Base64): " + encryptMessageBase64);

        // 4. Descifrar con la clave privada
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] messageDecode = cipher.doFinal(Base64.getDecoder().decode(encryptMessageBase64));
        System.out.println("Mensaje descifrado: " + new String(messageDecode));
    }

}
