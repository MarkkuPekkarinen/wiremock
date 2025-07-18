/*
 * Copyright (C) 2017-2025 Thomas Akehurst
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
package com.github.tomakehurst.wiremock.extension;

import com.github.tomakehurst.wiremock.common.FileSource;
import com.github.tomakehurst.wiremock.recording.StubGenerationResult;
import com.github.tomakehurst.wiremock.stubbing.ServeEvent;
import com.github.tomakehurst.wiremock.stubbing.StubMapping;

/**
 * Base class for stub mapping transformer extensions. This allows transforming stub mappings
 * recorded via the snapshot and recording API endpoints.
 */
public abstract class StubMappingTransformer implements Extension {
  public StubMapping transform(StubMapping stubMapping, FileSource files, Parameters parameters) {
    throw new UnsupportedOperationException();
  }

  /**
   * @param serveEvent The original recorded serve event used to generate the stub mapping.
   */
  public StubGenerationResult transform(
      StubMapping stubMapping, FileSource files, Parameters parameters, ServeEvent serveEvent) {
    return new StubGenerationResult.Success(transform(stubMapping, files, parameters));
  }

  public boolean applyGlobally() {
    return true;
  }
}
