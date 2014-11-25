import Canvas.Canvas

object Run {

  def runProgram(canvas: Canvas, string: String = "Please enter your command"): Canvas = {
    new Display(canvas).display
    println(string)
    val input = userInput
    try {
      input match {
        case x if x(0) == 'C' => runProgram(Canvas.create(x(1), x(2)))
        case x if x(0) == 'L' => runProgram(new Line(canvas).drawsLine(x(1), x(2), x(3), x(4)))
        case x if x(0) == 'R' => runProgram(new Rectangle(canvas).drawRectangle(x(1), x(2), x(3), x(4)))
        case x if x(0) == 'B' => runProgram(new BucketFill(canvas).bucketFill(x(1), x(2), x(3).asInstanceOf[Char]))
        case x if x(0) == 'Q' => canvas
      }
    } catch {
      case _ => runProgram(canvas, "Try Again please")
    }
  }

  def userInput = Console.readLine().split(' ').map { x => try {
    x.toInt
  } catch {
    case y: NumberFormatException => x.charAt(0)
  }
  }

  def createCanvas(string: String = "Please create a canvas by filling in command"): Canvas = {
    println(string)
    val x = userInput
    try {
      Canvas.create(x(1), x(2))
    } catch {
      case _ => createCanvas("Please Try Again")
    }
  }

  def main(args: Array[String]) {
    runProgram(createCanvas())
  }

}