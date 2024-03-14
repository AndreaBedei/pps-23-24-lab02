package task2

import org.junit.*
import org.junit.Assert.*
import task2.Es3b.neg


class PredicateTest:

  @Test def init() =
    val empty: String => Boolean = _ == "" // predicate on strings
    val notEmpty = neg(empty) // which type of notEmpty?
    assertTrue(notEmpty("foo")) 
    assertFalse(notEmpty("")) 
    assertTrue(notEmpty("foo") && !notEmpty("")) // true.. a comprehensive test
    
    