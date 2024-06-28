// import breeze.linalg.DenseVector
// import com.github.fommil.netlib.BLAS
// import org.slf4j.LoggerFactory
object Demo {
    def loop(j: Int): Unit = {
        for (i <- 1 to j) println(i)
        var i = 1
        while (i <= 5) {
            println(s"$i\n")
            i += 1
        }
    }

    def main(ar: Array[String]): Unit = {
        val x : Int = 20 
        if(x == 20){
            println(s"pEACA")
        }
        loop(20)
    }
}