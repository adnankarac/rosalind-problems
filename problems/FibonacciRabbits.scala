package problems

object FibonacciRabbits {
	
	def solve(n: Int, k:BigInt): BigInt = {
	  lazy val fibs: Stream[BigInt] = BigInt(0) #:: BigInt(1) #:: fibs.zip(fibs.tail).map {n => n._1*k + n._2}
	  fibs(n)
	}
}