package pac1.exemple.masterdetail;

import android.app.Activity;
import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import pac1.exemple.masterdetail.modelo.BookModel;

/**
 * A fragment representing a single Item detail screen.
 * This fragment is either contained in a {@link BookListActivity}
 * in two-pane mode (on tablets) or a {@link BookDetailActivity}
 * on handsets.
 */
public class BookDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private BookModel.BookItem mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public BookDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mItem = BookModel.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);

            //És el títol del toolbar, si ho trec surt ITEM
            if (appBarLayout != null) {
                appBarLayout.setTitle("Título:  " + mItem.Título);
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        //********************************************************************

        //AQUI EST EL TEMA ! ! ! !
        //View rootView = inflater.inflate(R.layout.book_detail, container, false);
        View rootView = inflater.inflate(R.layout.book_detail, container, false);
        //AQUI EST EL TEMA ! ! ! !

        //*********************************************************************+




        // Show the dummy content as text in a TextView.
        if (mItem != null) {
            //((TextView) rootView.findViewById(R.id.txtnombre)).setText(mItem.nombre + "  " + mItem.apellido);
            ((TextView) rootView.findViewById(R.id.txtTítulo)).setText("Título:  " + mItem.Título + "  Autor: " + mItem.Autor);
            ((TextView) rootView.findViewById(R.id.txtFechaPub)).setText(mItem.fecha_pub.toString());
            ((TextView) rootView.findViewById(R.id.txtDescripcion)).setText(mItem.Descripción);
            ((TextView) rootView.findViewById(R.id.txtURL_imagen)).setText(mItem.URL_imagen);
    }

        return rootView;
    }
}
