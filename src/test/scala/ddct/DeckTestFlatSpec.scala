package ddct

/**
  * Created by darbyrob on 09/05/2017.
  */

import ddct.Deck._
import org.scalatest._

class DeckTestFlatSpec extends FlatSpec with Matchers {

  val deck: List[Card] = newDeck

  "Deck" should "not be empty" in {
    assert(newDeck.nonEmpty)
  }

  it should "contain 52 cards" in {
    assert(newDeck.length == 52)
  }

  it should "be able to be shuffled" in {
    assert(shuffle(deck) != deck)
  }

  "CreateHand" should "create a hand of 5 Cards" in {
    assert(createHand(deck).length == 5)
  }

  "Deal" should "return a List of Players with Hands" in {
    assert(deal(deck, 1).length == 1)
  }

  it should "not deal to more than 4 players" in {
    assert(deal(deck, 5).isEmpty)
  }
}