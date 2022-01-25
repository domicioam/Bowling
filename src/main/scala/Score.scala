trait Score

case class Strike() extends Score
case class Spare() extends Score
case class Roll(val value: Int) extends Score
case class Foul() extends Score
case class Miss() extends Score
