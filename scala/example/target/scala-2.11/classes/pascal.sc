object exercise {
  def loop(c : Int, r : Int): Int = {
    if(c == r || c == 0) 1
    else loop( c-1, r-1 ) + loop (c ,r-1)
  }
  loop(0,0)
  loop(0,1)
  loop(1,1)
  loop(0,2)
  loop(1,2)
  loop(2,2)
  loop(0,3)
  loop(1,3)
  loop(2,3)
  loop(3,3)
}