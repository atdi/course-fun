object session {

  def abs(x: Double) = if (x < 0) -x else x

  def sqrt(x: Double) = {

    def isGoodEnough(guess: Double) =
      abs(guess * guess - x) == 0.00


    def improve(guess: Double): Double =
      (guess + x / guess) / 2

    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess))
        guess
      else
        sqrtIter(improve(guess))

    sqrtIter(1.0)
  }


  sqrt(2)
  sqrt(4)


}