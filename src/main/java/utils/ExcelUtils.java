package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class ExcelUtils {

    static XSSFWorkbook workbook;
    static XSSFSheet sheet;

    public static void main(String [] args) throws IOException {
        ExcelUtils excel = new ExcelUtils("D:/EMUMBA/Read/Automation Testing/WEB UI Java Path/ASSIGNMENTS/Assignment1/src/main/resources/Datasheet.xlsx","Signin");
        excel.getStringData(1,1);
        excel.getRowCount();
    }

    public ExcelUtils(String excelPath, String sheetName) throws IOException {
        workbook = new XSSFWorkbook(excelPath);
        sheet = workbook.getSheet(sheetName);
    }
    public static int getRowCount() throws IOException {
        int rowCount = sheet.getPhysicalNumberOfRows();
        //System.out.println(rowCount);
        return rowCount;
    }

    public static int getColCount() throws IOException {
        int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
        //System.out.println(colCount);
        return colCount;
    }

    public static String getStringData(int rowNum, int colNum) throws IOException {
        String stringData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
        //System.out.println(stringData);
        return stringData;
    }

    public static void getNumericData(int rowNum, int colNum) throws IOException {
        double numericData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
    }

}
