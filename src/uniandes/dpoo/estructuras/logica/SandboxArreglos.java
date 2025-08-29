package uniandes.dpoo.estructuras.logica;

import java.util.HashMap;

/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre arreglos de enteros y de cadenas.
 *
 * Todos los métodos deben operar sobre los atributos arregloEnteros y arregloCadenas.
 * 
 * No pueden agregarse nuevos atributos.
 * 
 * Implemente los métodos usando operaciones sobre arreglos (ie., no haga cosas como construir listas para evitar la manipulación de arreglos).
 */
public class SandboxArreglos
{
    /**
     * Un arreglo de enteros para realizar varias de las siguientes operaciones.
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private int[] arregloEnteros;

    /**
     * Un arreglo de cadenas para realizar varias de las siguientes operaciones
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private String[] arregloCadenas;

    /**
     * Crea una nueva instancia de la clase con los dos arreglos inicializados pero vacíos (tamaño 0)
     */
    public SandboxArreglos( )
    {
        arregloEnteros = new int[]{};
        arregloCadenas = new String[]{};
    }

    /**
     * Retorna una copia del arreglo de enteros, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de enteros
     */
    public int[] getCopiaEnteros( ) {   //le voy a meter parametros. No estabaaan

    	int[] copia = new int[arregloEnteros.length];
    	
    	for (int i = 0; i < arregloEnteros.length; i++) {
    			copia[i] = arregloEnteros[i];
    		}
    
    	return copia;
    	
       // return null;
    }

