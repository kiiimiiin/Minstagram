package com.min.android.minstagram

class Feed(
    val userId: String,
    val imageUrl: String,
    val profileImageUrl: String,
    var likeCount: Int,
    var isLike: Boolean,
    var isBookmark: Boolean
) {
}