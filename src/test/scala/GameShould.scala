import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.scalatest.funsuite.AnyFunSuite

class GameShould extends AnyFunSuite{
  test("store player score in scoreboard") {
    val scoreBoard = ScoreBoard()
    val player1 = Player("player 1")
    val players = List(player1)
    val game = Game(players, scoreBoard)
    game.roll(player1, 5)
    assertThat(game.score(player1), equalTo(5))
  }
}
