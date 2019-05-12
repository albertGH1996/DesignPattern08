package tablefactory
import factory.*

class TableLink(override val caption: String, override val url: String): Link(caption, url) {
    override fun makeHTML(): String {
        return "<td><a href=\"$url\">$caption</a></td>\n>"
    }
}