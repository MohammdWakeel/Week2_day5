package day5_task3;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;
import java.util.function.*;

//import eg2.Bus;

public class StreamToMap {

	public static void main(String[] args) {
		List<Bus> busList = new ArrayList<>();
		busList.add(new Bus(100, "Abc Travels", 1200.22, 2.3f));
		busList.add(new Bus(101, "Abc Travels", 1100.22, 2.4f));
		busList.add(new Bus(190, "Xyz Travels", 1100.22, 2.3f));
		busList.add(new Bus(200, "Jee Travels", 1000.22, 4.3f));
		busList.add(new Bus(104, "Java Travels", 900.22, 4.3f));
		busList.add(new Bus(111, "Xyz Travels", 1400.22, 4.3f));
		
		Map<Integer, String> map=busList.stream().collect(Collectors.toMap(Bus::getId, Bus::getProviderName));
		System.out.println(map);
		
		Map<Integer, Bus> map1=busList.stream().collect(Collectors.toMap(Bus::getId, Function.identity()));
		System.out.println(map1);
		
		Map<String, List<Bus>> map2=busList.stream().collect(Collectors.groupingBy(Bus::getProviderName));
		System.out.println(map2);

	}

}
