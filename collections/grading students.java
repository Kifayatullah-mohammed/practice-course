import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Student{
    public static void main(String[] arg){
        Scanner gr = new Scanner(System.in);
        int n = gr.nextInt();
        int marks;
        for(int i=0;i<n;i++){
            marks = gr.nextInt();
            if(marks>=38){
                if((((marks/5)*5+5)-marks)<3){
                    marks = ((marks/5)*5+5);
                }
            }
            System.out.println(marks);
        }
    }
}
