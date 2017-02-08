object excercise {
  def coinChange(amount :Int, coins : List[Int]): Int = {
    //def loop(amount: Int, coins: List[Int], res: Int): Int = {
      if (amount < 0) 0
      else if (amount == 0) 1
      else if ( coins.nonEmpty && amount > 0)
     // loop(amount - coins(res), coins, res) + loop(amount, coins, res + 1)
      coinChange(amount - coins.head, coins) + coinChange(amount, coins.tail)
      else 0
    //}
    //loop(amount,coins,1)
  }
  coinChange(4,List(1,2))
  coinChange(300,List(5,10,20,50,100,200,500))
}