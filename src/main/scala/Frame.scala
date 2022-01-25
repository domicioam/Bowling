class Frame(val firstScore: Option[Score], val secondScore: Option[Score]) {
  def setSecondRollScore(rollScore: Score): Frame = Frame(firstScore, Some(rollScore))
  def setFirstRollScore(score: Score): Frame = Frame(Some(score), secondScore)
}

object Frame {
  def apply() = new Frame(None, None)
  def apply(firstScore: Option[Score], secondScore: Option[Score]) = new Frame(firstScore, secondScore)
}
