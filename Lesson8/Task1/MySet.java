package Task1;


import java.util.Arrays;

/**
 * Created by Anton_Khmyzov on 3/19/2017.
 */
public class MySet <T> {
    private Object[] setElements;
    private int mySetSize;
    public MySet(){
        this.setElements = new Object[]{};
    }
    public int size(){
        return mySetSize;
    }

    public boolean isEmpty(){
        if (mySetSize == 0 || setElements == null){
            return true;
        }
        return false;
    }

    public boolean containsElement(Object obj){
        if (obj == null) {
            for (Object objInt: setElements) {
                if(objInt == null)
                    return true;
            }
        } else {
            for (Object objInt: setElements)
                if (obj.equals(objInt))
                    return true;
        }
        return false;
    }

    public Object[] toArray() {
        return Arrays.copyOf(setElements, mySetSize);
    }

    private void extendMySet(int numberOfElements) {
        setElements = Arrays.copyOf(setElements, mySetSize + numberOfElements);
        mySetSize = mySetSize + numberOfElements;
    }

    public boolean addElement(T obj) {
        if (!containsElement(obj)) {
            extendMySet(1);
            setElements[mySetSize - 1] = obj;
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "MySet{" +
                "size=" + mySetSize +
                ", setElements=" + Arrays.toString(setElements) +
                '}';
    }


}
