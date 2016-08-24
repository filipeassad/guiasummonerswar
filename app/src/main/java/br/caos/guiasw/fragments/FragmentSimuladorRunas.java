package br.caos.guiasw.fragments;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import br.caos.guiasw.R;
import br.caos.guiasw.adapters.RunaAdapter;
import br.caos.guiasw.estaticos.VariaveisEstaticas;
import br.caos.guiasw.model.Monstro;
import br.caos.guiasw.model.Runa;
import br.caos.guiasw.model.RunaBoard;
import br.caos.guiasw.persistencia.RunaBoardDataSource;
import br.caos.guiasw.persistencia.RunaDataSource;

/**
 * Created by 0118431 on 22/08/2016.
 */
public class FragmentSimuladorRunas extends Fragment {

    private TextView tvNome;
    private ImageView ivImagem;
    private TextView tvVida;
    private TextView tvAtaque;
    private TextView tvDefesa;
    private TextView tvVelocidade;
    private TextView tvChanceCrit;
    private TextView tvCriticalDmg;
    private TextView tvResistencia;
    private TextView tvPrecisao;

    private TextView tvVidaRuna;
    private TextView tvAtaqueRuna;
    private TextView tvDefesaRuna;
    private TextView tvVelocidadeRuna;
    private TextView tvChanceCritRuna;
    private TextView tvCriticalDmgRuna;
    private TextView tvResistenciaRuna;
    private TextView tvPrecisaoRuna;

    private ImageView ivRuna1;
    private ImageView ivRuna2;
    private ImageView ivRuna3;
    private ImageView ivRuna4;
    private ImageView ivRuna5;
    private ImageView ivRuna6;

