import scala.compiletime.ops.string

object Question1{

    def main(args:Array[String]):Unit = {

        class Rational(x:Int , y:Int){
            def neumer  = x;
            def denom = y;
            def neg():String = {
                new Rational((neumer * (-1)),denom).ToString();
            }
            def ToString():String = {
                neumer + "/" +denom;
            }
        }

        var x1 = new Rational(1,2);
        println(x1.neg())
    }

   
    
}