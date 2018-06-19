package institucionalempresa.cursoandroid.com.atminstitucionalempresa;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {

    private ImageView sobreEmpresa;
    private ImageView sobreServicos;
    private ImageView sobreClientes;
    private ImageView sobreContato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sobreEmpresa  = findViewById(R.id.sobreEmpresa);
        sobreServicos = findViewById(R.id.sobreServicos);
        sobreClientes = findViewById(R.id.sobreClientes);
        sobreContato  = findViewById(R.id.sobreContato);

        sobreEmpresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SobreEmpresaActivity.class));
            }
        });
    }
}
