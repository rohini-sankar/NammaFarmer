package com.nammafarmer.seeds;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.nammafarmer.R;

import java.util.ArrayList;
import java.util.List;

public class ActSeedsLandingBuy extends AppCompatActivity {

    private List<BuySeeds> buySeedsData;
    private RecyclerView rv;
    private BuySeedsAdapter adapter;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_seeds_landing_buy);
        Toast.makeText(getApplicationContext(),"inside ActSeedsLandingBuy",Toast.LENGTH_SHORT).show();

        rv=(RecyclerView)findViewById(R.id.recycler_view);
        Toast.makeText(getApplicationContext(),"inside RecyclerView ActSeedsLandingBuy",Toast.LENGTH_SHORT).show();
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        Toast.makeText(getApplicationContext(),"inside Layout Manager ActSeedsLandingBuy",Toast.LENGTH_SHORT).show();
        buySeedsData=new ArrayList<>();

        final DatabaseReference nf= FirebaseDatabase.getInstance().getReference("Seeds");
        Toast.makeText(getApplicationContext(),"inside DatabaseReference ActSeedsLandingBuy",Toast.LENGTH_SHORT).show();
        nf.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Toast.makeText(getApplicationContext(),"inside onDataChange ActSeedsLandingBuy",Toast.LENGTH_SHORT).show();
                if (dataSnapshot.exists()){
                    Toast.makeText(getApplicationContext(),"inside dataSnapshot ActSeedsLandingBuy",Toast.LENGTH_SHORT).show();
                    for (DataSnapshot npsnapshot : dataSnapshot.getChildren()){
                        BuySeeds l=npsnapshot.getValue(BuySeeds.class);
                        Toast.makeText(getApplicationContext(),"inside getChildren ActSeedsLandingBuy",Toast.LENGTH_SHORT).show();
                        buySeedsData.add(l);

                    Toast.makeText(getApplicationContext(),"BuySeeds",Toast.LENGTH_SHORT).show();
                    }
                    adapter=new BuySeedsAdapter(buySeedsData);
                    rv.setAdapter(adapter);

                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Toast.makeText(getApplicationContext(),databaseError.getDetails(),Toast.LENGTH_SHORT).show();
            }
        });
    }





}
