package com.nammafarmer.seeds;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.nammafarmer.R;

public class BuySeedsViewHolder extends RecyclerView.ViewHolder {

    private TextView textNameView;
    private TextView textPhoneView;
    private TextView textEMailView;
    private TextView textSeedsView;

    /**
     * The ViewHolder that will be used to display the data in each item shown
     * in the RecyclerView
     *
     * @param itemView
     *         The layout view group used to display the data
     */
    public BuySeedsViewHolder(final View itemView) {
        super(itemView);
        textNameView = (TextView) itemView.findViewById(R.id.textName);
        textPhoneView = (TextView) itemView.findViewById(R.id.textPhone);
        textEMailView = (TextView) itemView.findViewById(R.id.textEMail);
        textSeedsView = (TextView) itemView.findViewById(R.id.textSeeds);


    }


    public void bindData(final BuySeeds currentItem) {
        String tmpSeeds = "";
        textNameView.setText(currentItem.getName());
        textPhoneView.setText(currentItem.getPhone());
        textEMailView.setText(currentItem.getEmail());
        if (currentItem.getRice() == true)
            tmpSeeds = tmpSeeds +  "Rice, ";
        if (currentItem.getOnion() == true)
            tmpSeeds = tmpSeeds +  "Onion,  ";
        if (currentItem.getTomato() == true)
            tmpSeeds = tmpSeeds +  "Tomato, ";
        if (currentItem.getBendi() == true)
            tmpSeeds = tmpSeeds +  "Bendi, ";
        if (currentItem.getBrinjal() == true)
            tmpSeeds = tmpSeeds +  "Brinjal, ";
        if (currentItem.getPumpkin() == true)
            tmpSeeds = tmpSeeds +  "Pumpkin, ";
        if (currentItem.getWheat() == true)
            tmpSeeds = tmpSeeds +  "Wheat, ";
        if (currentItem.getKarela() == true)
            tmpSeeds = tmpSeeds +  "Karela, ";
        if (currentItem.getBeans() == true)
            tmpSeeds = tmpSeeds +  "Beans, ";
        if (currentItem.getCarrot() == true)
            tmpSeeds = tmpSeeds +  "Carrot, ";
        if (currentItem.getSquash() == true)
            tmpSeeds = tmpSeeds +  "Squash, ";
        if (currentItem.getRadish() == true)
            tmpSeeds = tmpSeeds +  "Radish, ";
        if (currentItem.getMillets() == true)
            tmpSeeds = tmpSeeds +  "Millets, ";
        if (currentItem.getChilli() == true)
            tmpSeeds = tmpSeeds +  "Chilli, ";
        if (currentItem.getGinger() == true)
            tmpSeeds = tmpSeeds +  "Ginger, ";
        if (currentItem.getGarlic() == true)
            tmpSeeds = tmpSeeds +  "Garlic, ";
        if (currentItem.getSpices() == true)
            tmpSeeds = tmpSeeds +  "Spices, ";

             tmpSeeds = tmpSeeds +  "Others";

            textSeedsView.setText(tmpSeeds);


    }
}