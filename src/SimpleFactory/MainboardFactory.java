package SimpleFactory;

public class MainboardFactory {
       public static  Mainboard createMainboard(int type) {
    	   Mainboard mainboard = null;
    	   if(type==1) {
    		   mainboard = new IntelMainboard(775);
    	   }else if(type==2) {
    		   mainboard = new AmdMainboard(938);
    	   }
    	   return mainboard;
       }
}
