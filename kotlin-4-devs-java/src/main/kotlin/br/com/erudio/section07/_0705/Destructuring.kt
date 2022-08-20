package br.com.erudio.section07._0705

fun main() {

    //showComponents()

    val c1 = Coordinates(200, 100)
    val c2 = Coordinates(1000, 2000)
    val c3 = c1 + c2
    val c4 = c1.plus(c2)

    println("c3 = $c3")
    println("c4 = $c4")

    val (xCoordinate, yCoordinate) = c2

    println("xCoordinate = $xCoordinate, yCoordinate = $yCoordinate")
    //println("xCoordinate component1() = ${c3.component1()}")
    //println("yCoordinate component2() = ${c3.component2()}")

}

fun showComponents() {
    val myPoint = Point(5000, 500, 60000)
    val (myX, myY, myZ) = myPoint
    println("myX = $myX, myY = $myY, myZ = $myZ")
}