package proj1.tamamtamam.thewall;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;


public class PostFragment extends Fragment implements PostsRecyclerViewAdapter.PostClickedListener {

    private RecyclerView mRecyclerView;
    private PostsRecyclerViewAdapter adapter;
    private List<Post> postList;


    public PostFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_post, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        postList = PostListProvider.getList();

        mRecyclerView = getView().findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.addItemDecoration(new DividerItemDecoration(getActivity(),
                DividerItemDecoration.VERTICAL));
        adapter = new PostsRecyclerViewAdapter(getContext(), postList, this);

        mRecyclerView.setAdapter(adapter);
    }

    @Override
    public void postClicked(Post post) {
        Intent myIntent = new Intent(getActivity(), PostDetailsActivity.class);
        myIntent.putExtra("title", post.getTitle());
        myIntent.putExtra("price", post.getPrice());
        myIntent.putExtra("place", post.getPlace());
        myIntent.putExtra("imageUrl", post.getImageUrl());
        getActivity().startActivity(myIntent);
    }
}
