import java.io.*;
class filesinputoutput1
	    {
	        public static void main(String args[])
	        {
	            InputStream obj = new FileInputStream("inputoutput.java");
	            System.out.print(obj.available());
	        }
	    }
