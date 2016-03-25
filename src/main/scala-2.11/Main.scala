import akka.actor.{ActorSystem, Props}

/**
  * Main App
  */
object Main extends App {

  val system = ActorSystem("HelloSystem")

  val helloActor = system.actorOf(Props[HelloActor], name = "HelloActor_1")


  helloActor ! "hello"
  //this line would be equal to helloActor.receive("
 // actor <- pass this string

}
