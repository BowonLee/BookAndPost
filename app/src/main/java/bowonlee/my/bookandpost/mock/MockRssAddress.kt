package bowonlee.my.bookandpost.mock

/**
 * RSS 요청 목록
 * 원래는 웹에서 리스트를 파싱 하는 것이 좋지만, 우선 하드코딩으로 리스트를 구성한다.
 *
 * */
class MockRssAddress{

    val cateList = listOf<String>(
        "temp",
        "temp2"
    )

    fun getMockRssAddress() : List<String> {

        return cateList
    }
}