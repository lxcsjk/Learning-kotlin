/**
 * Created by LXC on 2017/5/10.
 */

fun main(args: Array<String>) {
  test("Hello World")
}

fun test(string: String) {
  val c = Customer(string, "email", "age")
  println(c.name)
}

data class Customer(val name: String, val email: String, val age: String)