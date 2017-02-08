package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if(c == r || c == 0) 1
      else pascal( c-1, r-1 ) + pascal (c ,r-1)
    }
  
  /**
   * Exercise 2
   */
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
  
  /**
   * Exercise 3
   */
    def countChange(amount: Int, coins: List[Int]): Int =  {
      if (amount < 0) 0
      else if (amount == 0) 1
      else if ( coins.nonEmpty && amount > 0)
        countChange(amount - coins.head, coins) + countChange(amount, coins.tail)
      else 0
    }
  }
