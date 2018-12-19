package model

case class Game(current_tick: Int,
                players: Seq[Player],
                robots: Seq[Robot],
                nitro_packs: Seq[NitroPack],
                ball: Ball)
