public class LambdaFun {

        public static void main(String[] args) {
    
            Mock m = () ->{ 
    
                System.out.println("hello guys!");
    
            };
            m.hi();
            
    
        }
    }
    
    @FunctionalInterface
    
    interface Mock {
    
        void hi();
    }
    

