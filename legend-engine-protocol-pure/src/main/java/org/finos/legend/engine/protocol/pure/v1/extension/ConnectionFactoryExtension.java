// Copyright 2021 Goldman Sachs
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.finos.legend.engine.protocol.pure.v1.extension;

import org.eclipse.collections.api.tuple.Pair;
import org.finos.legend.engine.protocol.pure.v1.model.data.EmbeddedData;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.connection.Connection;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.mapping.mappingTest.InputData;

import java.io.Closeable;
import java.util.List;
import java.util.Optional;

public interface ConnectionFactoryExtension
{
    default Optional<Connection> tryBuildFromInputData(InputData inputData)
    {
        return Optional.empty();
    }

    default Optional<Connection> tryBuildFromConnection(Connection connection, String testData, String element)
    {
        return Optional.empty();
    }

    default Optional<Pair<Connection, List<Closeable>>> tryBuildTestConnection(Connection sourceConnection, EmbeddedData data)
    {
        return Optional.empty();
    }
}
