package com.example.rafa.djlobo_with_downloads;

/**
 * Created by Rafa on 2/27/17.
 */

import  java.util.*;
import java.io.*;
public class File_Array {

    String file_Name;

    static String[] songlist = null;


    public File_Array() {


    }


    public static String [] file_toR(String path) {
path = "songs.txt";
        try {
            BufferedReader in = null;

            in = new BufferedReader(new FileReader(path));
            String str;
            List<String> list = new ArrayList<String>();


            while ((str = in.readLine()) != null)
            System.out.println(str);
                list.add(str);




           songlist[1] = list.get(1);
            return songlist;
        } catch (EOFException e) {


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}