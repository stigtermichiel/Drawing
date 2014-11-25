object Canvas {
  type Canvas = Vector[Vector[Char]]

  def create(horizontal: Int, vertical:Int, char: Char = ' ') = {
    require(horizontal > 0 & vertical > 0, "Please put in a non-zero, non-negative Integers")
    Vector.fill(vertical, horizontal)(char)
  }
}


