package io.github.nickid2018.dejava.ast;

import io.github.nickid2018.dejava.api.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


class FieldDeclTest {
    @Test
    void test() {
        var result = new FieldDecl(Typename.of("int"), "field0", null)
            .addModifiers(Modifiers.PUBLIC).toSource();
        assertEquals("public int field0", result);
        System.out.println(result);
    }
    // public int field0[];
}
