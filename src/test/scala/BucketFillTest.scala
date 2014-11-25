import org.scalatest.FunSpec

class BucketFillTest extends FunSpec {

  describe("BucketFill") {
    val bucket = new BucketFill(Canvas.create(10, 10))

    describe("it can fill an empty canvas with a color") {
      assert(bucket.bucketFill(1,1,'o') === Vector(Vector('o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o'), Vector('o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o'), Vector('o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o'), Vector('o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o'), Vector('o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o'), Vector('o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o'), Vector('o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o'), Vector('o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o'), Vector('o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o'), Vector('o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o')))
    }

    describe("it can fill the right canvas") {
      val rec = new Rectangle(Canvas.create(10,10))
      val x = rec.drawRectangle(3,3,7,7)
      assert(new BucketFill(x).bucketFill(1,1,'c') === Vector(Vector('c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c'), Vector('c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c'), Vector('c', 'c', 'x', 'x', 'x', 'x', 'x', 'c', 'c', 'c'), Vector('c', 'c', 'x', ' ', ' ', ' ', 'x', 'c', 'c', 'c'), Vector('c', 'c', 'x', ' ', ' ', ' ', 'x', 'c', 'c', 'c'), Vector('c', 'c', 'x', ' ', ' ', ' ', 'x', 'c', 'c', 'c'), Vector('c', 'c', 'x', 'x', 'x', 'x', 'x', 'c', 'c', 'c'), Vector('c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c'), Vector('c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c'), Vector('c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c')))
    }
  }

}
