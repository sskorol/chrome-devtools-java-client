package io.github.sskorol.cdt.protocol.commands;

/*-
 * #%L
 * cdt-java-client
 * %%
 * Copyright (C) 2018 - 2022 Sergey Korol
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import io.github.sskorol.cdt.protocol.support.annotations.ReturnTypeParameter;
import io.github.sskorol.cdt.protocol.support.annotations.Returns;
import io.github.sskorol.cdt.protocol.types.schema.Domain;
import java.util.List;

/** This domain is deprecated. */
@Deprecated
public interface Schema {

  /** Returns supported domains. */
  @Returns("domains")
  @ReturnTypeParameter(Domain.class)
  List<Domain> getDomains();
}
