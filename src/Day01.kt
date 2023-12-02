fun main() {
    fun part1(input: List<String>): Int {
        var total=0
        for(line in input){
            println(line)
            //read left to right
            //print("left to right:")
            var lineValue=0
            for(c in line){
                //print(c)
                if (c.isDigit()){
                    lineValue=c.digitToInt()
                    //println("found digit:"+lineValue)
                    break
                }
            }

            //multiple line value by 10 and add digit
            lineValue*=10

            //read right to left
            //print("right to left:")
            for (i in line.length -1 downTo  0 ) {
                //print(line[i])
                //save if number
                if (line[i].isDigit()){
                    lineValue+=line[i].digitToInt()
                    //println("found digit:"+lineValue)
                    break
                }
            }
            println("Line value is:"+lineValue)
            total+=lineValue
        }

        return total
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 142)

    val input = readInput("Day01")
    part1(input).println()
    part2(input).println()
}