    /**
     * Retorna una copia del arreglo de cadenas, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de cadenas
     */
    public String[] getCopiaCadenas()
    {	String[] copia = new String[arregloCadenas.length];
    	for (int i = 0; i < arregloCadenas.length; i++) {
    		copia[i] = arregloCadenas[i];
    	}
    	
        return copia;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de enteros
     * @return
     */
    public int getCantidadEnteros()  //int[] arreglo_enteros
    {	
        return arregloEnteros.length;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de cadenas
     * @return
     */
    public int getCantidadCadenas( )  //String[] arreglo_cadenas)
    {
        return arregloCadenas.length;
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param entero El valor que se va a agregar.
     */
    public void agregarEntero( int entero )
    {
    	int[] nuevoArreglo = new int[arregloEnteros.length + 1];
        for (int i = 0; i < arregloEnteros.length; i++) {
            nuevoArreglo[i] = arregloEnteros[i];
        }
        nuevoArreglo[arregloEnteros.length] = entero;
        arregloEnteros = nuevoArreglo;

    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param cadena La cadena que se va a agregar.
     */
    public void agregarCadena( String cadena )
    {
    	String[] nuevoArreglo = new String[arregloCadenas.length + 1];
        for (int i = 0; i < arregloCadenas.length; i++) {
            nuevoArreglo[i] = arregloCadenas[i];
        }
        nuevoArreglo[arregloCadenas.length] = cadena;
        arregloCadenas = nuevoArreglo;

    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de enteros
     * @param valor El valor que se va eliminar
     */
    public void eliminarEntero( int valor )
    {
    	int contador = 0;
        for (int i = 0; i < arregloEnteros.length; i++) {
            if (arregloEnteros[i] == valor) {
                contador++;
            }
        }
        
        if (contador == 0) return;
        
        int[] nuevoArreglo = new int[arregloEnteros.length - contador];
        int indice = 0;
        for (int i = 0; i < arregloEnteros.length; i++) {
            if (arregloEnteros[i] != valor) {
                nuevoArreglo[indice] = arregloEnteros[i];
                indice++;
            }
        }
        arregloEnteros = nuevoArreglo;

    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de cadenas
     * @param cadena La cadena que se va eliminar
     */
    public void eliminarCadena( String cadena )
    {
    	int contador = 0;
        for (int i = 0; i < arregloCadenas.length; i++) {
            if (arregloCadenas[i].equals(cadena)) {
                contador++;
            }
        }
        
        if (contador == 0) return;
        
        String[] nuevoArreglo = new String[arregloCadenas.length - contador];
        int indice = 0;
        for (int i = 0; i < arregloCadenas.length; i++) {
            if (!arregloCadenas[i].equals(cadena)) {
                nuevoArreglo[indice] = arregloCadenas[i];
                indice++;
            }
        }
        arregloCadenas = nuevoArreglo;

    }

    /**
     * Inserta un nuevo entero en el arreglo de enteros.
     * 
     * @param entero El nuevo valor que debe agregarse
     * @param posicion La posición donde debe quedar el nuevo valor en el arreglo aumentado. 
     * Si la posición es menor a 0, se inserta el valor en la primera posición. Si la
     * posición es mayor que el tamaño del arreglo, se inserta el valor en la última posición.
     */
    public void insertarEntero( int entero, int posicion )
    {	
    	if (posicion < 0) {
            posicion = 0;
        } else if (posicion > arregloEnteros.length) {
            posicion = arregloEnteros.length;
        }
        
        int[] nuevoArreglo = new int[arregloEnteros.length + 1];
        for (int i = 0; i < posicion; i++) {
            nuevoArreglo[i] = arregloEnteros[i];
        }
        nuevoArreglo[posicion] = entero;
        for (int i = posicion; i < arregloEnteros.length; i++) {
            nuevoArreglo[i + 1] = arregloEnteros[i];
        }
        arregloEnteros = nuevoArreglo;

    }

    /**
     * Elimina un valor del arreglo de enteros dada su posición.
     * @param posicion La posición donde está el elemento que debe ser eliminado. Si el parámetro posicion no corresponde a ninguna posición del arreglo de enteros, el método
     *        no debe hacer nada.
     */
    public void eliminarEnteroPorPosicion( int posicion )
    {
    	 if (posicion < 0 || posicion >= arregloEnteros.length) {
             return;
         }
         
         int[] nuevoArreglo = new int[arregloEnteros.length - 1];
         for (int i = 0; i < posicion; i++) {
             nuevoArreglo[i] = arregloEnteros[i];
         }
         for (int i = posicion + 1; i < arregloEnteros.length; i++) {
             nuevoArreglo[i - 1] = arregloEnteros[i];
         }
         arregloEnteros = nuevoArreglo;

    }

    /**
     * Reinicia el arreglo de enteros con los valores contenidos en el arreglo del parámetro 'valores' truncados.
     * 
     * Es decir que si el valor fuera 3.67, en el nuevo arreglo de enteros debería quedar el entero 3.
     * @param valores Un arreglo de valores decimales.
     */
    public void reiniciarArregloEnteros( double[] valores )
    {
    	if (valores == null) {
            arregloEnteros = new int[0];
            return;
        }
        
        arregloEnteros = new int[valores.length];
        for (int i = 0; i < valores.length; i++) {
            arregloEnteros[i] = (int) valores[i]; // Truncar el valor double a int
        }

    }

    /**
     * Reinicia el arreglo de cadenas con las representaciones como Strings de los objetos contenidos en el arreglo del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Un arreglo de objetos
     */
    public void reiniciarArregloCadenas( Object[] objetos )
    {
    	if (objetos == null) {
            arregloCadenas = new String[0];
            return;
        }
        
        arregloCadenas = new String[objetos.length];
        for (int i = 0; i < objetos.length; i++) {
            if (objetos[i] != null) {
                arregloCadenas[i] = objetos[i].toString();
            } else {
                arregloCadenas[i] = "null"; // o podría ser null dependiendo de los requisitos
            }
        }

    }

    /**
     * Modifica el arreglo de enteros para que todos los valores sean positivos.
     * 
     * Es decir que si en una posición había un valor negativo, después de ejecutar el método debe quedar el mismo valor muliplicado por -1.
     */
    public void volverPositivos( )
    {
        for (int i = 0; i < arregloEnteros.length; i++) {
            if (arregloEnteros[i] < 0) {
                arregloEnteros[i] = arregloEnteros[i] * (-1);
            }
        }
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores queden organizados de menor a mayor.
     */
    public void organizarEnteros( )
    {
    	// Usando el algoritmo de ordenamiento de burbuja
        int n = arregloEnteros.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arregloEnteros[j] > arregloEnteros[j + 1]) {
                    // Intercambiar los elementos
                    int temp = arregloEnteros[j];
                    arregloEnteros[j] = arregloEnteros[j + 1];
                    arregloEnteros[j + 1] = temp;
                }
            }
        }

    }

    /**
     * Modifica el arreglo de cadenas para que todos los valores queden organizados lexicográficamente.
     */
    public void organizarCadenas( )
    {
    	 // Usando el algoritmo de ordenamiento de burbuja para cadenas
        int n = arregloCadenas.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Comparar lexicográficamente usando compareTo()
                if (arregloCadenas[j].compareTo(arregloCadenas[j + 1]) > 0) {
                    // Intercambiar los elementos
                    String temp = arregloCadenas[j];
                    arregloCadenas[j] = arregloCadenas[j + 1];
                    arregloCadenas[j + 1] = temp;
                }
            }
        }

    }

    /**
     * Cuenta cuántas veces aparece el valor recibido por parámetro en el arreglo de enteros
     * @param valor El valor buscado
     * @return La cantidad de veces que aparece el valor
     */
    public int contarApariciones( int valor )
    {
    	int contador = 0;
        for (int i = 0; i < arregloEnteros.length; i++) {
            if (arregloEnteros[i] == valor) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * Cuenta cuántas veces aparece la cadena recibida por parámetro en el arreglo de cadenas.
     * 
     * La búsqueda no debe diferenciar entre mayúsculas y minúsculas.
     * @param cadena La cadena buscada
     * @return La cantidad de veces que aparece la cadena
     */
    public int contarApariciones( String cadena )
    {
    	if (cadena == null) {
            // Contar cuántas cadenas null hay en el arreglo
            int contador = 0;
            for (int i = 0; i < arregloCadenas.length; i++) {
                if (arregloCadenas[i] == null) {
                    contador++;
                }
            }
            return contador;
        }
        
        int contador = 0;
        String cadenaBuscada = cadena.toLowerCase(); // Convertir a minúsculas para comparación case-insensitive
        
        for (int i = 0; i < arregloCadenas.length; i++) {
            if (arregloCadenas[i] != null && arregloCadenas[i].toLowerCase().equals(cadenaBuscada)) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * Busca en qué posiciones del arreglo de enteros se encuentra el valor que se recibe en el parámetro
     * @param valor El valor que se debe buscar
     * @return Un arreglo con los números de las posiciones del arreglo de enteros en las que se encuentra el valor buscado. Si el valor no se encuentra, el arreglo retornado
     *         es de tamaño 0.
     */
    public int[] buscarEntero( int valor )
    {
    	 // Primero contamos cuántas veces aparece el valor
        int contador = 0;
        for (int i = 0; i < arregloEnteros.length; i++) {
            if (arregloEnteros[i] == valor) {
                contador++;
            }
        }
        
        // Creamos un arreglo del tamaño exacto
        int[] posiciones = new int[contador];
        
        // Llenamos el arreglo con las posiciones
        int indice = 0;
        for (int i = 0; i < arregloEnteros.length; i++) {
            if (arregloEnteros[i] == valor) {
                posiciones[indice] = i;
                indice++;
            }
        }
        
        return posiciones;
    }

    /**
     * Calcula cuál es el rango de los enteros (el valor mínimo y el máximo).
     * @return Un arreglo con dos posiciones: en la primera posición, debe estar el valor mínimo en el arreglo de enteros; en la segunda posición, debe estar el valor máximo
     *         en el arreglo de enteros. Si el arreglo está vacío, debe retornar un arreglo vacío.
     */
    public int[] calcularRangoEnteros( )
    {
    	if (arregloEnteros.length == 0) {
            return new int[0]; // Arreglo vacío
        }
        
        int min = arregloEnteros[0];
        int max = arregloEnteros[0];
        
        for (int i = 1; i < arregloEnteros.length; i++) {
            if (arregloEnteros[i] < min) {
                min = arregloEnteros[i];
            }
            if (arregloEnteros[i] > max) {
                max = arregloEnteros[i];
            }
        }
        
        return new int[]{min, max};
    }

    /**
     * Calcula un histograma de los valores del arreglo de enteros y lo devuelve como un mapa donde las llaves son los valores del arreglo y los valores son la cantidad de
     * veces que aparece cada uno en el arreglo de enteros.
     * @return Un mapa con el histograma de valores.
     */
    public HashMap<Integer, Integer> calcularHistograma( )
    {
    	HashMap<Integer, Integer> histograma = new HashMap<>();
        
        for (int i = 0; i < arregloEnteros.length; i++) {
            int valor = arregloEnteros[i];
            // Si el valor ya está en el mapa, incrementamos el contador
            // Si no está, lo agregamos con contador 1
            histograma.put(valor, histograma.getOrDefault(valor, 0) + 1);
        }
        
        return histograma;
    }

    /**
     * Cuenta cuántos valores dentro del arreglo de enteros están repetidos.
     * @return La cantidad de enteos diferentes que aparecen más de una vez
     */
    public int contarEnterosRepetidos( )
    {
    	if (arregloEnteros.length == 0) {
            return 0;
        }
        
        // Primero calculamos el histograma
        HashMap<Integer, Integer> histograma = new HashMap<>();
        for (int i = 0; i < arregloEnteros.length; i++) {
            int valor = arregloEnteros[i];
            
            // Verificamos si el valor ya está en el mapa
            if (histograma.containsKey(valor)) {
                // Si ya existe, incrementamos el contador
                int contadorActual = histograma.get(valor);
                histograma.put(valor, contadorActual + 1);
            } else {
                // Si no existe, lo agregamos con contador 1
                histograma.put(valor, 1);
            }
        }
        
        // Contamos cuántos valores aparecen más de una vez
        int contadorRepetidos = 0;
        for (int valor : histograma.keySet()) {
            int frecuencia = histograma.get(valor);
            if (frecuencia > 1) {
                contadorRepetidos++;
            }
        }
        
        return contadorRepetidos;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica si son iguales, es decir que contienen los mismos elementos exactamente en el mismo orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los arreglos son idénticos y false de lo contrario
     */
    public boolean compararArregloEnteros( int[] otroArreglo )
    {
    	// Primero comparamos las longitudes
        if (arregloEnteros.length != otroArreglo.length) {
            return false;
        }
        
        // Si tienen la misma longitud, comparamos elemento por elemento
        for (int i = 0; i < arregloEnteros.length; i++) {
            if (arregloEnteros[i] != otroArreglo[i]) {
                return false; // Encontramos un elemento diferente
            }
        }
        
        // Si llegamos hasta aquí, todos los elementos son iguales
        return true;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica que tengan los mismos elementos, aunque podría ser en otro orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los elementos en los dos arreglos son los mismos
     */
    public boolean mismosEnteros( int[] otroArreglo )
    {
    	// Primero comparamos las longitudes
        if (arregloEnteros.length != otroArreglo.length) {
            return false;
        }
        
        // Creamos copias para no modificar los arreglos originales
        int[] copiaArreglo1 = new int[arregloEnteros.length];
        int[] copiaArreglo2 = new int[otroArreglo.length];
        
        // Copiamos los elementos
        for (int i = 0; i < arregloEnteros.length; i++) {
            copiaArreglo1[i] = arregloEnteros[i];
            copiaArreglo2[i] = otroArreglo[i];
        }
        
        // Ordenamos ambos arreglos
        // Método de burbuja para copiaArreglo1
        for (int i = 0; i < copiaArreglo1.length - 1; i++) {
            for (int j = 0; j < copiaArreglo1.length - i - 1; j++) {
                if (copiaArreglo1[j] > copiaArreglo1[j + 1]) {
                    int temp = copiaArreglo1[j];
                    copiaArreglo1[j] = copiaArreglo1[j + 1];
                    copiaArreglo1[j + 1] = temp;
                }
            }
        }
        
        // Método de burbuja para copiaArreglo2
        for (int i = 0; i < copiaArreglo2.length - 1; i++) {
            for (int j = 0; j < copiaArreglo2.length - i - 1; j++) {
                if (copiaArreglo2[j] > copiaArreglo2[j + 1]) {
                    int temp = copiaArreglo2[j];
                    copiaArreglo2[j] = copiaArreglo2[j + 1];
                    copiaArreglo2[j + 1] = temp;
                }
            }
        }
        
        // Comparamos los arreglos ordenados elemento por elemento
        for (int i = 0; i < copiaArreglo1.length; i++) {
            if (copiaArreglo1[i] != copiaArreglo2[i]) {
                return false;
            }
        }
        
        return true;
    }

    /**
     * Cambia los elementos del arreglo de enteros por una nueva serie de valores generada de forma aleatoria.
     * 
     * Para generar los valores se debe partir de una distribución uniforme usando Math.random().
     * 
     * Los números en el arreglo deben quedar entre el valor mínimo y el máximo.
     * @param cantidad La cantidad de elementos que debe haber en el arreglo
     * @param minimo El valor mínimo para los números generados
     * @param maximo El valor máximo para los números generados
     */
    public void generarEnteros( int cantidad, int minimo, int maximo )
    {
    	// Creamos un nuevo arreglo con la cantidad especificada
        arregloEnteros = new int[cantidad];
        
        // Calculamos el rango de valores
        int rango = maximo - minimo + 1;
        
        // Generamos cada número aleatorio
        for (int i = 0; i < cantidad; i++) {
            // Math.random() genera un número entre 0.0 (incluido) y 1.0 (excluido)
            double numeroAleatorio = Math.random();
            
            // Escalamos el número al rango deseado
            int valor = (int) (numeroAleatorio * rango) + minimo;
            
            // Asignamos el valor al arreglo
            arregloEnteros[i] = valor;
        }
    }

}
