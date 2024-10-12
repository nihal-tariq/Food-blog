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
            Article(R.drawable.img1, "Mouth-Watering Pizzas to Indulge In", "Enhance your online visibility with built-in SEO tools. Clean URLs, automatic sitemaps, and custom titles and descriptions ensure your blog ranks high in search results.", "Now let’s dive into the world of unique pizza toppings. The first unusual topping I tried was truffle oil. Yes, you know the one (and I found a great spot that serves it). Then, I discovered prosciutto on pizza (again, found an excellent pizzeria). Soon after, I noticed more places experimenting with creative toppings — some with figs, some with honey, some with eggs, some even with arugula. And now, we’re seeing many gourmet pizza places adding these toppings to their menus — Blaze, MOD, and others.\n" +
                    "\n" +
                    "I’ve always loved experimenting with pizza toppings. I didn’t think it was strange (because yes, it can be unusual), I thought it was amazing from the start. I couldn’t justify spending too much at high-end spots (though I do love my local pizzerias – check out those reviews for more).\n" +
                    "\n" +
                    "I’ve rounded up some of the most creative pizza spots that I’ve found from different cities – just proving that gourmet pizzas are EVERYWHERE. A quick Google search of unique pizza toppings will open a whole new world of flavors. Now that the season for outdoor dining is here, you’ll see just how many people are trying out these innovative pizza creations."),

            Article(R.drawable.img2, "Irresistible Burgers to Satisfy Your Hunger", "Boost your online presence with built-in SEO tools. Clean URLs, automatic sitemaps, and custom titles and descriptions help elevate your blog in search rankings.", "Let’s talk about the trend of gourmet burger toppings. The first unique topping I tried was avocado slices. Yes, you know the one (and I found an amazing burger joint that serves it). Then, I discovered caramelized onions (again, found a fantastic burger place). After that, more burger spots started offering creative toppings — some with pineapple, some with fried eggs, some with jalapeños, some with peanut butter. And now, many gourmet burger chains are including these toppings — Five Guys, Shake Shack, and others.\n" +
                    "\n" +
                    "I’ve always enjoyed trying out different burger toppings. I didn’t think it was odd (because yes, some combos are bold), I thought they were delicious from the beginning. I couldn’t justify going to expensive places often (though I do love my local burger joints – check out those reviews for more).\n" +
                    "\n" +
                    "I’ve rounded up some of the best burger places with unique toppings that I’ve found from various locations – proving that gourmet burgers are EVERYWHERE. A quick Google search for creative burger toppings will reveal a whole new world of options. Now that summer is here, you’ll see just how many people are exploring new ways to enjoy their burgers."),

            Article(R.drawable.img3, "Comfort Foods to Warm Your Soul", "Increase your blog’s visibility with built-in SEO tools. Clean URLs, automatic sitemaps, and custom titles and descriptions help your blog rise in search rankings.", "Now let’s explore the world of comfort foods. The first dish that comes to mind is mac and cheese. Yes, you know the classic (and I found an incredible recipe). Then, I discovered chicken pot pie (again, found a great local spot that serves it). Soon, more places started offering their take on comfort classics — some with loaded mashed potatoes, some with hearty stews, some with cheesy casseroles, some with creamy soups. And now, many restaurants are including these comforting dishes on their menus — Panera, Cracker Barrel, and more.\n" +
                    "\n" +
                    "I’ve always been a fan of comfort foods. I didn’t think they were just simple (because yes, they’re often rich and hearty), I thought they were heartwarming from the start. I couldn’t justify splurging on comfort food at fancy places often (though I do love my go-to spots – check out those reviews for more).\n" +
                    "\n" +
                    "I’ve gathered some of the best comfort food recipes and restaurants I’ve come across – just proving that comfort food is EVERYWHERE. A quick Google search of comfort food recipes will introduce you to a world of cozy dishes. Now that the weather is cooling down, you’ll see just how many people are turning to these timeless favorites."),

            Article(R.drawable.img4, "Decadent Lotus Cheesecake to Satisfy Your Sweet Tooth", "Enhance your blog's reach with built-in SEO tools. Clean URLs, automatic sitemaps, and custom titles and descriptions will get your blog noticed in search rankings.", "Let’s dive into the world of Lotus Biscoff cheesecake. The first one I tasted was creamy with that signature Lotus crunch. Yes, you know the one (and I found an amazing bakery that makes it). Then, I discovered a caramel Lotus cheesecake (again, found a wonderful café that serves it). Soon, more places started experimenting with variations — some with white chocolate, some with salted caramel, some with a no-bake version, some with a Lotus Biscoff base. And now, many bakeries and cafés are adding this dessert to their menu — Cheesecake Factory, Magnolia, and others.\n" +
                    "\n" +
                    "I’ve always adored Lotus Biscoff cheesecake. I didn’t think it was overrated (because yes, it’s become quite popular), I thought it was irresistible from the start. I couldn’t always justify going to high-end dessert spots (though I do love my local favorites – check out those reviews for more).\n" +
                    "\n" +
                    "I’ve rounded up some of the best places offering Lotus Biscoff cheesecake and recipes I’ve found online – proving that this dessert is EVERYWHERE. A quick Google search of Lotus Biscoff cheesecake will reveal a whole world of indulgent recipes. Now that the dessert craze is growing, you’ll see just how many people are loving this creamy, crunchy treat."),

            )
    }
}