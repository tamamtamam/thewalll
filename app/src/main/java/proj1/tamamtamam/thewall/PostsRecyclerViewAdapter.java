package proj1.tamamtamam.thewall;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.util.List;

import proj1.tamamtamam.thewall.dummy.DummyContent.DummyItem;

/**
 * {@link RecyclerView.Adapter} that can display a {@link DummyItem} and makes a call to the
 * TODO: Replace the implementation with code for your data type.
 */
public class PostsRecyclerViewAdapter extends RecyclerView.Adapter<PostsRecyclerViewAdapter.ViewHolder> {

    private final List<Post> mValues;
    private final Context context;
    private final View.OnClickListener mListener;

    public PostsRecyclerViewAdapter(Context context, List<Post> items, View.OnClickListener listener) {
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
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.mTitleView.setText(mValues.get(position).getTitle());
        holder.mImageView.setImageResource(android.R.drawable.arrow_down_float);
        holder.mPlaceView.setText(mValues.get(position).getPlace());
        holder.mDateView.setText(mValues.get(position).getDate());

        Picasso.with(this.context)
                .load("https://www.tutorialspoint.com/images/tp-logo-diamond.png")
                .placeholder(android.R.drawable.arrow_down_float)
                .resize(400, 400)
                .centerCrop()
                .rotate(0)
                .into(holder.mImageView, new Callback() {
                    @Override
                    public void onSuccess() {
                        Toast.makeText(context, "Fetched image from internet", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onError() {
                        Toast.makeText(context, "An error occurred", Toast.LENGTH_SHORT).show();
                    }
                });

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onClick(v);
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
            mDateView = (TextView) view.findViewById(R.id.date);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + "'";
        }
    }
}
