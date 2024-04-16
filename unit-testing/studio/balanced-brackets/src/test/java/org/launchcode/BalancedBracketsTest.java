package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }


//1
@Test
public void allTextInBracketsReturnsTrue() {
    assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
}
//2
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
//    3
    @Test
    public void testOrderOfBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
//4
    @Test
    public void testHasBracketStart() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
// 5
    @Test
    public void testHasBracketEnd() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
//  6
    @Test
    public void testMixedUpBracketsAfterCorrectOnes(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]["));
    }
//    7
@Test
public void testNestedBracketsReturnsTrue() {
    assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch [Code]!]"));
}
//    8
@Test
public void multipleBalancedBracketsReturnsTrue() {
    assertTrue(BalancedBrackets.hasBalancedBrackets("[]Launch[]Code[]"));
}


//    9
@Test
public void oneWordInBracket() {
    assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
}

//    10


    @Test
    public void testMismatchedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch [Code!]"));
    }





//    11


    @Test
    public void multipleBalancedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]Launch[]Code[]"));
    }


//    12
@Test
public void emptyBracketsBeforeTextReturnsTrue() {
    assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
}

}