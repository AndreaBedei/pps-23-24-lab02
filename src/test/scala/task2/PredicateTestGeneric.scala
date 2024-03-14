package task2

import org.junit.*
import org.junit.Assert.*
import task2.Es3c.negGeneric

class PredicateTestGeneric:

  @Test def testInt() =
    val empty: Int => Boolean = _ == 10 // predicate on strings
    val notEmpty = negGeneric(empty) // which type of notEmpty?
    assertFalse(notEmpty(10))
    assertTrue(notEmpty(5)) 
    assertTrue(notEmpty(10) && !notEmpty(5)) // true.. a comprehensive test

  @Test def testString() =
    val empty: String => Boolean = _ == "" // predicate on strings
    val notEmpty = negGeneric(empty) // which type of notEmpty?
    assertTrue(notEmpty("foo")) 
    assertFalse(notEmpty("")) 
    assertTrue(notEmpty("foo") && !notEmpty("")) // true.. a comprehensive test
    
    