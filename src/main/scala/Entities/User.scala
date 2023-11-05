package Entities

case class User(
               name: String,
               country: String,
               gender: String,
               age: Int,
               comments: Option[List[Comment]],
               following: Option[List[Artist]],
               songsLiked: Option[List[Song]]
               )
