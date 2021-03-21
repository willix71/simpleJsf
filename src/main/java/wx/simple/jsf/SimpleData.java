package wx.simple.jsf;

import java.io.Serializable;
import java.util.Random;

public class SimpleData implements Serializable {
   private static final long serialVersionUID = 1L;
   private static final Random RANDOM = new Random();

   private String name;
   private boolean one = RANDOM.nextBoolean();
   private boolean two = RANDOM.nextBoolean();
   private boolean three = RANDOM.nextBoolean();
   private boolean four = RANDOM.nextBoolean();
   private boolean five = RANDOM.nextBoolean();
   private boolean six = RANDOM.nextBoolean();
   private boolean seven = RANDOM.nextBoolean();
   
   public SimpleData(int i) {      
      name = "Data" + i;
   }

   public String getName() {
      return name;
   }

   public boolean isOne() {
      return one;
   }

   public boolean isTwo() {
      return two;
   }

   public boolean isThree() {
      return three;
   }

   public boolean isFour() {
      return four;
   }

   public boolean isFive() {
      return five;
   }

   public boolean isSix() {
      return six;
   }

   public boolean isSeven() {
      return seven;
   }
}
