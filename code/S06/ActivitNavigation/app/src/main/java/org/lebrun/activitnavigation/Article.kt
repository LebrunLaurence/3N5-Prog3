package org.lebrun.activitnavigation

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.lebrun.activitnavigation.databinding.ActivityArticleBinding
import org.lebrun.activitnavigation.databinding.ActivityMainBinding

class Article : AppCompatActivity() {
    private lateinit var binding: ActivityArticleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityArticleBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.text.setText("orem ipsum dolor sit amet, consectetur adipiscing elit. Nam odio quam, venenatis non risus in, laoreet iaculis lectus. Quisque vulputate placerat congue. Duis eget luctus augue. Maecenas sodales porta purus. Quisque et felis vel nisi sagittis finibus eget at mauris. Vestibulum lobortis, magna tempus tincidunt lacinia, elit nisl euismod quam, ac venenatis velit augue eget turpis. Sed rutrum ullamcorper tincidunt.\n" +
                "\n" +
                "Nunc congue leo tempor, elementum dolor nec, lobortis risus. In id massa vel ipsum porta dapibus eget in sem. Mauris viverra luctus purus a venenatis. Proin sed lectus rutrum, imperdiet libero nec, consectetur ex. Nunc laoreet ante ac odio finibus, eu laoreet diam bibendum. Donec porttitor condimentum tempus. Donec tristique, ligula eget ultrices vestibulum, odio lectus facilisis libero, id venenatis est est non turpis. Suspendisse maximus id massa non scelerisque. Nunc consectetur porttitor semper. Proin sem risus, faucibus eget placerat at, lobortis nec elit. Nunc ut accumsan erat. Quisque a lorem sit amet arcu vehicula condimentum a eget arcu. Morbi fermentum dapibus quam, non pretium sem pretium a. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Quisque malesuada, lectus eget luctus rhoncus, purus est venenatis nibh, ut dapibus velit massa quis massa.")

        if(intent.hasExtra("NoArticle")){
            title = "Article #" + intent.getStringExtra("NoArticle")
        }

        binding.contact.setOnClickListener{
            val intent = Intent(this,Contact::class.java)

            startActivity(intent)
        }
    }
}