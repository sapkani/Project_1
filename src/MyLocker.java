import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MyLocker {

public static void main(String[] args) throws Exception {
	
	//Project Name and Developer name
	System.out.println("Welcome");
	System.out.println();
	System.out.println("Application Name:"+ " LockedMe.com");
	System.out.println("Developer Name:"+ " Nikhil Sapkal");
	System.out.println();
	
	// Taking User input for FolderPath
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the folder Path for files to be stored."+" "+"for ex C:\\Users\\nikhi\\Desktop\\123\\");
	String Path=sc.next();
	File a=new File(Path);
    String finalfile;
    int flag=0;
      	
    while(true){
		// Menu Options
 	   System.out.println("Choose one of the option\n1. Add\n2. Delete\n3. Search\n4. Close");
 	   int option=sc.nextInt(); 
 	   switch (option) {	
 	   
 	   //Add file
 	   case 1:     
 	    	ArrayList<String> al=new ArrayList<>();
 			System.out.println("enter the file name to add");
 			String filename=sc.next(); 
 			finalfile=Path+filename;
 			File f=new File(finalfile);
 			try {
 			boolean res=f.createNewFile();
 			if(res==false){ 
 				System.out.println(f.getName()+" file is already exist");				
 				break;
 			}	
 			else {	
 				al.add(filename);				
 				System.out.println(f.getName()+" file is successfully created");
 			}
 			 break;		
 			}
 			catch(Exception e) {
 				System.out.println("invalid Path.Please enter valid path");
 			}   System.exit(0);
 			
       //Delete file
 	   case 2:
 		   System.out.println("enter the file name to delete");
 		   String filedel=sc.next();
 		   File b=new File(Path+filedel);		
 		   File arr[]=a.listFiles();
 		   for(File ff:arr) {
 				if(ff.getName().equals(filedel)) {
 					flag=1;
 					break;
 				}
 				else {
 					flag=0;
 				}
 			}
 			if(flag==1) {
 				b.delete();					
 				System.out.println(filedel+" "+"file is successfully deleted");
 			}
 			
 			else {
 				System.out.println("file not found");
 			}   break;
                  			  
       // Search File
 	   case 3:
 			System.out.println("enter the file name to search");
 			String filesearch=sc.next();
 			File filen[]=a.listFiles();
 			for(File ff:filen) {
 				if(ff.getName().equals(filesearch)) {
 					flag=1;
 					break;
 				}
 				else {
 					flag=0;
 				}
 			}
 			if(flag==1) {
 				System.out.println("file is susscessfuly Searched");
 				break;
 			}       
 			else {
 				System.out.println("file can't be searched");
 			}   break;
 			   			   
 	   //Close application
 	   case 4:
 		   System.out.println("Closed application");
 		   System.exit(0);		      
 	   }
 	  }   
  }
}

