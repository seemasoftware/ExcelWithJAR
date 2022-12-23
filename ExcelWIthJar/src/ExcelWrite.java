import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ExcelWrite {
	public void WriteExcel() throws IOException, RowsExceededException, WriteException {
		File f = new File("../ExcelWIthJar/doc.xls");
		WritableWorkbook wk =  Workbook.createWorkbook(f);
		WritableSheet ws = wk.createSheet("seema", 0);
		for (int i=0;i<4;i=i+1)
		{								// for row
			for(int j=0;i<4;j=j+1)
				{     // for column
				Label l = new Label(j,i,"seem"); // for content
				ws.addCell(l);
				}
		}
		wk.write();
		wk.close();
		}	

		public static void main(String[] args) throws RowsExceededException, WriteException, IOException {
			ExcelWrite w = new ExcelWrite();
			w.WriteExcel();
		}

}
