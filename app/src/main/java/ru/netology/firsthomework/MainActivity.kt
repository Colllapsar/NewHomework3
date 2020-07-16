package ru.netology.firsthomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val post = Post ("First post in our network!", "20 august 2020","Colllapsar",true, "1", "1", "1")

        contentTv.text = post.content
        starDateTv.text = post.date
        authorTv.text = post.author
        numberOfLikes.text = post.numberOfLikes
        numberOfComments.text = post.numberOfComments
        numberOfShares.text = post.numberOfShares

        if (post.numberOfLikes=="0"){
            post.liked = false
            numberOfLikes.visibility = View.INVISIBLE
        }
        if (post.numberOfComments=="0"){
            numberOfComments.visibility = View.INVISIBLE
        }
        if (post.numberOfShares=="0"){
            numberOfShares.visibility = View.INVISIBLE
        }
        if (post.liked){
        Like.setImageResource(R.drawable.ic_baseline_like)
        }
    }
}