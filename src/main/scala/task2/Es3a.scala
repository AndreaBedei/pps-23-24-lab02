package task2


object Es3a extends App :
    
    val v : Int = -5

    def positive(num: Int) : String = num match
        case num if num >= 0 => "positive"
        case _ => "negative"

    print(positive(v))

    