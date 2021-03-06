/*
 * Author: Kirupa Devarajan
 * Object: SmartString
 */
package DeveloperTests.Implementation
import scala.io.Source
object SmartString{
  //Create a implicit class StringText to create filterLines() and filterWords() methods that process a string
  implicit class StringText(val str: String) {
    /* Method Name: filterLines()
     * Input: A String and a function
     * Output: A String Array
     */
    def filterLines(func: String => Boolean): Array[String] = {
      str.split("\n").filter(func)
    }
    /* Method Name: filterWords()
     * Input: A String and a function
     * Output: A String Array
     */
    def filterWords(func:String=> Boolean):Array[String]={
      str.split("\n").flatMap(x=>x.split(" ")).filter(func)
    }
  }
}
