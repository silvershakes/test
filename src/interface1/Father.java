package interface1;

public interface Father
{
    void money();
    void rules();
    default void love()
    {
    	System.out.println("fathers love");
    }
}
