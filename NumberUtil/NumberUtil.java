import java.util.*;

public class NumberUtil {
    
    private List<Integer> numberList;
    
    public NumberUtil(List<Integer> numberList) {
        this.numberList = numberList;
    }
    
    public void setNumberList(List<Integer> numberList) {
        this.numberList = numberList;
    }
    
    public int max() {
    		if(numberList.isEmpty()) {
    			throw new IllegalArgumentException("The list is empty!");
    		}
    		return numberList.stream().mapToInt(number -> number.intValue())
    		  .max().getAsInt();
    }
    

    public int sum() {
    		if(numberList.isEmpty()) {
			throw new IllegalArgumentException("The list is empty!");
		}
        return numberList.stream().mapToInt(number -> number.intValue())
        		.sum();
    }

}