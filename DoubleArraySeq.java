package storage;

public class DoubleArraySeq implements Cloneable
{
    public static final int DEFAULT_CAPACITY = 10;
    private double[] data;
    private int manyItems;
    private int currentIndex;

    public DoubleArraySeq()
    {
        this(DEFAULT_CAPACITY);
    }

    public DoubleArraySeq(int initialCapacity)
    {
        data = new double[initialCapacity];
        manyItems = 0;
        currentIndex = 0; 
    }

    public void addAfter(double element)
    {

    }

    public void addBefore(double element)
    {

    }

    public void addAll(DoubleArraySeq addend)
    {

    }

    public void trimToSize()
    {

    }

    public void ensureCapacity(int minimumCapacity)
    {

    }

    public void start()
    {

    }

    public void advance()
    {
        if (!isCurrent())
        {
            throw new IllegalStateException("No current element");
        }
        if (currentIndex == manyItems - 1)
        {
            currentIndex = manyItems;
        }
        else
        {
            currentIndex++;
        }
    }

    public double getCurrent()
    {
        if (!isCurrent())
        {
            throw new IllegalStateException("No current element");
        }
        
        return currentIndex;
    }

    public double removeCurrent()
    {
        return 0;
    }

    public boolean isCurrent()
    {
        if (currentIndex >= 0 && currentIndex < manyItems)
        {
            return true;
        }
        
        return false;
    }

    public int getCapacity()
    {
        return data.length;
    }

    public int size()
    {
        return manyItems;
    }
    public DoubleArraySeq clone()
    {
        return null;
    }

    public String toString()
    {
        if (manyItems == 0) 
        {
            return "<>";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for (int i = 0; i < manyItems; i++) 
        {
            if (i > 0) sb.append(", ");
            if (i == currentIndex) {
                sb.append("[").append(data[i]).append("]");
            } else {
                sb.append(data[i]);
            }
        }
        sb.append(">");
        return sb.toString();
    }

    public boolean equals(Object other)
    {
        return false;
    }

    public static DoubleArraySeq concatenation(DoubleArraySeq s1, DoubleArraySeq s2)
    {
        return null;
    }
}
