package com.github.jgonian.ipmath

import org.scalatest.Spec

class ParsingImplicitsSpec extends Spec {

  object `When parsing strings` {

    def `should parse Ipv4`() {
      assert("192.0.2.0".toIpv4 == Ipv4.of("192.0.2.0"))
      assert("192.0.2.0/24".toIpv4Range == Ipv4Range.from("192.0.2.0").andPrefixLength(24))
    }

    def `should parse Ipv6`() {
      assert("2001:db8::".toIpv6 == Ipv6.of("2001:db8::"))
      assert("2001:db8::/32".toIpv6Range == Ipv6Range.from("2001:db8::").andPrefixLength(32))
    }

    def `should parse ASN`() {
      assert("AS65535".toAsn == Asn.of(65535l))
      assert("AS0-AS65535".toAsnRange == AsnRange.from(0l).to(65535l))
    }
  }
}
