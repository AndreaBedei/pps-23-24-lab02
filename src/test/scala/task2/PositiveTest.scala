package task2

import org.junit.*
import org.junit.Assert.*

class PositiveTest:

  @Test def init() =
    assertEquals("positive", Es3a.positive(5))
    assertNotEquals("positive", Es3a.positive(-5))
    
    