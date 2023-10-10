package sec04.exam06;

class Data{
	int iData;
}

public class ReturnTypeExam {

	public static void main(String[] args) {
		Data data = new Data();
		
		data.iData = 100;
		System.out.println("iData: " + data.iData);
		
		Data data2 = dataChange(data); // 참조 변수 전달
		System.out.println("iData: " + data2.iData);
		
	} // end of main
	
	static Data dataChange(Data data) { // 참조형 매개변수
		Data tmp = new Data();
		tmp.iData = data.iData + 100;
		
		return tmp; // 참조형 변수 반환
	} // end of dataChange()	
}
