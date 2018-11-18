import java.util.*;
import org.junit.*;
import org.junit.runner.*;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class NumberUtilTest {
	private NumberUtil numberUtil;
	
	private List<Integer> numList;
	private int maxResult, sumResult;
	
	public NumberUtilTest(List<Integer> numList, int maxResult, int sumResult) {
		this.numList = numList;
		this.maxResult = maxResult;
		this.sumResult = sumResult;
	}
	
	@Parameters
	public static Collection<Object[]> setUpTest(){
		return Arrays.asList(new Object[][] {
			{Arrays.asList(1, 2, 3, 4, 5), 5, 15},
			{Arrays.asList(100), 100, 100},
			{Arrays.asList(-1, -1999, -2000, 0, 2000), 2000, -2000},
			{Arrays.asList(0, -100, 100, 100, -100), 100, 0}
		});
	}
	
	@Before
	public void setUp() {
		numberUtil = new NumberUtil(numList);
	}
	
	@Test
	public void testMax() {
		assertEquals(maxResult, numberUtil.max());
	}
	
	@Test 
	public void testSum() {
		assertEquals(sumResult, numberUtil.sum());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testEmptyList() {
		NumberUtil emptyList = new NumberUtil(Arrays.asList());
		emptyList.max();
		emptyList.sum();
	}
	
	
}
