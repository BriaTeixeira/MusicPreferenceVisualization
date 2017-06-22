/**
 * 
 */
package musicpreference;

import list.ListInterface;

/**
 * @author Bria
 *
 */
public class LinkedList<T> implements ListInterface<T>
{

    /* (non-Javadoc)
     * @see list.ListInterface#add(java.lang.Object)
     */
    public void add(T arg0)
    {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see list.ListInterface#add(int, java.lang.Object)
     */
    public void add(int arg0, T arg1)
    {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see list.ListInterface#clear()
     */
    public void clear()
    {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see list.ListInterface#contains(java.lang.Object)
     */
    public boolean contains(T arg0)
    {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see list.ListInterface#getEntry(int)
     */
    public T getEntry(int arg0)
    {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see list.ListInterface#getLength()
     */
    public int getLength()
    {
        // TODO Auto-generated method stub
        return 0;
    }

    /* (non-Javadoc)
     * @see list.ListInterface#isEmpty()
     */
    public boolean isEmpty()
    {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see list.ListInterface#remove(int)
     */
    public T remove(int arg0)
    {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see list.ListInterface#replace(int, java.lang.Object)
     */
    public T replace(int arg0, T arg1)
    {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see list.ListInterface#toArray()
     */
    public Object[] toArray()
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    // ========================================================================
    
    /**
     * Doubly linked node object.
     * @author Bria
     *
     * @param <E>
     */
    private static class DLNode<E>
    {
        private E data;
        private DLNode<E> next;
        private DLNode<E> prev;
        
        /**
         * Create a new DLNode
         * @param The data to be stored in the new node.
         */
        public DLNode(E dataPortion)
        {
            data = dataPortion;
            next = null;
            prev = null;
        }
        
        public void data()
        {
            
        }
        
        public void setData()
        {
            
        }
    }

}
