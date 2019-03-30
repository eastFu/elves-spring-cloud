package cn.gyyx.elves.thrift;
/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

import org.apache.thrift.EncodingUtils;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;

import javax.annotation.Generated;
import java.util.*;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-11-11")
public class Reinstruct implements org.apache.thrift.TBase<Reinstruct, Reinstruct._Fields>, java.io.Serializable, Cloneable, Comparable<Reinstruct> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Reinstruct");

  private static final org.apache.thrift.protocol.TField INS_FIELD_DESC = new org.apache.thrift.protocol.TField("ins", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField FLAG_FIELD_DESC = new org.apache.thrift.protocol.TField("flag", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField COSTTIME_FIELD_DESC = new org.apache.thrift.protocol.TField("costtime", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField RESULT_FIELD_DESC = new org.apache.thrift.protocol.TField("result", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ReinstructStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ReinstructTupleSchemeFactory());
  }

  public Instruct ins; // required
  public int flag; // required
  public int costtime; // required
  public String result; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    INS((short)1, "ins"),
    FLAG((short)3, "flag"),
    COSTTIME((short)4, "costtime"),
    RESULT((short)5, "result");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // INS
          return INS;
        case 3: // FLAG
          return FLAG;
        case 4: // COSTTIME
          return COSTTIME;
        case 5: // RESULT
          return RESULT;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __FLAG_ISSET_ID = 0;
  private static final int __COSTTIME_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.INS, new org.apache.thrift.meta_data.FieldMetaData("ins", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Instruct.class)));
    tmpMap.put(_Fields.FLAG, new org.apache.thrift.meta_data.FieldMetaData("flag", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.COSTTIME, new org.apache.thrift.meta_data.FieldMetaData("costtime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.RESULT, new org.apache.thrift.meta_data.FieldMetaData("result", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Reinstruct.class, metaDataMap);
  }

  public Reinstruct() {
  }

  public Reinstruct(
    Instruct ins,
    int flag,
    int costtime,
    String result)
  {
    this();
    this.ins = ins;
    this.flag = flag;
    setFlagIsSet(true);
    this.costtime = costtime;
    setCosttimeIsSet(true);
    this.result = result;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Reinstruct(Reinstruct other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetIns()) {
      this.ins = new Instruct(other.ins);
    }
    this.flag = other.flag;
    this.costtime = other.costtime;
    if (other.isSetResult()) {
      this.result = other.result;
    }
  }

  public Reinstruct deepCopy() {
    return new Reinstruct(this);
  }

  @Override
  public void clear() {
    this.ins = null;
    setFlagIsSet(false);
    this.flag = 0;
    setCosttimeIsSet(false);
    this.costtime = 0;
    this.result = null;
  }

  public Instruct getIns() {
    return this.ins;
  }

  public Reinstruct setIns(Instruct ins) {
    this.ins = ins;
    return this;
  }

  public void unsetIns() {
    this.ins = null;
  }

  /** Returns true if field ins is set (has been assigned a value) and false otherwise */
  public boolean isSetIns() {
    return this.ins != null;
  }

  public void setInsIsSet(boolean value) {
    if (!value) {
      this.ins = null;
    }
  }

  public int getFlag() {
    return this.flag;
  }

  public Reinstruct setFlag(int flag) {
    this.flag = flag;
    setFlagIsSet(true);
    return this;
  }

  public void unsetFlag() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FLAG_ISSET_ID);
  }

  /** Returns true if field flag is set (has been assigned a value) and false otherwise */
  public boolean isSetFlag() {
    return EncodingUtils.testBit(__isset_bitfield, __FLAG_ISSET_ID);
  }

  public void setFlagIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FLAG_ISSET_ID, value);
  }

  public int getCosttime() {
    return this.costtime;
  }

  public Reinstruct setCosttime(int costtime) {
    this.costtime = costtime;
    setCosttimeIsSet(true);
    return this;
  }

  public void unsetCosttime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __COSTTIME_ISSET_ID);
  }

  /** Returns true if field costtime is set (has been assigned a value) and false otherwise */
  public boolean isSetCosttime() {
    return EncodingUtils.testBit(__isset_bitfield, __COSTTIME_ISSET_ID);
  }

  public void setCosttimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __COSTTIME_ISSET_ID, value);
  }

  public String getResult() {
    return this.result;
  }

  public Reinstruct setResult(String result) {
    this.result = result;
    return this;
  }

  public void unsetResult() {
    this.result = null;
  }

  /** Returns true if field result is set (has been assigned a value) and false otherwise */
  public boolean isSetResult() {
    return this.result != null;
  }

  public void setResultIsSet(boolean value) {
    if (!value) {
      this.result = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case INS:
      if (value == null) {
        unsetIns();
      } else {
        setIns((Instruct)value);
      }
      break;

    case FLAG:
      if (value == null) {
        unsetFlag();
      } else {
        setFlag((Integer)value);
      }
      break;

    case COSTTIME:
      if (value == null) {
        unsetCosttime();
      } else {
        setCosttime((Integer)value);
      }
      break;

    case RESULT:
      if (value == null) {
        unsetResult();
      } else {
        setResult((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case INS:
      return getIns();

    case FLAG:
      return getFlag();

    case COSTTIME:
      return getCosttime();

    case RESULT:
      return getResult();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case INS:
      return isSetIns();
    case FLAG:
      return isSetFlag();
    case COSTTIME:
      return isSetCosttime();
    case RESULT:
      return isSetResult();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Reinstruct)
      return this.equals((Reinstruct)that);
    return false;
  }

  public boolean equals(Reinstruct that) {
    if (that == null)
      return false;

    boolean this_present_ins = true && this.isSetIns();
    boolean that_present_ins = true && that.isSetIns();
    if (this_present_ins || that_present_ins) {
      if (!(this_present_ins && that_present_ins))
        return false;
      if (!this.ins.equals(that.ins))
        return false;
    }

    boolean this_present_flag = true;
    boolean that_present_flag = true;
    if (this_present_flag || that_present_flag) {
      if (!(this_present_flag && that_present_flag))
        return false;
      if (this.flag != that.flag)
        return false;
    }

    boolean this_present_costtime = true;
    boolean that_present_costtime = true;
    if (this_present_costtime || that_present_costtime) {
      if (!(this_present_costtime && that_present_costtime))
        return false;
      if (this.costtime != that.costtime)
        return false;
    }

    boolean this_present_result = true && this.isSetResult();
    boolean that_present_result = true && that.isSetResult();
    if (this_present_result || that_present_result) {
      if (!(this_present_result && that_present_result))
        return false;
      if (!this.result.equals(that.result))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_ins = true && (isSetIns());
    list.add(present_ins);
    if (present_ins)
      list.add(ins);

    boolean present_flag = true;
    list.add(present_flag);
    if (present_flag)
      list.add(flag);

    boolean present_costtime = true;
    list.add(present_costtime);
    if (present_costtime)
      list.add(costtime);

    boolean present_result = true && (isSetResult());
    list.add(present_result);
    if (present_result)
      list.add(result);

    return list.hashCode();
  }

  @Override
  public int compareTo(Reinstruct other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetIns()).compareTo(other.isSetIns());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIns()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ins, other.ins);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFlag()).compareTo(other.isSetFlag());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFlag()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.flag, other.flag);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCosttime()).compareTo(other.isSetCosttime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCosttime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.costtime, other.costtime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetResult()).compareTo(other.isSetResult());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResult()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.result, other.result);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Reinstruct(");
    boolean first = true;

    sb.append("ins:");
    if (this.ins == null) {
      sb.append("null");
    } else {
      sb.append(this.ins);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("flag:");
    sb.append(this.flag);
    first = false;
    if (!first) sb.append(", ");
    sb.append("costtime:");
    sb.append(this.costtime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("result:");
    if (this.result == null) {
      sb.append("null");
    } else {
      sb.append(this.result);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (ins != null) {
      ins.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ReinstructStandardSchemeFactory implements SchemeFactory {
    public ReinstructStandardScheme getScheme() {
      return new ReinstructStandardScheme();
    }
  }

  private static class ReinstructStandardScheme extends StandardScheme<Reinstruct> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Reinstruct struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // INS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.ins = new Instruct();
              struct.ins.read(iprot);
              struct.setInsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // FLAG
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.flag = iprot.readI32();
              struct.setFlagIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // COSTTIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.costtime = iprot.readI32();
              struct.setCosttimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // RESULT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.result = iprot.readString();
              struct.setResultIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Reinstruct struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.ins != null) {
        oprot.writeFieldBegin(INS_FIELD_DESC);
        struct.ins.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(FLAG_FIELD_DESC);
      oprot.writeI32(struct.flag);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(COSTTIME_FIELD_DESC);
      oprot.writeI32(struct.costtime);
      oprot.writeFieldEnd();
      if (struct.result != null) {
        oprot.writeFieldBegin(RESULT_FIELD_DESC);
        oprot.writeString(struct.result);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ReinstructTupleSchemeFactory implements SchemeFactory {
    public ReinstructTupleScheme getScheme() {
      return new ReinstructTupleScheme();
    }
  }

  private static class ReinstructTupleScheme extends TupleScheme<Reinstruct> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Reinstruct struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetIns()) {
        optionals.set(0);
      }
      if (struct.isSetFlag()) {
        optionals.set(1);
      }
      if (struct.isSetCosttime()) {
        optionals.set(2);
      }
      if (struct.isSetResult()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetIns()) {
        struct.ins.write(oprot);
      }
      if (struct.isSetFlag()) {
        oprot.writeI32(struct.flag);
      }
      if (struct.isSetCosttime()) {
        oprot.writeI32(struct.costtime);
      }
      if (struct.isSetResult()) {
        oprot.writeString(struct.result);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Reinstruct struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.ins = new Instruct();
        struct.ins.read(iprot);
        struct.setInsIsSet(true);
      }
      if (incoming.get(1)) {
        struct.flag = iprot.readI32();
        struct.setFlagIsSet(true);
      }
      if (incoming.get(2)) {
        struct.costtime = iprot.readI32();
        struct.setCosttimeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.result = iprot.readString();
        struct.setResultIsSet(true);
      }
    }
  }

}
