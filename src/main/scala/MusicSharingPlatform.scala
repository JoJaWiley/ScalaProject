import java.sql.Timestamp

case class Song(
               name: String,
               artist: Artist,
               statistics: SongStatistics,
               duration: Double,
               releaseDate: Timestamp,
               comments: Option[List[Comment]],
               inPlaylists: Option[List[Playlist]]
               )

case class Album(
                name: String,
                artist: Artist,
                songs: List[Song],
                releaseDate: Timestamp,
                duration: Double
                )

case class Playlist(
                   name: String,
                   mood: Option[String],
                   songs: List[Song],
                   duration: Double
                   )

case class Artist(
                 name: String,
                 realName: Option[String],
                 country: String,
                 gender: Option[String],
                 age: Option[Int],
                 popularSongs: Option[List[Song]],
                 albums: Option[List[Album]],
                 playlists: Option[List[Playlist]],
                 comments: Option[List[Comment]],
                 statistics: ArtistStatistics
                 )

case class User(
               name: String,
               country: String,
               gender: String,
               age: Int,
               followedArtists: Option[List[Artist]],
               favoriteSongs: Option[List[Song]],
               registrationDate: Timestamp
               )

case class Comment(
                  user: User,
                  text: String,
                  likesNumber: Int,
                  date: Timestamp
                  )

case class ArtistStatistics(
                           likesNumber: Int,
                           streamsNumber: Int,
                           followersNumber: Int
                           )

case class SongStatistics(
                         likesNumber: Int,
                         streamsNumber: Int,
                         repostsNumber: Int
                         )

