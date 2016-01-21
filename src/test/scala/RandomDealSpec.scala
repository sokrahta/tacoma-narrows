import org.scalatest.{FunSuiteLike, Matchers}

class RandomDealSpec extends FunSuiteLike with Matchers {
  test("print me a random hand") {
    println(RandomDeal(13).english)
  }
}
