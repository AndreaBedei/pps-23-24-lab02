package task3

object Es6 extends App :

    @annotation.tailrec
    def gcd(a: Int, b: Int): Int = (a, b) match
        case equal if b == 0 => a 
        case grater if a > b  => gcd(b, a % b)
        case _ => 1
            
