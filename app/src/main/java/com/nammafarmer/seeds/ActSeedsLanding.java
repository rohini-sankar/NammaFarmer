package com.nammafarmer.seeds;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.nammafarmer.R;

public class ActSeedsLanding extends AppCompatActivity implements View.OnClickListener  {
    Button btnSeedsBuy, btnSeedsSell;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_seeds_landing);

       btnSeedsBuy = findViewById(R.id.btnSeedsBuy);
       btnSeedsBuy.setOnClickListener(this);
        /*btnSeedsBuy.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          Intent intent = new Intent(ActSeedsLanding.this,
                                                  ActSeedsLandingBuy.class);
                                          startActivity(intent);
                                      }
                                  });*/

        btnSeedsSell =  findViewById(R.id.btnSeedsSell);
        btnSeedsSell.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId()== R.id.btnSeedsBuy)
        {
            Toast.makeText(getApplicationContext(),"Button BuySeeds",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(ActSeedsLanding.this, ActSeedsLandingBuy.class);
            Toast.makeText(getApplicationContext(),"Button BuySeeds intent",Toast.LENGTH_SHORT).show();
            startActivity(intent);
        }
        else if (v.getId()== R.id.btnSeedsSell)
        {
            Intent intent = new Intent(this, ActSeedsLandingSell.class);
            startActivity(intent);
        }

    }



}
