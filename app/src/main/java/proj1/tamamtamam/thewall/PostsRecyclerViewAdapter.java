package proj1.tamamtamam.thewall;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class PostsRecyclerViewAdapter extends RecyclerView.Adapter<PostsRecyclerViewAdapter.ViewHolder> {

    private final List<Post> mValues;
    private final Context context;
    private final PostClickedListener mListener;

    public PostsRecyclerViewAdapter(Context context, List<Post> items, PostClickedListener listener) {
        mValues = items;
        mListener = listener;
        this.context = context;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        holder.mItem = mValues.get(position);
        holder.mTitleView.setText(mValues.get(position).getTitle());
        holder.mPlaceView.setText(mValues.get(position).getPlace());
        holder.mDateView.setText(mValues.get(position).getPrice());

        Picasso.get()
                .load(mValues.get(position).getImageUrl())
                .placeholder(R.drawable.ic_wallpaper_gray_24dp)
                .resize(400, 400)
                .centerCrop()
                .into(holder.mImageView);

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.postClicked(mValues.get(position));
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mTitleView;
        public final ImageView mImageView;
        public final TextView mPlaceView;
        public final TextView mDateView;
        //        public final TextView mContentView;
        public Post mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mTitleView = (TextView) view.findViewById(R.id.title);
            mImageView = (ImageView) view.findViewById(R.id.image);
            mPlaceView = (TextView) view.findViewById(R.id.place);
            mDateView = (TextView) view.findViewById(R.id.price);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + "'";
        }
    }

    public interface PostClickedListener {

        void postClicked(Post post);
    }
}
