package trading.output.write;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WriteToExcel {

	private FileOutputStream fileOut;
	private HSSFWorkbook workbook;
	private HSSFSheet worksheet;

	private final String pathToExcel = "C:\\Users\\hp\\workspace\\AgentBasedNegotiationSystem\\bin\\trading\\output\\excel\\test.xls";

	// constructor
	public WriteToExcel() {
		try {
			this.fileOut = new FileOutputStream(new File(this.pathToExcel));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.workbook = new HSSFWorkbook();
		this.worksheet = workbook.createSheet("Worksheet");
	}

	// method to write to the excel sheet
	public void methodWrite() {

		/*
		 * try {
		 * 
		 * // index from 0,0... cell A1 is cell(0,0) HSSFRow row1 =
		 * worksheet.createRow(0);
		 * 
		 * HSSFCell cellA1 = row1.createCell(0); cellA1.setCellValue("Hello");
		 * HSSFCellStyle cellStyle = workbook.createCellStyle();
		 * //cellStyle.setFillForegroundColor(HSSFColor GOLD.index);
		 * cellStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
		 * cellA1.setCellStyle(cellStyle);
		 * 
		 * HSSFCell cellB1 = row1.createCell(1); cellB1.setCellValue("Goodbye");
		 * cellStyle = workbook.createCellStyle();
		 * cellStyle.setFillForegroundColor
		 * (HSSFColor.LIGHT_CORNFLOWER_BLUE.index);
		 * cellStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
		 * cellB1.setCellStyle(cellStyle);
		 * 
		 * HSSFCell cellC1 = row1.createCell(2); cellC1.setCellValue(true);
		 * 
		 * HSSFCell cellD1 = row1.createCell( 3); cellD1.setCellValue(new
		 * Date()); cellStyle = workbook.createCellStyle();
		 * cellStyle.setDataFormat(HSSFDataFormat
		 * .getBuiltinFormat("m/d/yy h:mm")); cellD1.setCellStyle(cellStyle);
		 * 
		 * workbook.write(fileOut); fileOut.flush(); fileOut.close(); } catch
		 * (FileNotFoundException e) { e.printStackTrace(); } catch (IOException
		 * e) { e.printStackTrace(); }
		 */
	}
}
