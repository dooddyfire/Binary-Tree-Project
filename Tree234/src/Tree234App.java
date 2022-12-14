import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tree234App
   {
   public static void main(String[] args) throws IOException
      {
      long value;
      Tree234 theTree = new Tree234();

      theTree.insert(50);
      theTree.insert(40);
      theTree.insert(60);
      theTree.insert(30);
      theTree.insert(70);

     

     

      

      
      while(true)
         {
         System.out.print("Enter first letter of ");
         System.out.print("show, insert, or find: ");
         char choice = getChar();
         switch(choice)
            {
            case 's':
               theTree.displayTree();
               break;
            case 'i':
               
               System.out.print("Enter value to insert: ");
               value = getInt();
               long startTime1 = System.currentTimeMillis();
               theTree.insert(value);
               long endTime1 = System.currentTimeMillis();
               System.out.println("Insert Time " + (endTime1 - startTime1) + " milliseconds");
               break;
            case 'f':
               System.out.print("Enter value to find: ");
               value = getInt();
               long startTime2 = System.currentTimeMillis();

               int found = theTree.find(value);
               long endTime2 = System.currentTimeMillis();
               System.out.println("Search Time " + (endTime2 - startTime2) + " milliseconds");
               if(found != -1)
                  System.out.println("Found "+value);
               else
                  System.out.println("Could not find "+value);
               break;
            default:
               System.out.print("Invalid entry\n");
            }  // end switch
         }  // end while
      }  // end main()
//--------------------------------------------------------------
   public static String getString() throws IOException
      {
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      String s = br.readLine();
      return s;
      }
//--------------------------------------------------------------
   public static char getChar() throws IOException
      {
      String s = getString();
      return s.charAt(0);
      }

//-------------------------------------------------------------
   public static int getInt() throws IOException
      {
      String s = getString();
      return Integer.parseInt(s);
      }
//-------------------------------------------------------------
   }  // end class Tree234App
////////////////////////////////////////////////////////////////
