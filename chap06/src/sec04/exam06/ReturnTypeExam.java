package sec04.exam06;

class Data{
	int iData;
}

public class ReturnTypeExam {

	public static void main(String[] args) {
		Data data = new Data();
		
		data.iData = 100;
		System.out.println("iData: " + data.iData);
		
		Data data2 = dataChange(data); // ���� ���� ����
		System.out.println("iData: " + data2.iData);
		
	} // end of main
	
	static Data dataChange(Data data) { // ������ �Ű�����
		Data tmp = new Data();
		tmp.iData = data.iData + 100;
		
		return tmp; // ������ ���� ��ȯ
	} // end of dataChange()	
}
