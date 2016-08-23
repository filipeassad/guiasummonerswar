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
import br.caos.guiasw.model.ItemList;

/**
 * Created by 0118431 on 22/08/2016.
 */
public class BasicoAdapter extends ArrayAdapter<ItemList> {

    private Context mContext;
    private int mResource;

    public BasicoAdapter(Context context, int resource, List objects) {

        super(context, resource, objects);

        mContext = context;
        mResource = resource;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView==null){
            LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
            convertView = inflater.inflate(mResource, parent, false);
        }

        TextView tvTitulo = (TextView) convertView.findViewById(R.id.tvTitulo);
        ImageView ivImagem = (ImageView) convertView.findViewById(R.id.ivImagem);

        tvTitulo.setText(getItem(position).getTitulo());
        ivImagem.setImageBitmap(getItem(position).getImagem());

        return convertView;
    }
}
