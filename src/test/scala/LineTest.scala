class LineTest extends org.scalatest.FunSpec {

    val line = new Line(Canvas.create(4, 4))

    describe("Given horizontal params") {
      it("updates a canvas with a line") {
        assert(line.drawsLine(1, 1, 4, 1) === Vector(Vector('x', 'x', 'x', 'x'), Vector(' ', ' ', ' ', ' '), Vector(' ', ' ', ' ', ' '), Vector(' ', ' ', ' ', ' ')))
      }
    }

    describe("Given zero or negative params") {
      intercept[IndexOutOfBoundsException] {
      line.drawsLine(-1, 2, -1, 2)
      }
    }

    describe("Given vertical params") {
      it("updates a canvas with a vertical line") {
        assert(line.drawsLine(1,1,1,4) === Vector(Vector('x', ' ', ' ', ' '), Vector('x', ' ', ' ', ' '), Vector('x', ' ', ' ', ' '), Vector('x', ' ', ' ', ' ')))
      }
    }

}
