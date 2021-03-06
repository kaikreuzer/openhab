/**
 * Copyright (c) 2010-2016, openHAB.org and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.core.jsr223.internal.shared;

import java.util.List;

/**
 * Rule-Interface: A script can implement multiple Rules
 * 
 * @author Simon Merschjohann
 * @since 1.7.0
 */
public interface Rule {
	public List<EventTrigger> getEventTrigger();

	public void execute(Event event);
}
