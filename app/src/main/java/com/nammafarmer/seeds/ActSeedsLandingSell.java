package com.nammafarmer.seeds;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.CheckBox;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import com.google.android.gms.tasks.*;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.*;
import com.nammafarmer.R;

//import kotlinx.android.synthetic.main.activity_act_seeds_landing_sell.*;

public class ActSeedsLandingSell extends AppCompatActivity   {
    Button btnSeedsSellSubmit;
    EditText editTextName,editTextPhone,editTextEmail;
    CheckBox cBoxSeedsRice,cBoxSeedsOnion,cBoxSeedsTomato,cBoxSeedsBendi,cBoxSeedsBrinjal,cBoxSeedsPumpkin,cBoxSeedsWheat,
            cBoxSeedsKarela,cBoxSeedsBeans,cBoxSeedsCarrot,cBoxSeedsSquash,cBoxSeedsRadish,cBoxSeedsMillets,cBoxSeedsChilli,
            cBoxSeedsGinger,cBoxSeedsGarlic,cBoxSeedsSpices,cBoxSeedsOthers;
    Activity activity = ActSeedsLandingSell.this;



    DatabaseReference nf= FirebaseDatabase.getInstance().getReference("Seeds");
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_seeds_landing_sell);

       // btnSeedsSellSubmit = findViewById(R.id.btnSubmit);
       // btnSeedsSellSubmit.setOnClickListener(this);
    }


    public void onClick(View v) {

        if (v.getId() == R.id.btnSubmit) {
            String name = "", phone = "", email = "";
       if (editTextName.getText() != null)
                name = editTextName.getText().toString().trim();
            if (editTextPhone.getText() != null)
                phone = editTextPhone.getText().toString().trim();
            if (editTextEmail.getText() != null)
                email = editTextEmail.getText().toString().trim();
            // if(cBoxSeedsRice.isChecked)
            //bSeedsRice = true;


            Toast.makeText(getApplicationContext(), "Button btnSubmit", Toast.LENGTH_SHORT).show();
            if (name.isEmpty()) {
                editTextName.setError("Please enter your name...");
                return;
            }
            if (phone.isEmpty()) {
                editTextPhone.setError("Please enter your phone number...");
                return;
            }

            //Get a key for new record
            String farmRecID = nf.push().getKey().toString();
            SaveSeeds farmRec = new SaveSeeds(
                    farmRecID,
                    name,
                    phone,
                    email,
                    cBoxSeedsRice.isChecked(),
                    cBoxSeedsOnion.isChecked(),
                    cBoxSeedsTomato.isChecked(),
                    cBoxSeedsBendi.isChecked(),
                    cBoxSeedsBrinjal.isChecked(),
                    cBoxSeedsPumpkin.isChecked(),
                    cBoxSeedsWheat.isChecked(),
                    cBoxSeedsKarela.isChecked(),
                    cBoxSeedsBeans.isChecked(),
                    cBoxSeedsCarrot.isChecked(),
                    cBoxSeedsSquash.isChecked(),
                    cBoxSeedsRadish.isChecked(),
                    cBoxSeedsMillets.isChecked(),
                    cBoxSeedsChilli.isChecked(),
                    cBoxSeedsGinger.isChecked(),
                    cBoxSeedsGarlic.isChecked(),
                    cBoxSeedsSpices.isChecked(),
                    cBoxSeedsOthers.isChecked()
            );

            if (farmRecID != null) {

                nf.child(farmRecID).setValue(farmRec).addOnCompleteListener(this, new OnCompleteListener<Void>() {


                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if(!task.isSuccessful())
                            Toast.makeText(getApplicationContext(), "Error Saving", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(getApplicationContext(), "Saved Successfully", Toast.LENGTH_LONG).show();
                    }


                });


            }

        }

    }

}
