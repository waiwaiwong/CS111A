import java.util.*;
import java.util.concurrent.*;

public class CookThread implements Runnable{
	private BlockingQueue<Food> queue;
	private List<Food> foodList;
	
	public CookThread(BlockingQueue<Food> queue, List<Food> foodList) {
		this.queue = queue;
		this.foodList = foodList;
	}
	
	@Override
	public void run() {
		for(Food food : foodList) {
			try {
				System.out.println("COOK READY");
				System.out.println("COOK STARTING: " + food.toString());
				Thread.sleep(food.getCookTime() * 1000);
				queue.put(food);
				System.out.println("COOK ENDING: " + food.toString());
				
				
			} catch (InterruptedException ex) {}
		}
	}
}
