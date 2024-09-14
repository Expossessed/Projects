/* Written By: Cuizon, Veejay N.
   Written On: 12/09/24
*/
public class Poem{
   private String Name;
   private int Lines;
   
   public Poem(String Name, int Lines){
      this.Name = Name;
      this.Lines = Lines;
   }
   
   public String getName(){
      return this.Name;
   }
   public int getLines(){
      return this.Lines;
   }
   
   public void display(){
      System.out.println("Poem: "+ getName() + "\nLines:"+ getLines());
   }
}