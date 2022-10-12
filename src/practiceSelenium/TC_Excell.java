package practiceSelenium;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;
public class TC_Excell {
	public static void main(String args[]) throws Exception{
	FileInputStream file = new FileInputStream("C:\\Users\\Satya\\Desktop\\excel file.xls");
		Workbook   wb = Workbook.getWorkbook(file);
		Sheet      st = wb.getSheet(0);
		int rowcount = st.getRows();
		System.out.println(rowcount);
		for(int i=1;i<rowcount;i++) {
		String empid = st.getCell(1,i).getContents();
		String name = st.getCell(1,i).getContents();
		String email = st.getCell(1,i).getContents();
		String no = st.getCell(1,i).getContents();
		System.out.println(empid);
		System.out.println(name);
		System.out.println(email);
		System.out.println(no);
		}
		}
}
