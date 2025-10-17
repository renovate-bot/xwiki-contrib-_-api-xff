package org.xwiki.filter.xff.test.internal.input;

/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
import java.io.InputStream;
import java.nio.file.Path;

import javax.inject.Named;

import org.xwiki.component.annotation.Component;
import org.xwiki.component.annotation.InstantiationStrategy;
import org.xwiki.component.descriptor.ComponentInstantiationStrategy;
import org.xwiki.filter.FilterException;
import org.xwiki.filter.xff.input.AbstractReader;
import org.xwiki.filter.xff.input.Reader;
import org.xwiki.filter.xff.internal.input.XFFInputFilter;
import org.xwiki.model.reference.EntityReference;

@Component
@Named("test")
@InstantiationStrategy(ComponentInstantiationStrategy.PER_LOOKUP)
public class TestReader extends AbstractReader
{
    @Override
    public void route(Path path, InputStream inputStream) throws FilterException
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void close() throws FilterException
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void open(String id, EntityReference parentReference, Object filter, XFFInputFilter proxyFilter)
        throws FilterException
    {
        // TODO Auto-generated method stub

    }

    public Object publicUnmarshal(InputStream inputStream, Class<?> type)
    {
        return this.unmarshal(inputStream, type);
    }

    public Reader publicGetReader(String hint) throws FilterException
    {
        return this.getReader(hint);
    }
}
