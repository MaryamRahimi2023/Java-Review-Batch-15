package com.syntax.review11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFile {

    public static void main(String[] args){

        String path="Files/Config.properties";
       try {
           FileInputStream fileInputStream = new FileInputStream(path);
           Properties properties=new Properties();// This "Properties" class will assist us to read and write data to .properties files
           // like word and excel in our computers
           properties.load(fileInputStream);
           System.out.println(properties.getProperty("userName"));
           System.out.println(properties.getProperty("password"));
       }catch (FileNotFoundException e){
           System.out.println("Something gone wrong");
       }catch (NullPointerException e){
           System.out.println("You are trying to call a method on Null object");
       } catch (IOException e) {
           System.out.println("IO Exception occurred");
       }

    }
}
