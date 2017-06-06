import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

/**
 * Created by LXC on 2017/5/10.
 */

fun test(string: String): Long? {
  val c = Customer(string, "email", 999L)
  println(c.name)
  return c.age
}

data class Customer(var name: String, var email: String, var age: Long)

var x: IntArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

var y: MutableList<String> = mutableListOf()

private val FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")

class MyClass {

  var id: Long = 0

  var createTime: LocalDateTime? = LocalDateTime.now()

  var list: MutableList<Long>? = mutableListOf(1)
}

fun main(args: Array<String>) {
  y.add("Created by LXC on 2017/5/10.")

  println(y.size)

  for (a in y) {
    println(a)
  }

  println()

  for (c in x) {
    println(c.plus(10))
  }

  println(test("LXC"))

  val a: MyClass = MyClass()

  a.id = 1

  for (i in 1..100) {
    a.list!!.add(i.toLong())
  }

  println(a.list)

  println(FORMATTER.format(a.createTime))
}