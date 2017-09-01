object week5{
	val fruit = List("apples","oranges","pears")
                                                  //> fruit  : List[String] = List(apples, oranges, pears)
	val nums = List(1,2,3)                    //> nums  : List[Int] = List(1, 2, 3)
	val diag3 = List(List(1,0,0),List(0,1,0),List(0,0,1))
                                                  //> diag3  : List[List[Int]] = List(List(1, 0, 0), List(0, 1, 0), List(0, 0, 1))
                                                  //| 
	val empty = List()                        //> empty  : List[Nothing] = List()
	
	def removeAt(n: Int, xs: List[Int]) = (xs take n):::(xs drop n + 1)
                                                  //> removeAt: (n: Int, xs: List[Int])List[Int]
	println(removeAt(1,nums))                 //> List(1, 3)
	
	val pair = ("answer",42)                  //> pair  : (String, Int) = (answer,42)
	
	val (label,value) = pair                  //> label  : String = answer
                                                  //| value  : Int = 42
	
}