package com.github.jgonian.ipmath

trait ParsingImplicits {

  implicit final class StringOps(private val str: String) {

    def toIpv4: Ipv4 = Ipv4.parse(str)

    def toIpv6: Ipv6 = Ipv6.parse(str)

    def toAsn: Asn = Asn.parse(str)

    def toIpv4Range: Ipv4Range = Ipv4Range.parse(str)

    def toIpv6Range: Ipv6Range = Ipv6Range.parse(str)

    def toAsnRange: AsnRange = AsnRange.parse(str)
  }
}
