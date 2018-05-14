import java.io.*;
import java.util.*;

public class jabada{
    public static void main (String [] args)throws IOException{
        LinkedQueue<String> requirement = new LinkedQueue<String>();
        File file = new File("Mamamia.txt");
        file.createNewFile();
        FileWriter writer = new FileWriter(file);
        
        try{
            Scanner scan = new Scanner (new File ("challenge.html"));
            while (scan.hasNext()){ //will loop so long as there is more text to read in the file
                String line = scan.nextLine(); //assigns the first line of text to the String variable "line"
                while (line.contains("<")){
                    int start = line.indexOf("<"); //assigns the numerical index of "<" to the variable "start"
                    int end = line.indexOf(">"); //assigns the numerical index of ">" to the variable "end"
                    if (start != -1 && end != -1){ //runs so long as start & end do not contain a value of -1(empty list)
                        String sub1 = ""; 
                        if (start != 0){
                            sub1 = line.substring(0, start); //assigns all the text from numerical index of 0 to start, but doesn't include start
                        }
                        String sub2 = "";
                        if (end != (line.length()-1)){
                            sub2 = line.substring(end+1,line.length()); //asigns all the text from the numerical index immediately after end until the end of the line
                        }
                        line = sub1 + sub2; //reassigns line to the text without the HTML tags
                    }
                }
                System.out.println(line);
                requirement.enqueue(line);
            }
            
            while(!requirement.isEmpty()){
                String A = requirement.dequeue() + "\n";
                writer.write(A);
            }
            writer.close();
            
        }catch(IOException e){
            System.out.print(e);
        }
    }
}
