package com.nammafarmer.seeds;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.nammafarmer.R;

import java.util.ArrayList;
import java.util.List;

public class BuySeedsAdapter extends RecyclerView.Adapter  {

    private List<BuySeeds> buySeedsObj = new ArrayList<>();

    /**
     * Adapter constructor
     *
     * @param buySeedsviewModels
     *         A collection of viewmodels which will contain the data that will be used in each ViewHolder
     */
    public BuySeedsAdapter(final List<BuySeeds> buySeedsviewModels) {
        if (buySeedsviewModels != null) {
            this.buySeedsObj.addAll(buySeedsviewModels);
        }
    }

    /**
     * This is where the ViewHolder(s) are created. Since the framework handles the initialization and recycling
     * we only need to use the viewtype passed in here to inflate our View
     *
     * @param parent
     *         The ViewGroup into which the new View will be added after it is bound to
     *         an adapter position.
     * @param viewType
     *         The view type of the new View.
     *
     * @return
     */
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        final View view = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);
        return new BuySeedsViewHolder(view);
    }

    /**
     * This is where the data is bound to each ViewHolder. This method is called at least once and will be
     * called each time the adapter is notified that the data set has changed
     *
     * @param holder
     *         The ViewHolder
     * @param position
     *         The position in our collection of data
     */
    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
        ((BuySeedsViewHolder) holder).bindData(buySeedsObj.get(position));
    }

    /**
     * Gets the size of the collection of items in our list
     *
     * @return An Integer representing the size of the collection that will be displayed
     */
    @Override
    public int getItemCount() {
        return buySeedsObj.size();
    }

    /**
     * Gets the item view type. We can return the static constant that the Android framework
     * creates for us.
     *
     * @param position
     *         The position in the collection
     *
     * @return The item layout id
     */
    @Override
    public int getItemViewType(final int position) {
        return R.layout.buy_seeds_card;
    }

/*
    private List<BuySeeds> buySeedsList;


    public void onCreateViewHolder(ViewGroup viewGroup, int viewType): BuySeedsViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.buy_seeds_card, parent, false)

        return BuySeedsViewHolder(itemView)
    }


    // Provide a suitable constructor (depends on the kind of dataset)
    public BuySeedsAdapter(List<BuySeeds> buySeedsList1) {
        buySeedsList = buySeedsList1;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public BuySeedsAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                     int viewType) {
        // create a new view
        TextView v = (TextView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.my_text_view, parent, false);

        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(BuySeedsViewHolder holder, int position) {
        BuySeeds currentItem = buySeedsList.get(position);

        String tmpSeeds = "";

        holder.imageView.setImageResource(R.drawable.ic_person);
        holder.name.text = currentItem.getName();
        holder.phone.text = currentItem.getPhone();
        holder.email.text = currentItem.getEmail();
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
        holder.seeds.text = tmpSeeds;


    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return buySeedsList.length;
    }
*/

}
