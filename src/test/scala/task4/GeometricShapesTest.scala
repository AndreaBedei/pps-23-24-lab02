package task4

import org.junit.Assert._
import org.junit.Test
import task4.Es7.* 

class GeometricShapesTest :

  @Test
  def testRectangleArea() = 
    val rectangle = Shape.Rectangle(5, 3)
    assertEquals(15, Shape.area(rectangle), 0.01)


  @Test
  def testCircleArea() = 
    val circle = Shape.Circle(4)
    assertEquals(Math.PI * 16, Shape.area(circle), 0.01)

  @Test
  def testSquareArea() =
    val square = Shape.Square(6)
    assertEquals(36, Shape.area(square), 0.01)

  @Test
  def testRectanglePerimeter() = 
    val rectangle = Shape.Rectangle(5, 3)
    assertEquals(16, Shape.perimeter(rectangle), 0.01)

  @Test
  def testCirclePerimeter() = 
    val circle = Shape.Circle(4)
    assertEquals(2 * Math.PI * 4, Shape.perimeter(circle), 0.01)

  @Test
  def testSquarePerimeter() = 
    val square = Shape.Square(6)
    assertEquals(24, Shape.perimeter(square), 0.01)

  @Test
  def testScale() = 
    val rectangle = Shape.Rectangle(5, 3)
    val scaledRectangle = Shape.scale(rectangle, 2)
    assertEquals(Shape.Rectangle(10, 6), scaledRectangle)

    val circle = Shape.Circle(4)
    val scaledCircle = Shape.scale(circle, 2)
    assertEquals(Shape.Circle(8), scaledCircle)

    val square = Shape.Square(6)
    val scaledSquare = Shape.scale(square, 2)
    assertEquals(Shape.Square(12), scaledSquare)


