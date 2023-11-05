package Entities

case class Artist(
                 name: String,
                 realName: Option[String],
                 country: String,
                 gender: Option[String],
                 age: Option[Int],
                 songs: List[Song],
                 followedBy: Option[List[User]]
                 )
