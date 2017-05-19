package ddct


/**
  * Created by darbyrob on 08/02/2017.
  */

import org.scalatest.FunSuite
import ddct.Deck._

class DeckTestFunSuite extends FunSuite {

  val deck: List[Card] = newDeck

  test("Deck should not be empty") {
    assert(newDeck.nonEmpty)
  }

  test("Deck should contain 52 Cards") {
    assert(newDeck.length == 52)
  }

  test("Deck should be able to shuffled") {
    assert(shuffle(deck) != deck)
  }

  test("CreateHand should create a hand of 5 Cards") {
    assert(createHand(deck).length == 5)
  }

  test("Deal should return a List of Players with Hands") {
    assert(deal(deck, 1).length == 1)
  }

  test("Deal should not deal to more than 4 players") {
    assert(deal(deck, 5).isEmpty)
  }
}
