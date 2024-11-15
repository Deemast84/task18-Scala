
object StringProcessor {
  // Переделал функцию  'processStrings' использовав методы filter и map вместо цикла for и
  // изменяемой переменной result
  def processStrings(strings: List[String]): List[String] = {
    strings.filter(_.length > 3).map(_.toUpperCase)
  }

  def main(args: Array[String]): Unit = {
    val strings = List("apple", "cat", "banana", "dog", "elephant")
    val processedStrings = processStrings(strings)
    println(s"Processed strings: $processedStrings")
  }
}