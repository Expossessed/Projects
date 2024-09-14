import java.util.*;
/* Written By: Cuizon, Veejay N.
   Written On: 12/09/24
*/
public class DemoPoems{
   public static void main(String[]args){
      Poem p = new Poem("Sting like a bee",18);
      p.display();
      Couplet c = new Couplet("Tyler's Relationship");
      c.display();
      Limerick l = new Limerick("My Life");
      l.display();
      Haiku h = new Haiku("Bubble Cars");
      h.display();
   }
}