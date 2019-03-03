package bowonlee.my.bookandpost.models
sealed class CategoryModel {
    /**
     * 카테고리 자체
     * */
    data class Category(
        var categoryId: Int,
        var categoryName : String
    )
    /**
     * 카테고리들 목록
     * */
    data class CategoryList(
        var categoryList: List<Category>
    )

    /**
     * 카테고리와, 해당 카테고리에 속하는 데이터 소스 값들
     * */
    data class CategoryItems(
        val categoryId : Int,
        var categoryItemList:List<String>
    )

}