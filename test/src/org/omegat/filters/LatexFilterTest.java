/**************************************************************************
 OmegaT - Computer Assisted Translation (CAT) tool
          with fuzzy matching, translation memory, keyword search,
          glossaries, and translation leveraging into updated projects.

 Copyright (C) 2011 Alex Buloichik
               Home page: https://www.omegat.org/
               Support center: https://omegat.org/support

 This file is part of OmegaT.

 OmegaT is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 OmegaT is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <https://www.gnu.org/licenses/>.
 **************************************************************************/

package org.omegat.filters;

import org.junit.Test;
import org.omegat.core.data.IProject;
import org.omegat.filters2.latex.LatexFilter;

public class LatexFilterTest extends TestFilterBase {

    @Test
    public void testLoad() throws Exception {
        String f = "test/data/filters/Latex/latexexample.tex";
        IProject.FileInfo fi = loadSourceFiles(new LatexFilter(), f);

        checkMultiStart(fi, f);
        checkMulti("[11pt]{article}", null, null, "", "LaTeX Typesetting By Example", null);
        checkMulti("LaTeX Typesetting By Example", null, null, "[11pt]{article}",
                "Phil Farrell<br0> Stanford University School of Earth Sciences", null);
    }
}
