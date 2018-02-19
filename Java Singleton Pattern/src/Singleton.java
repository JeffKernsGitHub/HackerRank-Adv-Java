
/*
"The singleton pattern is a design pattern that restricts the instantiation of a class to one object. This is useful when exactly one object is needed to coordinate actions across the system." 
- Wikipedia: Singleton Pattern
*/
class Singleton
{
   public String str = "Hello I am a singleton! Let me say hello world to you";
   private static Singleton instance = null;
   private Singleton() {
      // Exists only to defeat instantiation.
   }
   public static Singleton getSingleInstance () {
      if(instance == null) {
         instance = new Singleton();
      }
      return instance;
   }

}