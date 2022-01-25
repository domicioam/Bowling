import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.scalatest.funsuite.AnyFunSuite

class ScoreBoardShould extends AnyFunSuite {
  test("add score entry to board") {
    val player = Player("player")
    val scoreBoard = ScoreBoard()
    val score = scoreBoard.addEntry(player, Roll(5)).score(player)
    assertThat(score, equalTo(5))
  }
}
