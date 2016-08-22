package br.caos.guiasw.adapters;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import br.caos.guiasw.R;
import br.caos.guiasw.model.Monstro;

/**
 * Created by Filipe on 19/08/2016.
 */
public class MonstroAdapter extends ArrayAdapter<Monstro> {

    private Context mContext;
    private int mResource;

    public MonstroAdapter(Context context, int resource, List<Monstro> objects) {

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

        TextView textView = (TextView) convertView.findViewById(R.id.tvItemMonstro);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.ivItemMonstro);

        textView.setText(getItem(position).getNome());
        //imageView.setBackground(new BitmapDrawable(mContext.getResources(),getItem(position).getImgPequena()));
        imageView.setImageBitmap(getItem(position).getImgPequena());

        return convertView;
    }
}
