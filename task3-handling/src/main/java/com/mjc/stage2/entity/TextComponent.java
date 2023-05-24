package com.mjc.stage2.entity;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class TextComponent extends AbstractTextComponent {
    protected List<AbstractTextComponent> componentList = new ArrayList<>();
    private int size = 0;

    public TextComponent(TextComponentType componentType) {
        super(componentType);
    }

    @Override
    public String operation() {
        StringBuilder text = new StringBuilder();
        componentList.forEach(component -> text
                .append(component.operation())
                .append(component.getComponentType().getDelimiter()));
        return text.toString();
    }

    @Override
    public void add(AbstractTextComponent textComponent) {
        if (componentList.add(textComponent)) {
            size++;
        }
    }

    @Override
    public void remove(AbstractTextComponent textComponent) {
        if (componentList.remove(textComponent)) {
            size--;
        }
    }

    @Override
    public int getSize() {
        return size;
    }
// Write your code here!
}
