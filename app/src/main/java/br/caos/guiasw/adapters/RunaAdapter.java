package br.caos.guiasw.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import br.caos.guiasw.R;
import br.caos.guiasw.model.Runa;

/**
 * Created by 0118431 on 23/08/2016.
 */
public class RunaAdapter extends ArrayAdapter<Runa> {

    private Context mContext;
    private int mResource;

    public RunaAdapter(Context context, int resource, int textViewResourceId, List<Runa> objects) {
        super(context, resource, textViewResourceId, objects);
        mContext = context;
        mResource = resource;
    }

    public View getCustomView(int position, View convertView, ViewGroup parent) {

        if(convertView==null){
            LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
            convertView = inflater.inflate(mResource, parent, false);
        }

        ImageView ivImagem  = (ImageView) convertView.findViewById(R.id.ivImagem);
        TextView tvNome = (TextView) convertView.findViewById(R.id.tvNome);

        tvNome.setText(getItem(position).getNome().trim());
        ivImagem.setImageBitmap(getItem(position).getImagem());

        /*if (position == 0) {
            // Removing the image view
            img.setVisibility(View.GONE);
            // Setting the size of the text
            tvLanguage.setTextSize(20f);
            // Setting the text Color
            tvLanguage.setTextColor(Color.BLACK);
        }*/

        return convertView;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        return getCustomView(position, convertView, parent);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return getCustomView(position, convertView, parent);
    }
}
