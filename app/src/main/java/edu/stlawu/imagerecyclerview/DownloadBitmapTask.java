package edu.stlawu.imagerecyclerview;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.widget.ImageView;

public class DownloadBitmapTask extends
        AsyncTask<String, Void, Bitmap>  {

    // The task will fill in the views in the view holder
    private ImageAdapter.ImageAdapterViewHolder
            viewHolder;

    private String url;

    public DownloadBitmapTask(
            ImageAdapter.ImageAdapterViewHolder viewHolder) {
        this.viewHolder = viewHolder;
    }

    public String getUrl() {
        return url;
    }

    @Override
    // doInBackground runs in a separate thread
    // than the UI thread. Worker thread.
    protected Bitmap doInBackground(String... url) {
        Bitmap bm = Utility.downloadBitmap(
            url[0],
            viewHolder.imageView.getMaxWidth(),
            viewHolder.imageView.getMaxHeight()
        );
        this.url = url[0];
        return bm;
    }

    @Override
    // onPostExecute always runs in the UI thread.
    protected void onPostExecute(Bitmap bitmap) {
        super.onPostExecute(bitmap);
        this.viewHolder.imageView.setImageBitmap(bitmap);
        this.viewHolder.textView.setText(this.url);
    }
}
