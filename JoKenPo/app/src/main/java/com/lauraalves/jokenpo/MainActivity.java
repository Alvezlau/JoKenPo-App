package com.lauraalves.jokenpo;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void selecionarPedra(View view){
        verificarVitoria(esc="pedra");

    }
    public void selecionarPapel(View view){

        verificarVitoria(escolhaUsuario="papel");
    }
    public void selecionarTesoura(View view){

        verificarVitoria(escolhaUsuario="tesoura");
    }

    private String escolherAleatório(){
    String [] opcoes = {"pedra", "papel", "tesoura"};

    int aleatorio = new Random().nextInt(3);
    ImageView imageApp findViewById(R.id.imagepadrao);
    String escolha = opcoes(aleatorio)

    switch (escolha){
        case "pedra":
            imageApp.setImageResource(R.drawable.preda);
            break;
        case "papel":
            imageApp.setImageResource(R.drawable.papel);
            break;
        case "tesoura":
            imageApp.setImageResource(R.drawable.tesoura);
    }//Fim switch

        return escolha;

    private void verificarVitoria(String escolhaUsuario){
            String escolhaAleatoria = escolherAleatório();
            TextView textoResult = findViewById(R.id.textresultado)

            if
            (escolhaAleatoria == "pedra" && escolhaUsuario == "tesoura")||
            (escolhaAleatoria == "papel" && escolhaUsuario == "pedra")||
            (escolhaAleatoria == "tesoura" && escolhaUsuario == "papel")
            {//appganha
                textoResult.setText("Você perdeu, noob!");
                //}
                else if (escolhaUsuario == escolhaAleatoria)
                    textoResult.setText("Empate, noob!");};

            else {textoResult.setText("Você ganhou, mas era fácil.");}
}