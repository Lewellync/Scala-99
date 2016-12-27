
def length1[A](ls: List[A]): Int =
  ls.length

def length2[A](ls: List[A]): Int = {
  def length(len: Int, ls: List[A]): Int = {
    if (ls.isEmpty) len
    else length(len + 1, ls.drop(1))
  }
  length(0, ls)
}

// Pattern matching recursion
def lengthRecursive[A](ls: List[A]): Int =
  ls match {
    case Nil        => 0
    case _ :: tail  => 1 + lengthRecursive(tail)
  }

// Tail recursive solution
def lengthTailRecursive[A](ls: List[A]): Int = {
  def lengthTR(result: Int, curList: List[A]): Int = {
    curList match {
      case Nil        => result
      case _ :: tail  => lengthTR(result + 1, tail)
    }
  }
  lengthTR(0, ls)
}

// Pure functional solutions with FOLDS (don't know these yet)
def lengthFunctional[A](ls: List[A]): Int = ls.foldLeft(0) { (c, _) => c + 1 }

val temp = List(2,4,5,6,1,123,41,3)

println(length1(temp))
println(length2(temp))
println(lengthRecursive(temp))
println(lengthTailRecursive(temp))
println(lengthFunctional(temp))
