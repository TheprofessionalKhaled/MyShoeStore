package com.example.myshoestore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.myshoestore.databinding.ActivityMainBinding
import timber.log.Timber
import java.util.*


class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)
       val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
        val navController = this.findNavController(R.id.myNavHostFragment)
        NavigationUI.setupActionBarWithNavController(activity = this,navController)

//        val rollButton : Button= findViewById(R.id.roll_button);
//        rollButton.text = "Hamada"
//        rollButton.setOnClickListener{
//            rollDice()
//        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.myNavHostFragment)
        return navController.navigateUp()
    }

    override fun onStart() {
        super.onStart()
        Timber.i("message here")

    }

    //Lesson.1
    //1. Use lateinit to extract the image view variable:
    //
    //lateinit var diceImage: ImageView
    //2. Initialize the image view variable:
    //
    //diceImage = findViewById(R.id.dice_image)
    //global not local
//    private fun rollDice() {
//        val randomInt = Random().nextInt(6)+1
//        val imageView : ImageView = findViewById(R.id.image_view);
//        //kotlin doesnot has switch statement only when
//        val drawableResource = when(randomInt){
//            1->R.drawable.dice_1
//            2->R.drawable.dice_2
//            3->R.drawable.dice_3
//            4->R.drawable.dice_4
//            5->R.drawable.dice_5
//            else->R.drawable.dice_6
//        }
//        imageView.setImageResource(drawableResource)
//    }
}
/*lesson.1
drawable..generated png make the app sie larger so we will apply a libarary
to use vector of rescources
1.build.gradle
2.xmlns:app="http://schemas.android.com/apk/res-auto"
3.srcCompat
use androidx library to support vector drawables in older version
 */

/*lesson 2 .a.add text and image in constraint add content description then new string
value with name yellow_star and value yellowstar and we can refactor name of image
 */
/*lesson  2.b.we extraact style right click textview and then refactor until we made a style.xml
and we can made a font from font family them more font then robotoo and then regular
when we click the 3dot we have 3 options one to use the value already made 2.add rescource
3.add value
 */
/*lesson 2.c enable databinding in build.gradle then in xml enclose it with ,<layout.
hamadaButton is generated name
 */
/* we use logs to track lifecycle of activity and fragments from log cat during app operation
process...we use Timber after set it up as it is more efficient
onresume and onpause the screen is already appear but in the background onstart and onstop visible
and not visible
lesson 4 lesson 10 contians the summary
 */

