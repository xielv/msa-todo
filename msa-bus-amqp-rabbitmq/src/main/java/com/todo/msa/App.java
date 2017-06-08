package com.todo.msa;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        try {
            FileInputStream fis = new FileInputStream("/Users/rochuan/Downloads/timg.jpeg");

            FileOutputStream fos = new FileOutputStream("timg.jpeg");
            BufferedInputStream bis = new BufferedInputStream(fis);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            byte[] b =  new byte[10];

            while (bis.read(b) != -1){
                bos.write(b);
            }

            bos.close();
            bis.close();
            fis.close();
            fos.close();
            System.out.println("done!");


        }catch (Exception e){
            System.out.println(e.fillInStackTrace());
        }


    }



}
