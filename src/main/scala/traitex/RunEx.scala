package traitex

object RunEx extends  App {
  val frog =new Frog
  System.out.print(frog.philosophize)
  val philosophical = frog
  System.out.print(philosophical.philosophize)

  val queue = new MyQueue
  queue.put(10)
  System.out.print(queue.get());
}
