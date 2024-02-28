//class Node[T](var data: T, var next: Option[Node[T]] = None)
//
//class LinkedList[T] {
//  var head: Option[Node[T]] = None
//
//  def append(data: T): Unit = {
//    val newNode = new Node(data)
//    if (head.isEmpty) {
//      head = Some(newNode)
//    } else {
//      var current = head
//      while (current.get.next.isDefined) {
//        current = current.get.next
//      }
//      current.get.next = Some(newNode)
//    }
//  }
//
//  def display(): Unit = {
//    var current = head
//    while (current.isDefined) {
//      print(current.get.data + " -> ")
//      current = current.get.next
//    }
//    println("null")
//  }
//
//  def delete(data: T): Unit = {
//    head = deleteNode(head, data)
//  }
//
//  private def deleteNode(node: Option[Node[T]], data: T): Option[Node[T]] = {
//    if (node.isEmpty) {
//      return None
//    }
//
//    if (node.get.data == data) {
//      return node.get.next
//    }
//
//    node.get.next = deleteNode(node.get.next, data)
//    node
//  }
//
//  def insertAfter(prevData: T, newData: T): Unit = {
//    head = insertAfterNode(head, prevData, newData)
//  }
//
//  private def insertAfterNode(node: Option[Node[T]], prevData: T, newData: T): Option[Node[T]] = {
//    if (node.isEmpty) {
//      return None
//    }
//
//    if (node.get.data == prevData) {
//      val newNode = new Node(newData)
//      newNode.next = node.get.next
//      node.get.next = Some(newNode)
//    } else {
//      insertAfterNode(node.get.next, prevData, newData)
//    }
//
//    node
//  }
//}
//object LinkedList {
//  def main(args: Array[String]): Unit = {
//    val linkedList = new LinkedList[Int]
//
//    linkedList.append(1)
//    linkedList.append(2)
//    linkedList.append(3)
//
//    println("Linked List:")
//    linkedList.display()
//
//    linkedList.delete(2)
//    println("\nLinked List after deleting 2:")
//    linkedList.display()
//
//    linkedList.insertAfter(1, 4)
//    println("\nLinked List after inserting 4 after 1:")
//    linkedList.display()
//  }
//}
