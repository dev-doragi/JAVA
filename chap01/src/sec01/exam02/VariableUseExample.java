package sec01.exam02;

public class VariableUseExample {
	public static void main(String[] args) throws Exception {
		// ���� ����
		//int hour = 3;
		//int minute = 5;
		
		// ��� 
		//System.out.println(hour + "�ð�" + minute + "��");
		
		// ����
		//int totalMinute = (hour*60) + minute;
		// ���
		//System.out.println("��" + totalMinute + "��");
		
		int num;
		int dice[] = {0, 0, 0, 0, 0, 0};
		
		for (int i = 0; i < 1000; i++) {
			num  = (int) (Math.random() * 6)  + 1;
			switch (num){
				case 1: {
					dice[0]++;
					break;
				} case 2: {
					dice[1]++;
					break;
				} case 3: {
					dice[2]++;
					break;
				} case 4: {
					dice[3]++;
					break;
				} case 5: {
					dice[4]++;
					break;
				} case 6: {
					dice[5]++;
					break;
				}
			}
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.println("dice[" + i + "] = " + dice[i]);
		}
			
	} // end of main
} // end of class
