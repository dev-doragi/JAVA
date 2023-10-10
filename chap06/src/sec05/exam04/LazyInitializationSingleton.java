package sec05.exam04;

public class LazyInitializationSingleton {
	private static LazyInitializationSingleton instance = null;
	
	 private LazyInitializationSingleton() {}
	 
	 public static LazyInitializationSingleton getInstance() {
		 // �̱��� �ν��Ͻ��� �������� ���� ��쿡�� �ν��Ͻ� ����
		 if (instance == null) {
			 instance = new LazyInitializationSingleton();
		 } 
		 return instance;
	 }
}
