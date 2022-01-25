class Game(players: List[Player], scoreBoard: ScoreBoard) {
  def roll(player: Player, pinsKnockedDown: Int): Game = {
    val newScoreBoard = scoreBoard.addEntry(player, Roll(pinsKnockedDown))
    Game(players, newScoreBoard)
  }
  def score(player: Player): Int = scoreBoard.score(player)
}

object Game {
  def apply(players: List[Player], scoreBoard: ScoreBoard): Game = new Game(players, scoreBoard)
}
