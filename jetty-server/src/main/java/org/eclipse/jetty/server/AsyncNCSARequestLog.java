//
//  ========================================================================
//  Copyright (c) 1995-2018 Mort Bay Consulting Pty. Ltd.
//  ------------------------------------------------------------------------
//  All rights reserved. This program and the accompanying materials
//  are made available under the terms of the Eclipse Public License v1.0
//  and Apache License v2.0 which accompanies this distribution.
//
//      The Eclipse Public License is available at
//      http://www.eclipse.org/legal/epl-v10.html
//
//      The Apache License v2.0 is available at
//      http://www.opensource.org/licenses/apache2.0.php
//
//  You may elect to redistribute this code under either of these licenses.
//  ========================================================================
//

package org.eclipse.jetty.server;

import java.util.concurrent.BlockingQueue;

/**
 * An asynchronously writing NCSA Request Log
 * @deprecated use {@link CustomRequestLog} given format string {@link CustomRequestLog#EXTENDED_NCSA_FORMAT} with an {@link AsyncRequestLogWriter}
 */
@Deprecated
public class AsyncNCSARequestLog extends NCSARequestLog
{
    public AsyncNCSARequestLog()
    {
        this(null,null);
    }

    public AsyncNCSARequestLog(String filename, BlockingQueue<String> queue)
    {
        super(new AsyncRequestLogWriter(filename, queue));
    }
}
