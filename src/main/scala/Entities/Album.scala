package Entities

import jdk.jfr.Timestamp

case class Album(
                name: String,
                artist: Artist,
                song: List[Song],
                releaseDate: Timestamp
                )
