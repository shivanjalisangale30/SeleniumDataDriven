/**
 * Description : Library.java reads the Path of Excel sheet and Extract the Row and Column value
 * Author      : Shivanjali Sangale
 * Date        : 14/01/2020
 */
package com.bridgelabz.generic;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Library implements IAutoConstant {

    public static Workbook workbook;

    public static String getURLProperty(String CONFIGURATION_PATH, String key)  {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(CONFIGURATION_PATH));
        } catch (IOException e) {}
        String property = properties.getProperty(key);
        return property;
    }

    public static int getRowCount(String EXCEL_DATA_PATH,String sheet) {
        try {
            workbook = WorkbookFactory.create(new FileInputStream(EXCEL_DATA_PATH));
        } catch (IOException e) {}
        int rowNum = workbook.getSheet(sheet).getLastRowNum();
        return rowNum;
    }

    public static String getCellValue(String EXCEL_DATA_PATH , String sheet , int row , int column){
        String string ="";
        try {
            workbook =WorkbookFactory.create(new FileInputStream(EXCEL_DATA_PATH));
            string = workbook.getSheet(sheet).getRow(0).getCell(1).toString();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e);
        }
        return string;
    }
}
