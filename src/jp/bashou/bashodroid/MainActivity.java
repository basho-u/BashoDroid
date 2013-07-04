package jp.bashou.bashodroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final String haiku = "こうもりも　出でよ浮世の　花に鳥";

		((Button)findViewById(R.id.btn_take)).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				v.setVisibility(View.GONE);
				TextView yomifuda = (TextView)findViewById(R.id.txt_haiku);
				yomifuda.setText(haiku);
				yomifuda.setVisibility(View.VISIBLE);
			}
		});
	}

}