    private Runa runaSelecionada;
    private RunaBoard runaBoardSelecionada;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_simulador_runas, container, false);

        tvNome          = (TextView) view.findViewById(R.id.tvNome);
        ivImagem        = (ImageView) view.findViewById(R.id.ivImagem);
        tvVida          = (TextView) view.findViewById(R.id.tvVida);
        tvAtaque        = (TextView) view.findViewById(R.id.tvAtaque);
        tvDefesa        = (TextView) view.findViewById(R.id.tvDefesa);
        tvVelocidade    = (TextView) view.findViewById(R.id.tvVelocidade);
        tvChanceCrit    = (TextView) view.findViewById(R.id.tvChanceCrit);
        tvCriticalDmg   = (TextView) view.findViewById(R.id.tvCriticalDmg);
        tvResistencia   = (TextView) view.findViewById(R.id.tvResistencia);
        tvPrecisao      = (TextView) view.findViewById(R.id.tvPrecisao);

        tvVidaRuna          = (TextView) view.findViewById(R.id.tvVidaRuna);
        tvAtaqueRuna        = (TextView) view.findViewById(R.id.tvAtaqueRuna);
        tvDefesaRuna        = (TextView) view.findViewById(R.id.tvDefesaRuna);
        tvVelocidadeRuna    = (TextView) view.findViewById(R.id.tvVelocidadeRuna);
        tvChanceCritRuna    = (TextView) view.findViewById(R.id.tvChanceCritRuna);
        tvCriticalDmgRuna   = (TextView) view.findViewById(R.id.tvCriticalDmgRuna);
        tvResistenciaRuna   = (TextView) view.findViewById(R.id.tvResistenciaRuna);
        tvPrecisaoRuna      = (TextView) view.findViewById(R.id.tvPrecisaoRuna);

        ivRuna1 = (ImageView) view.findViewById(R.id.ivRuna1);
        ivRuna2 = (ImageView) view.findViewById(R.id.ivRuna2);
        ivRuna3 = (ImageView) view.findViewById(R.id.ivRuna3);
        ivRuna4 = (ImageView) view.findViewById(R.id.ivRuna4);
        ivRuna5 = (ImageView) view.findViewById(R.id.ivRuna5);
        ivRuna6 = (ImageView) view.findViewById(R.id.ivRuna6);

        ivRuna1.setDrawingCacheEnabled(true);
        ivRuna2.setDrawingCacheEnabled(true);
        ivRuna3.setDrawingCacheEnabled(true);
        ivRuna4.setDrawingCacheEnabled(true);
        ivRuna5.setDrawingCacheEnabled(true);
        ivRuna6.setDrawingCacheEnabled(true);

        if(VariaveisEstaticas.getMonstroEstatico() != null){
            Monstro monstroSelecioando = VariaveisEstaticas.getMonstroEstatico();
            tvNome.setText(monstroSelecioando.getNome());
            ivImagem.setImageBitmap(monstroSelecioando.getImgPequena());
            tvVida.setText(monstroSelecioando.getVida().toString());
            tvAtaque.setText(monstroSelecioando.getAtaque().toString());
            tvDefesa.setText(monstroSelecioando.getDefesa().toString());
            tvVelocidade.setText(monstroSelecioando.getVelocidade().toString());
            tvChanceCrit.setText(monstroSelecioando.getChanceCritico().toString() + "%");
            tvCriticalDmg.setText(monstroSelecioando.getDanoCritico().toString() + "%");
            tvResistencia.setText(monstroSelecioando.getResistencia().toString() + "%");
            tvPrecisao.setText(monstroSelecioando.getPrecisao().toString() + "%");
        }

        acoesImagens();

        return view;

    }

    private void acoesImagens(){

        ivRuna1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                Bitmap bmp = Bitmap.createBitmap(v.getDrawingCache());
                int color = bmp.getPixel((int) event.getX(), (int) event.getY());
                if (color == Color.TRANSPARENT)
                    return false;
                else {
                    criaDialog(ivRuna1, 1);
                    return false;
                }
            }
        });

        ivRuna2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                Bitmap bmp = Bitmap.createBitmap(v.getDrawingCache());
                int color = bmp.getPixel((int) event.getX(), (int) event.getY());
                if (color == Color.TRANSPARENT)
                    return false;
                else {
                    criaDialog(ivRuna2, 2);
                    return false;
                }
            }
        });

        ivRuna3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                Bitmap bmp = Bitmap.createBitmap(v.getDrawingCache());
                int color = bmp.getPixel((int) event.getX(), (int) event.getY());
                if (color == Color.TRANSPARENT)
                    return false;
                else {
                    criaDialog(ivRuna3, 3);
                    return false;
                }
            }
        });

        ivRuna4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                Bitmap bmp = Bitmap.createBitmap(v.getDrawingCache());
                int color = bmp.getPixel((int) event.getX(), (int) event.getY());
                if (color == Color.TRANSPARENT)
                    return false;
                else {
                    criaDialog(ivRuna4, 4);
                    return false;
                }
            }
        });

        ivRuna5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                Bitmap bmp = Bitmap.createBitmap(v.getDrawingCache());
                int color = bmp.getPixel((int) event.getX(), (int) event.getY());
                if (color == Color.TRANSPARENT)
                    return false;
                else {
                    criaDialog(ivRuna5, 5);
                    return false;
                }
            }
        });

        ivRuna6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                Bitmap bmp = Bitmap.createBitmap(v.getDrawingCache());
                int color = bmp.getPixel((int) event.getX(), (int) event.getY());
                if (color == Color.TRANSPARENT)
                    return false;
                else {
                    criaDialog(ivRuna6, 6);
                    return false;
                }
            }
        });

    }

    private void criaDialog(final View view, final int numero){

        final Dialog dialog = new Dialog(getContext());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_runa);

        ImageView ivSair            = (ImageView) dialog.findViewById(R.id.ivSair);
        final Spinner spTipoRuna    = (Spinner) dialog.findViewById(R.id.spTipoRuna);
        Button btnSelecionar        = (Button) dialog.findViewById(R.id.btnSelecionar);

        RunaDataSource runaDataSource = new RunaDataSource(getContext());

        List<Runa> listRuna =  runaDataSource.getAllRunas();

        RunaAdapter runaAdapter = new RunaAdapter(getContext(), R.layout.adapter_runa, R.id.tvNome,listRuna);
        spTipoRuna.setAdapter(runaAdapter);

        runaSelecionada = (Runa) spTipoRuna.getItemAtPosition(0);

        ivSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        btnSelecionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(runaSelecionada != null){
                    changeImagem(view, numero);
                }
                dialog.dismiss();
            }
        });

        spTipoRuna.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                runaSelecionada = (Runa) spTipoRuna.getItemAtPosition(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        dialog.show();

    }

    public void changeImagem(View view, int numero){

        RunaBoardDataSource runaBoardDataSource = new RunaBoardDataSource(getContext());
        RunaBoard runaBoard = runaBoardDataSource.getRuBoByNomeNum(runaSelecionada.getNome().trim(), numero);

        if(runaBoard != null){
            ((ImageView) view).setImageBitmap(runaBoard.getImagem());
        }

    }
}
