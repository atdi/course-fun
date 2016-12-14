package week3

/**
  * Created by avramesc on 11/17/2016.
  */
class Rational(x: Int, y: Int) {

  def this(x: Int) = this(x, 1)

  require(y != 0, "denominator must be nonzero")

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  def numer = x

  def denom = y

  def less(that: Rational) = numer * that.denom < that.numer * denom

  def max(that: Rational) = if (this.less(that)) that else this

  def add(that: Rational) =
    new Rational(numer * that.denom + that.numer * denom,
      denom * that.denom)

  def sub(that: Rational) = add(that.neg)

  def mul(that: Rational) =
    new Rational(numer * that.numer,
      denom * that.denom)

  def neg: Rational = new Rational(-numer, denom)

  override def toString: String = {
    val g = gcd(numer, denom)
    numer / g + "/" + denom / g
  }
}
