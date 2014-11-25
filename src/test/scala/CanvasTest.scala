class CanvasTest extends org.scalatest.FunSpec {

  describe("A Canvas") {
    describe("when initialized with params 0 and 0") {

      it("should produce NoSuchElementException when initialized with params of zero or below") {
        intercept[IllegalArgumentException] {
          Canvas.create(-1, -1)
        }
      }

      it("instantiates as a vector of vector of Chars, of length x and width y") {
          assert(Canvas.create(2,3) === Vector(Vector(' ', ' '), Vector(' ', ' '), Vector(' ', ' ')))
      }


    }
  }
}


