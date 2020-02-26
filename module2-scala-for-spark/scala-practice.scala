// Databricks notebook source
println("Hello World!")
println(10)

// COMMAND ----------

print("hello world!")
print(10)

// COMMAND ----------

val x = 10
x = 20
var y = 10
y = 20

// COMMAND ----------

val z: Int = 10
val a: Double = 1.0

// COMMAND ----------

val b: Double = 10

// COMMAND ----------

10 > 5

// COMMAND ----------

6/4

// COMMAND ----------

'a'

// COMMAND ----------

"a"

// COMMAND ----------

"hello world".length

// COMMAND ----------

"hello world".substring(2,6)

// COMMAND ----------

"hello world".replace("e", "3")

// COMMAND ----------

"hello world".take(5)

// COMMAND ----------

"hello world".drop(5)

// COMMAND ----------

val n = 45
s"We have $n apples"

// COMMAND ----------

s"Power of 2: ${math.pow(2,2)}"

// COMMAND ----------

"They stood outside the \"Rose and Crown\""

// COMMAND ----------

def sumOfSquares(x: Int, y: Int): Int = {
  val x2 = x*x
  val y2 = y*y
  x2+y2
}

// COMMAND ----------

sumOfSquares(2,2)

// COMMAND ----------

def sumOfSquaresShort(x: Int, y: Int): Int = x*x + y*y
sumOfSquaresShort(2,2)

// COMMAND ----------

def subtract(x: Int, y: Int): Int = x - y
subtract(10,5)

// COMMAND ----------

subtract(y=10,x=5)

// COMMAND ----------

def sq(x: Int) = x*x
sq(2)

// COMMAND ----------

def addWithDefault(x: Int, y: Int = 5) = x + y
addWithDefault(1,2)

// COMMAND ----------

addWithDefault(1)

// COMMAND ----------

(x: Int) => x*x
val sq: Int => Int = x => x * x
sq(10)

// COMMAND ----------

val addOne: Int => Int = _ + 1
val weirdSum: (Int, Int) => Int = (_*2+_*3)
addOne(5)

// COMMAND ----------

weirdSum(2,4)

// COMMAND ----------

1 to 5

// COMMAND ----------

val r = 1 to 5
r.foreach(println)

// COMMAND ----------

r foreach println

// COMMAND ----------

(5 to 1 by -1) foreach (println)

// COMMAND ----------

def showNumbersInRange(a: Int, b: Int): Unit = {
  print(a)
  if (a < b)
    showNumbersInRange(a + 1, b)
}
showNumbersInRange(1, 14)

// COMMAND ----------

val x = 10
if (x == 1) println("yeah")
if (x == 10) println("yeah") else println("nay")

// COMMAND ----------

println(if (x == 10) "yeah" else "nope")

// COMMAND ----------

val text = if (x == 10) "yeah" else "nope"

// COMMAND ----------

val a = Array(1,2,3,5,8,13)
a(0)
a(3)

// COMMAND ----------

a(21)

// COMMAND ----------

val s = Set(1,3,7,7)
s

// COMMAND ----------

s(0)

// COMMAND ----------

s(7)

// COMMAND ----------

(1,2)

// COMMAND ----------

(a, 2, "three")

// COMMAND ----------

val divideInts = (x: Int, y: Int) => (x/y, x%y)
divideInts(10,3)

// COMMAND ----------

val d = divideInts(10,3)
d._1

// COMMAND ----------

val (div, mod) = divideInts(10, 3)
div

// COMMAND ----------

val add10: Int => Int = _ + 10
List(1,2,3) map add10

// COMMAND ----------

List(1,2,3) map (x=> x+10)

// COMMAND ----------

List(1,2,3) map (_+10)

// COMMAND ----------

List("A","B","C") foreach println

// COMMAND ----------

s.map(sq)

// COMMAND ----------

val sSquared = s.map(sq)

// COMMAND ----------

sSquared.filter(_<10)

// COMMAND ----------

sSquared.reduce(_+_)

// COMMAND ----------

case class Person(name:String, age:Int)
List(
  Person(name="Dom", age=23),
  Person(name="Bob", age=30)
).filter(_.age > 25)

// COMMAND ----------

val aListOfNumbers = List(1,2,3,4,10,20,100)
aListOfNumbers foreach (x=>println(x))

// COMMAND ----------


