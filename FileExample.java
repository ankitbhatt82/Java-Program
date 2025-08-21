import java.io.*; 
import java.io.BufferedWriter; 
import java.io.File; 
import java.io.FileWriter; 
import java.util.Scanner; 
public class FileExample  
{ 
 public static void main(String[] args) throws Exception  
 { 
  writeFile(); 
  readFile(); 
 } 
static void writeFile()  
{ 
 try  
 { 
  File ff=new File("FileExample.txt"); 
  FileWriter fw=new FileWriter(ff); 
  BufferedWriter bw=new BufferedWriter(fw); 
  bw.write("file"); 
  bw.write("\t\t"); 
  bw.write("handling"); 
  bw.close(); 
  fw.close(); 
 System.out.println("success"); 
 } 
 catch(Exception e) 
 { 
  System.out.println("file not found"); 
 } 
} 
static void readFile() throws Exception 
{ 
  FileReader fr=new FileReader("FileExample.txt"); 
  BufferedReader br=new BufferedReader(fr); 
  int j; 
  while((j=br.read())!=-1)  
  { 
   System.out.print((char)j); 
  } 
  br.close(); 
  fr.close(); 
} 
} 
 
 