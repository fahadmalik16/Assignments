package TestData;

import org.testng.annotations.DataProvider;
import utils.ExcelUtils;
import java.io.IOException;
import java.util.*;


public class ExcelDataProvider {



    //public Object[][] getData() throws IOException {
     //   Object data[][] = testData("D:/EMUMBA/Read/Automation Testing/WEB UI Java Path/ASSIGNMENTS/Assignment1/src/main/resources/Datasheet.xlsx","Signin");
     //   return data;
   // }
    @DataProvider(name = "loginData")
    public static Object[][] testData() throws IOException {
        ExcelUtils excel = new ExcelUtils("D:/EMUMBA/Read/Automation Testing/WEB UI Java Path/ASSIGNMENTS/Assignment1/src/main/resources/Datasheet.xlsx","Signin");
        int rowCount = excel.getRowCount();
        int colCount = excel.getColCount();

        Object data[][] = new Object[rowCount-1][colCount];

        for(int row=1; row<rowCount;row++){
            for(int col=0;col<colCount;col++){
                String cellData = excel.getStringData(row,col);
                data[row-1][col]= cellData;
            }
        }
        return data;
    }


}
