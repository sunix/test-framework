/*******************************************************************************
 * Copyright (c) 2012-2014 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 *******************************************************************************/
package com.codenvy.test.framework.concordion;
import org.concordion.api.Resource;
import org.concordion.api.extension.ConcordionExtender;
import org.concordion.api.extension.ConcordionExtension;

/**
 * An extension that add to the page JS scripts for converting markdown to html.
 */
public class CodenvyConcordionResourceExtension implements ConcordionExtension {

    public void addTo(ConcordionExtender concordionExtender) {
        concordionExtender.withLinkedJavaScript("/com/codenvy/test/framework/scripts/jquery-1.9.0.min.js",
                                                new Resource("/scripts/jquery-1.9.0.min.js"));
        concordionExtender.withLinkedJavaScript("/com/codenvy/test/framework/scripts/Markdown.ClassConvert.js",
                                                new Resource("/scripts/Markdown.ClassConvert.js"));
        concordionExtender.withLinkedJavaScript("/com/codenvy/test/framework/scripts/Markdown.Converter.js",
                                                new Resource("/scripts/Markdown.Converter.js"));

        // bootstrap
        concordionExtender.withLinkedJavaScript("/com/codenvy/test/framework/bootstrap/js/bootstrap.min.js", new Resource("/bootstrap/js/bootstrap.min.js"));
        concordionExtender.withLinkedCSS("/com/codenvy/test/framework/bootstrap/css/bootstrap.min.css", new Resource("/bootstrap/css/bootstrap.min.css"));
    }
}
