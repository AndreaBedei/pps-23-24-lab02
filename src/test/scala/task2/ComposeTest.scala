package task2

import org.junit.*
import org.junit.Assert.*
import task2.Es5.* 

class ComposeTest:

  @Test def composeSimple() =
    def f(x: Int): Int = x * 2
    def g(y: Int): Int = y - 1
    assertEquals(compose(f, g)(5), 8)

  @Test def composeGen() =
    def f(x: Int): Int = x * 2
    def g(y: Int): Int = y - 1
    assertEquals(composeGeneric(f, g)(5), 8)
    
    