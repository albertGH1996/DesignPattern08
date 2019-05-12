package listfactory
import factory.*

class ListTray(override val caption: String): Tray(caption) {
    override fun makeHTML(): String {
        val buffer: StringBuffer = StringBuffer()
        buffer.append("<li>\n")
        buffer.append(caption + "\n")
        buffer.append("<ul>\n")
        val it: Iterator<Item> = tray.iterator()
        while (it.hasNext()) {
            val item: Item = it.next()
            buffer.append(item.makeHTML())
        }
        buffer.append("</ul>\n")
        buffer.append("</li>\n")
        return buffer.toString()
    }
}