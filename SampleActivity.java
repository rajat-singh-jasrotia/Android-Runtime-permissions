package android.com.runtimepermission;

import android.Manifest;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;

public class SampleActivity extends GrantRunTimePermissionActivity {

    RelativeLayout relativeLayout;
    private SharedPreferences mSharedPreference;
    int i=0;
    int requestCode=100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
        relativeLayout=(RelativeLayout)findViewById(R.id.rl_parent);
        findViewById(R.id.btn_demo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grantPermission(new String[]{Manifest.permission.WRITE_CALENDAR,
                        Manifest.permission.ACCESS_FINE_LOCATION,
                        Manifest.permission.CAMERA}, requestCode, "Permissions explanation", relativeLayout, "Tag1");
            }
        });
    }

    @Override
    public void onPermissionResult(String[] permissionList, int requestCode, boolean isAllGranted, int[] grantResult) {
        Log.e("Permissions Callback:::","Inside calling activity");
    }

}
