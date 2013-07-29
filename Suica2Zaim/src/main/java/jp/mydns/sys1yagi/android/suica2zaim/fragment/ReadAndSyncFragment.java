/**
 * 
 */
package jp.mydns.sys1yagi.android.suica2zaim.fragment;


import jp.mydns.sys1yagi.android.suica2zaim.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

/**
 * @author yagitoshihiro
 *
 */
public class ReadAndSyncFragment extends Fragment {
    private final static String TAG = ReadAndSyncFragment.class.getSimpleName();
    /**
     get this object for enclosing objects.
     @return ReadAndSyncFragment this object.
     */
    public ReadAndSyncFragment This() {
        return this;
    }
    /**
     * 
     */
    public ReadAndSyncFragment() {

    }
    
    /* (non-Javadoc)
     * @see android.support.v4.app.Fragment#onCreate(android.os.Bundle)
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.read_and_sync_fragment, container, false);
        
        return view;
    }
    
    private void initUI(View view){
        view.findViewById(R.id.read_button).setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                
            }
        });
    }
}
