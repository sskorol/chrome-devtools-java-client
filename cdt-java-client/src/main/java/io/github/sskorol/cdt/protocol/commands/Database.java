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

import io.github.sskorol.cdt.protocol.events.database.AddDatabase;
import io.github.sskorol.cdt.protocol.support.annotations.EventName;
import io.github.sskorol.cdt.protocol.support.annotations.Experimental;
import io.github.sskorol.cdt.protocol.support.annotations.ParamName;
import io.github.sskorol.cdt.protocol.support.annotations.ReturnTypeParameter;
import io.github.sskorol.cdt.protocol.support.annotations.Returns;
import io.github.sskorol.cdt.protocol.support.types.EventHandler;
import io.github.sskorol.cdt.protocol.support.types.EventListener;
import io.github.sskorol.cdt.protocol.types.database.ExecuteSQL;
import java.util.List;

@Experimental
public interface Database {

  /** Disables database tracking, prevents database events from being sent to the client. */
  void disable();

  /** Enables database tracking, database events will now be delivered to the client. */
  void enable();

  /**
   * @param databaseId
   * @param query
   */
  ExecuteSQL executeSQL(
      @ParamName("databaseId") String databaseId, @ParamName("query") String query);

  /**
   * @param databaseId
   */
  @Returns("tableNames")
  @ReturnTypeParameter(String.class)
  List<String> getDatabaseTableNames(@ParamName("databaseId") String databaseId);

  @EventName("addDatabase")
  EventListener onAddDatabase(EventHandler<AddDatabase> eventListener);
}
