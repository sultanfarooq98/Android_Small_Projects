import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {         super.onCreate(savedInstanceState);         setContentView(R.layout.activity_main);
    }
    public void updateScore(View view) {
        TextView tv  = (TextView)findViewById(R.id.pscore);         String score = tv.getText().toString();

        String[] parts = score.split("/");
        String pscore  = parts[0];
        String pwickets = parts[1];

        int updates = Integer.parseInt(pscore);         updates++;

        pscore = updates+"";
        tv.setText(pscore+"/"+pwickets);


    }
    public void updateWickets(View view) {
        TextView tv  = (TextView)findViewById(R.id.pscore);         String score = tv.getText().toString();

        String[] parts = score.split("/");
        String pscore   = parts[0];
        String pwickets = parts[1];

        int updates = Integer.parseInt(pwickets);         if(updates < 10){             updates++;
        }         else{             return;
        }

        pwickets = updates+"";
        tv.setText(pscore+"/"+pwickets);


    }
    public void reset(View view){
        TextView tv  = (TextView)findViewById(R.id.pscore);

        tv.setText(0+ "/"+ 0); 
