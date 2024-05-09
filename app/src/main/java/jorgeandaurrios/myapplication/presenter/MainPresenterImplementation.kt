package jorgeandaurrios.myapplication.presenter

import jorgeandaurrios.myapplication.model.UserModel

import jorgeandaurrios.myapplication.view.MainView

class MainPresenterImplementation (private val view: MainView, private val model: UserModel) : MainPresenter {
    override fun onButtonClicked() {
        val fullName = view.getUserName()
        model.setFullName(fullName)

        val greeting = "Hola, ${model.getFullName()}!"
        view.displayGreeting(greeting)
    }

}