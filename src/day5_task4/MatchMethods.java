package day5_task4;

import java.util.ArrayList;
import java.util.List;

import day5_task3.Bus;

public class MatchMethods {

	public static void main(String[] args) {
		List<Bus> busList = new ArrayList<>();
		busList.add(new Bus(100, "Abc Travels", 1200.22, 2.3f));
		busList.add(new Bus(101, "Abc Travels", 1100.22, 2.4f));
		busList.add(new Bus(190, "Xyz Travels", 1100.22, 2.3f));
		busList.add(new Bus(200, "Jee Travels", 1000.22, 4.3f));
		busList.add(new Bus(104, "Java Travels", 900.22, 4.3f));
		busList.add(new Bus(111, "Xyz Travels", 1400.22, 4.3f));
		
		boolean b1=busList.stream().anyMatch(e->e.getProviderName().equals("Xyz Travels"));
		System.out.println(b1);
		
		boolean b2=busList.stream().allMatch(e->e.getProviderName().equals("Xyz Travels"));
		System.out.println(b2);
		
		boolean b3=busList.stream().noneMatch(e->e.getProviderName().equals("Xyz Travels"));
		System.out.println(b3);

	}

}
