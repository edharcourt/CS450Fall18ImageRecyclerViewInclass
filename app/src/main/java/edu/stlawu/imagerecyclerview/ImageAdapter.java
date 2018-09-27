package edu.stlawu.imagerecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

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

        DownloadBitmapTask t =
                new DownloadBitmapTask(imageAdapterViewHolder);
        t.execute(url);
    }

    @Override
    public int getItemCount() {
        return images.count();
    }

    class ImageAdapterViewHolder
        extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;

        public ImageAdapterViewHolder(
                @NonNull View itemView) {
            super(itemView);
            this.imageView = itemView.findViewById(R.id.rv_item_image);
            this.textView = itemView.findViewById(R.id.rv_item_text);
        }
    }

}
