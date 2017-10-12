package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class Layer extends Element {

    public Layer() {

    }

    protected Layer(String jsBase) {
        this.jsBase = jsBase;
    }

    protected Layer(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Element element;

    public Layer setAddChild(Element element) {
        if (jsBase == null) {
            this.element = element;
        } else {
            this.element = element;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".addChild(%s)", (element != null) ? element.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addChild(%s)", (element != null) ? element.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private Element element1;
    private Double index;

    public Layer setAddChildAt(Element element1, Double index) {
        if (jsBase == null) {
            this.element = null;
            this.element1 = null;
            
            this.element1 = element1;
            this.index = index;
        } else {
            this.element1 = element1;
            this.index = index;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".addChildAt(%s, %f)", (element1 != null) ? element1.generateJs() : "null", index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addChildAt(%s, %f)", (element1 != null) ? element1.generateJs() : "null", index));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double cx;
    private Double cy;
    private Double radius;

    public Circle setCircle(Double cx, Double cy, Double radius) {
        if (jsBase == null) {
            this.cx = cx;
            this.cy = cy;
            this.radius = radius;
        } else {
            this.cx = cx;
            this.cy = cy;
            this.radius = radius;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".circle(%f, %f, %f);", cx, cy, radius));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".circle(%f, %f, %f)", cx, cy, radius));
                js.setLength(0);
            }
        }
        return new Circle(jsBase);
    }

    private Double cx1;
    private Double cy1;
    private Double rx;
    private Double ry;

    public VectorEllipse setEllipse(Double cx1, Double cy1, Double rx, Double ry) {
        if (jsBase == null) {
            this.cx = null;
            this.cx1 = null;
            
            this.cx1 = cx1;
            this.cy = null;
            this.cy1 = null;
            
            this.cy1 = cy1;
            this.rx = rx;
            this.ry = ry;
        } else {
            this.cx1 = cx1;
            this.cy1 = cy1;
            this.rx = rx;
            this.ry = ry;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".ellipse(%f, %f, %f, %f);", cx1, cy1, rx, ry));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".ellipse(%f, %f, %f, %f)", cx1, cy1, rx, ry));
                js.setLength(0);
            }
        }
        return new VectorEllipse(jsBase);
    }

    private Double index1;

    public Element setGetChildAt(Double index1) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            
            this.index1 = index1;
        } else {
            this.index1 = index1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".getChildAt(%f);", index1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getChildAt(%f)", index1));
                js.setLength(0);
            }
        }
        return new Element(jsBase);
    }

    private Element element2;

    public void setHasChild(Element element2) {
        if (jsBase == null) {
            this.element = null;
            this.element1 = null;
            this.element2 = null;
            
            this.element2 = element2;
        } else {
            this.element2 = element2;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".hasChild(%s);", (element2 != null) ? element2.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hasChild(%s)", (element2 != null) ? element2.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Double x;
    private Double y;
    private String text;

    public VectorText setHtml(Double x, Double y, String text) {
        if (jsBase == null) {
            this.x = x;
            this.y = y;
            this.text = text;
        } else {
            this.x = x;
            this.y = y;
            this.text = text;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".html(%f, %f, %s);", x, y, text));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".html(%f, %f, %s)", x, y, text));
                js.setLength(0);
            }
        }
        return new VectorText(jsBase);
    }

    private String src;
    private Double x1;
    private Double y1;
    private Double width;
    private Double height;

    public Image setImage(String src, Double x1, Double y1, Double width, Double height) {
        if (jsBase == null) {
            this.src = src;
            this.x = null;
            this.x1 = null;
            
            this.x1 = x1;
            this.y = null;
            this.y1 = null;
            
            this.y1 = y1;
            this.width = width;
            this.height = height;
        } else {
            this.src = src;
            this.x1 = x1;
            this.y1 = y1;
            this.width = width;
            this.height = height;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".image(%s, %f, %f, %f, %f);", src, x1, y1, width, height));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".image(%s, %f, %f, %f, %f)", src, x1, y1, width, height));
                js.setLength(0);
            }
        }
        return new Image(jsBase);
    }

    private Element element3;

    public void setIndexOfChild(Element element3) {
        if (jsBase == null) {
            this.element = null;
            this.element1 = null;
            this.element2 = null;
            this.element3 = null;
            
            this.element3 = element3;
        } else {
            this.element3 = element3;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".indexOfChild(%s);", (element3 != null) ? element3.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".indexOfChild(%s)", (element3 != null) ? element3.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Double x2;
    private Double y2;
    private Double width1;
    private Double height1;

    public VectorRect setRect(Double x2, Double y2, Double width1, Double height1) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            this.x2 = null;
            
            this.x2 = x2;
            this.y = null;
            this.y1 = null;
            this.y2 = null;
            
            this.y2 = y2;
            this.width = null;
            this.width1 = null;
            
            this.width1 = width1;
            this.height = null;
            this.height1 = null;
            
            this.height1 = height1;
        } else {
            this.x2 = x2;
            this.y2 = y2;
            this.width1 = width1;
            this.height1 = height1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".rect(%f, %f, %f, %f);", x2, y2, width1, height1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rect(%f, %f, %f, %f)", x2, y2, width1, height1));
                js.setLength(0);
            }
        }
        return new VectorRect(jsBase);
    }

    private Element element4;

    public Element setRemoveChild(Element element4) {
        if (jsBase == null) {
            this.element = null;
            this.element1 = null;
            this.element2 = null;
            this.element3 = null;
            this.element4 = null;
            
            this.element4 = element4;
        } else {
            this.element4 = element4;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".removeChild(%s);", (element4 != null) ? element4.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeChild(%s)", (element4 != null) ? element4.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return new Element(jsBase);
    }

    private Double index2;

    public Element setRemoveChildAt(Double index2) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            
            this.index2 = index2;
        } else {
            this.index2 = index2;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".removeChildAt(%f);", index2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeChildAt(%f)", index2));
                js.setLength(0);
            }
        }
        return new Element(jsBase);
    }

    private Element element5;
    private Element element6;

    public Layer setSwapChildren(Element element5, Element element6) {
        if (jsBase == null) {
            this.element = null;
            this.element1 = null;
            this.element2 = null;
            this.element3 = null;
            this.element4 = null;
            this.element5 = null;
            this.element6 = null;
            
            this.element5 = element5;
            this.element = null;
            this.element1 = null;
            this.element2 = null;
            this.element3 = null;
            this.element4 = null;
            this.element5 = null;
            this.element6 = null;
            
            this.element6 = element6;
        } else {
            this.element5 = element5;
            this.element6 = element6;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".swapChildren(%s, %s)", (element5 != null) ? element5.generateJs() : "null", (element6 != null) ? element6.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".swapChildren(%s, %s)", (element5 != null) ? element5.generateJs() : "null", (element6 != null) ? element6.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double index3;
    private Double index4;

    public Layer setSwapChildrenAt(Double index3, Double index4) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            this.index3 = null;
            this.index4 = null;
            
            this.index3 = index3;
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            this.index3 = null;
            this.index4 = null;
            
            this.index4 = index4;
        } else {
            this.index3 = index3;
            this.index4 = index4;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".swapChildrenAt(%f, %f)", index3, index4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".swapChildrenAt(%f, %f)", index3, index4));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double x3;
    private Double y3;
    private String text1;

    public VectorText setText(Double x3, Double y3, String text1) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            this.x2 = null;
            this.x3 = null;
            
            this.x3 = x3;
            this.y = null;
            this.y1 = null;
            this.y2 = null;
            this.y3 = null;
            
            this.y3 = y3;
            this.text = null;
            this.text1 = null;
            
            this.text1 = text1;
        } else {
            this.x3 = x3;
            this.y3 = y3;
            this.text1 = text1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".text(%f, %f, %s);", x3, y3, text1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".text(%f, %f, %s)", x3, y3, text1));
                js.setLength(0);
            }
        }
        return new VectorText(jsBase);
    }

    private String generateJSelement() {
        if (element != null) {
            return String.format(Locale.US, "element: %s,", (element != null) ? element.generateJs() : "null");
        }
        return "";
    }

    private String generateJSelement1() {
        if (element1 != null) {
            return String.format(Locale.US, "element: %s,", (element1 != null) ? element1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSindex() {
        if (index != null) {
            return String.format(Locale.US, "index: %f,", index);
        }
        return "";
    }

    private String generateJScx() {
        if (cx != null) {
            return String.format(Locale.US, "cx: %f,", cx);
        }
        return "";
    }

    private String generateJScy() {
        if (cy != null) {
            return String.format(Locale.US, "cy: %f,", cy);
        }
        return "";
    }

    private String generateJSradius() {
        if (radius != null) {
            return String.format(Locale.US, "radius: %f,", radius);
        }
        return "";
    }

    private String generateJScx1() {
        if (cx1 != null) {
            return String.format(Locale.US, "cx: %f,", cx1);
        }
        return "";
    }

    private String generateJScy1() {
        if (cy1 != null) {
            return String.format(Locale.US, "cy: %f,", cy1);
        }
        return "";
    }

    private String generateJSrx() {
        if (rx != null) {
            return String.format(Locale.US, "rx: %f,", rx);
        }
        return "";
    }

    private String generateJSry() {
        if (ry != null) {
            return String.format(Locale.US, "ry: %f,", ry);
        }
        return "";
    }

    private String generateJSindex1() {
        if (index1 != null) {
            return String.format(Locale.US, "index: %f,", index1);
        }
        return "";
    }

    private String generateJSelement2() {
        if (element2 != null) {
            return String.format(Locale.US, "element: %s,", (element2 != null) ? element2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSx() {
        if (x != null) {
            return String.format(Locale.US, "x: %f,", x);
        }
        return "";
    }

    private String generateJSy() {
        if (y != null) {
            return String.format(Locale.US, "y: %f,", y);
        }
        return "";
    }

    private String generateJStext() {
        if (text != null) {
            return String.format(Locale.US, "text: %s,", text);
        }
        return "";
    }

    private String generateJSsrc() {
        if (src != null) {
            return String.format(Locale.US, "src: %s,", src);
        }
        return "";
    }

    private String generateJSx1() {
        if (x1 != null) {
            return String.format(Locale.US, "x: %f,", x1);
        }
        return "";
    }

    private String generateJSy1() {
        if (y1 != null) {
            return String.format(Locale.US, "y: %f,", y1);
        }
        return "";
    }

    private String generateJSwidth() {
        if (width != null) {
            return String.format(Locale.US, "width: %f,", width);
        }
        return "";
    }

    private String generateJSheight() {
        if (height != null) {
            return String.format(Locale.US, "height: %f,", height);
        }
        return "";
    }

    private String generateJSelement3() {
        if (element3 != null) {
            return String.format(Locale.US, "element: %s,", (element3 != null) ? element3.generateJs() : "null");
        }
        return "";
    }

    private String generateJSx2() {
        if (x2 != null) {
            return String.format(Locale.US, "x: %f,", x2);
        }
        return "";
    }

    private String generateJSy2() {
        if (y2 != null) {
            return String.format(Locale.US, "y: %f,", y2);
        }
        return "";
    }

    private String generateJSwidth1() {
        if (width1 != null) {
            return String.format(Locale.US, "width: %f,", width1);
        }
        return "";
    }

    private String generateJSheight1() {
        if (height1 != null) {
            return String.format(Locale.US, "height: %f,", height1);
        }
        return "";
    }

    private String generateJSelement4() {
        if (element4 != null) {
            return String.format(Locale.US, "element: %s,", (element4 != null) ? element4.generateJs() : "null");
        }
        return "";
    }

    private String generateJSindex2() {
        if (index2 != null) {
            return String.format(Locale.US, "index: %f,", index2);
        }
        return "";
    }

    private String generateJSelement5() {
        if (element5 != null) {
            return String.format(Locale.US, "element: %s,", (element5 != null) ? element5.generateJs() : "null");
        }
        return "";
    }

    private String generateJSelement6() {
        if (element6 != null) {
            return String.format(Locale.US, "element: %s,", (element6 != null) ? element6.generateJs() : "null");
        }
        return "";
    }

    private String generateJSindex3() {
        if (index3 != null) {
            return String.format(Locale.US, "index: %f,", index3);
        }
        return "";
    }

    private String generateJSindex4() {
        if (index4 != null) {
            return String.format(Locale.US, "index: %f,", index4);
        }
        return "";
    }

    private String generateJSx3() {
        if (x3 != null) {
            return String.format(Locale.US, "x: %f,", x3);
        }
        return "";
    }

    private String generateJSy3() {
        if (y3 != null) {
            return String.format(Locale.US, "y: %f,", y3);
        }
        return "";
    }

    private String generateJStext1() {
        if (text1 != null) {
            return String.format(Locale.US, "text: %s,", text1);
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
            js.append(generateJSelement());
            js.append(generateJSelement1());
            js.append(generateJSindex());
            js.append(generateJScx());
            js.append(generateJScy());
            js.append(generateJSradius());
            js.append(generateJScx1());
            js.append(generateJScy1());
            js.append(generateJSrx());
            js.append(generateJSry());
            js.append(generateJSindex1());
            js.append(generateJSelement2());
            js.append(generateJSx());
            js.append(generateJSy());
            js.append(generateJStext());
            js.append(generateJSsrc());
            js.append(generateJSx1());
            js.append(generateJSy1());
            js.append(generateJSwidth());
            js.append(generateJSheight());
            js.append(generateJSelement3());
            js.append(generateJSx2());
            js.append(generateJSy2());
            js.append(generateJSwidth1());
            js.append(generateJSheight1());
            js.append(generateJSelement4());
            js.append(generateJSindex2());
            js.append(generateJSelement5());
            js.append(generateJSelement6());
            js.append(generateJSindex3());
            js.append(generateJSindex4());
            js.append(generateJSx3());
            js.append(generateJSy3());
            js.append(generateJStext1());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}