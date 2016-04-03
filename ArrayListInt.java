
/**
 * Write a description of class ArrayListInt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayListInt
{
    private int[] array;
    /**
     * Constructor for objects of class ArrayListInt
     */
    public ArrayListInt()
    {
        array = new int[0];
    }
    
    /**
     * Añade un elemento a la colección al final de la misma
     */
    public void add(int elemento)
    {
        int[] local;
        local = array;
        array = new int[local.length + 1];
        for (int cont = 0; cont < local.length;cont++)
        {
            array[cont] = local[cont];
        }
        array[local.length] = elemento;
    }
    
    /**
     * Añade un elemento a la colección en la posición especificada por el parámetro index. Si el valor de index no es válido, 
     * entonces no hace nada. Los elementos a continuación del añadido se desplazan una posición
     */
    public void add(int index, int elemento)
    {
        if (index <= array.length && index >= 0)
        {
            int[] local;
            local = array;
            array = new int[local.length + 1];
            for (int cont = 0; cont < local.length;cont++)
            {
                if (cont < index)
                {
                    array[cont] = local[cont];
                }
                else
                {
                    array[cont+1] = local[cont];
                }
            }
            array[index] = elemento;
        }
    }
    
    /**
     * vacía la colección
     */
    public void clear()
    {
        array = new int[0];
    }
    
    /**
     * Devuelve true si la colección contiene ese elemento, false en cualquier otro caso
     */
    public boolean contains(int elemento)
    {
        boolean contiene = false;
        int cont = 0;
        while(cont < array.length && !contiene)
        {
             if (array[cont] == elemento)
             {
                 contiene = true;
             }
             cont++;
        }
        return contiene;
    }
    
    /**
     * Devuelve el elemento existente en la posición indicada. Si el valor de index no es válido, entonces devuelve -1
     */
    public int get(int index)
    {
        int devolver = -1;
        if (index < array.length && index >= 0)
        {
            devolver = array[index];
        }
        return devolver;
    }
    
    /**
     * Reemplaza el elemento en la posición index con el valor de element. Si el índice no es válido, no hace nada
     */
    public void set(int index, int element)
    {
        if (index < array.length && index >= 0)
        {
            array[index] = element;
        }
    }
    
    /**
     * Devuelve el indice en el que aparece la primera ocurrencia del elemento especificado o -1 
     * en caso de que la colección no contenga el elemento especificado
     */
    public int indexOf(int elemento)
    {
        int cont = 0;
        boolean encontrado = false;
        while(cont < array.length && !encontrado)
        {
            if (array[cont] == elemento)
            {
                encontrado = true;
            }
            cont++;
        }
        if (!encontrado)
        {
            cont = 0;
        }
        return cont-1;
    }
    
    /**
     * Devuelve true si la lista no contiene elementos.
     */
    public boolean isEmpty()
    {
        return array.length == 0;
    }
    
    /**
     * Elimina de la colección el elemento que ocupa la posición especificada y devuelve dicho elemento.
     * Si el valor de index no es válido, no hace nada y devuelve -1.
     */
    public int remove(int index)
    {
        int borrado = -1;
        if (index <= array.length && index >= 0)
        {
            int[] local;
            local = array;
            array = new int[local.length - 1];
            for (int cont = 0; cont < array.length;cont++)
            {
                if (cont < index)
                {
                    array[cont] = local[cont];
                }
                else
                {
                    array[cont] = local[cont+1];
                }
            }
            borrado = local[index];
        }
        return borrado;
    }
    
    /**
     * Devuelve el número de elementos de la colección
     */
    public int size()
    {
        return array.length;
    }
    
    
}
