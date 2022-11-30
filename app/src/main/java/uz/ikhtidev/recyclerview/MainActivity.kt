package uz.ikhtidev.recyclerview

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val personList = mutableListOf<Person>()

        val person1 = Person("Saidov Umid", "https://www.shutterstock.com/image-photo/young-handsome-man-beard-wearing-260nw-1768126784.jpg")
        val person2 = Person("Yarashov Ixtiyor", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQQc0slekZ9XFM4E-8HD67qmooXoiryocZW8v4ow6ntCw&s")
        val person3 = Person("Hayitov Ilhom", "https://t4.ftcdn.net/jpg/02/24/86/95/360_F_224869519_aRaeLneqALfPNBzg0xxMZXghtvBXkfIA.jpg")
        val person4 = Person("Bozorov Dilshod", "https://www.shutterstock.com/image-photo/young-handsome-man-beard-wearing-260nw-1768126784.jpg")
        val person5 = Person("Saidov Umid", "https://t4.ftcdn.net/jpg/02/24/86/95/360_F_224869519_aRaeLneqALfPNBzg0xxMZXghtvBXkfIA.jpg")
        val person6 = Person("Yarashov Ixtiyor", "https://www.shutterstock.com/image-photo/young-handsome-man-beard-wearing-260nw-1768126784.jpg")
        val person7 = Person("Hayitov Ilhom", "https://t4.ftcdn.net/jpg/02/24/86/95/360_F_224869519_aRaeLneqALfPNBzg0xxMZXghtvBXkfIA.jpg")
        val person8 = Person("Bozorov Dilshod", "https://www.shutterstock.com/image-photo/young-handsome-man-beard-wearing-260nw-1768126784.jpg")

        personList.add(person1)
        personList.add(person2)
        personList.add(person3)
        personList.add(person4)
        personList.add(person5)
        personList.add(person6)
        personList.add(person7)
        personList.add(person8)

        val adapter = PersonAdapter(personList, this)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = adapter



    }

    fun itemClick(item: Person) {
        val intent = Intent(this, PersonActivity::class.java)
        intent.putExtra("name", item.name)
        intent.putExtra("image", item.image)
        startActivity(intent)
    }

}