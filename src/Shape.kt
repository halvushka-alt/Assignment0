//Define the Dimensionable interface
interface Dimensionable {

    fun printDimensions()

}//end Dimensionable

//Define the abstract Shape class that implements Dimensionable
abstract class Shape (_name: String) : Dimensionable {

    var name = _name

    //function to get the area of a shape
    open fun getArea () : Double {

        return 0.0;

    }// end fun getArea()

}// end class Shape
