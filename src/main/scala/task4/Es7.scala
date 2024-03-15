package task4

object Es7 extends App:
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
    


     
