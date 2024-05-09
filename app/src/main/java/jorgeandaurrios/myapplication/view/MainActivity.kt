package jorgeandaurrios.myapplication.view

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import jorgeandaurrios.myapplication.R
import jorgeandaurrios.myapplication.model.UserModelImplementation
import jorgeandaurrios.myapplication.presenter.MainPresenter
import jorgeandaurrios.myapplication.presenter.MainPresenterImplementation

class MainActivity : AppCompatActivity(), MainView {

    private lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        presenter = MainPresenterImplementation(this, UserModelImplementation())

        val btn = findViewById<Button>(R.id.btn)
        btn.setOnClickListener {
            presenter.onButtonClicked()
        }

    }

    override fun getUserName(): String {
        return findViewById<EditText>(R.id.etName).text.toString()
    }

    override fun displayGreeting(greeting: String) {
        findViewById<TextView>(R.id.tvGreeting).text = greeting
    }
}