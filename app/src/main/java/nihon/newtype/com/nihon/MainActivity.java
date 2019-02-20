package nihon.newtype.com.nihon;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements CountDownAnimation.CountDownListener {
    private TextView textView;
    private TextView krText;
    private String s="";
    private TextView inputText;
    private String[] hiragana;
    private Button[] btn;
    private CountDownAnimation countDownAnimation;
    private Word[] w;
    private int wordCount;
    private int seconds;
    private ViewFlipper mFlip;
    private boolean startCheck;



    @Override
    protected void onStop() {
        countDownAnimation.cancel();
        super.onStop();
    }

    @Override
    protected void onRestart() {
        countDownAnimation.start();
        super.onRestart();
    }

    private void test(){




        int[] arr = new int[9];  //1차원배열 방 10개를 만듭니다.
        int ran=0;    //랜덤값을 받을 변수를 만듭니다.
        boolean cheak;    // 비교하기 위해 boolean형 변수를 만듭니다.
        Random r = new Random();    // Random형 객체를 만듭니다.

//        int[] temp = {0,1,2,3,4};
//        for(int i=0;i<temp.length;i++){
//            arr[i] = temp[i];
//        }

        String[] temp = w[wordCount].getNum().split(",");

        int count =0;
        for(int i=0;i<temp.length;i++){
            ran = Integer.parseInt(temp[i]);
            cheak = true;
            for (int j=0; j<i; j++) {
                if(arr[j] == ran) {

                    cheak=false;
                }
            }
            if(cheak) {
                arr[i] =  Integer.parseInt(temp[i]);
                count++;
            }
            //arr[i] = Integer.parseInt(temp[i]);
        }
        count++;


        for (int i=count; i<arr.length; i++) {    // 배열의 크기만큼 for문을 돌립니다.
            ran = r.nextInt(72);    // nextInt(10)하면 0-9까지 나오므로  +1을 시켜 1-10까지로 만듭니다.
            cheak = true;    // i문이 돌 때마다 cheak를 true로 만듭니다.
            for (int j=0; j<i; j++) {    //if문 때문에 j를 i값만큼 돌립니다.
                if(arr[j] == ran) {
                    // arr배열의 방은 다 비어있는 상태이고 위에서 nextInt를 해야 하나씩 들어갑니다.
                    // 그러므로 i의 값만큼 배열에  들어가있는 것입니다.
                    // for문을 돌리면서  방금 받은 random값과 배열에 들어있는 값들을 비교하여 같은게 있으면
                    i--;    // i의 값을 하나 줄여 한 번 더 돌게 합니다.
                    cheak=false;    // 목적과는 다르게 같은 값이 나왔으므로 cheak를 false로 만듭니다.
                }
            }
            if(cheak)    // 위의 if문의 조건을 만족하지 않았으면 자동으로 cheak는 true므로 실행이 됩니다.
                arr[i] = ran;    // ran에 받은 값을 arr[i]방에 넣습니다.
        }



        for(int i=0; i<9; i++){

            while(true) {
                ran = r.nextInt(9);
                if (arr[ran] != 777){
                    break;
                }
            }

            btn[i].setText(hiragana[ arr[ran] ]);
            arr[ran] = 777;
        }



    }
    private void makeHiragana(){
        hiragana = new String[72];
        hiragana[0] = "あ";
        hiragana[1] = "い";
        hiragana[2] = "う";
        hiragana[3] = "え";
        hiragana[4] = "お";

        hiragana[5] = "か";
        hiragana[6] = "き";
        hiragana[7] = "く";
        hiragana[8] = "け";
        hiragana[9] = "こ";

        hiragana[10] = "さ";
        hiragana[11] = "し";
        hiragana[12] = "す";
        hiragana[13] = "せ";
        hiragana[14] = "そ";

        hiragana[15] = "た";
        hiragana[16] = "ち";
        hiragana[17] = "つ";
        hiragana[18] = "て";
        hiragana[19] = "と";

        hiragana[20] = "な";
        hiragana[21] = "に";
        hiragana[22] = "ぬ";
        hiragana[23] = "ね";
        hiragana[24] = "の";

        hiragana[25] = "は";
        hiragana[26] = "ひ";
        hiragana[27] = "ふ";
        hiragana[28] = "へ";
        hiragana[29] = "ほ";

        hiragana[30] = "ま";
        hiragana[31] = "み";
        hiragana[32] = "む";
        hiragana[33] = "め";
        hiragana[34] = "も";

        hiragana[35] = "や";
        hiragana[36] = "ゆ";
        hiragana[37] = "よ";

        hiragana[38] = "ら";
        hiragana[39] = "り";
        hiragana[40] = "る";
        hiragana[41] = "れ";
        hiragana[42] = "ろ";

        hiragana[43] = "わ";
        hiragana[44] = "を";

        hiragana[45] = "ん";

        hiragana[46] = "が";
        hiragana[47] = "ぎ";
        hiragana[48] = "ぐ";
        hiragana[49] = "げ";
        hiragana[50] = "ご";

        hiragana[51] = "ざ";
        hiragana[52] = "じ";
        hiragana[53] = "ず";
        hiragana[54] = "ぜ";
        hiragana[55] = "ぞ";

        hiragana[56] = "だ";
        hiragana[57] = "ぢ";
        hiragana[58] = "づ";
        hiragana[59] = "で";
        hiragana[60] = "ど";

        hiragana[61] = "ば";
        hiragana[62] = "び";
        hiragana[63] = "ぶ";
        hiragana[64] = "べ";
        hiragana[65] = "ぼ";

        hiragana[66] = "ぱ";
        hiragana[67] = "ぴ";
        hiragana[68] = "ぷ";
        hiragana[69] = "ぺ";
        hiragana[70] = "ぽ";

        hiragana[71] = "-";

    }
    private void initBtnId(){
        btn = new Button[9];
        btn[0] = (Button)findViewById(R.id.btn0);
        btn[1] = (Button)findViewById(R.id.btn1);
        btn[2] = (Button)findViewById(R.id.btn2);
        btn[3] = (Button)findViewById(R.id.btn3);
        btn[4] = (Button)findViewById(R.id.btn4);
        btn[5] = (Button)findViewById(R.id.btn5);
        btn[6] = (Button)findViewById(R.id.btn6);
        btn[7] = (Button)findViewById(R.id.btn7);
        btn[8] = (Button)findViewById(R.id.btn8);
    }
    private void initCountDownAnimation() {
        countDownAnimation = new CountDownAnimation(textView, getStartCount());
        countDownAnimation.setCountDownListener(this);
    }
    private int getStartCount() {
        return seconds;
    }
    private void startCountDownAnimation() {
        // Customizable animation

            // Use scale animation
            Animation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f,
                    0.0f, Animation.RELATIVE_TO_SELF, 0.5f,
                    Animation.RELATIVE_TO_SELF, 0.5f);
            countDownAnimation.setAnimation(scaleAnimation);


        // Customizable start count
        countDownAnimation.setStartCount(getStartCount());
        countDownAnimation.start();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        inputText = (TextView)findViewById(R.id.inputText);
        krText = (TextView)findViewById(R.id.krText);
        mFlip = (ViewFlipper)findViewById(R.id.flip);
        seconds = 3;
        startCheck = true;
        initCountDownAnimation();
        startCountDownAnimation();
        initBtnId();
        makeHiragana();
        Hiragana h = new Hiragana();
        wordCount =0;
        w = new Word[3];
        w[0] = new Word("지갑",h.romaToJp("sa,i,hu,"),h.getNumber());
        w[1] = new Word("책방",h.romaToJp("ho,n,ya,"),h.getNumber());
        w[2] = new Word("꽃집",h.romaToJp("ha,na,ya,"),h.getNumber());
    }

    @Override
    public void onCountDownEnd(CountDownAnimation animation) {
        String z = w[wordCount].getJp();
        if(s.equals(z)){
            MyToast.show(this, "すごい", false);

            if(wordCount == (w.length-1)){
                wordCount=0;
            }
            else{
           wordCount++;
            }


        }
        else{
            if(startCheck){

                startCheck = false;
            }
            else{
                MyToast2.show(this,z, false);
            }


        }
      //  MyToast2.show(this, "", false);
       // mFlip.showNext();
          // mFlip.setOutAnimation(AnimationUtils.loadAnimation(this, R.anim.viewout));
         //mFlip.setInAnimation(AnimationUtils.loadAnimation(this, R.anim.viewin));
       // mFlip.setInAnimation(AnimationUtils.loadAnimation(this, R.anim.viewdown));
       // mFlip.setOutAnimation(AnimationUtils.loadAnimation(this, R.anim.viewup));

        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                krText.setText(w[wordCount].getKo());
                s="";
                inputText.setText(s);
                test();

                seconds = w[wordCount].getJp().length()+2;
                startCountDownAnimation();
            }
        }, 2000);


    }

    public void btnClick(View view) {

        Button b = (Button)findViewById(view.getId());
        s += b.getText().toString();
        inputText.setText(s);

    }

}
