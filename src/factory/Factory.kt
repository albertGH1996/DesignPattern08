package factory

import kotlin.properties.Delegates
import kotlin.reflect.full.createInstance

abstract class Factory {
    companion object{
        fun getFactory(classname: String): Factory {
            var factory: Factory by Delegates.notNull()
            try {
                factory = Class.forName(classname).kotlin.createInstance() as Factory
            } catch (e: ClassNotFoundException) {
                e.printStackTrace()
            }
            return factory
        }
    }
    abstract fun createLink(caption: String, url: String): Link
    abstract fun createTray(caption: String): Tray
    abstract fun createPage(title: String, author: String): Page
}