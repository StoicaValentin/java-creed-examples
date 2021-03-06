/*
 * #%L
 * Testing Swing Application
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
package com.javacreed.examples.test;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {

  public static void main(final String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        final ApplicationPresenter domain = new ApplicationPresenter();
        final ApplicationView application = new ApplicationView();

        domain.setView(application);
        application.setPresenter(domain);

        application.setTitle("Test Swing Application");
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.pack();
        application.setLocationRelativeTo(null);
        application.setVisible(true);
      }
    });
  }
}
