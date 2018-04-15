/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jbadcode.util;

/**
 *
 * @author JBadCode
 * @param <K>
 * @param <V>
 */
public class ComponentMap<K, V> {

    K key;
    V value;
    ComponentMap<K, V> tree;

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public ComponentMap<K, V> getTree() {
        return tree;
    }

    public void setTree(ComponentMap<K, V> tree) {
        this.tree = tree;
    }

}
