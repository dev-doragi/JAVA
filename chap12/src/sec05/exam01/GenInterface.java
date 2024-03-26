package sec05.exam01;

//제네릭 타입 함수형 인터페이스 선언
@FunctionalInterface
public interface GenInterface<T> {
	public T getVlue(T val);
}


