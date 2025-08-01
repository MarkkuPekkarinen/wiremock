/*
 * Copyright (C) 2013-2025 Thomas Akehurst
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
package com.github.tomakehurst.wiremock.servlet;

import com.github.tomakehurst.wiremock.core.MappingsSaver;
import com.github.tomakehurst.wiremock.stubbing.StubMapping;
import java.util.List;
import java.util.UUID;

public class NotImplementedMappingsSaver implements MappingsSaver {
  @Override
  public void save(List<StubMapping> stubMappings) {
    throw new UnsupportedOperationException("Saving mappings is not supported");
  }

  @Override
  public void save(StubMapping stubMapping) {
    throw new UnsupportedOperationException("Saving mapping is not supported");
  }

  @Override
  public void remove(UUID stubMappingId) {
    throw new UnsupportedOperationException("Remove mapping is not supported");
  }

  @Override
  public void removeAll() {
    throw new UnsupportedOperationException("Remove all mappings is not supported");
  }

  @Override
  public void setAll(List<StubMapping> stubMappings) {
    throw new UnsupportedOperationException("Set all mappings is not supported");
  }
}
