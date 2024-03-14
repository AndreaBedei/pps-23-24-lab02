package task2

object Es5 extends App:
   
   def compose(f: Int => Int, g: Int => Int): Int => Int = 
      x => f(g(x))

   def composeGeneric[X, Y, Z](f: Y => Z, g: X => Y): X => Z = 
      x => f(g(x))
