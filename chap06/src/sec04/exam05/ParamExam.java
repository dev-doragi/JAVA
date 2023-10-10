package sec04.exam05;

class Data{
	int iData;
}

public class ParamExam {

	public static void main(String[] args) {
		Data data = new Data();
		
		data.iData = 100;
		System.out.println("iData: " + data.iData);
		
		dataChange(data);
		System.out.println("iData: " + data.iData);
	}
	
	static void dataChange(Data data) {
		System.out.println("iData: " + data.iData);
		data.iData = 1000;
		}
}
