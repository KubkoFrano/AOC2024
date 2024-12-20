package solutions.AOC2024

import solutions.Day
import java.io.File
import java.io.InputStream
import kotlin.math.abs

class Day1 : Day() {
    override fun execute(){
        val lst1 = ArrayList<Int>()
        val lst2 = ArrayList<Int>()

        val inputStream: InputStream = File("day1.txt").inputStream()
        inputStream.bufferedReader().forEachLine {
            val line = it.split("   ")
            lst1.add(line[0].toInt())
            lst2.add(line[1].toInt())
        }

        lst1.sort()
        lst2.sort()

        var result = 0

        for (i in 0..<lst1.size){
            result += abs(lst1[i]- lst2[i])
        }

        println(result)
    }
}