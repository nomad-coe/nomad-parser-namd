package eu.nomad_lab.parsers

import org.specs2.mutable.Specification

object NAMDParserTests extends Specification {
  "NAMDParserTest" >> {
    "[tiny with 507 atoms] test with json-events" >> {
      ParserRun.parse(NAMDParser, "parsers/namd/test/examples/tiny/tiny.log", "json-events") must_== ParseResult.ParseSuccess
    }
    "[tiny with 507 atoms] test with json" >> {
      ParserRun.parse(NAMDParser, "parsers/namd/test/examples/tiny/tiny.log", "json") must_== ParseResult.ParseSuccess
    }
    "[apoa1-trajectory with 92224 atoms] test with json-events" >> {
      ParserRun.parse(NAMDParser, "parsers/namd/test/examples/apoa1-trajectory/apoa1.log", "json-events") must_== ParseResult.ParseSuccess
    }
    "[apoa1-trajectory with 92224 atoms] test with json" >> {
      ParserRun.parse(NAMDParser, "parsers/namd/test/examples/apoa1-trajectory/apoa1.log", "json") must_== ParseResult.ParseSuccess
    }
  }
}
