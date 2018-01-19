package cn.edu.hznu.aitcm;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ConstitutionIntroductionActivity extends AppCompatActivity {

    private LinearLayout statuBar;
    private ImageView back_to_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constitution_introduction);

        statuBar = (LinearLayout)findViewById(R.id.statuBar);
        statuBar.setMinimumHeight(getStatusBarHeight(getWindow().getContext()));

        back_to_home = (ImageView) findViewById(R.id.back_to_home);
        back_to_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConstitutionIntroductionActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

    /*用于获取状态栏的高度*/
    private static int getStatusBarHeight(Context context) {
        int statusBarHeight = 0;
        Resources res = context.getResources();
        int resourceId = res.getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            statusBarHeight = res.getDimensionPixelSize(resourceId);
        }
        return statusBarHeight;
    }
}
