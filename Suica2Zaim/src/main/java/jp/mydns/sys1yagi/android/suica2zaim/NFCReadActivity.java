package jp.mydns.sys1yagi.android.suica2zaim;

import android.app.Activity;
import android.nfc.NfcAdapter;
import android.os.Bundle;

public class NFCReadActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nfcread);
        
        NfcAdapter adapter = NfcAdapter.getDefaultAdapter(this);
        
    }
}
