package br.caos.guiasw.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import br.caos.guiasw.R;
import br.caos.guiasw.estaticos.VariaveisEstaticas;
import br.caos.guiasw.model.Monstro;

/**
 * Created by Filipe on 21/08/2016.
 */
public class FragmentDetalheMonstro extends Fragment {

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


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_detalhe_monstro, container, false);

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


        if(VariaveisEstaticas.getMonstroEstatico() != null){
            Monstro monstroSelecioando = VariaveisEstaticas.getMonstroEstatico();
            tvNome.setText(monstroSelecioando.getNome());
            ivImagem.setImageBitmap(monstroSelecioando.getImgGrande());
            tvVida.setText(monstroSelecioando.getVida().toString());
            tvAtaque.setText(monstroSelecioando.getAtaque().toString());
            tvDefesa.setText(monstroSelecioando.getDefesa().toString());
            tvVelocidade.setText(monstroSelecioando.getVelocidade().toString());
            tvChanceCrit.setText(monstroSelecioando.getChanceCritico().toString() + "%");
            tvCriticalDmg.setText(monstroSelecioando.getDanoCritico().toString() + "%");
            tvResistencia.setText(monstroSelecioando.getResistencia().toString() + "%");
            tvPrecisao.setText(monstroSelecioando.getPrecisao().toString() + "%");
        }

        return view;
    }
}
