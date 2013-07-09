package jp.mydns.sys1yagi.android.suica2zaim.model;

import java.util.Date;

/**
 * Created by yagitoshihiro on 2013/07/09.
 */
public interface History {
    Date getDate();
    String getSummary();
    Integer getAmount();
}
