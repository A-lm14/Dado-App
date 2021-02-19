package alm.itesm.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("alm.itesm.helloworld", "Demostración de Log")

        tira_dado()
    }

    fun tira_dado() {
        var res1 = 0
        var res2 = 0
        var player = 1
        var turnos = 0

        mensaje.text = "Total Jugador 1: ${res1}"
        roll_dice.text = "Jugador 1"

        roll_dice.setOnClickListener {
            if (player == 1) {
                if(turnos == 6) {
                    if(res1 > res2) {
                        mensaje.text = "Jugador 1 gana con ${res1} puntos"
                        roll_dice.text = "Jugar de nuevo"
                        res1 = 0
                        res2 = 0
                        turnos = 0
                    }
                    if(res1 < res2) {
                        mensaje.text = "Jugador 2 gana con ${res1} puntos"
                        roll_dice.text = "Jugar de nuevo"
                        res1 = 0
                        res2 = 0
                        turnos = 0
                    }
                } else {
                    val rand = Random.nextInt(1, 6)
                    res1 += rand
                    turnos++
                    player = 2
                    mensaje.text = "Total Jugador 1: ${res1}"
                    roll_dice.text = "Jugador 2"
                }
            } else if (player == 2) {
                if(turnos == 6) {
                    if(res1 > res2) {
                        mensaje.text = "Jugador 1 gana con ${res1} puntos"
                        roll_dice.text = "Jugar de nuevo"
                        res1 = 0
                        res2 = 0
                        turnos = 0
                    }
                    if(res1 < res2) {
                        mensaje.text = "Jugador 2 gana con ${res1} puntos"
                        roll_dice.text = "Jugar de nuevo"
                        res1 = 0
                        res2 = 0
                        turnos = 0
                    }
                } else {
                    val rand = Random.nextInt(1, 6)
                    res2 += rand
                    player = 1
                    mensaje.text = "Total Jugador 2: ${res2}"
                    roll_dice.text = "Jugador 1"
                }

            }
        }
    }
}

