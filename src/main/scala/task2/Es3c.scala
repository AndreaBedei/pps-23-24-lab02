package task2

object Es3c extends App :
    
    def negGeneric[X](predicate: X => Boolean): X => Boolean =
        s => !predicate(s) 
