package problems
import scala.io.Source
import scala.collection.immutable.Map

object FileReader {
	def readToList(file: String): List[String] = {
	  Source.fromFile(file).getLines.toList
	}	
	
	def convertToMap(lst : List[String]) : Map[String, String] = {	  
	  def is_header(str : String) : Boolean = str.startsWith(">")
	  
	  lst.foldLeft(List[List[String]]()) { (a, b) => 
	  	if(is_header(b)) List[String](b) :: a
	  	else List(b :: a.head) ::: a.tail
	  }.map(_.reverse).map( a => (a.head, a.tail.mkString )).toMap
	}	
	
	
}