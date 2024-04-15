package com.example.primerproyectoandroid

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val textoA = findViewById<TextView>(R.id.tv1)
        val textoB = findViewById<TextView>(R.id.tv2)
        val boton = findViewById<Button>(R.id.btCambiar)

        val textos = arrayOf(
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                    "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
                    "Ut enim ad minim veniam, " +
                    "quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. " +
                    "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. " +
                    "Excepteur sint occaecat cupidatat non proident, " +
                    "sunt in culpa qui officia deserunt mollit anim id est laborum.",

            "Ac odio tempor orci dapibus. " +
                    "Sit amet est placerat in egestas. " +
                    "Erat pellentesque adipiscing commodo elit at imperdiet dui accumsan sit. " +
                    "Magna fringilla urna porttitor rhoncus dolor purus non. " +
                    "Amet risus nullam eget felis eget nunc. Mauris pharetra et ultrices neque ornare aenean. " +
                    "Ornare lectus sit amet est placerat in. " +
                    "Turpis cursus in hac habitasse platea dictumst quisque sagittis purus.",

            "Sit amet consectetur adipiscing elit duis tristique sollicitudin nibh sit. " +
                    "Integer malesuada nunc vel risus commodo. " +
                    "Interdum velit laoreet id donec ultrices tincidunt arcu. " +
                    "Ipsum nunc aliquet bibendum enim facilisis gravida neque. " +
                    "Eu ultrices vitae auctor eu augue ut lectus arcu bibendum. " +
                    "Non pulvinar neque laoreet suspendisse. " +
                    "In est ante in nibh mauris cursus.",

            "Ut tristique et egestas quis. " +
                    "Elementum nibh tellus molestie nunc non blandit massa enim nec. " +
                    "Quis hendrerit dolor magna eget.",

            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                    "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
                    "Id faucibus nisl tincidunt eget nullam non. " +
                    "Mauris in aliquam sem fringilla ut morbi tincidunt. " +
                    "Molestie nunc non blandit massa enim nec dui. " +
                    "Suscipit tellus mauris a diam maecenas. " +
                    "Lorem ipsum dolor sit amet consectetur adipiscing elit ut aliquam. " +
                    "Massa sapien faucibus et molestie ac feugiat sed lectus.",

            "In fermentum et sollicitudin ac orci phasellus egestas tellus. " +
                    "Est placerat in egestas erat imperdiet sed. " +
                    "Quis lectus nulla at volutpat diam. " +
                    "Id volutpat lacus laoreet non. " +
                    "Eget lorem dolor sed viverra ipsum. " +
                    "Enim blandit volutpat maecenas volutpat blandit aliquam etiam erat velit.",

            "Aliquam purus sit amet luctus venenatis lectus magna fringilla urna. " +
                    "Ultrices neque ornare aenean euismod elementum. " +
                    "Ornare massa eget egestas purus viverra accumsan in nisl. " +
                    "Senectus et netus et malesuada fames ac turpis. " +
                    "Orci dapibus ultrices in iaculis nunc.",

            "Viverra nibh cras pulvinar mattis nunc sed. " +
                    "Nisl suscipit adipiscing bibendum est ultricies integer. " +
                    "Metus vulputate eu scelerisque felis imperdiet. " +
                    "Diam ut venenatis tellus in metus vulputate eu scelerisque. " +
                    "Augue neque gravida in fermentum et sollicitudin. " +
                    "Molestie a iaculis at erat pellentesque adipiscing commodo elit at. " +
                    "Ante metus dictum at tempor commodo ullamcorper a lacus.",

            "Pretium vulputate sapien nec sagittis. " +
                    "Tellus cras adipiscing enim eu. " +
                    "Diam phasellus vestibulum lorem sed risus ultricies tristique.",

            "At in tellus integer feugiat scelerisque. " +
                    "Fermentum odio eu feugiat pretium nibh. " +
                    "Urna cursus eget nunc scelerisque viverra mauris in aliquam. " +
                    "A iaculis at erat pellentesque adipiscing commodo elit at. " +
                    "Ornare suspendisse sed nisi lacus sed. " +
                    "Lobortis elementum nibh tellus molestie nunc.",

            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
                    "Ipsum dolor sit amet consectetur adipiscing. " +
                    "Sed risus pretium quam vulputate dignissim. " +
                    "Enim praesent elementum facilisis leo."
        )

        boton.setOnClickListener() {
            val numRandom = Random.nextInt(textos.size)
            val nRandom = Random.nextInt(1, 3)

            if (nRandom == 1) {
                textoA.text = textos[numRandom]
            } else if (nRandom == 2) {
                textoB.text = textos[numRandom]
            }
        }
    }
}