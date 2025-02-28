package com.example.recycleview


import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity(), onClickListener {
    private var list= ArrayList<ContactModel>()
    private lateinit var recycleId:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        recycleId=findViewById(R.id.recyclerCont)

        recycleId.layoutManager= LinearLayoutManager(this).apply {
            orientation=LinearLayoutManager.VERTICAL
        }
        
        val c1=ContactModel(R.drawable.a, "A", "7685943002")
        val c2=ContactModel(R.drawable.b, "B", "48039743985")
        val c3= ContactModel(R.drawable.c,"C", "8329014793")
        list.add(c1)
        list.add(c2)
        list.add(c3)
        list.add(ContactModel(R.drawable.e,"E", "9049555839"))
        list.add(ContactModel(R.drawable.cx,"F", "9055305839"))
        list.add(ContactModel(R.drawable.df,"GF", "7849305839"))
        list.add(ContactModel(R.drawable.cx,"FG", "9049305839"))
        list.add(ContactModel(R.drawable.xx,"GG", "90495454839"))
        list.add(ContactModel(R.drawable.f,"RT", "9453626646"))
        list.add(ContactModel(R.drawable.ab,"JK", "94660242424"))
        list.add(ContactModel(R.drawable.ac,"MS", "9078305839"))
        list.add(ContactModel(R.drawable.ba,"L", "9049665839"))
        list.add(ContactModel(R.drawable.ad,"E", "9049655839"))
        list.add(ContactModel(R.drawable.ad,"G", "9044605839"))
        list.add(ContactModel(R.drawable.sd,"FG", "904705839"))
        list.add(ContactModel(R.drawable.xx,"FF", "9047705839"))

        val adaptor= RecyclerContactAdapter(
            this, list, this)

      recycleId.adapter=adaptor

    }

   // @SuppressLint("SuspiciousIndentation")
    override fun onItemClick(position: Int) {
      var intent= Intent(this, MainActivity2::class.java)
        intent.putExtra("Img", list[position].img)
        intent.putExtra("Name", list[position].name)
        intent.putExtra("Num", list[position].number)
        startActivity(intent)
    }
}