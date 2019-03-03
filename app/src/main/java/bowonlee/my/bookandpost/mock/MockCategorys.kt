package bowonlee.my.bookandpost.mock

/**
 * 테스트 전용, 카테고리들의 항목을 미리 설정해 놓는다.
 *
 * */
class MockCategorys{

    val cateTypeList = listOf(
        "요리",
        "패션",
        "디자인",
        "창업",
        "테크"


    )

    fun getCategoryList() : List<String>{
        return cateTypeList
    }


}