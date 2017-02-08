object  exercise {
  def balance(chars: List[Char]): Boolean = {
    def isBalanced(chars: List[Char], balancer: Int): Boolean = {
      if (chars.isEmpty) balancer == 0
      else {
        if (chars.head == '(') isBalanced(chars.tail, balancer + 1)
        else {
          if (chars.head == ')') balancer > 0 && isBalanced(chars.tail, balancer - 1)
          else isBalanced(chars.tail, balancer)
        }
      }
    }
  isBalanced(chars,0)
  }
  balance(":-)".toList)
  balance("()".toList)
  balance(")(".toList)
  balance("(if (zero? x) max (/ 1 x))".toList)
  balance("I told him (that it’s not (yet) done). (But he wasn’t listening)".toList)

}