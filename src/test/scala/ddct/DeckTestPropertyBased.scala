package ddct

import org.scalatest.{FlatSpec, Matchers}
import org.scalatest.prop.GeneratorDrivenPropertyChecks
import ddct.Deck._
import org.scalacheck.Gen
/**
  * Created by darbyrob on 11/05/2017.
  */
class DeckTestPropertyBased extends FlatSpec with Matchers with GeneratorDrivenPropertyChecks {

  val deck: List[Card] = newDeck
  val playersGen = Gen.choose(1, 4)

  "Deck" should "" in {
    forAll(deck, playersGen) { (a: List[Card], b: Int) =>

    }
  }



}
