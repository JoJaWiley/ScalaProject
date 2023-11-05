package Entities

import jdk.jfr.Timestamp

case class Song(
               name: String,
               artist: Artist,
               album: Album,
               duration: Double,
               releaseDate: Timestamp,
               comments: Option[List[Comment]],
               likedBy: Option[List[User]],
               playlistsUsing: Option[List[Playlist]]
               )
