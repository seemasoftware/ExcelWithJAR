import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excel {
	public void ReadData() throws BiffException, IOException{
		File f = new File("../ExcelWIthJar/Test2.xls");
		Workbook wk = Workbook.getWorkbook(f);
		Sheet ws = wk.getSheet(0);
		int r= ws.getRows();
		int c =ws.getColumns();
		
		for (int i=0;i<r;i=i+1)
		{// for row
			for(int j=0;i<c;j=j+1) {// for columns
				{
				Cell c1 = ws.getCell(j,i);
				System.out.println(c1.getContents());
				}
			}
		}
	}
	public static void main(String[] args) throws BiffException, IOException {
		Excel e = new Excel();
		e.ReadData();
	}
}
