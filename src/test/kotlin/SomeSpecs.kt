import org.spek.Spek
import kotlin.test.assertEquals

class SomeSpecs : Spek() {{
  given("与える条件はこれ") {
    val foo = "hogehoge"
    on("こんなとき") {
      val boo = "hogehoge"
      it("foo と boo はいっしょ") {
        assertEquals(foo, boo)
      }
    }
  }
}
}
