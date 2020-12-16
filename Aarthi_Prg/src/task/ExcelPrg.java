package task;

import java.io.File;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.*;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class ExcelPrg {

	public static void main(String[] args) throws InterruptedException
	{
		int i=0,j=0,c=1;
		String[] name= {"Aarthi","Akshiya","Sweety","Divya","Lavanya","Sharmi"};
		String[] role= {"Developer","Student","Developer","Student","Trainee","Trainee"};
		String[] cmpy= {"Zoho","DGCT","i-exceed","TCS","Wipro","CTS"};
		
		WritableWorkbook wb;
		WritableFont headerCellFont = new WritableFont(WritableFont.createFont("Calibri"), 11,WritableFont.BOLD, true);
		WritableCellFormat headerCellFormat = new WritableCellFormat(headerCellFont);
		
		Label headerCell1 = new Label(0, 0, "Name", headerCellFormat);
		Label headerCell2 = new Label(1, 0, "Role", headerCellFormat);
		Label headerCell3 = new Label(2, 0, "Company", headerCellFormat);
		
		try
		{
			wb=Workbook.createWorkbook(new File("D:\\demo.xls"));
			WritableSheet sh=wb.createSheet("Demo", 0);
			sh.addCell(headerCell1);
			sh.addCell(headerCell2);
			sh.addCell(headerCell3);
			for(i=2;i<name.length+1;i++)
			{
				Label lb1 = new Label(0,c,name[j]);
				sh.addCell(lb1);
				Label lb2 = new Label(1,c,role[j]);
				sh.addCell(lb2);
				Label lb3 = new Label(2,c,cmpy[j]);
				sh.addCell(lb3);
				j++;
				c++;
				
			}
			wb.write();
			wb.close();
            System.out.println("workbook created!!");
		}
		catch(Exception e)
		{
			System.out.println("Exception: "+e);
		}

	}

}
