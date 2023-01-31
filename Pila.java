import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.NoSuchElementException;
import java.util.Stack;

public class Pila<E> implements IStack<E> {

    ArrayList<E> elementos = new ArrayList<E>();

    /* (non-Javadoc)
     * @see IStack#push(java.lang.Object)
     * añade un operando al stack
     */
    public void push(E item) { 
        elementos.add(item);
    }

    /* (non-Javadoc)
     * @see IStack#pop()
     * Quita un operando del stack
     */
    public E pop() throws EmptyStackException { // 
        if (empty()) {
            throw new NoSuchElementException("No se puede realizar la acción -pop- en un stack vacío.");

        }
        return elementos.remove(elementos.size() - 1);
    }

    /* (non-Javadoc)
     * @see IStack#peek()
     * Retorna el valor del último elemento agregado al stack
     */
    
    public E peek() throws EmptyStackException { // 
        if (empty()) {
            throw new NoSuchElementException("No se puede realizar la acción -peek- en un stack vacío.");
        }
        return null;
    }

    /* (non-Javadoc)
     * @see IStack#empty()
     * // Revisa si hay el stack está vacío o no.
     */
    public boolean empty() { 
        return elementos.isEmpty();

    }

    /* (non-Javadoc)
     * @see IStack#size()
     * // Imprime la cantidad de elementos en el stack en el momento.
     */
    public int size() { 
        return elementos.size();

    }



}