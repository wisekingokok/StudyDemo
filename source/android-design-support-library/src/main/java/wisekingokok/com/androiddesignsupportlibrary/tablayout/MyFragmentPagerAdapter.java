package wisekingokok.com.androiddesignsupportlibrary.tablayout;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * author: 林彦君(<a href="mailto:linyanjun@danlu.com">linyanjun@danlu.com</a>)<br/>
 * version: 1.0.0<br/>
 * since: 2017-02-04 15:06<br/>
 *
 * <p>
 * 内容描述区域
 * </p>
 */
public class MyFragmentPagerAdapter extends FragmentPagerAdapter {
    public final int COUNT = 15;
    private String[] titles = new String[]{"Tab1", "Tab2", "Tab3", "Tab4", "Tab5"};
    private Context context;

    public MyFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        return PageFragment.newInstance(position + 1);
    }

    @Override
    public int getCount() {
        return COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position%5];
    }
}
