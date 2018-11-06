package com.grakra.failpoint.java.runtime

class FailPointDescriptor : Comparable<FailPointDescriptor> {

  var variable: String = ""
  var type: String = ""
  var default: String? = null

  override fun hashCode() = variable.hashCode()

  override fun equals(other: Any?): Boolean {
    if (other == null) {
      return false
    }
    if (this == other) {
      return true
    }
    if (other !is FailPointDescriptor) {
      return false
    }

    return other.variable == this.variable &&
      other.type == this.type &&
      other.default == this.default
  }

  override fun compareTo(other: FailPointDescriptor): Int {
    return if (this == other) {
      0
    } else {
      this.variable.compareTo(other.variable)
    }
  }
}