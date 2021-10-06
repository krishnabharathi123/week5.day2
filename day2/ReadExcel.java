package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public String[][] readExcel(String FileNm) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook("./Datas/"+FileNm+".xlsx");
		int rowCount = wb.getSheet("Sheet1").getLastRowNum();
		int cellCount = wb.getSheet("Sheet1").getRow(0).getLastCellNum();
		String[][] val = new String[rowCount][cellCount];
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < cellCount; j++) {
				val[i - 1][j] = wb.getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
			}
		}
		wb.close();
		return val;

	}

}
