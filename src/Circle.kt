//Define the Circle Class
class Circle (_name: String, _radius: Double): Shape(_name) {

    var radius = _radius

    override fun getArea(): Double {

        return Math.PI * radius * radius

    }//end fun getArea()

    override fun printDimensions() {

        println("$name has radius $radius")

    }//end fun printDimensions()

}// end class Circle