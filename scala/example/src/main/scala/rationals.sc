object exercise{
  val x = new Rationals(1,2)
  val y = new Rationals(1,2)
  x.suma(y)


}

class Rationals(x : Int, y : Int) {
  def numerador = x
  def denominador = y

  def suma(that: Rationals) =
    new Rationals(
      numerador * that.denominador  + that.numerador * denominador,
      denominador * that.denominador
    )
  override def toString = numerador + "/" + denominador
}

