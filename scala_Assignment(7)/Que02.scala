object Question02 {
    def main(args: Array[String]):Unit={

    class RationalNumber(p: Int, q: Int){

        if(q == 0) throw new IllegalArgumentException("Denominator cannot be 0")

        def this(p: Int) = this(p, 1)

        private def GCD(a: Int, b: Int): Int = if (b == 0) a.abs else GCD(b, (a % b))

        private def gcd = GCD(q, p)
        private def numer = p / gcd
        private def denom = q / gcd

        def -(that: RationalNumber) = RationalNumber(numer * that.denom - that.numer * denom, denom * that.denom)
        override def toString = s"$numer/$denom"
    }

    val x = RationalNumber(3, 4)
    val y = RationalNumber(5, 8)
    val z = RationalNumber(2, 7)

    println(x - y - z)

    }
}