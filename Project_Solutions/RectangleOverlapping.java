package com.Project17;
import java.util.Arrays;
import java.util.*;
import java.awt.Point;

public class RectangleOverlapping {
    public static void main(String[] args) {
        String[] strArr = {"(0,0),(0,-2),(3,0),(3,-2),(2,-1),(3,-1),(2,3),(3,3)"};
        int numOverlapInRect1 = overlappingRectangles(strArr);
        System.out.println(numOverlapInRect1);
    }

    public static int overlappingRectangles(String[] strArr) {
        int[] rect1 = parseRectangle(strArr[0]);
        int[] rect2 = parseRectangle(strArr[1]);
        int overlapArea = overlapArea(rect1, rect2);
        if (overlapArea == 0) {
            return 0;
        }
        int rect1Area = area(rect1);
        int overlapCount = rect1Area / overlapArea;
        return overlapCount;
    }

    private static int[] parseRectangle(String strRect) {
        String[] parts = strRect.split("[(),\\s]+");
        int[] coords = new int[8];
        for (int i = 0; i < 8; i++) {
            coords[i] = Integer.parseInt(parts[i+1]);
        }
        return coords;
    }

    private static int overlapArea(int[] rect1, int[] rect2) {
        int left = Math.max(rect1[0], rect2[0]);
        int bottom = Math.max(rect1[1], rect2[1]);
        int right = Math.min(rect1[4], rect2[4]);
        int top = Math.min(rect1[5], rect2[5]);
        if (left >= right || bottom >= top) {
            return 0;
        }
        return (right - left) * (top - bottom);
    }

    private static int area(int[] rect) {
        return (rect[2] - rect[0]) * (rect[5] - rect[1]);
    }
}
