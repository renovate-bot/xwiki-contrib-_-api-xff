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
package org.xwiki.filter.xwf;

import java.io.File;
import java.util.Date;

import org.codehaus.plexus.util.FileUtils;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.xwiki.extension.test.ExtensionPackager;
import org.xwiki.filter.test.integration.FilterTestSuite;
import org.xwiki.filter.test.integration.FilterTestSuite.Scope;
import org.xwiki.test.annotation.AllComponents;

/**
 * Run all tests found in the classpath. These {@code *.test} files must follow the conventions described in
 * {@link org.xwiki.filter.test.integration.TestDataParser}.
 * 
 * @version $Id$
 */
@RunWith(FilterTestSuite.class)
@AllComponents
@Scope("xwf")
public class XWFIntegrationTest
{
    @BeforeClass
    public static void beforeClass() throws Exception
    {
        File folder = new File("target/test-" + new Date().getTime()).getAbsoluteFile();
        ExtensionPackager extensionPackager = new ExtensionPackager(null, folder);
        extensionPackager.generateExtensions();
        
        File xwfDirSrc = new File("target/test-classes/packagefile/xwf/xwiki");
        File xwfDirDst = new File(folder.toString() + "/xwiki");
        FileUtils.copyDirectoryStructure(xwfDirSrc, xwfDirDst);

        System.setProperty("extension.repository", folder.getAbsolutePath());
    }
}
