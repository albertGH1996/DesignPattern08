package tablefactory
import factory.*

class TablePage(override val title: String, override val author: String): Page(title, author) {
    override fun makeHTML(): String {
        val buffer = StringBuffer()
        buffer.append("<html><head><title>$title</title></head>")
        buffer.append("<body>\n")
        buffer.append("<h1>$title</h1>\n")
        buffer.append("<table width=\"80%\" border=\"3\">\n")
        val it: Iterator<Item> = content.iterator()
        while (it.hasNext()) {
            val item: Item = it.next()
            buffer.append("<tr>${item.makeHTML()}</tr>")
        }
        buffer.append("</table>\n")
        buffer.append("<hr><address>$author</address>")
        buffer.append("</body></html>\n")
        return buffer.toString()
    }
}