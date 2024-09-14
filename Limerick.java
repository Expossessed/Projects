/* Written By: Cuizon, Veejay N.
   Written On: 12/09/24
*/
public class Limerick extends Poem{
   private String Title;
   
   public Limerick(String Title){
      super(Title,5);
   }
   
   @Override
   public void display(){
      System.out.println("--Limerick--");
      super.display();
   }

}