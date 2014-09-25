package ChiselTest

import Chisel._

class TestIO extends Bundle {
  val in = Bits(INPUT, width = 32)
}

trait MemParams {
  val data_width = 32
}

class TraitBundle extends Bundle with MemParams {
  val data_in = Bits(width = data_width)
}

class TraitBundleTest extends Module {
  val io = new TestIO()
  val testReg = Reg(new TraitBundle())
  val testQueue = Module(new Queue(new TraitBundle, 32))
}