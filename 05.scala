
def reverse1[A](ls: List[A]): List[A] =
  ls match {
    case Nil        => Nil
    case h :: tail  => reverse1(tail) ::: List(h)
  }

def reverse2[A](ls: List[A]): List[A] = {
  def reverse[A](ls: List[A], curList: List[A]): List[A] = {
    ls match {
      case Nil        => curList
      case h :: tail  => reverse(tail, h :: curList)
    }
  }

  reverse(ls, Nil)
}

val temp = List(1,3,5,7,9)

println(reverse1(temp))
println(reverse2(temp))
