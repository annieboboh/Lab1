/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greeter;

/**
 *
 * @author anhsu
 */
public class Greeter
{
   /**
      Constructs a Greeter object that can greet a person or 
      entity.
      @param aName the name of the person or entity who should
      be addressed in the greetings.
   */
   public Greeter(String aName)
   {
      name = aName;
   }

   /**
      Greet with a "Hello" message.
      @return a message containing "Hello" and the name of
      the greeted person or entity.
   */
   public String sayHello()
   {
      return "Hello, " + name + "!";
   }
   /**
    * Sets name of greeter to a different name.
    * @param diffName the new name of the person or entity
    * to be addressed in the greeting.
    */
   public void setName(String diffName)
   {
       this.name = diffName;
   }
   
/**
 * Swaps the names of this greeter and another.
 * @param other the greeter who's name is to be swapped
 * with this greeter.
 */
   public void swapName(Greeter other)
   {
       tempName = this.name;
       this.name = other.name;
       other.name = tempName;
   }
   
   private String name, tempName;
   
   /**
    * Creates new greeters and tests sayHello, setName,
    * and swapName.
    * @param args not used.
    */
   public static void main(String[] args){
       
       Greeter worldGreeter = new Greeter("World");
       Greeter peopleGreeter = new Greeter("People");
       Greeter anotherGreeter = worldGreeter;
       
       System.out.println(worldGreeter.sayHello());
       anotherGreeter.setName("Annie");
       System.out.println(worldGreeter.sayHello());
       System.out.println(peopleGreeter.sayHello());
       worldGreeter.swapName(peopleGreeter);
       System.out.println(worldGreeter.sayHello());
       System.out.println(peopleGreeter.sayHello());
       
   }
}