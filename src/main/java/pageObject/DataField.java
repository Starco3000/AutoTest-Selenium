package pageObject;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.JDBCType;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.sql.Types.BOOLEAN;
import static java.sql.Types.NUMERIC;
import static org.apache.poi.ss.usermodel.DataValidationConstraint.ValidationType.FORMULA;
import static org.apache.xmlbeans.impl.piccolo.xml.Piccolo.STRING;

public class DataField {
    public String filePath;
    public FileInputStream stream;
    public File s;
    XSSFWorkbook work_book;
    XSSFSheet sheet;
    public JDBCType CellType;

    public DataField(String excelfilePath) {
        try {
            filePath = excelfilePath;
            s = new File(excelfilePath);
            stream = new FileInputStream(s);
            work_book = new XSSFWorkbook(stream);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String getData(int row, int column) {
        sheet = work_book.getSheetAt(0);
        return sheet.getRow(row).getCell(column).getStringCellValue();
    }

//    public int getRowCount(int sheetIndex) {
//        int row = work_book.getSheetAt(sheetIndex).getLastRowNum();
//        row = row + 1;
//        return row;
//    }
//
//    public void closeWorkBook() throws IOException {
//        stream.close();
//    }
//
//    public void write(String text, int row, int column) throws IOException {
//        var cell = sheet.getRow(row).createCell(column);
//        System.out.println(cell);
//        cell.setCellValue(text);
//        FileOutputStream output = new FileOutputStream(filePath);
//        work_book.write(output);
//        output.close();
//
//    }
}
