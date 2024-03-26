package sec01.exam01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("손흥민");
		set.add("아이유");
		set.add("이강인");
		
		//외부 반복자(for)
		for (String item : set) {
			System.out.println(item);
		}
		System.out.println();
		
		//외부 반복자(Iterator)
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String item = iterator.next();
			System.out.println(item);			
		}
		System.out.println();
		
		//내부 반복자(Stream)
		Stream<String> stream = set.stream();
		/* void forEach(Consumer<? super T> action)
		 * 
		 * @FunctionalInterface
		 * public interface Consumer<T> {
		 * 	    void accept(T t);
		 * }	    
		 */
		stream.forEach((t) -> System.out.println(t));
		
	}//end of main
}
