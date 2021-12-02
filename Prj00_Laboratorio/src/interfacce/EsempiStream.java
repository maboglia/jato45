package interfacce;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EsempiStream {
	
	public static void main(String[] args) {
		
//		IntStream
//			.range(1, 91)
//			.filter(n -> n%3==0)
//			.forEach(n -> System.out.println(n));
//		
//		long somma = IntStream
//		.range(1, 91)
//		.filter(n -> n%3==0)
//		.sum();
//		System.out.println(somma);
		
//		String[] nomi = {"romolo", "remo", "giovanni", "francesca", "adamo", "zorro"};
//		List<String> nomiLunghi =  Arrays.stream(nomi)
//			.filter(n -> n.length()>5)
//			.sorted()
//			.collect(Collectors.toList());
		
		IntSummaryStatistics summaryStatistics = IntStream.of(28,30,25,24,22,18,23,27).summaryStatistics();
		System.out.println(summaryStatistics);
	}

}
