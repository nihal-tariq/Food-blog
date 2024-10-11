package com.example.assignment2

import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
       val recyclerView: RecyclerView =findViewById(R.id.recyclerView)
        val adaptar= ArticlesAdaptar(getArticles())
        recyclerView.adapter=adaptar
        recyclerView.layoutManager= LinearLayoutManager(this)

    }

    fun getArticles(): List<Article>{
        return listOf(
            Article(R.drawable.img1, "SEO, to go", "Get found faster thanks to built-in search engine optimization tools. Clean URLs, automatic sitemaps, and custom titles and descriptions help put your blog at the top of the stack in search results.","So now here comes the mesh shoe trend. The first pair of mesh flats I remember were from Alaia. Yeah you know the ones (and I found an excellent dupe). Then, Khaite did an incredible pair (again, found an amazing dupe). And then we starting seeing more specialty retailers come up with their own versions — some embellished, some solid, some mesh, some netted. And now we’re seeing a lot of mesh shoes coming to mass market — Mango, COS, Sam Edelman, etc.\n" +
                    "\n" +
                    "I personally have always loved the mesh shoe trend. I didn’t think it was weird (because yah, your toes do show), I thought they were pretty cool right off the bat. I couldn’t justify spending the money on a designer pair (although I do love my Gucci, Chanel, and Hermes shoes – check out those posts for more).\n" +
                    "\n" +
                    "I’ve rounded up mesh flats that I’ve found from so many different retailers – just proving that they’re EVERYWHERE. A quick Google search of mesh flats brings you to an entire world of shoes. Now that the weather is warming up, you’re going to see just how many girls are into the mesh shoe trend."),


            Article(R.drawable.img2, "Find your audience", "Say hello to a huge community of bloggers, creators, and avid readers, every time you publish. WordPress.com’s built-in Reader means millions of people can easily find, follow, and share your blog.","So now here comes the mesh shoe trend. The first pair of mesh flats I remember were from Alaia. Yeah you know the ones (and I found an excellent dupe). Then, Khaite did an incredible pair (again, found an amazing dupe). And then we starting seeing more specialty retailers come up with their own versions — some embellished, some solid, some mesh, some netted. And now we’re seeing a lot of mesh shoes coming to mass market — Mango, COS, Sam Edelman, etc.\n" +
                    "\n" +
                    "I personally have always loved the mesh shoe trend. I didn’t think it was weird (because yah, your toes do show), I thought they were pretty cool right off the bat. I couldn’t justify spending the money on a designer pair (although I do love my Gucci, Chanel, and Hermes shoes – check out those posts for more).\n" +
                    "\n" +
                    "I’ve rounded up mesh flats that I’ve found from so many different retailers – just proving that they’re EVERYWHERE. A quick Google search of mesh flats brings you to an entire world of shoes. Now that the weather is warming up, you’re going to see just how many girls are into the mesh shoe trend."),


            Article(R.drawable.img3, "Take it to social", "Put the word out on social media with no extra work. Set up automatic social updates once. Then leave it to WordPress.com to update Facebook, Tumblr, and LinkedIn every time you hit publish.","So now here comes the mesh shoe trend. The first pair of mesh flats I remember were from Alaia. Yeah you know the ones (and I found an excellent dupe). Then, Khaite did an incredible pair (again, found an amazing dupe). And then we starting seeing more specialty retailers come up with their own versions — some embellished, some solid, some mesh, some netted. And now we’re seeing a lot of mesh shoes coming to mass market — Mango, COS, Sam Edelman, etc.\n" +
                    "\n" +
                    "I personally have always loved the mesh shoe trend. I didn’t think it was weird (because yah, your toes do show), I thought they were pretty cool right off the bat. I couldn’t justify spending the money on a designer pair (although I do love my Gucci, Chanel, and Hermes shoes – check out those posts for more).\n" +
                    "\n" +
                    "I’ve rounded up mesh flats that I’ve found from so many different retailers – just proving that they’re EVERYWHERE. A quick Google search of mesh flats brings you to an entire world of shoes. Now that the weather is warming up, you’re going to see just how many girls are into the mesh shoe trend."),


            Article(R.drawable.img4, "Get paid for what you made", "Let your audience support your hard work with built-in monetization tools. From shipping out merch to selling downloadable content, taking donations to offering subscriptions and memberships. Everything you need to collect payments is baked right in.","So now here comes the mesh shoe trend. The first pair of mesh flats I remember were from Alaia. Yeah you know the ones (and I found an excellent dupe). Then, Khaite did an incredible pair (again, found an amazing dupe). And then we starting seeing more specialty retailers come up with their own versions — some embellished, some solid, some mesh, some netted. And now we’re seeing a lot of mesh shoes coming to mass market — Mango, COS, Sam Edelman, etc.\n" +
                    "\n" +
                    "I personally have always loved the mesh shoe trend. I didn’t think it was weird (because yah, your toes do show), I thought they were pretty cool right off the bat. I couldn’t justify spending the money on a designer pair (although I do love my Gucci, Chanel, and Hermes shoes – check out those posts for more).\n" +
                    "\n" +
                    "I’ve rounded up mesh flats that I’ve found from so many different retailers – just proving that they’re EVERYWHERE. A quick Google search of mesh flats brings you to an entire world of shoes. Now that the weather is warming up, you’re going to see just how many girls are into the mesh shoe trend."),
        )
    }
}