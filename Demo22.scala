class Demo(val field1: String,
    val field2: Int,
    // .. and so on ..
    val field23: String)

extends Product 
//For Spark it has to be Serializable
with Serializable {
    def canEqual(that: Any) = that.isInstanceOf[Demo]

    def productArity = 23 // number of columns

    def productElement(idx: Int) = idx match {
        case 0 => field1
        case 1 => field2
        // .. and so on ..
        case 22 => field23
    }
}
