package exception;

import java.io.FileInputStream;
import java.io.FileWriter;

public class File {


    public void readFile(){

        try{
            FileInputStream fin=new FileInputStream("/Users/arjit/Desktop/abc.txt");
            int i=0;
            while((i=fin.read())!=-1){
                System.out.print((char)i);
            }
            fin.close();
        }catch(Exception e){System.out.println(e);}
    }



    public void fileWrite(){
        try{
            FileWriter fw=new FileWriter("/Users/arjit/Desktop/abc.txt");
            fw.write("Hello\nHello");
            fw.close();
        }catch(Exception e){System.out.println(e);}
        System.out.println("Success...");

}

    public static void main(String[] args) {
        File f1 = new File();
        f1.readFile();
//        f1.fileWrite();
    }
}

