package factory

import java.io.FileWriter
import java.io.IOException
import java.io.Writer

abstract class Page(protected open val title: String, protected open val author: String) {
    protected val content: ArrayList<Item> = ArrayList()

    fun add(item: Item) {
        content.add(item)
    }

    fun output() {
        try {
            val filename = "$title.html"
            val writer: Writer = FileWriter(filename)
            writer.write(this.makeHTML())
            writer.close()
        } catch(e: IOException) {
        e.printStackTrace()
        }
    }
    abstract fun makeHTML(): String
}