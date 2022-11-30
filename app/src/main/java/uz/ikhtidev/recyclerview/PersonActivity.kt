package uz.ikhtidev.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import coil.load
import uz.ikhtidev.recyclerview.databinding.ActivityPersonBinding


class PersonActivity : AppCompatActivity() {
    private lateinit var binding:ActivityPersonBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPersonBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = intent
        val name = intent.getStringExtra("name")
        val image = intent.getStringExtra("image")


        binding.personName.text = name
        binding.personImage.load(image)
    }
}