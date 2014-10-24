import kotlin.test.assertEquals
import org.jetbrains.spek.api.Spek

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
