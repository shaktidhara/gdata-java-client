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

package com.google.api.client.json;

import com.google.api.client.util.GenericData;
import com.google.api.client.util.Key;

/**
 * Generic JSON data that stores all unknown key name/value pairs.
 * <p>
 * Subclasses can declare fields for known data keys using the {@link Key}
 * annotation. {@code null} unknown data key names are not allowed, but {@code
 * null} data values are allowed.
 * 
 * @since 2.2
 * @author Yaniv Inbar
 */
public class GenericJson extends GenericData implements Cloneable {

  @Override
  public String toString() {
    return Json.toString(this);
  }

  @Override
  public GenericJson clone() {
    return (GenericJson) super.clone();
  }
}
