package week1_ComputationsInParallel
import scala.util.Random

object estimatingPie {
	def mcCount(iter: Int): Int = {
		val randomX = new Random
		val randomY = new Random
		var hits = 0
		for(i <- 0 until iter){
			val x = randomX.nextDouble // in [0,1]
			val y = randomY.nextDouble // in [0,1]
			if (x*x + y*y < 1) hits = hits + 1
		}
		hits
	}
	def monteCarloPiSeq(iter: Int): Double = 4.0 * mcCount(iter) / iter
	
}