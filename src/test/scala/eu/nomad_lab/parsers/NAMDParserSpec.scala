/*
 * Copyright 2018-2018 Berk Onat, Fawzi Mohamed
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package eu.nomad_lab.parsers

import org.specs2.mutable.Specification

object NamdParserTests extends Specification {
  "NAMDParserTest" >> {
    "[tiny with 507 atoms] test with json-events" >> {
      ParserRun.parse(NamdParser, "parsers/namd/test/examples/tiny/tiny.log", "json-events") must_== ParseResult.ParseSuccess
    }
    "[tiny with 507 atoms] test with json" >> {
      ParserRun.parse(NamdParser, "parsers/namd/test/examples/tiny/tiny.log", "json") must_== ParseResult.ParseSuccess
    }
    "[apoa1-trajectory with 92224 atoms] test with json-events" >> {
      ParserRun.parse(NamdParser, "parsers/namd/test/examples/apoa1-trajectory/apoa1.log", "json-events") must_== ParseResult.ParseSuccess
    }
    "[apoa1-trajectory with 92224 atoms] test with json" >> {
      ParserRun.parse(NamdParser, "parsers/namd/test/examples/apoa1-trajectory/apoa1.log", "json") must_== ParseResult.ParseSuccess
    }
  }
}
