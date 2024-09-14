/* Written By: Cuizon, Veejay N.
   Written On: 12/09/24
*/
public class Haiku extends Poem{
   private String Title;
   
   public Haiku(String Title){
      super(Title,3);
   }
   
   @Override
   public void display(){
      System.out.println("--Couplet--");
      super.display();
   }

}