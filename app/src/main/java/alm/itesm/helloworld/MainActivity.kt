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
        //test_kotlin()

        tira_dado()
    }

    fun tira_dado() {
        var res1 = 0
        var res2 = 0
        var turnos = 0

        do {
            if (turnos % 2 == 0) {
                mensaje.text = "Total Jugador 1: ${res1}"
                roll_dice.text = "Jugador 1"
                roll_dice.setOnClickListener {
                    val rand = Random.nextInt(1, 6)
                    res1 += rand
                }
                turnos++
            } else if (turnos % 2 != 0) {
                mensaje.text = "Total Jugador 2: ${res1}"
                roll_dice.text = "Jugador 2"
                roll_dice.setOnClickListener {
                    val rand = Random.nextInt(1, 6)
                    res2 += rand
                }
                turnos++
            }

        } while (turnos <= 12)

        if (res1 > res2)
            mensaje.text = "Jugador 1 Ganador"
        if (res2 > res1)
            mensaje.text = "Jugador 2 Ganador"
    }
}

