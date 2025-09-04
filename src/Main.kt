//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
* Student: Elena Usova
* Date: Sept 4th, 2025
* Course: CIS 3515
* */

fun main() {

    //create instances
    val mySquare = Square("Square", 10.0)
    val myCircle = Circle("Circle",  4.0)
    val myTriangle = Triangle("Triangle", 7.0, 8.0)
    val myEquilateralTriangle = EquilateralTriangle("Equilateral Triangle", 5.0)

    //output results
    println("Dimensions:")
    mySquare.printDimensions()
    myCircle.printDimensions()
    myTriangle.printDimensions()

    println("*********************************")
    println("Areas:")
    println("Square area is ${mySquare.getArea()}")
    println("Circle area is ${myCircle.getArea()}")
    println("Triangle area is ${myTriangle.getArea()}")
    println("Equilateral Triangle are is ${myEquilateralTriangle.getArea()}")

}// end main