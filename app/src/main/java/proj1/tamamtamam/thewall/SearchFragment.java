package proj1.tamamtamam.thewall;

import android.arch.lifecycle.ViewModelStoreOwner;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class SearchFragment extends Fragment implements View.OnClickListener {

    private RecyclerView mRecyclerView;
    private PostsRecyclerViewAdapter adapter;
    private List<Post> postList;


    public SearchFragment() {
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
        return inflater.inflate(R.layout.fragment_search, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);;

        postList = new ArrayList<>();
        postList.add(new Post(1, "a used laptop", "downtown resort", "$200"));
        postList.add(new Post(2, "a used charger", "downtown resort", "$10"));
        mRecyclerView = getView().findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.addItemDecoration(new DividerItemDecoration(getActivity(),
                DividerItemDecoration.VERTICAL));
        adapter = new PostsRecyclerViewAdapter(getContext(), postList, this);

        mRecyclerView.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {

    }
}
