package com.bussiness.multiportit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_dashboard.*

class DashboardActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        todo_card.setOnClickListener(this)
        inventory_card.setOnClickListener(this)
        users_multiport_card.setOnClickListener(this)
        users_colfletar_card.setOnClickListener(this)
        providers_card.setOnClickListener(this)
        licences_card.setOnClickListener (this)
    }

    override fun onClick(v: View) {
        val i: Intent
        when(v.id){
            R.id.todo_card -> { i = Intent(this, TodoActivity::class.java)
                startActivity(i)}

            R.id.inventory_card -> { i = Intent(this, InventoryActivity::class.java)
                startActivity(i)}

            R.id.users_multiport_card -> { i = Intent(this, UsersMultiportActivity::class.java)
                startActivity(i)}

            R.id.users_colfletar_card -> { i = Intent(this, UsersColfletarActivity::class.java)
                startActivity(i)}

            R.id.providers_card -> { i = Intent(this, ProvidersActivity::class.java)
                startActivity(i)}

            R.id.licences_card -> { i = Intent(this, LicensesActivity::class.java)
                startActivity(i)}


            else -> {

            }
        }
    }

}
