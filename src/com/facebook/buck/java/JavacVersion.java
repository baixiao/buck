/*
 * Copyright 2014-present Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.facebook.buck.java;

import com.google.common.base.Preconditions;

public class JavacVersion {

  private final String version;

  public JavacVersion(String version) {
    this.version = Preconditions.checkNotNull(version);
  }

  @Override
  public String toString() {
    return version;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof JavacVersion)) {
      return false;
    }
    JavacVersion that = (JavacVersion) o;
    return this.version.equals(that.version);
  }

  @Override
  public int hashCode() {
    return version.hashCode();
  }

}
