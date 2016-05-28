/*
 * Author: Kirupa Devarajan
 * Object: SmartSeq
 */
package DeveloperTests.Implementation
import scala.io.Source
object SmartSeq{
  //Create a implicit class StringSequence to create filterLines() and filterWords() methods that process a sequence
  implicit class StringSequence(val strArray: Array[String]) {
    /* Method Name: filterLines()
     * Input: A String Array and a function
     * Output: A String Array
     */
    def filterLines(func: String => Boolean): Array[String] = {
      strArray.filter(func)
    }
    /* Method Name: filterWords()
     * Input: A String Array and a function
     * Output: A String Array
     */
    def filterWords(func:String=> Boolean):Array[String]={
      strArray.flatMap(x=>x.split(" ")).filter(func)
    }
  }
}
