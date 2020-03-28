import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveFirst2CharsTest {

	@Test
	void Test1() {
	RemoveFirst2Chars removeSwap2Chars=new RemoveFirst2Chars();
	assertEquals("BCD",removeSwap2Chars.Remove("ABCD"));
	}
	@Test
	void Test2() {
		RemoveFirst2Chars removeSwap2Chars=new RemoveFirst2Chars();
		assertEquals("CD",removeSwap2Chars.Remove("AACD"));
		}
	@Test
	void Test3() {
		RemoveFirst2Chars removeSwap2Chars=new RemoveFirst2Chars();
		assertEquals("BCD",removeSwap2Chars.Remove("BACD"));
		}
	@Test
	void Test4() {
		RemoveFirst2Chars removeSwap2Chars=new RemoveFirst2Chars();
		assertEquals("BBAA",removeSwap2Chars.Remove("BBAA"));
		}
	@Test
	void Test5() {
		RemoveFirst2Chars removeSwap2Chars=new RemoveFirst2Chars();
		assertEquals("BAA",removeSwap2Chars.Remove("AABAA"));
		}

}
