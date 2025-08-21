import java.io.*; 
import java.io.BufferedWriter; 
import java.io.File; 
import java.io.FileWriter; 
import java.util.Scanner; 
 
public class File5 { 
 public static void main(String[] args) throws Exception { 
  writeFile(); 
  readFile(); 
 
 } 
 
 
static void writeFile() { 
 try { 
  File ff=new File("Details.txt"); 
  FileWriter fw=new FileWriter(ff); 
  BufferedWriter bw=new BufferedWriter(fw); 
  Scanner sc=new Scanner(System.in); 
  System.out.println("enter the serial no "); 
  int i=sc.nextInt(); 
  System.out.println("enter the name"); 
  String name=sc.next(); 
  System.out.println("enter the cgpa"); 
  float cgpa=sc.nextFloat(); 
  System.out.println("enter the grade"); 
  char ch=sc.next().charAt(0); 
  bw.write(String.valueOf(i)); 
  bw.write("\t"); 
  bw.write(name); 
  bw.write("\t\t"); 
  bw.write(String.valueOf(cgpa)); 
  bw.write("\t"); 
  bw.write(ch); 
 bw.close(); 
 fw.close(); 
  
 System.out.println("success"); 
 } 
 catch(Exception e) 
 { 
  System.out.println("file not found"); 
 } 
} 
static void readFile() throws Exception{ 
  
  FileReader fr=new FileReader("Details.txt"); 
  BufferedReader br=new BufferedReader(fr); 
  int j; 
  while((j=br.read())!=-1) { 
   System.out.print((char)j); 
 
  } 
  br.close(); 
  fr.close(); 
} 
} 