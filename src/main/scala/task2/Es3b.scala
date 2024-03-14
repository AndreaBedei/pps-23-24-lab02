package task2

object Es3b extends App :
  
    def neg(predicate: String => Boolean): String => Boolean =
        s => !predicate(s) 
    