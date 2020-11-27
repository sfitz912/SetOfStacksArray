public class PushTest
{
   public static void main(String[] args)
   {
      SetOfStacks<Integer> nums = new SetOfStacks<Integer>();
      
      for (int i = 0; i < 1005; i++)
      {
         System.out.println("Attempting to push " + i + " to SetOfStacks...");
         try
         {
            nums.push( i );
            System.out.println("Done pushing " + i + " to SetOfStacks");
         }
         catch(Exception e)
         {
            System.out.println("Error: " + e);
         }
         System.out.println("Number of Stacks: " + nums.numStacks() );

      }
      
      for (int i = 0; i < 1005; i++)
      {
         System.out.print("Attempting top() and pop() from SetOfStacksArray: " );
         try
         {
            System.out.print(nums.top() );
            nums.pop();
         }
         catch (Exception e)
         {
            System.out.println("Error: " + e);
         }
         System.out.println("\nNumber of Stacks: " + nums.numStacks() );
         
      }
   }
}