package testdatamarqqqq;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class excel22 {
	
	 @DataProvider(name="data")


			 public Object[][] Employe() throws Throwable {

			File file = new File("./excelsheet/sai.xlsx");

			FileInputStream stream = new FileInputStream(file);

			XSSFWorkbook book = new XSSFWorkbook(stream);

			XSSFSheet sheet = book.getSheetAt(0);

			int rows = sheet.getPhysicalNumberOfRows();

			int cells = sheet.getRow(0).getLastCellNum();

			Object[][] data = new Object[rows][cells];

			for (int i = 0; i < rows; i++) {

				for (int j = 0; j < cells; j++) {

					DataFormatter df = new DataFormatter();

					data[i][j] = df.formatCellValue(sheet.getRow(i).getCell(j));

					System.out.println(df.formatCellValue(sheet.getRow(i).getCell(j)));
				}
			}
			
			 return data;

	 }
}
