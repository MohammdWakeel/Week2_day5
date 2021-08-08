package aug5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RestMain {

	public static void main(String[] args) {
		List<Restraunt> itemList = new ArrayList<>();
		itemList.add(new Restraunt(100, "fish",6,123.50));
		itemList.add(new Restraunt(101, "chicken",2, 100.22));
		itemList.add(new Restraunt(190, "biryani", 5, 200.52));
		itemList.add(new Restraunt(200, "Dosa", 3, 60.0));
		itemList.add(new Restraunt(104, "Paneer", 4,200.22));
		itemList.add(new Restraunt(111, "Idli", 3, 60.0));
		
		Collections.sort(itemList, (Restraunt r1,Restraunt r2)-> {
				String s1=r1.getP_Name();
				String s2=r2.getP_Name();
				return s1.compareTo(s2);
		});
		
		RestMain obj=new RestMain();
		obj.display(itemList);
		
	}
	public static void display(List<Restraunt> itemList) {
		System.out.println("---------------------------------------------------------");
		System.out.println("#    Name        Price         Qty.      Total");
		System.out.println("---------------------------------------------------------");
		//int i=0;
		for(Restraunt r:itemList) {
			System.out.println(r);
		}
		
		System.out.println("---------------------------------------------------------");
		Double totalBill=itemList.stream().map(e->e.getPrice()*e.getQuantity()).reduce(0.0, (sum,bill) -> sum+bill);
		//List names=itemList.stream().map(e->e.getP_Name()).sorted().collect(Collectors.toList());
		System.out.println("Total                                    "+totalBill);
		System.out.println("5% GST                                   "+totalBill*0.05);
		System.out.println("Final Bill                               "+totalBill*1.05);
		
		System.out.println("---------------------------------------------------------");

	}
	
	public void print(List<Restraunt> itemList) {
		for(Restraunt o: itemList) {
			System.out.println(o);
		}
	}

}
