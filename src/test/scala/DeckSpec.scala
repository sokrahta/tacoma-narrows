import org.scalatest.{FunSuiteLike, Matchers}

class DeckSpec extends FunSuiteLike with Matchers {
  test("playing with a full deck of cards") {
    val deck = new Deck
    deck.cards.length should be(52)

    val uniqueCards = deck.cards.groupBy(c => c)
    uniqueCards.forall(_._2.length == 1) should be(right = true)
  }
}
