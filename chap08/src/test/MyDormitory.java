package test;

public class MyDormitory {
	ForWho ormitory = new FirstD();
	
	MyDormitory() { }
	
	MyDormitory(ForWho ormitory) {
		this.ormitory = ormitory;
		//ormitory.setNumber(1);
		ormitory.isFor();
	}
}
