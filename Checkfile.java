import java.io.*; 
public class Checkfile { 
 
 public static void main(String[] args) { 
  try { 
  File f=new File("newfile.txt"); 
  f.createNewFile(); 
  System.out.println("file exists? "+f.exists()); 
  System.out.println("is a directory ? "+f.isDirectory()); 
 
  } 
  catch(Exception e) 
  { 
   System.out.println("file does not exists ");  
  } 
 } 
} 