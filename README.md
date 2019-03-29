AnkoSample
Android Anko layout with kotlin.
Sample source code.
Why a DSL?

By default, UI in Android is written using XML. That is inconvenient in the following ways:

    It is not typesafe;
    It is not null-safe;
    It forces you to write almost the same code for every layout you make;
    XML is parsed on the device wasting CPU time and battery;
    Most of all, it allows no code reuse.

While you can create UI programmatically, it's hardly done because it's somewhat ugly and hard to maintain. Here's a plain Kotlin version (one in Java is even longer):

val act = this
val layout = LinearLayout(act)
layout.orientation = LinearLayout.VERTICAL
val name = EditText(act)
val button = Button(act)
button.text = "Say Hello"
button.setOnClickListener {
    Toast.makeText(act, "Hello, ${name.text}!", Toast.LENGTH_SHORT).show()
}
layout.addView(name)
layout.addView(button)

A DSL makes the same logic easy to read, easy to write and there is no runtime overhead. Here it is again:

verticalLayout {
    val name = editText()
    button("Say Hello") {
        onClick { toast("Hello, ${name.text}!") }
    }
}
