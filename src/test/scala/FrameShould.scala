import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers._
import org.scalatest.funsuite.AnyFunSuite

class FrameShould extends AnyFunSuite {
  test("store the score of a turn with two rolls") {
    val expected1stRoll: Score = Roll(2)
    val expected2ndRoll: Score = Roll(4)

    val frame = Frame().setFirstRollScore(expected1stRoll).setSecondRollScore(expected2ndRoll)

    val actualFirstRoll: Score = frame.firstScore.get
    val actualSecondRoll: Score = frame.secondScore.get

    assertThat("first roll", actualFirstRoll, equalTo(expected1stRoll))
    assertThat("second roll", actualSecondRoll, equalTo(expected2ndRoll))
  }

  test("store strike score") {
    val frame = Frame().setFirstRollScore(Strike())
    assert(frame.firstScore.isInstanceOf[Option[Strike]])
    assert(frame.secondScore.isEmpty)
  }

  test("store spare score") {
    val frame = Frame().setFirstRollScore(Roll(2)).setSecondRollScore(Spare())
    assert(frame.firstScore.get == Roll(2))
    assert(frame.secondScore.isInstanceOf[Option[Spare]])
  }

  test("store foul") {
    val frame = Frame().setFirstRollScore(Foul()).setSecondRollScore(Roll(5))
    assert(frame.firstScore.isInstanceOf[Option[Foul]])
    assert(frame.secondScore.get == Roll(5))
  }

  test("store miss") {
    val frame = Frame().setFirstRollScore(Miss())
    assert(frame.firstScore.isInstanceOf[Option[Foul]])
  }
}
