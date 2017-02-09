package ddct

import scala.util.Random

/**
  * Created by darbyrob on 08/02/2017.
  */
trait Deck {
  val suites = List("Spades", "Hearts", "Clubs", "Diamonds")
  val faces  = List("Two", "Three", "Four", "Five", "Six",
    "Seven", "Eight", "Nine", "Ten", "Jack",
    "Queen", "King", "Ace")

  def shuffle(deck: List[Card]): List[Card] = {
    Random.shuffle(deck)
  }

  def deal(deck: List[Card], noOfPlayers: Int) = {
    for (p <- 1 to noOfPlayers; if noOfPlayers <= 4) yield {
      val hand = createHand(deck)
      new Player(hand)
    }
  }

  def createHand(deck: List[Card]) : List[Card]= {
    val shuffledDeck = shuffle(deck)
     shuffledDeck.take(5)
  }
}

object Deck extends Deck {
  def newDeck = for (s <- suites; f <- faces) yield Card(s, f)
}
