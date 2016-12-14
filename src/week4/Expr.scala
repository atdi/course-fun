package week4

/**
  * Created by avramesc on 11/23/2016.
  */
trait Expr {

}

case class Number(n: Int) extends Expr {}

case class Sum(e1: Expr, e2: Expr) extends Expr {}
