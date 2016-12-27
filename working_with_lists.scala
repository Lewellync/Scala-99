
// Scala 01
def last[A](ls: List[A]): [A] =
  ls match {
    case h :: Nil   => h
    case _ :: tail  => last(tail)
    case _          => throw new NoSuchElementException
  }

// Scala 02
def penultimate[A](ls: List[A]): A =
  ls match {
    case h :: _ :: Nil  => h
    case _ :: tail      => penultimate(tail)
    case _              => throw new NoSuchElementException
  }

// Scala 03
def nth[A](index: Int, ls: List[A]): A =
  (index, ls) match {
    case (0, h :: _   ) => h
    case (n, h :: tail) => nth(n - 1, tail)
    case (_, Nil      ) => throw new NoSuchElementException
  }
