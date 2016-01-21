import org.scalatest.{FunSuiteLike, Matchers}

class CardSpec extends FunSuiteLike with Matchers {
  test("ace of spades") {
    val card = Card(12)
    card.suit should be(0)
    card.rank should be(12)
    card.english should be("Spade Ace")
  }

  test("king of hearts") {
    val card = Card(24)
    card.suit should be(1)
    card.rank should be(11)
    card.english should be("Heart King")
  }

  test("queen of diamonds") {
    val card = Card(36)
    card.suit should be(2)
    card.rank should be(10)
    card.english should be("Diamond Queen")
  }

  test("jack of clubs") {
    val card = Card(48)
    card.suit should be(3)
    card.rank should be(9)
    card.english should be("Club Jack")
  }

  test("sortable") {
    Seq(42,13).map(Card(_)).sorted should be(Seq(Card(13), Card(42)))
  }
}
