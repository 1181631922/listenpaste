package com.example.listenpaste;

import android.annotation.SuppressLint;
import android.content.ClipboardManager;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.EditText;
import android.widget.Toast;

public class AddTextMyEditText extends EditText {
	/**
	 * 粘贴id
	 */
	private static final int ID_PASTE = android.R.id.paste;

	public AddTextMyEditText(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public AddTextMyEditText(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	public AddTextMyEditText(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}

	@SuppressLint("NewApi")
	@SuppressWarnings("deprecation")
	@Override
	public boolean onTextContextMenuItem(int id) {
		if (id == ID_PASTE) {
		      ClipboardManager clip = (ClipboardManager)getContext().getSystemService(Context.CLIPBOARD_SERVICE);
              //改变粘贴版中的内容
		      clip.setText("增加的内容 ==>"+clip.getText());
		}
		return super.onTextContextMenuItem(id);
	}

}
