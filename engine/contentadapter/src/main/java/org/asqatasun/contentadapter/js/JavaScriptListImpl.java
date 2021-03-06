/*
 * Asqatasun - Automated webpage assessment
 * Copyright (C) 2008-2019  Asqatasun.org
 *
 * This file is part of Asqatasun.
 *
 * Asqatasun is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Contact us by mail: asqatasun AT asqatasun DOT org
 */
package org.asqatasun.contentadapter.js;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author jkowalczyk
 */
public class JavaScriptListImpl implements JavaScriptList {

    private List<JSResource> javaScriptList;

    public JavaScriptListImpl() {
        super();
        this.javaScriptList = new ArrayList<JSResource>();
    }

    @Override
    public void addJavaScript(JSResource javaScript) {
        javaScriptList.add(javaScript);
    }

    @Override
    public List<JSResource> getJavaScriptList() {
        return javaScriptList;
    }

    @Override
    public void setJavaScript(List<JSResource> javaScriptList) {
        this.javaScriptList = javaScriptList;
    }

}
