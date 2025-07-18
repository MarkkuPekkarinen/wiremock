/*
 * Copyright (C) 2023-2025 Thomas Akehurst
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.tomakehurst.wiremock.matching;

import com.github.tomakehurst.wiremock.common.url.PathTemplate;

public class UrlPathTemplatePattern extends UrlPathPattern {

  public UrlPathTemplatePattern(String expectedValue) {
    super(new PathTemplatePattern(expectedValue), false);
  }

  @Override
  public PathTemplatePattern getPattern() {
    return (PathTemplatePattern) super.getPattern();
  }

  public PathTemplate getPathTemplate() {
    return getPattern().getPathTemplate();
  }
}
