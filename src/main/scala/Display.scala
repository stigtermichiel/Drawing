import Canvas.Canvas

class Display(canvas: Canvas) {
  def display = {
    top
    inside
    top
  }.toString

  def inside = canvas.foreach { case a => print("|"); a foreach { b => print(b.toString + " ")}; print("| " + '\n')}.toString

  def top = {
    (1 to canvas(0).length).foreach { case a => print(" _")}
    print("" + '\n')
  }
}

