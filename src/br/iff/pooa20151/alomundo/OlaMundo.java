package br.iff.pooa20151.alomundo;


import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class OlaMundo extends Activity {

	private EditText edNome;
	private Button btEnviar;
	private Button btModal;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ola_mundo);

		edNome = (EditText) findViewById(R.id.edNome);
		btEnviar = (Button) findViewById(R.id.btEnviar);
		btModal = (Button) findViewById(R.id.btModal);

		btEnviar.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
				Toast.makeText(getApplicationContext(), edNome.getText(),
						Toast.LENGTH_LONG).show();
			}
		});

		// Definicao do evento de clique do botao - exibir confirmacao
		btModal.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
				AlertDialog.Builder builder = new AlertDialog.Builder(
						OlaMundo.this);
				builder.setMessage(getApplicationContext().getString(
						R.string.operacao));
				builder.setNeutralButton("OK", null);
				AlertDialog dialog = builder.create();
				dialog.setTitle("Resultado da execução");
				dialog.show();
			}
		});

		Log.i("Ciclo de Vida", "OnCreate");
	}

	protected void onStart(Bundle savedInstanceState) {
		super.onStart();
		Log.i("Ciclo de Vida", "OnStart");
	}

	protected void onResume(Bundle savedInstanceState) {
		super.onResume();
		Log.i("Ciclo de Vida", "REsume");
	}

}
