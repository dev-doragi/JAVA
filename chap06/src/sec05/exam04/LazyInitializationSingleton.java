package sec05.exam04;

public class LazyInitializationSingleton {
	private static LazyInitializationSingleton instance = null;
	
	 private LazyInitializationSingleton() {}
	 
	 public static LazyInitializationSingleton getInstance() {
		 // 싱글톤 인스턴스를 생성하지 않은 경우에만 인스턴스 생성
		 if (instance == null) {
			 instance = new LazyInitializationSingleton();
		 } 
		 return instance;
	 }
}
