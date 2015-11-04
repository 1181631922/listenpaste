package com.example.listenpaste;

import android.annotation.SuppressLint;
import android.content.ClipboardManager;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.EditText;
import android.widget.Toast;

public class MyEditText extends EditText {
	/**
	 * Õ³Ìùid
	 */
	private static final int ID_PASTE = android.R.id.paste;

	public MyEditText(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public MyEditText(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	public MyEditText(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}

	@SuppressLint("NewApi")
	@Override
	public boolean onTextContextMenuItem(int id) {
		//Õ³Ìû°å
		ClipboardManager clip = (ClipboardManager) getContext().getSystemService(Context.CLIPBOARD_SERVICE);

		System.out.println("id:" + id);
		// Õ³Ìù°åÄÚÈİ
		@SuppressWarnings("deprecation")
		CharSequence paste = clip.getText();
		System.out.println("paste = " + paste);
		if (id == ID_PASTE) {
			System.out.println("=====ÔÚÕ³Ìù======");
			Toast toast = Toast.makeText(getContext(), "²»ÄÜÊäÈëÕ³ÌùÄÚÈİ£¬ÇëÊÖÊä£¡", Toast.LENGTH_SHORT);
			toast.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 0);
			toast.show();
			return false;
		}
		return super.onTextContextMenuItem(id);
	}

}
