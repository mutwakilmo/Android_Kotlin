package com.mutwaakil.alertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addContactDialog = AlertDialog.Builder(this)
            .setTitle("Add contact")
            .setMessage("Do you want to add Mr Poop to contact list?")
            .setIcon(R.drawable.ic_action_name)
            .setPositiveButton("Yes") { _, _ ->
                Toast.makeText(this, "You added Mr Poop to your contact list", Toast.LENGTH_SHORT)
                    .show()
            }
            .setNegativeButton("No") { _, _ ->
                Toast.makeText(this, "You didn't Mr Poop to your contact list", Toast.LENGTH_SHORT)
                    .show()

            }.create()

        btnDialog1.setOnClickListener {
            addContactDialog.show()
        }

        //Second Dialog
        val options = arrayOf("First Item", "Second Item", "Third Item")
        val singleChoiceDialog = AlertDialog.Builder(this)
            .setTitle("Choose one of these options")
            .setSingleChoiceItems(options,0){dialogInterface, i ->
                Toast.makeText(this, "You clicked on ${options[i]}", Toast.LENGTH_SHORT)
            }

            .setPositiveButton("Accept") { _, _ ->
                Toast.makeText(this, "You acceptedd the singleChoiceDialog", Toast.LENGTH_SHORT)
                    .show()
            }
            .setNegativeButton("Declined") { _, _ ->
                Toast.makeText(this, "You declined the singleChoiceDialog", Toast.LENGTH_SHORT)
                    .show()

            }.create()

        btnDialog2.setOnClickListener {
            singleChoiceDialog.show()
        }


        //Third  Dialog

        val multiChoiceDialog = AlertDialog.Builder(this)
            .setTitle("Choose one of these options")
            .setMultiChoiceItems(options, booleanArrayOf(false,false,false)){_, i,isChecked ->
              if (isChecked){
                  Toast.makeText(this, "You checked ${options[i]}",Toast.LENGTH_SHORT).show()
              } else{
                  Toast.makeText(this, "You unChecked ${options[i]}",Toast.LENGTH_SHORT).show()
              }

            }
            .setPositiveButton("Accept") { _, _ ->
                Toast.makeText(this, "You acceptedd the MultiChoiceDialog", Toast.LENGTH_SHORT)
                    .show()
            }
            .setNegativeButton("Declined") { _, _ ->
                Toast.makeText(this, "You declined the MultiChoiceDialog", Toast.LENGTH_SHORT)
                    .show()

            }.create()

        btnDialog3.setOnClickListener {
            multiChoiceDialog.show()
        }
    }
}