package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class Item extends JsObject  {

    
    private String classNames;
    private String[] classNames1;
    private Boolean enabled;
    private String eventType;
    private String href;
    private String iconClass;
    private Double index;
    private Boolean scrollable;
    private Item[] subMenu;
    private String target;
    private String text;

    
    public Item(String classNames, Boolean enabled, String eventType, String href, String iconClass, Double index, Boolean scrollable, Item[] subMenu, String target, String text) {
        this.classNames = classNames;
        this.enabled = enabled;
        this.eventType = eventType;
        this.href = href;
        this.iconClass = iconClass;
        this.index = index;
        this.scrollable = scrollable;
        this.subMenu = subMenu;
        this.target = target;
        this.text = text;

        js.append(String.format(Locale.US, "{classNames: %s,enabled: %b,eventType: %s,href: %s,iconClass: %s,index: %f,scrollable: %b,subMenu: %s,target: %s,text: %s}",  classNames, enabled, eventType, href, iconClass, index, scrollable, arrayToString(subMenu), target, text));
    }
    public Item(String[] classNames1, Boolean enabled, String eventType, String href, String iconClass, Double index, Boolean scrollable, Item[] subMenu, String target, String text) {
        this.classNames1 = classNames1;
        this.enabled = enabled;
        this.eventType = eventType;
        this.href = href;
        this.iconClass = iconClass;
        this.index = index;
        this.scrollable = scrollable;
        this.subMenu = subMenu;
        this.target = target;
        this.text = text;

        js.append(String.format(Locale.US, "{classNames: %s,enabled: %b,eventType: %s,href: %s,iconClass: %s,index: %f,scrollable: %b,subMenu: %s,target: %s,text: %s}",  Arrays.toString(classNames1), enabled, eventType, href, iconClass, index, scrollable, arrayToString(subMenu), target, text));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}