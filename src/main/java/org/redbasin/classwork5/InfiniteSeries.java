/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.redbasin.classwork5;

/**
 *
 * @author redbasin
 */
public class InfiniteSeries {
  public static final long NUM_TERMS = 3000000000L;

  public static void main(String[] args) {
    double sum = 0;
    for (long i = 1; i < NUM_TERMS; i++) {
      sum += 1.0/i;
    }
    System.out.println("sum = " + sum);
  }

}