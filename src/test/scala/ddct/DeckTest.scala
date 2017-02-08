package ddct

import org.scalatest.FunSuite
import ddct.Deck._

/**
  * Created by darbyrob on 08/02/2017.
  */

class DeckTest extends FunSuite {

  val deck = newDeck

  test("Deck should not be empty") {
    assert(!newDeck.isEmpty)
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

  test("Deal should not deal to more than 5 players") {
    assert(deal(deck, 6).length == 0)
  }
}
