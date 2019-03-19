package doodle
package svg
package effect

import doodle.core.Color

final case class Frame(id: String,
                       size: Size,
                       background: Option[Color] = None) {
  def background(color: Color): Frame =
    this.copy(background = Some(color))

  def fitToImage(border: Int = 20): Frame =
    this.copy(size = Size.fitToImage(border))

  def size(width: Double, height: Double): Frame =
    this.copy(size = Size.fixedSize(width, height))

}
object Frame {
  def apply(id: String): Frame =
    Frame(id, Size.fitToImage(), None)
}
