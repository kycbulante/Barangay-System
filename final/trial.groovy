      
        public class hi{
        public hi ()
        {
            hello()
           // repeat()
        }
        
        public void hello()
        {
            println("enter:")
            def res = System.in.newReader().readLine()
            println(res)
            hello1(res)
        }
        public void hello1(def res)
        {
          def  name=hello();
           // println("hello " + res)
        }
        public void repeat()
        {
          //println("my name is")  
           hello1()
        }
         public static void main (String[]args) 
        {
           
           new hi();


         }
        }


        