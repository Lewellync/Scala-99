
def nth1[A](index: Int, ls: List[A]): A =
  if(index >= 0) ls(index)
  else throw new NoSuchElementException

// Pattern matching!
def nth2[A](index: Int, ls: List[A]): A =
  (index, ls) match {
    case (0, h :: _   ) => h
    case (n, _ :: tail) => nth2(n - 1, tail)
    case (_, Nil      ) => throw new NoSuchElementException
  }

// Recursion without pattern matching!
def nth3[A](index: Int, ls: List[A]): A =
  if (index == 0) ls(0)
  else nth3(index - 1, ls.drop(1))

val temp = List(1,2,3,4,5,6,7)

println(nth1(3, temp))
println(nth2(3, temp))
println(nth3(3, temp))
