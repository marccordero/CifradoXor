# Cifrado Binario

Este es un programa simple en Java que realiza un cifrado de texto utilizando operaciones binarias XOR. Puede cifrar y descifrar un mensaje utilizando una clave dada.

## Cómo funciona

El programa utiliza el cifrado XOR, que es una operación bit a bit, para cifrar y descifrar el texto. Cada carácter del mensaje original se combina con un carácter correspondiente de la clave utilizando XOR.

## Requisitos

- Eclipse IDE con Java Development Tools (JDT) instalado en tu sistema.

## Cómo usar

1. Clona este repositorio en tu máquina local.

2. Abre Eclipse IDE.

3. Importa el proyecto en Eclipse:

    - Haz clic en `File` > `Import...`.
    - En el cuadro de diálogo `Import`, selecciona `General` > `Existing Projects into Workspace` y haz clic en `Next`.
    - Selecciona la opción `Select root directory` y haz clic en `Browse...`.
    - Navega hasta el directorio donde clonaste el repositorio y selecciona el directorio del proyecto. Haz clic en `Open` y luego en `Finish`.

4. Encuentra el archivo `CifradoBinario.java` en la vista del Explorador de Paquetes (Package Explorer) y ábrelo.

5. Haz clic con el botón derecho en `CifradoBinario.java` y selecciona `Run As` > `Java Application`.

6. Sigue las instrucciones en pantalla para introducir el mensaje y la clave.

## Ejemplo

```java
// Mensaje original: "Hola Guapo"
// Clave: "cordero"
// Mensaje cifrado: ")(�E/2"
// Mensaje descifrado: "Hola Guapo"
