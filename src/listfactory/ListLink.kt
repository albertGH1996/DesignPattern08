package listfactory
import factory.*

class ListLink(override val caption: String, override val url: String): Link(caption, url) {
    override fun makeHTML(): String {
        return " <li><a href=\" $url\">$caption</a></li>\n"
    }
}