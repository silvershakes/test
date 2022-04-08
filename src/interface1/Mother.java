package interface1;

public interface Mother
{
    default void love()
    {
    	System.out.println("mothers love");
    }
    void nature();
       static void test3()
       {
    	   System.out.println("mothers test");
       }
}
