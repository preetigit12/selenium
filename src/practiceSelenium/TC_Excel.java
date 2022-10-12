package practiceSelenium;
import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;
public class TC_Excel {
	public static void main(String args[]) throws Exception{
		FileInputStream file = new FileInputStream("C:\\Users\\Satya\\Desktop\\excel file.xls");
		Workbook   wb = Workbook.getWorkbook(file);
		Sheet      st = wb.getSheet(0);
	//	int row=3;
		String empid = st.getCell(1,1).getContents();
		String name = st.getCell(1,2).getContents();
		String email = st.getCell(1,3).getContents();
		String no = st.getCell(1,4).getContents();
		System.out.println(empid);
		System.out.println(name);
		System.out.println(email);
		System.out.println(no);

		}
		
}
