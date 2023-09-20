public class AccessModifiersDemo {
        public int privateVar;
        double defaultVar;
        protected boolean protectedVar;
        public String publicVar;
    
        public int getPrivateVar() {
            return privateVar;
        }
    
        double getDefaultVar() {
            return defaultVar;     
        }
    
        protected boolean getProtectedVar(){
            return protectedVar;
        }
    
        public String getPublicVar() {
            return publicVar;
        }
       
}
class SubclassDemo extends AccessModifiersDemo {
     void displayProtectedVar() {
        boolean value = getProtectedVar(); 
         System.out.println("Protected variable value in subclass: " + value);
  }
}
    