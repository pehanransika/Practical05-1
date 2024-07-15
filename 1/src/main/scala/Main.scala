import scala.io.StdIn.readLine

object InventoryManagement {

  def getProductList(): List[String] = {
    var products = List[String]()
    var input = ""

    while (input != "done") {
      input = readLine("Enter Product Name (Enter 'done' to finish) - ")
      if (input != "done") {
        products = products :+ input
      }
    }
    products
  }

  def printProductList(products: List[String]): Unit = {
    for (i <- products.indices) {
      println(s"${i + 1}. ${products(i)}")
    }
  }

  def getTotalProducts(products: List[String]): Int = {
    products.length
  }

  def main(args: Array[String]): Unit = {
    val productList = getProductList()
    println("\nProducts - ")
    printProductList(productList)
    println(s"\nTotal No of Products ${getTotalProducts(productList)}")
  }
}
