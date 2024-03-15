package task3

import org.junit.*
import org.junit.Assert.*
import task3.Es6.*

class RecursionTest2 :

    @Test def Init() =
        assertEquals(3,3)

    @Test def recursionTail() =
        assertEquals(gcd(12, 8), 4)
        assertEquals(gcd(14, 7), 7)
        assertEquals(gcd(7, 3), 1)
        assertEquals(gcd(8, 12), 4)

