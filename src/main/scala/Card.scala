case class Card(suit: Int, rank: Int) {
  private val i: Int = suit * 13 + rank

  val english: String = s"${Deck.suits(suit)} ${Deck.ranks(rank)}"
}

object Card {
  implicit def ordering[A <: Card]: Ordering[A] = new Ordering[A] {
    override def compare(x: A, y: A): Int = x.i.compareTo(y.i)
  }

  def apply(i: Int): Card = {
    if (i >= 0 && i < 52) Card(i / 13, i % 13)
    else throw new IllegalArgumentException("There are only 52 cards in the deck")
  }
}
