import factory.*

fun main() {
    val args = "tablefactory.TableFactory"

    if (args.isEmpty()) {
        System.out.println("Usage: kotlin Main class.name.of.ConcreteFactory")
        System.out.println("Example 1: kotlin Main listfactory.ListFactory")
        System.out.println("Example 2: kotlin Main tablefactory.TableFactory")
        System.exit(0)
    }
    val factory: Factory = Factory.getFactory(args)
    val asahi: Link = factory.createLink("朝日新聞", "https://www.asahi.com/")
    val yomiuri: Link = factory.createLink("読売新聞", "https://www.yomiuri.co.jp/")

    val us_yahoo: Link = factory.createLink("Yahoo!", "https://www.yahoo.com")
    val jp_yahoo: Link = factory.createLink("Yahoo!Japan", "https://www.yahoo.co.jp")
    val excite: Link = factory.createLink("Excite", "https://www.excite.com")
    val google: Link = factory.createLink("Google", "https://www.google.com")

    val trayNews: Tray = factory.createTray("新聞")
    trayNews.add(asahi as Item)
    trayNews.add(yomiuri as Item)

    val trayYahoo: Tray = factory.createTray("Yahoo!")
    trayYahoo.add(us_yahoo as Item)
    trayYahoo.add(jp_yahoo as Item)

    val traySearch: Tray = factory.createTray("サーチエンジン")
    traySearch.add(excite as Item)
    traySearch.add(google as Item)

    val page: Page = factory.createPage("LinkPage", "俺だよれ")
    page.add(trayNews as Item)
    page.add(trayYahoo as Item)
    page.add(traySearch as Item)
    page.output()
}