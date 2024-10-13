package OOPS;

interface Ani{
   void walk();
}

interface herbivore {

}

class Horsee implements Ani, herbivore {
   public void walk() {
      System.out.println("Horse walks on 4 legs");
   }
}

class Chickenn implements Ani {
   public void walk() {
      System.out.println("Chicken walks on 2 legs");
   }
}

public class Interface {
   public static void main(String args[]) {
      Horsee ani = new Horsee();
      ani.walk();
   }
}
