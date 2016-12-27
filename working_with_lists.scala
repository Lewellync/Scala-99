
// Scala 01
def last[A](ls: List[A]): [A] =
  ls match {
    case h :: Nil   => h
    case _ :: tail  => last(tail)
    case _          => throw new NoSuchElementException
  }
