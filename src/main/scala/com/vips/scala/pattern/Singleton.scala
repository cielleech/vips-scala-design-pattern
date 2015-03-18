package com.vips.scala.pattern

object Main {
  def main(args: Array[String]) = {
    Singleton.print();
  }
}


object Singleton {
  def print() = {
    println("Singleton print")
  }
}