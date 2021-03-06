package c4stor.com.feheroes.skillview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

import org.w3c.dom.Text;

import c4stor.com.feheroes.R;

/**
 * Created by Nicolas on 20/03/2017.
 */

public class SkillTextView {
    public static final int WEAPON_TYPE = 0;
    public static final int ASSIST_TYPE=1;
    public static final int SPECIAL_TYPE=2;
    public static final int PASSIVE_TYPE=3;


    public static void makeSkillView(Context context, TextView tv, int skillType, String text) {
        Drawable d =null;
        switch(skillType){
            case WEAPON_TYPE:
                d = context.getResources().getDrawable(R.drawable.weapons);
                break;
            case ASSIST_TYPE:
                d = context.getResources().getDrawable(R.drawable.assists);
                break;
            case SPECIAL_TYPE:
                d = context.getResources().getDrawable(R.drawable.specials);
                break;
            case PASSIVE_TYPE:
                d = context.getResources().getDrawable(R.drawable.passives);
                break;
        }
        tv.setCompoundDrawablesWithIntrinsicBounds(d,null,null,null);
        tv.setText(text);
    }
}
