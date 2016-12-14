object morelists {
  def init[T](xs: List[T]): List[T] = xs match {
    case List() => throw new Error("init of empty list")
    case List(x) => List()
    case y :: ys => y :: init(ys)
  }

  def concat[T](xs: List[T], ys: List[T]): List[T] = xs match {
    case List() => ys
    case z :: zs => concat(zs, ys)
  }

  def reverse[T](xs: List[T]): List[T] = xs match {
    case List() => List()
    case y :: ys => reverse(ys) ++ List(y)
  }

  def removeAt[T](n: Int, xs: List[T]) = (xs take n) ::: (xs drop n + 1)

  //def flatten(xs: List[Any]): List[Any] = ???

  //flatten(List(List(1, 1), 2, List(3, List(5, 8))))
}
