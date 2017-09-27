package Strategy;

public class Context {
         private Cry cry;
         public Context(Cry cry) {
        	 this.cry = cry;
         }
         public  String 	Sound(String name) {
        	 return cry.Sound(name);
         }
}
