package com.syntax.review11;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelDemo1 {

    public static void main(String[] args) {

        String path="Files/TestTask.xlsx";

        try { FileInputStream fileInputStream = new FileInputStream(path);
            XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
            Sheet sheet1=xssfWorkbook.getSheet("Sheet3");

            int noOfRows= sheet1.getPhysicalNumberOfRows();
           List<Map<String,String>> excelData=new ArrayList<>();
           // if we use var here will get run time error coz Array list type
           // if we use var then should provide the data type on the other site
           // var excelData=new ArrayList<Map<String,String>>();
            Row row0= sheet1.getRow(0);// the header that we will use as key so declare and save here to reuse
            for (int i = 1; i < noOfRows; i++) {// start from 1 here coz we got the first row as header
                LinkedHashMap<String,String> rowMap=new LinkedHashMap<>();
                Row row=sheet1.getRow(i);
            int noOfCells=row.getPhysicalNumberOfCells();
                for (int j = 0; j < noOfCells; j++) {
                String key=row0.getCell(j).toString();
                String values=row.getCell(j).toString();

                rowMap.put(key,values);
                }
                excelData.add(rowMap);
            }
            System.out.println(excelData);

        }catch (Exception e){
            System.out.println("Please check the path of the file");
        }

    }
}
