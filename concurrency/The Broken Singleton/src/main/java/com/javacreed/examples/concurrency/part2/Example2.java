/*
 * #%L
 * The Broken Singleton
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2012 - 2014 Java Creed
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package com.javacreed.examples.concurrency.part2;

public class Example2 {

  public static void main(final String[] args) {
    final SequenceGenerator a = SequenceGenerator.getInstance();
    System.out.printf("SG A: %d%n", a.getNextValue());
    System.out.printf("SG A: %d%n", a.getNextValue());

    final SequenceGenerator b = SequenceGenerator.getInstance();
    System.out.printf("SG B: %d%n", b.getNextValue());
  }
}
