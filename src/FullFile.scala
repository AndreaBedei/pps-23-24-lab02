object FullFile {
    // Task2
    // Es 3a
    val v : Int = -5
    def positive(num: Int) : String = num match
        case num if num >= 0 => "positive"
        case _ => "negative"

    print(positive(v))

    // Es 3b
    def neg(predicate: String => Boolean): String => Boolean =
        s => !predicate(s)

    // Es 3c
    def negGeneric[X](predicate: X => Boolean): X => Boolean =
        s => !predicate(s) 

    // Es 4
   val p1: Int => Int => Int => Boolean = x => y => z => (x <= y) && (y == z)
   val p2: (Int, Int, Int) => Boolean = (x, y, z) => (x <= y) && (y == z)
   def p3(x: Int)(y: Int)(z: Int): Boolean = (x <= y) && (y == z)
   def p4(x: Int, y: Int, z: Int) = (x <= y) && (y == z)

   // Es 5
   def compose(f: Int => Int, g: Int => Int): Int => Int = 
      x => f(g(x))

   def composeGeneric[X, Y, Z](f: Y => Z, g: X => Y): X => Z = 
      x => f(g(x))

    // task3
    // Es 6
    @annotation.tailrec
    def gcd(a: Int, b: Int): Int = (a, b) match
        case (a, 0) => a 
        case (a, b) if a > b  => gcd(b, a % b)
        case _ => gcd(a, b % a)

    // task4
    // Es7
    enum Shape:
        case Rectangle(sideLateral: Double, sideHorizontal: Double )
        case Circle(radius: Double)
        case Square(side: Double)


    object Shape:
        def area(shape: Shape): Double = shape match
            case Rectangle(sideLateral, sideHorizontal) => sideLateral * sideHorizontal
            case Circle(radius) => radius * radius * Math.PI
            case Square(side) => side * side

        def perimeter(shape: Shape): Double = shape match
            case Rectangle(sideLateral, sideHorizontal) => (2 * sideLateral) + (2 * sideHorizontal)
            case Circle(radius) => 2 * radius * Math.PI
            case Square(side) => 4 * side

        def scale(shape: Shape, alpha: Double): Shape = shape match
            case Rectangle(sideLateral, sideHorizontal) => Rectangle(sideLateral * alpha, sideHorizontal * alpha)
            case Circle(radius) => Circle(radius * alpha)
            case Square(side) => Square(side * alpha)


    // Task5
    // Es 8
    
    /**
   * Optional is a type that represents a value that may or may not be present.
   * Similar to Optional in Java but using the ADT concept.
   * Therefore, an Optional is a sum type with two cases: Maybe and Empty.
   * Maybe contains the value, and Empty represents the absence of a value.
   *
   * @tparam A
   */
  enum Optional[A]:
    case Maybe(value: A)
    case Empty()

  object Optional:
    /**
     * isEmpty returns true if the optional is Empty, false otherwise.
     * Example:
     *
     * isEmpty(Empty()) == true
     * isEmpty(Maybe(1)) == false
     *
     * @param optional the optional to check
     * @tparam A the type of the optional
     * @return true if the optional is Empty, false otherwise
     */
    def isEmpty[A](optional: Optional[A]): Boolean = optional match
      case Empty() => true
      case _ => false

    /**
     *
     * getOrElse returns the value of the optional if it is Maybe, otherwise it returns the default value.
     * Example:
     * orElse(Maybe(1), 0) == 1
     * orElse(Empty(), 0) == 0
     *
     * @param optional the optional to get the value from
     * @param default the default value to return if the optional is Empty
     * @tparam A the type of the optional
     * @tparam B the type of the default value
     * @return the value of the optional if it is Maybe, otherwise the default value
     */
    def orElse[A, B >: A](optional: Optional[A], default: B): B = optional match
      case Maybe(value) => value
      case Empty() => default

    /**
     * map applies the function f to the value of the optional if it is Maybe, otherwise it returns Empty.
     * Example:
     *
     * map(Maybe(1), (x: Int) => x + 1) == Maybe(2)
     * map(Empty(), (x: Int) => x + 1) == Empty()
     *
     *
     * @param optional the optional to apply the function to
     * @param f the function to apply to the value of the optional
     * @tparam A the type of the optional
     * @tparam B the type of the result of the function
     * @return the result of applying the function to the value of the optional if it is Maybe, otherwise Empty
     */
    def map[A, B](optional: Optional[A], f: A => B): Optional[B] = optional match
      case Maybe(value) => Maybe(f(value))
      case Empty() => Empty()

    /**
     * filter keeps the value (if present, otherwise the output is None) only if it satisfies the given predicate.
     * Example:
     *
     * filter(Maybe(5))(_ > 2) == Maybe(5)
     * filter(Maybe(5))(_ > 8) == Empty()
     * filter(Empty())(_ > 2) == Empty()
     *
     * @param optional the optional to filter
     * @param f the predicate to check against the value of the optional
     * @tparam A the type of the optional
     * @return the value of the optional if it satisfies the predicate, otherwise Empty
     */
    def filter[A](optional: Optional[A])( f: A => Boolean): Optional[A] = optional match
      case Maybe(value) if f(value) => Maybe(value)
      case _ => Empty()
    
}
