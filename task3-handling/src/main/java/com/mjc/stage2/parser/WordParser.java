package com.mjc.stage2.parser;


import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.SymbolLeaf;

public class WordParser extends AbstractTextParser{
    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        for (char letter : string.toCharArray()) {
            abstractTextComponent.add(new SymbolLeaf(letter));
        }
    }

}
