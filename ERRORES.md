1. El principio SRP establece que una clase debe tener una sola razón para cambiar, es decir, una sola responsabilidad. En este caso, podemos ver que la clase Directory tiene varias responsabilidades, como mantener una lista de archivos y subdirectorios, y calcular su tamaño total. He añadido La clase DirectoryContent para no mantener la lista y el tamaño por sí sola.

2. En este caso, se ha creado una nueva interfaz AudioConverter que define un único método convert para la conversión de archivos de audio. Luego, se han implementado dos clases que implementan esta interfaz, Mp3ToWavConverter y WavToMp3Converter, y se han movido las lógicas de conversión de los métodos originales a estos nuevos métodos. De esta manera, se cumple el principio de responsabilidad única, ya que cada método tiene la única responsabilidad de convertir de un formato a otro. También se cumple el principio abierto-cerrado, ya que podemos agregar nuevos convertidores.

3. También he organizado el proyecto en diferentes paquetes, estos son relacionados con los archivos o directorios que pueden interactuar.

4. El principio SRP establece que una clase debe tener una sola razón para cambiar, es decir, una sola responsabilidad. En este caso, podemos ver que la clase File tiene varias responsabilidades. He añadido La clase FileContent para que no mantenga los metodos por si sola.

5. He creado dos interfaces DirectotyAccess y FileAccess, para que las clases File y Directory Content no tengan que depender de la interfaz FileSystemItem.