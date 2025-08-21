class Asdfg
   {
	int i;
	int j;
        Asdfg() 
        {
            i = 1;
            j = 2;
        }
   }
   class Output 
   {
        public static void main(String args[])
        {
             Asdfg obj1 = new Asdfg();
             Asdfg obj2 = new Asdfg();
	     System.out.print(obj1.equals(obj2));
        }
   }
