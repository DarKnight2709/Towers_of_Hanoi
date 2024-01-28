package library
open class Book (private val title: String, private val author: String, private val publicationYear: Int){
    open fun display() = "Title: $title, Author: $author, PublicationYear: $publicationYear"

    inner class Ebook(private val format: String)
        : Book(title, author, publicationYear){
        override fun display() =
                this@Book.display() + ", Fomat: $format"
    }
}