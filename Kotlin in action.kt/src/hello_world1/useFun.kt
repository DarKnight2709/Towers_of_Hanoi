package bouncing

fun bouncingBall(h:Double, bounce:Double, window:Double) =
        if(h <= 0 || bounce <= 0 || bounce >= 1 || window >= h) -1
        else{
            var sum = 1
            var height = h * bounce
            while(height >= window ){
                sum +=  2
                height *= bounce
            }
            sum
        }

fun main(args: Array<String>) {

}