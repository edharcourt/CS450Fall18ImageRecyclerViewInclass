package edu.stlawu.imagerecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ImageAdapter extends
   RecyclerView.Adapter<
     ImageAdapter.ImageAdapterViewHolder>
{

    private ImageURLInterface images;

    public ImageAdapter(ImageURLInterface images) {
        this.images = images;
    }

    @NonNull
    @Override
    public ImageAdapterViewHolder onCreateViewHolder(
        @NonNull ViewGroup viewGroup, int i) {

        Context context = viewGroup.getContext();
        int layoutIdForListItem = R.layout.rv_item;
        LayoutInflater inflater =
                LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;
        View view = inflater.inflate(layoutIdForListItem,
                viewGroup, shouldAttachToParentImmediately);
        ImageAdapterViewHolder viewHolder = new
                ImageAdapterViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(
      @NonNull ImageAdapterViewHolder
               imageAdapterViewHolder, int i) {
        String url = images.get(i);

        




    }

    @Override
    public int getItemCount() {
        return images.count();
    }

    class ImageAdapterViewHolder
        extends RecyclerView.ViewHolder {

        public ImageAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

}
