package task2

import org.junit.*
import org.junit.Assert.*
import task2.Es4.* 

class CurriedEndNotTest:

  @Test def p1Check() =
    assertFalse(p1(5)(6)(7))
    assertTrue(p1(5)(10)(10))

  @Test def p2Check() =
    assertFalse(p2(5, 6, 7))
    assertTrue(p2(5, 10, 10)) 

  @Test def p3Check() =
    assertFalse(p3(5)(6)(7))
    assertTrue(p3(5)(10)(10))   

  @Test def p4Check() =
    assertFalse(p4(5, 6, 7))
    assertTrue(p4(5, 10, 10)) 
    