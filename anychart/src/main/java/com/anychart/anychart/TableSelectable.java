package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class TableSelectable extends JsObject {

    public TableSelectable() {

    }

    protected TableSelectable(String jsBase) {
        this.jsBase = jsBase;
    }

    protected TableSelectable(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Double key;
    private TableSearchMode mode;

    public TableselectableRowProxy setSearch(Double key, TableSearchMode mode) {
        if (jsBase == null) {
            this.key = key;
            this.mode = mode;
        } else {
            this.key = key;
            this.mode = mode;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".search(%f, %s);", key, (mode != null) ? mode.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".search(%f, %s)", key, (mode != null) ? mode.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return new TableselectableRowProxy(jsBase);
    }

    private Double startDate;
    private String startDate1;
    private Double endDate;
    private String endDate1;
    private Interval intervalUnit;
    private Double intervalCount;

    public TableSelectable setSelect(Double startDate, Double endDate, Interval intervalUnit, Double intervalCount) {
        if (jsBase == null) {
            this.startDate = null;
            this.startDate1 = null;
            
            this.startDate = startDate;
            this.endDate = null;
            this.endDate1 = null;
            
            this.endDate = endDate;
            this.intervalUnit = intervalUnit;
            this.intervalCount = intervalCount;
        } else {
            this.startDate = startDate;
            this.endDate = endDate;
            this.intervalUnit = intervalUnit;
            this.intervalCount = intervalCount;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".select(%f, %f, %s, %f)", startDate, endDate, (intervalUnit != null) ? intervalUnit.generateJs() : "null", intervalCount));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".select(%f, %f, %s, %f)", startDate, endDate, (intervalUnit != null) ? intervalUnit.generateJs() : "null", intervalCount));
                js.setLength(0);
            }
        }
        return this;
    }


    public TableSelectable setSelect(Double startDate, String endDate1, Interval intervalUnit, Double intervalCount) {
        if (jsBase == null) {
            this.startDate = null;
            this.startDate1 = null;
            
            this.startDate = startDate;
            this.endDate = null;
            this.endDate1 = null;
            
            this.endDate1 = endDate1;
            this.intervalUnit = intervalUnit;
            this.intervalCount = intervalCount;
        } else {
            this.startDate = startDate;
            this.endDate1 = endDate1;
            this.intervalUnit = intervalUnit;
            this.intervalCount = intervalCount;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".select(%f, %s, %s, %f)", startDate, endDate1, (intervalUnit != null) ? intervalUnit.generateJs() : "null", intervalCount));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".select(%f, %s, %s, %f)", startDate, endDate1, (intervalUnit != null) ? intervalUnit.generateJs() : "null", intervalCount));
                js.setLength(0);
            }
        }
        return this;
    }


    public TableSelectable setSelect(String startDate1, Double endDate, Interval intervalUnit, Double intervalCount) {
        if (jsBase == null) {
            this.startDate = null;
            this.startDate1 = null;
            
            this.startDate1 = startDate1;
            this.endDate = null;
            this.endDate1 = null;
            
            this.endDate = endDate;
            this.intervalUnit = intervalUnit;
            this.intervalCount = intervalCount;
        } else {
            this.startDate1 = startDate1;
            this.endDate = endDate;
            this.intervalUnit = intervalUnit;
            this.intervalCount = intervalCount;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".select(%s, %f, %s, %f)", startDate1, endDate, (intervalUnit != null) ? intervalUnit.generateJs() : "null", intervalCount));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".select(%s, %f, %s, %f)", startDate1, endDate, (intervalUnit != null) ? intervalUnit.generateJs() : "null", intervalCount));
                js.setLength(0);
            }
        }
        return this;
    }


    public TableSelectable setSelect(String startDate1, String endDate1, Interval intervalUnit, Double intervalCount) {
        if (jsBase == null) {
            this.startDate = null;
            this.startDate1 = null;
            
            this.startDate1 = startDate1;
            this.endDate = null;
            this.endDate1 = null;
            
            this.endDate1 = endDate1;
            this.intervalUnit = intervalUnit;
            this.intervalCount = intervalCount;
        } else {
            this.startDate1 = startDate1;
            this.endDate1 = endDate1;
            this.intervalUnit = intervalUnit;
            this.intervalCount = intervalCount;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".select(%s, %s, %s, %f)", startDate1, endDate1, (intervalUnit != null) ? intervalUnit.generateJs() : "null", intervalCount));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".select(%s, %s, %s, %f)", startDate1, endDate1, (intervalUnit != null) ? intervalUnit.generateJs() : "null", intervalCount));
                js.setLength(0);
            }
        }
        return this;
    }

    private Interval intervalUnit1;
    private Double intervalCount1;

    public TableSelectable setSelectAll(Interval intervalUnit1, Double intervalCount1) {
        if (jsBase == null) {
            this.intervalUnit = null;
            this.intervalUnit1 = null;
            
            this.intervalUnit1 = intervalUnit1;
            this.intervalCount = null;
            this.intervalCount1 = null;
            
            this.intervalCount1 = intervalCount1;
        } else {
            this.intervalUnit1 = intervalUnit1;
            this.intervalCount1 = intervalCount1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".selectAll(%s, %f)", (intervalUnit1 != null) ? intervalUnit1.generateJs() : "null", intervalCount1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectAll(%s, %f)", (intervalUnit1 != null) ? intervalUnit1.generateJs() : "null", intervalCount1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSkey() {
        if (key != null) {
            return String.format(Locale.US, "key: %f,", key);
        }
        return "";
    }

    private String generateJSmode() {
        if (mode != null) {
            return String.format(Locale.US, "mode: %s,", (mode != null) ? mode.generateJs() : "null");
        }
        return "";
    }

    private String generateJSstartDate() {
        if (startDate != null) {
            return String.format(Locale.US, "startDate: %f,", startDate);
        }
        return "";
    }

    private String generateJSstartDate1() {
        if (startDate1 != null) {
            return String.format(Locale.US, "startDate: %s,", startDate1);
        }
        return "";
    }

    private String generateJSendDate() {
        if (endDate != null) {
            return String.format(Locale.US, "endDate: %f,", endDate);
        }
        return "";
    }

    private String generateJSendDate1() {
        if (endDate1 != null) {
            return String.format(Locale.US, "endDate: %s,", endDate1);
        }
        return "";
    }

    private String generateJSintervalUnit() {
        if (intervalUnit != null) {
            return String.format(Locale.US, "intervalUnit: %s,", (intervalUnit != null) ? intervalUnit.generateJs() : "null");
        }
        return "";
    }

    private String generateJSintervalCount() {
        if (intervalCount != null) {
            return String.format(Locale.US, "intervalCount: %f,", intervalCount);
        }
        return "";
    }

    private String generateJSintervalUnit1() {
        if (intervalUnit1 != null) {
            return String.format(Locale.US, "intervalUnit: %s,", (intervalUnit1 != null) ? intervalUnit1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSintervalCount1() {
        if (intervalCount1 != null) {
            return String.format(Locale.US, "intervalCount: %f,", intervalCount1);
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
            js.append(generateJSkey());
            js.append(generateJSmode());
            js.append(generateJSstartDate());
            js.append(generateJSstartDate1());
            js.append(generateJSendDate());
            js.append(generateJSendDate1());
            js.append(generateJSintervalUnit());
            js.append(generateJSintervalCount());
            js.append(generateJSintervalUnit1());
            js.append(generateJSintervalCount1());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}