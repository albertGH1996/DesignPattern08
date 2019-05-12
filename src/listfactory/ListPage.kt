package listfactory
import factory.*

class ListPage(override val title: String, override val author: String): Page(title, author) {
    override fun makeHTML(): String {
        val buffer: StringBuffer = StringBuffer()
        buffer.append("<html><head><title>$title</title></head>\n")
        buffer.append("<body>\n")
        buffer.append("<h1>$title</h1>\n")
        buffer.append("<ul>\n")
        val it: Iterator<Item> = content.iterator()
        while (it.hasNext()) {
            val item: Item = it.next()
            buffer.append(item.makeHTML())
        }
        buffer.append("</ul>\n")
        buffer.append("<hr><address>$author</address>")
        buffer.append("</body></html>\n")
        return buffer.toString()
    }
}