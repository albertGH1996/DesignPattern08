package factory

// ここでもItemクラスのmakeHTMLメソッドが継承されている。
abstract class Tray(caption: String): Item(caption) {
    protected val tray: ArrayList<Item> = ArrayList()

    fun add(item: Item) {
        tray.add(item)
    }
}