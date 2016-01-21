class Deck {
  val cards: Seq[Card] = Range(0,52).map(Card(_))
}

object Deck {
  val suits = Map(
    0 -> "Spade",
    1 -> "Heart",
    2 -> "Diamond",
    3 -> "Club"
  )

  val ranks = Map(
    0 -> "2",
    1 -> "3",
    2 -> "4",
    3 -> "5",
    4 -> "6",
    5 -> "7",
    6 -> "8",
    7 -> "9",
    8 -> "Ten",
    9 -> "Jack",
    10 -> "Queen",
    11 -> "King",
    12 -> "Ace"
  )
}
