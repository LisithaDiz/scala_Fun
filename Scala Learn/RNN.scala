object RNN {
    def main(args: Array[String]) = {
        println("Hello")
        val name = "mark"
        val age = 18.5
        println(name + " is " + age + " yr old")
        println(f"$name is $age%f years old")
        println(s"$name is $age years old")
        // println(f"$name is $age%d years old") Error -> Double Req.
        println(s"$name is $age years old \n next line s")
        println(raw"$name is $age years old \n next line raw") 

        }
}