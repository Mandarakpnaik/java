package com.xworkz.plant.external;

import com.xworkz.plant.internal.MangoTree;
import com.xworkz.plant.internal.Tree;

public class PlantRunner {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.displayTree();
        tree.displayPlant();
        MangoTree mango = new MangoTree();
        mango.displayPlant();
        mango.displayMangoTree();
    }
}
