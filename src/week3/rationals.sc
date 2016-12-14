import week3.Rational

object rationals {
  val x = new Rational(1, 3)
  val y = new Rational(5, 7)
  val z = new Rational(3, 2)

  x.sub(y).sub(z)
  y.add(y)
  x.max(y)
  def error(msg: String) = throw new Error(msg)

  if (true) 1 else false
}


