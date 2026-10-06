// Task 5.2.2: conversion of marks into grades, using a function
fun grade(mark: Int) = when (mark) {
    in 70..100 -> "Distinction"
    in 40..69 -> "Pass"
    in 0..39 -> "Fail"
    else -> "Invalid"
}

fun main(args: Array<String>) {
    for (arg in args) {
        val mark = arg.toInt()
        val result = grade(mark)

        println("$mark $result")
    }
}