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

    /* (non-Javadoc)
     * @see IStack#empty()
     * // Revisa si hay el stack está vacío o no.
     */


    /* (non-Javadoc)
     * @see IStack#size()
     * // Imprime la cantidad de elementos en el stack en el momento.
     */


}