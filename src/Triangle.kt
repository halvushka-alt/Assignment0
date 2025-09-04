//Define the Triangle Class
open class Triangle (_name:String, _base:Double, _height:Double) : Shape (_name) {

    val base = _base
    val height = _height

    override fun getArea(): Double {

        return 0.5 * base * height

    }// end fun getArea()

    override fun printDimensions() {

        println("$name has base $base and height $height");

    }//end fun printDimensions()

}//end class Triangle