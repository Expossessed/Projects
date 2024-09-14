/* Written By: Cuizon, Veejay N.
   Written On: 12/09/24
*/
public class Couplet extends Poem{
   private String Title;
   
   public Couplet(String Title){
      super(Title,2);
   }
   
   @Override
   public void display(){
      System.out.println("--Couplet--");
      super.display();
   }

}