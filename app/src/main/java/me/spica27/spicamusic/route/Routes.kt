package me.spica27.spicamusic.route

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable
import me.spica27.spicamusic.db.entity.Song

/// App的导航

object Routes {


  @Serializable
  data object Splash : NavKey

  @Serializable
  data object Main : NavKey

  @Serializable
  data class AddSong(val playlistId: Long) : NavKey

  @Serializable
  data class PlaylistDetail(val playlistId: Long) : NavKey

  @Serializable
  data object Player : NavKey

  @Serializable
  data object SearchAll : NavKey


  @Serializable
  data object EQ : NavKey

  @Serializable
  data class PlayListItemDetail(val playlistId: Long, val songId: Long) : NavKey

  @Serializable
  data class LyricsSearch(val song: Song) : NavKey

}


