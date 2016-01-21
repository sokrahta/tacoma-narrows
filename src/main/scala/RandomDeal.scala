import scala.util.Random

case class RandomDeal(length: Int) {
  val cards = Random.shuffle((new Deck).cards)
    .take(length).sorted

  def english: String = {
    val suited = cards.groupBy(_.suit).map {
      case (suit, ranks) =>
        val s = Deck.suits(suit).take(1)
        val v = ranks.sortWith((a,b) => a.rank > b.rank).map(card => Deck.ranks(card.rank).take(1)).mkString("")
        suit -> s"$s$v"
    }

    Seq(
      suited.getOrElse(0, "S-"),
      suited.getOrElse(1, "H-"),
      suited.getOrElse(2, "D-"),
      suited.getOrElse(3, "C-")
    ).mkString(" ")
  }
}
