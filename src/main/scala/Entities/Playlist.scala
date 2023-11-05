package Entities

case class Playlist(
                   name: String,
                   mood: Option[String],
                   consistsOf: List[Song]
                   )
