import java.util.*;
import java.util.concurrent.*;

public class ServeThread implements Runnable {
	private BlockingQueue<Food> queue;
	private List<Food> foodList;
	
	public ServeThread(BlockingQueue<Food> queue, List<Food> foodList) {
		this.queue = queue;
		this.foodList = foodList;
	}

	@Override
	public void run() {
		for(int i = 0; i < foodList.size(); i++) {
			try {
				System.out.println("SERVER READY");
				Food food = queue.take();
				System.out.println("SERVER STARTING: " + food.toString());
				Thread.sleep(food.getServeTime() * 1000);
				System.out.println("SERVER ENDING: " + food.toString());
				
			} catch (InterruptedException ex) {}
		}
	}
}
