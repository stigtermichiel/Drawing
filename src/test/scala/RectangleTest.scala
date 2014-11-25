import org.scalatest.FunSpec

class RectangleTest extends FunSpec {

  describe("Rectangle") {

    val rectangle = new Rectangle(Canvas.create(4,4))

    describe("Given horizontal params") {
      it("updates a canvas with a line") {
        assert(rectangle.drawRectangle(1,1,4,4) === Vector(Vector('x', 'x', 'x', 'x'), Vector('x', ' ', ' ', 'x'), Vector('x', ' ', ' ', 'x'), Vector('x', 'x', 'x', 'x')))
      }
    }

    describe("Given params the other way around") {
      it("updates a canvas with a rectangle") {
        assert(rectangle.drawRectangle(4,4,1,1) === Vector(Vector('x', 'x', 'x', 'x'), Vector('x', ' ', ' ', 'x'), Vector('x', ' ', ' ', 'x'), Vector('x', 'x', 'x', 'x')))
      }
    }

  }

}

