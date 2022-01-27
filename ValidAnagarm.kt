package com.example.jettip.codechallenge

import java.util.*

fun isAnagrams(str1: String, str2: String): Boolean {
    //Both String Length must be Equal
    if (str1.length != str2.length) {
        return false
    }

    //Convert Strings to character Array
    val strArray1 = str1.toCharArray()
    val strArray2 = str2.toCharArray()

    //Sort the Arrays
    Arrays.sort(strArray1)
    Arrays.sort(strArray2)

    //Convert Arrays to String
    val sortedStr1 = String(strArray1)
    val sortedStr2 = String(strArray2)

    //Check Both String Equals or not After Sorting
    //and Return value True or False
    return sortedStr1 == sortedStr2
}

//Main Function, entry Point of Program
fun main(args: Array<String>) {
    val str1 = "Hi"
    val str2 = "mu"

    //Call Function to  check anagram String
    if (isAnagrams(str1, str2)) {
        println("Anagram Strings !!")
    } else {
        println("Strings are not Anagram !!")
    }
}