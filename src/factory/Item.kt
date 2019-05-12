package factory

abstract class Item(protected open val caption: String) {
    abstract fun makeHTML(): String
}