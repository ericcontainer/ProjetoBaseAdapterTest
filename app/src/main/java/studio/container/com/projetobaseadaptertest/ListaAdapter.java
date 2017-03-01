package studio.container.com.projetobaseadaptertest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eric on 28/02/2017.
 */

public class ListaAdapter extends ArrayAdapter {

    List list = new ArrayList();

    public ListaAdapter(Context context, int resource) {
        super(context, resource);
    }

    static class  Handle {
        ImageView img;
        TextView desc;
        TextView valor;
    }

    @Override
    public void add(Object object) {
        super.add(object);
        list.add(object);
    }


    @Override
    public int getCount() {
        return this.list.size();
    }

    @Nullable
    @Override
    public Object getItem(int position) {
        return this.list.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row;
        row = convertView;
        Handle  handle;
        if (row == null){
            LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.row_layout, parent, false);
            handle = new Handle();
            handle.img = (ImageView) row.findViewById(R.id.img_vegetable);
            handle.desc = (TextView) row.findViewById(R.id.tv_desc);
            handle.valor = (TextView) row.findViewById(R.id.tv_valor);
            row.setTag(handle);
        }else{
            handle = (Handle) row.getTag();
        }

        Carrinho c;
        c = (Carrinho) this.getItem(position);
        handle.img.setImageResource(c.getImageProduto());
        handle.valor.setText(c.getValor());
        handle.desc.setText(c.getDescricao());

        return row;
    }
}
