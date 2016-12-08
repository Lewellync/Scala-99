def last1[A](ls: List[A]): A = {
  ls.last
}

def last2[A](ls: List[A]): A = {
  ls(ls.length-1)
}

// Nice and fancy method
def last3[A](ls: List[A]): A = ls match {
  case h :: Nil   => h
  case _ :: tail  => last3(tail)
  case _          => throw new NoSuchElementException
}

val temp = List(1,2,3,4,5,6,7,4)

println(last1(temp))
println(last2(temp))
println(last3(temp))
