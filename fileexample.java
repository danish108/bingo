/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructors;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class fileexample {
    public static void main(String[] args) {
        FileReader fr=null;
        try
        {
            fr=new FileReader("E:\\onlinejava demo.text");
            int ch;
            int count=0;
            while((ch=fr.read())!=-1)
            {
                System.out.println((char)ch);
                ++count;
            }
            System.out.println("\n Total characters read:"+count);
        }
        catch(FileNotFoundException fnf)
        {
            System.out.println("cannot open the file");
            System.out.println(fnf.getMessage());
        }
        catch(IOException ex)
        {
            System.out.println("error while reading file:");
        }
            finally
            {
                    if(fr!=null)
                    {
                    try
                    {
                    fr.close();
                    }
                    catch(IOException ex)
                    {
                        System.out.println("error while closing file");
                    }
             }
        }
    }
    
}
