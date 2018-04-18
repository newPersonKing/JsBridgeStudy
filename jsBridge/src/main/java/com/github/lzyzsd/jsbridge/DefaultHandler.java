package com.github.lzyzsd.jsbridge;

import android.util.Log;

public class DefaultHandler implements BridgeHandler{

	String TAG = "DefaultHandler";
	
	@Override
	public void handler(String data, CallBackFunction function) {
		if(function != null){
			Log.i("cccccccccccc","data===这里接收send的消息-=="+data);
			function.onCallBack("DefaultHandler response data");
		}
	}

}
