# commons-ip-math-scala

A scala wrapper for the [commons-ip-math](https://github.com/jgonian/commons-ip-math) library.

### Usage

```scala
import com.github.jgonian.ipmath._

// Idiomatic scala syntax for parsing

"2001:db8::/64".toIpv6Range.size                    // 18446744073709551616

"192.0.2.0/24".toIpv4Range.toStringInRangeNotation  // 192.0.2.0-192.0.2.255

"AS0-AS65535".toAsnRange.contains("AS65536".toAsn)  // false
```
