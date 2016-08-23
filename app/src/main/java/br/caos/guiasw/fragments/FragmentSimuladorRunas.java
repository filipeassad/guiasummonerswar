package br.caos.guiasw.fragments;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import br.caos.guiasw.R;
import br.caos.guiasw.estaticos.VariaveisEstaticas;
import br.caos.guiasw.model.Monstro;

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
                    Toast.makeText(getContext(),"Runa 1", Toast.LENGTH_SHORT).show();
                    return true;
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
                    Toast.makeText(getContext(),"Runa 2", Toast.LENGTH_SHORT).show();
                    return true;
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
                    Toast.makeText(getContext(),"Runa 3", Toast.LENGTH_SHORT).show();
                    return true;
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
                    Toast.makeText(getContext(),"Runa 4", Toast.LENGTH_SHORT).show();
                    return true;
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
                    Toast.makeText(getContext(),"Runa 5", Toast.LENGTH_SHORT).show();
                    return true;
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
                    Toast.makeText(getContext(),"Runa 6", Toast.LENGTH_SHORT).show();
                    return true;
                }
            }
        });

    }
}
