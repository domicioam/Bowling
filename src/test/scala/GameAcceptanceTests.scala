import org.hamcrest.MatcherAssert._
import org.hamcrest.core.IsEqual._
import org.scalatest.funsuite.AnyFunSuite

class GameAcceptanceTests extends AnyFunSuite {
  test("score should be the sum of the two rolls after one turn") {
    val player = Player("player 1")
    val players = List(player)
    val scoreBoard = ScoreBoard()
    val game = Game(players, scoreBoard)
    game.roll(player, 3)
    game.roll(player, 4)
    val score = game.score(player)
    assertThat(score, equalTo(7))
  }

  test("should calculate spare score") {
    val player = Player("player 1")
    val players = List(player)
    val scoreBoard = ScoreBoard()
    val game = Game(players, scoreBoard)
      .roll(player, 3)
      .roll(player, 7)
      .roll(player, 2)
      .roll(player, 5)
    val score = game.score(player)
    assertThat(score, equalTo(19))
  }
}
