package com.example.study3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //리스트에 사용될 아이템
    private  String[] items  = {"망고주스", "키위주스", "사과 주스"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 버튼에 대한 정보를 받아와 버튼 객체를 만듦
        Button listButton = (Button)findViewById(R.id.listButton);
        listButton.setOnClickListener(new View.OnClickListener(){ //버튼을 눌렀을 때 이벤트 실행
             @Override
             //버튼 클릭했을 때 함수 처리 부분
             public void onClick(View v){
                 AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                 builder.setTitle("리스트"); //팝업창에 해당하는 제목

                 //리스트 내부의 내용을 클릭했을 때 이벤트 처리리
                builder.setItems(items, new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i){
                        //자신이 현재 클릭한 내용을 텍스트로서 잠시 띄움
                        Toast.makeText(getApplicationContext(), items[i], Toast.LENGTH_SHORT).show();
                    }
                 });
                
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
             }
        });

        //종료 버튼 이벤트 처리
        Button exitButton = (Button) findViewById(R.id.exitButton); //id를 받아온 후 버튼 객체로 생성
        exitButton.setOnClickListener(new View.OnClickListener(){
            @Override
            // 해당 버튼을 눌렀을 때 onClick 함수 실행
            public void onClick(View v){
                //Dialog.Builder로 객체 할당, 해당 내용을 MainActivity에 종속되도록 함
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("정말로 종료하시겠습니까?"); //해당 빌더에 메세지 설정
                builder.setTitle("종료 알림창")  //제목 설정, 관련 정보 세팅
                        .setCancelable(false)  // 3자가 임의로 종료할 수 없음
                        // Yes 버튼
                        .setPositiveButton("Yes",new DialogInterface.OnClickListener(){
                         @Override
                         public void onClick(DialogInterface dialog, int i){
                          finish(); //함수와 프로그램 종료                             
                    }
                })
                        .setNegativeButton("No", new DialogInterface.OnClickListener(){
                            @Override
                            public void onClick(DialogInterface dialog, int i){
                                dialog.cancel();  // dialog창 종료
                            }
                        });
                AlertDialog alert = builder.create();  //dialog의 객체를 받아옴
                alert.setTitle("종료알림창"); //dialog의 제목 세팅
                alert.show();               //dialog를 보임
                
            }
        });


    }
}