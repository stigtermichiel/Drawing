import org.scalatest.FunSpec

class DisplayTest extends FunSpec {

  val canvas = Canvas.create(80,80)

  val display = new Display(canvas)
  val rect = new Rectangle(canvas)
  val re = rect.drawRectangle(5,5,50,50)
  val x = new BucketFill(re)
  val withBuc = x.bucketFill(1,1,'O')
  val displayBuc = new Display(withBuc)

//  describe("Display") {
//    assert(display.display ===
//      """
//        |   _ _ _ _
//        |  |        |
//        |  |        |
//        |  |        |
//        |  |        |
//        |   _ _ _ _""".stripMargin)
//
//  }

  describe("with bucketfill") {
    assert(displayBuc.display === "")
  }


}
