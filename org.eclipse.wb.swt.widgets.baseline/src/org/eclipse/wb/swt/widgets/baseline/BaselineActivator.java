/*******************************************************************************
 * Copyright (c) 2011 Google, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Google, Inc. - initial API and implementation
 *******************************************************************************/
package org.eclipse.wb.swt.widgets.baseline;

import org.eclipse.ui.plugin.AbstractUIPlugin;

public class BaselineActivator extends AbstractUIPlugin {
  private static BaselineActivator plugin;

  @Override
  public void start(org.osgi.framework.BundleContext context) throws Exception {
    super.start(context);
    plugin = this;
  }

  @Override
  public void stop(org.osgi.framework.BundleContext context) throws Exception {
    plugin = null;
    super.stop(context);
  }

  public static BaselineActivator getDefault() {
    return plugin;
  }
}
