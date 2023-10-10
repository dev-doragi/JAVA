package sec05.exam04;

public class Singleton {
	/* 2) �ڽ��� Ŭ���� Ÿ������ ����(static)�ʵ带 �����ϰ� �ڽ��� �ν��Ͻ��� �����Ͽ� �ʱ�ȭ
	 *  - ������ ���� �ʵ带 �ܺο��� ������� ���ϵ��� ���������ڸ� private�� ����
	 */
	private static Singleton instance = new Singleton();
	
	/* 1) �����ڸ� private�� ������ ������ �ܺο��� �ٸ� Singleton ��ü�� ������ �� ������ �Ϸ��� */
		private Singleton() {}
		
	/* 3) ������ �ν��Ͻ��� �ܺο��� ����� �� �ֵ��� getInstance() ����
	 *  - �����ϰ� ������ �ν��Ͻ��� �ܺο��� ����� �� �ֵ��� ��ȯ 
	 */
		public static Singleton getInstance() {
		return instance;
	}
}
