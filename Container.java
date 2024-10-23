public class Container {
    private Object[] elems;
    private int size;
    private static final int initialCapacity = 10;


    public Container() {
        elems = new Object[initialCapacity];
        size = 0;
    }
    public static void main(String[] args) {
    }

public int getSize()
{
    return size;
}

private void resize()
{
    int newCapacity = elems.length*2;
    Object[] newElements=new Object[newCapacity];
    System.arraycopy(elems, 0,newElements, 0, elems.length);
    elems=newElements;
}
}