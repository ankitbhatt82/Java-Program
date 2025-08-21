import java.io.*; 
public class Filepermission { 

 public static void main(String[] args) 
 { 
  File file 
   = new File("newfile.txt"); 
  boolean exists = file.exists(); 
  if (exists == true) { 
   file.setExecutable(true); 
   file.setReadable(true); 
   file.setWritable(false); 
   System.out.println("File permissions changed."); 
 
   System.out.println("Executable:" + file.canExecute()); 
   System.out.println("Readable: " + file.canRead()); 
   System.out.println("Writable: " + file.canWrite()); 
  }   
   System.out.println("File not found"); 
  } 
 } 
 
 