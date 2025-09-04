//Define the EquilateralTriangle Class
class EquilateralTriangle (_name: String, _sideLength: Double) : Triangle (_name, _sideLength, _sideLength) {

    val sideLength = _sideLength

    override fun getArea(): Double {

        return (Math.sqrt(3.0)/4.0) * sideLength * sideLength

    }//end fun getArea()

    override fun printDimensions() {

        println("$name has side length $sideLength")

    }//end fun printDimensions

}// end class EquilateralTriangle