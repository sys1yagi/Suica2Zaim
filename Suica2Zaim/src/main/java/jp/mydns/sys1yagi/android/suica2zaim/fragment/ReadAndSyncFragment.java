/**
 * 
 */
package jp.mydns.sys1yagi.android.suica2zaim.fragment;


import jp.mydns.sys1yagi.android.suica2zaim.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author yagitoshihiro
 *
 */
public class ReadAndSyncFragment extends Fragment {

    /**
     * 
     */
    public ReadAndSyncFragment() {

    }
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.read_and_sync_fragment, container, false);
        
        return view;
    }
    
    private void initUI(){
        
    }
}
