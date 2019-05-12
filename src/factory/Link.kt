package factory

/**
 * この書き方でJavaのextends Item... super(caption) に等しい。
 * メソッドがないように見えるが、ItemクラスのmakeHTMLメソッドを継承している。
*/
abstract class Link(override val caption: String, protected open val url: String) : Item(caption)