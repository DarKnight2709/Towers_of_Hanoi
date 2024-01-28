import java.lang.Exception

class CircularlyLinkedList<E>{
    class Node<E>(val data: E, var next: Node<E>?)

    var tail: Node<E>?  = null
    var size = 0

    fun isEmpty() =  size == 0

    fun first() = if(isEmpty()) null
                    else tail?.next?.data

    fun last() = if(isEmpty()) null
                    else tail?.data


    fun rotate(){
        if(isEmpty()) throw Exception("Its empty. Cant rotate")
            tail = tail?.next
    }


    fun addFirst(element: E){
        var node = Node<E>(element, null)
        if(isEmpty()){
            tail = node
        }
        else
            node.next = tail?.next

        tail?.next = node
        ++size
    }
    fun addLast(element: E){
        addFirst(element)
        tail = tail?.next

    }

    fun removeFirst(): E?{
        if(isEmpty()) throw Exception("Its empty. Cant removeFirst")
        var head = tail?.next
        if(head == tail) tail = null
        else{
            tail?.next = head?.next
        }
        return head?.data
    }


}

fun main() {

}