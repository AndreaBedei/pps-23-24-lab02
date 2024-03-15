package task3

object Es6 extends App :

    @annotation.tailrec
    def gcd(a: Int, b: Int): Int = (a, b) match
        case (a, 0) => a 
        case (a, b) if a > b  => gcd(b, a % b)
        case _ => gcd(a, b % a)
            
