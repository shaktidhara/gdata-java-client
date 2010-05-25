/*
 * Copyright (c) 2010 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.api.data.client.generator;

import com.google.api.data.client.generator.linewrap.LineWrapper;
import com.google.api.data.client.generator.linewrap.XmlLineWrapper;

/**
 * @author Yaniv Inbar
 */
abstract class AbstractXmlFileGenerator extends AbstractFileGenerator {

  @Override
  public final LineWrapper getLineWrapper() {
    return XmlLineWrapper.get();
  }
}
