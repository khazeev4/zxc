package vlkv.example.zxc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import vlkv.example.zxc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            //binding.imageView.setImageDrawable(getDrawable(R.drawable.kamni))
            Picasso.get().load("https://i.pinimg.com/originals/36/cd/48/36cd4841a944ec0b1f32c1b91e2d148e.jpg").into(binding.imageView);
        }
    }
}