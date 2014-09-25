package ChiselTest

import Chisel._

object Main {
  def main(args: Array[String]): Unit = { 
    val rArgs  = args.slice(1, args.length)

    val res = 
    args(0) match {
      case "TraitBundleTest" =>
        chiselMain(rArgs, () => Module(new TraitBundleTest()))
    }
  }
}

