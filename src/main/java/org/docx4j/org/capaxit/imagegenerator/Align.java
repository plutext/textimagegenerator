/*
 * Copyright 2014 Jamie Craane - Capax IT
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.docx4j.org.capaxit.imagegenerator;

import java.util.List;
import java.awt.*;

/**
 * Author: Jamie Craane
 * Date: 22-dec-2008
 * Time: 10:44:59
 */
public interface Align {
    /**
     * Aligns the given text based on the given fortmetrics and linewidth.
     * @param text The text which should be aligned.
     * @param fm fontmetrics used to determine the dimensions of the text.
     * @param linewidth The total space available for the text.
     * @return List of Items                                                  
     */
    List<DrawableText> align(String text, FontMetrics fm, int linewidth);
}