package app

import library.Book

import library.Hello


import Library


fun main(args: Array<String>) {
    val a = Library()
    val book1 = Book("I", "quyen", 2023)
    val ebook1 = Book( "love", "hoang", 2023).Ebook("PDF")
    a.addBook(book1)
    a.addBook(ebook1)
    a.removeBook(book1)
    a.removeBook(ebook1)





}


