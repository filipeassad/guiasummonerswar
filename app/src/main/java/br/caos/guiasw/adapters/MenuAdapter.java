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

/**
 * Created by 0118431 on 19/08/2016.
 */
public class MenuAdapter extends ArrayAdapter<String>{

    private Context mContext;
    private int mResource;

    public MenuAdapter(Context context, int resource, List<String> objects) {
        super(context, resource, objects);
        mContext    = context;
        mResource   = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView==null){
            LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
            convertView = inflater.inflate(mResource, parent, false);
        }

        TextView textView = (TextView) convertView.findViewById(R.id.tvItemMenu);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.ivItemMenu);

        textView.setText(getItem(position));

        if(getItem(position).equals("Monstros")){
            imageView.setImageResource(R.drawable.icomenunav);
        }else if(getItem(position).equals("Farms")){
            imageView.setImageResource(R.drawable.expbooster);
        }else if(getItem(position).equals("Time DG")){
            imageView.setImageResource(R.drawable.guardianfire);
        }else if(getItem(position).equals("Time Batalha")){
            imageView.setImageResource(R.drawable.guilda);
        }else if(getItem(position).equals("Montagem de Runas")){
            imageView.setImageResource(R.drawable.runas);
        }else{
            imageView.setImageResource(R.drawable.legendaryl);
        }

        return convertView;
    }
}
