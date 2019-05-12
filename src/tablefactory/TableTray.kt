package tablefactory
import factory.*

class TableTray(override val caption: String): Tray(caption) {
    override fun makeHTML(): String {
        val buffer = StringBuffer()
        buffer.append("<td>")
        buffer.append("<table width=\"100%\" border=\"1\"><tr>")
        buffer.append("<td bgcolor=\"#cccccc\" align=\"center\" colspan=\"${tray.size}\"><b>$caption</b></td>>")
        buffer.append("</tr>\n")
        buffer.append("<tr>\n")
        val it: Iterator<Item> = tray.iterator()
        while(it.hasNext()) {
            val item: Item = it.next()
            buffer.append(item.makeHTML())
        }
        buffer.append("</tr></table>")
        buffer.append("</td>")
        return buffer.toString()
    }
}