# Cifrado Asimétrico RSA en Java

Este proyecto muestra cómo implementar **cifrado asimétrico con RSA** en Java,
usando Maven como sistema de construcción.
Se genera un par de claves (pública y privada),
se cifra un mensaje con la clave pública y luego se descifra con la clave privada.


## 🔐 ¿Qué es el cifrado asimétrico?

El cifrado asimétrico utiliza un par de claves:
- **Clave pública**: para cifrar datos.
- **Clave privada**: para descifrar datos.

Esto permite enviar mensajes seguros sin necesidad de compartir una clave secreta previamente.

## 🗂️ Estructura del proyecto


```bash

asymmetric-encryption-rsa/
├── pom.xml
└── src/
  └─── main/
    └─── java/
      └─── com/
        └─── rsa/
          └─── Main.java
```
- `Main.java`: archivo principal con el código de ejemplo.

## ⚙️ ¿Cómo funciona?

1. **Generación de claves**
    - Se genera un par de claves RSA (2048 bits) usando `KeyPairGenerator`.

2. **Cifrado**
    - Se cifra un mensaje de texto con la clave pública usando `Cipher` en modo `ENCRYPT_MODE`.

3. **Descifrado**
    - El mensaje cifrado se descifra con la clave privada usando `Cipher` en modo `DECRYPT_MODE`.

4. **Codificación Base64**
    - El mensaje cifrado se convierte a Base64 para facilitar su visualización y almacenamiento.

## ▶️ Cómo ejecutar

### Requisitos

- JDK 11 o superior
- Editor de texto o IDE como IntelliJ IDEA, Eclipse o VS Code

### Pasos

1. Guarda el proyecto en tu máquina.
2. Abre una terminal y navega al directorio donde guardaste el archivo.
3. Compila el proyecto:

   ```bash
   mvn clean compile
   ```
4. Ejecutar el proyecto:

   ```bash
   mvn exec:java -Dexec.mainClass="com.rsa.Main"
   ```