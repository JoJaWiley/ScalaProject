package Entities

import jdk.jfr.Timestamp

case class Comment(
                  user: User,
                  song: Song,
                  text: String,
                  likesNumber: Int,
                  date: Timestamp
                  )
