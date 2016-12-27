
// Scala 01
def last[A](ls: List[A]): A =
  ls match {
    case h :: Nil   => h
    case _ :: tail  => last(tail)
    case _          => throw new NoSuchElementException
  }


// The one that breaks with literally any checking
def penultimate1[A](ls: List[A]): A =
  ls(ls.length-2)

// My attempt at copying pattern matching from the previous example
def penultimate2[A](ls: List[A]): A =
  ls match {
    case h :: t :: Nil  => h
    case h :: tail      => penultimate2(tail)
    case h :: Nil       => throw new IndexOutOfBoundsException
    case _              => throw new NoSuchElementException
  }

// Different idea, utilize previous function
def penultimate3[A](ls: List[A]): A =
  last(ls.dropRight(1))

// Actual answer

val temp = List(1)

//println(penultimate1(temp))
println(penultimate2(temp))
println(penultimate3(temp))
