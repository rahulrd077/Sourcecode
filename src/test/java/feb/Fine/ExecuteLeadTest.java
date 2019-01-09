package feb.Fine;

//Hybrid framework

//Data driver + Keyword driven
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
public class ExecuteLeadTest {
	
	@Test
public static void LeadTest() throws Exception {
		Keywords key = new Keywords ();
		ArrayList a = new ArrayList();
		FileInputStream file = new FileInputStream("D:\\ExecuteLeadTest.xlsx");
		XSSFWorkbook wbks = new XSSFWorkbook (file);
		Sheet s = wbks.getSheet("Sheet1");
		Iterator itr = s.iterator();
		while (itr.hasNext()){
			Row rowitr = (Row)itr.next();
			Iterator cellitr = rowitr.cellIterator();
			while (cellitr.hasNext()){
					Cell cell1 = (Cell)cellitr.next();
					switch (cell1.getCellType()){
						case Cell.CELL_TYPE_STRING:
							a.add(cell1.getStringCellValue());
					break;
					case Cell.CELL_TYPE_NUMERIC:
						a.add(cell1.getNumericCellValue());
						break;
					case Cell.CELL_TYPE_BOOLEAN:
						a.add(cell1.getBooleanCellValue());
						break;
					}
				}
				
				}
				
				for (int i=0;i<a.size();i++){
					
					if(a.get(i).equals("openbrowser")){
						String keyword = (String)a.get(i);
						String data = (String)a.get(i+1);
						String objectName = (String)a.get(i+2);
						String runmode = (String)a.get(i+3);
						
						System.out.println (keyword);
						System.out.println (data);
						System.out.println (objectName);
						System.out.println (runmode);
						
						if(runmode.equals("Yes")){
							key.openbrowser();
						}
						}
				}
for (int i=0;i<a.size();i++){
	
	if(a.get(i).equals("navigate")){
		String keyword = (String)a.get(i);
		String data = (String)a.get(i+1);
		String objectName = (String)a.get(i+2);
		String runmode = (String)a.get(i+3);
		
		System.out.println (keyword);
		System.out.println (data);
		System.out.println (objectName);
		System.out.println (runmode);

		if(runmode.equals("Yes")){
			key.navigate(data);
		}
		}
}

	for (int i=0;i<a.size();i++){
		
		if(a.get(i).equals("input")){
			String keyword = (String)a.get(i);
			String data = (String)a.get(i+1);
			String objectName = (String)a.get(i+2);
			String runmode = (String)a.get(i+3);
			
			System.out.println (keyword);
			System.out.println (data);
			System.out.println (objectName);
			System.out.println (runmode);
			
			if(runmode.equals("Yes")){
				key.input(data,objectName);
			}
			}
	}

		
for (int i=0;i<a.size();i++){
		
		if(a.get(i).equals("input")){
			String keyword = (String)a.get(i);
			String data = (String)a.get(i+1);
			String objectName = (String)a.get(i+2);
			String runmode = (String)a.get(i+3);
			
			System.out.println (keyword);
			System.out.println (data);
			System.out.println (objectName);
			System.out.println (runmode);
			
			if(runmode.equals("Yes")){
				key.input(data,objectName);
			}
			}
		
		}
for (int i=0;i<a.size();i++){
if(a.get(i).equals("input ")){
	String keyword = (String)a.get(i);
	String data = (String)a.get(i+1);
	String objectName = (String)a.get(i+2);
	String runmode = (String)a.get(i+3);
	
	System.out.println (keyword);
	System.out.println (data);
	System.out.println (objectName);
	System.out.println (runmode);
	
	if(runmode.equals("Yes")){
		key.inputs(data,objectName);
	}
}
}
		
		for (int i=0;i<a.size();i++){
		
		if(a.get(i).equals("click")){
			String keyword = (String)a.get(i);
			String data = (String)a.get(i+1);
			String objectName = (String)a.get(i+2);
			String runmode = (String)a.get(i+3);
			
			System.out.println (keyword);
			System.out.println (data);
			System.out.println (objectName);
			System.out.println (runmode);
			
			if(runmode.equals("Yes")){
			key.click(objectName);
			}
	
	
}
}

		}
		}
					