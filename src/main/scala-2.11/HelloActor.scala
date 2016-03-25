import akka.actor.Actor
import akka.actor.Actor.Receive

/**
  * Created by Workstation on 25/03/16.
  */
class HelloActor extends Actor {

  override def receive: Receive = {
    case "hello" => println("answer to 'hello'")
    case _ => println("answer to WHAT?")
  }

}
