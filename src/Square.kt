//Define the Square class
class Square (_name: String, _sideLength: Double): Shape (_name) {

    val sideLength = _sideLength

    override fun getArea() :Double {

        return sideLength * sideLength

    }//end override fun getArea()

    override fun printDimensions() {

        println("$name has side length $sideLength");

    }//end fun printDimensions()

}//end class Square