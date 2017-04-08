/*object HtmlParser {

  val browser = HtmlUnitBrowser()

  def getEndPageNumber(): Int = {
    val homePageUrl = "http://www.bilibili.com/video/bagumi_offical_1.html"
    val doc = browser.get(homePageUrl)
    (doc >> element(".endPage")).text.toInt
  }

  val indexPageUrlCommonPrefix = """http://www.bilibili.com/video/bagumi_offical_1.html#!page="""
  val videoPageUrlCommonPrefix = """http://www.bilibili.com"""
  
  val videoPageUrls = for {
    page <- 1 to getEndPageNumber()
    url = indexPageUrlCommonPrefix + page
    doc = browser.get(url)
  } yield (doc >> elementList(".l-item") >> attr("href")("a")).map(videoPageUrlCommonPrefix + _)

  def keywordsOfVideoPage(videoPageUrl: String): Future[List[String]] = {

  }

  class Video(url: String, ) {
    
  }
}*/