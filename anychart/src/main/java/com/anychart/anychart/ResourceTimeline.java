package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class ResourceTimeline extends Timeline {

    public ResourceTimeline() {

    }

    protected ResourceTimeline(String jsBase) {
        this.jsBase = jsBase;
    }

    protected ResourceTimeline(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Double defaultRowHeight;

    public ResourceTimeline setDefaultRowHeight(Double defaultRowHeight) {
        if (jsBase == null) {
            this.defaultRowHeight = defaultRowHeight;
        } else {
            this.defaultRowHeight = defaultRowHeight;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".defaultRowHeight(%f)", defaultRowHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".defaultRowHeight(%f)", defaultRowHeight));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSdefaultRowHeight() {
        if (defaultRowHeight != null) {
            return String.format(Locale.US, "defaultRowHeight: %f,", defaultRowHeight);
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        if (jsBase == null) {
            js.append("{");
            js.append(generateJSdefaultRowHeight());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}