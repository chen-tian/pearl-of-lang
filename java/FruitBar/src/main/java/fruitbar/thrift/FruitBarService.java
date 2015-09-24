/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package fruitbar.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FruitBarService {

  public interface Iface {

    public void serve(Request req, Reply reply) throws org.apache.thrift.TException;

  }

  public interface AsyncIface {

    public void serve(Request req, Reply reply, org.apache.thrift.async.AsyncMethodCallback<AsyncClient.serve_call> resultHandler) throws org.apache.thrift.TException;

  }

  public static class Client extends org.apache.thrift.TServiceClient implements Iface {
    public static class Factory implements org.apache.thrift.TServiceClientFactory<Client> {
      public Factory() {}
      public Client getClient(org.apache.thrift.protocol.TProtocol prot) {
        return new Client(prot);
      }
      public Client getClient(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
        return new Client(iprot, oprot);
      }
    }

    public Client(org.apache.thrift.protocol.TProtocol prot)
    {
      super(prot, prot);
    }

    public Client(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
      super(iprot, oprot);
    }

    public void serve(Request req, Reply reply) throws org.apache.thrift.TException
    {
      send_serve(req, reply);
      recv_serve();
    }

    public void send_serve(Request req, Reply reply) throws org.apache.thrift.TException
    {
      serve_args args = new serve_args();
      args.setReq(req);
      args.setReply(reply);
      sendBase("serve", args);
    }

    public void recv_serve() throws org.apache.thrift.TException
    {
      serve_result result = new serve_result();
      receiveBase(result, "serve");
      return;
    }

  }
  public static class AsyncClient extends org.apache.thrift.async.TAsyncClient implements AsyncIface {
    public static class Factory implements org.apache.thrift.async.TAsyncClientFactory<AsyncClient> {
      private org.apache.thrift.async.TAsyncClientManager clientManager;
      private org.apache.thrift.protocol.TProtocolFactory protocolFactory;
      public Factory(org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.protocol.TProtocolFactory protocolFactory) {
        this.clientManager = clientManager;
        this.protocolFactory = protocolFactory;
      }
      public AsyncClient getAsyncClient(org.apache.thrift.transport.TNonblockingTransport transport) {
        return new AsyncClient(protocolFactory, clientManager, transport);
      }
    }

    public AsyncClient(org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.transport.TNonblockingTransport transport) {
      super(protocolFactory, clientManager, transport);
    }

    public void serve(Request req, Reply reply, org.apache.thrift.async.AsyncMethodCallback<serve_call> resultHandler) throws org.apache.thrift.TException {
      checkReady();
      serve_call method_call = new serve_call(req, reply, resultHandler, this, ___protocolFactory, ___transport);
      this.___currentMethod = method_call;
      ___manager.call(method_call);
    }

    public static class serve_call extends org.apache.thrift.async.TAsyncMethodCall {
      private Request req;
      private Reply reply;
      public serve_call(Request req, Reply reply, org.apache.thrift.async.AsyncMethodCallback<serve_call> resultHandler, org.apache.thrift.async.TAsyncClient client, org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.transport.TNonblockingTransport transport) throws org.apache.thrift.TException {
        super(client, protocolFactory, transport, resultHandler, false);
        this.req = req;
        this.reply = reply;
      }

      public void write_args(org.apache.thrift.protocol.TProtocol prot) throws org.apache.thrift.TException {
        prot.writeMessageBegin(new org.apache.thrift.protocol.TMessage("serve", org.apache.thrift.protocol.TMessageType.CALL, 0));
        serve_args args = new serve_args();
        args.setReq(req);
        args.setReply(reply);
        args.write(prot);
        prot.writeMessageEnd();
      }

      public void getResult() throws org.apache.thrift.TException {
        if (getState() != org.apache.thrift.async.TAsyncMethodCall.State.RESPONSE_READ) {
          throw new IllegalStateException("Method call not finished!");
        }
        org.apache.thrift.transport.TMemoryInputTransport memoryTransport = new org.apache.thrift.transport.TMemoryInputTransport(getFrameBuffer().array());
        org.apache.thrift.protocol.TProtocol prot = client.getProtocolFactory().getProtocol(memoryTransport);
        (new Client(prot)).recv_serve();
      }
    }

  }

  public static class Processor<I extends Iface> extends org.apache.thrift.TBaseProcessor<I> implements org.apache.thrift.TProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger(Processor.class.getName());
    public Processor(I iface) {
      super(iface, getProcessMap(new HashMap<String, org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>>()));
    }

    protected Processor(I iface, Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends Iface> Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> getProcessMap(Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      processMap.put("serve", new serve());
      return processMap;
    }

    public static class serve<I extends Iface> extends org.apache.thrift.ProcessFunction<I, serve_args> {
      public serve() {
        super("serve");
      }

      public serve_args getEmptyArgsInstance() {
        return new serve_args();
      }

      protected boolean isOneway() {
        return false;
      }

      public serve_result getResult(I iface, serve_args args) throws org.apache.thrift.TException {
        serve_result result = new serve_result();
        iface.serve(args.req, args.reply);
        return result;
      }
    }

  }

  public static class serve_args implements org.apache.thrift.TBase<serve_args, serve_args._Fields>, java.io.Serializable, Cloneable   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("serve_args");

    private static final org.apache.thrift.protocol.TField REQ_FIELD_DESC = new org.apache.thrift.protocol.TField("req", org.apache.thrift.protocol.TType.STRUCT, (short)1);
    private static final org.apache.thrift.protocol.TField REPLY_FIELD_DESC = new org.apache.thrift.protocol.TField("reply", org.apache.thrift.protocol.TType.STRUCT, (short)2);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new serve_argsStandardSchemeFactory());
      schemes.put(TupleScheme.class, new serve_argsTupleSchemeFactory());
    }

    public Request req; // required
    public Reply reply; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      REQ((short)1, "req"),
      REPLY((short)2, "reply");

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
          case 1: // REQ
            return REQ;
          case 2: // REPLY
            return REPLY;
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
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      tmpMap.put(_Fields.REQ, new org.apache.thrift.meta_data.FieldMetaData("req", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Request.class)));
      tmpMap.put(_Fields.REPLY, new org.apache.thrift.meta_data.FieldMetaData("reply", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Reply.class)));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(serve_args.class, metaDataMap);
    }

    public serve_args() {
    }

    public serve_args(
      Request req,
      Reply reply)
    {
      this();
      this.req = req;
      this.reply = reply;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public serve_args(serve_args other) {
      if (other.isSetReq()) {
        this.req = new Request(other.req);
      }
      if (other.isSetReply()) {
        this.reply = new Reply(other.reply);
      }
    }

    public serve_args deepCopy() {
      return new serve_args(this);
    }

    @Override
    public void clear() {
      this.req = null;
      this.reply = null;
    }

    public Request getReq() {
      return this.req;
    }

    public serve_args setReq(Request req) {
      this.req = req;
      return this;
    }

    public void unsetReq() {
      this.req = null;
    }

    /** Returns true if field req is set (has been assigned a value) and false otherwise */
    public boolean isSetReq() {
      return this.req != null;
    }

    public void setReqIsSet(boolean value) {
      if (!value) {
        this.req = null;
      }
    }

    public Reply getReply() {
      return this.reply;
    }

    public serve_args setReply(Reply reply) {
      this.reply = reply;
      return this;
    }

    public void unsetReply() {
      this.reply = null;
    }

    /** Returns true if field reply is set (has been assigned a value) and false otherwise */
    public boolean isSetReply() {
      return this.reply != null;
    }

    public void setReplyIsSet(boolean value) {
      if (!value) {
        this.reply = null;
      }
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case REQ:
        if (value == null) {
          unsetReq();
        } else {
          setReq((Request)value);
        }
        break;

      case REPLY:
        if (value == null) {
          unsetReply();
        } else {
          setReply((Reply)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case REQ:
        return getReq();

      case REPLY:
        return getReply();

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case REQ:
        return isSetReq();
      case REPLY:
        return isSetReply();
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof serve_args)
        return this.equals((serve_args)that);
      return false;
    }

    public boolean equals(serve_args that) {
      if (that == null)
        return false;

      boolean this_present_req = true && this.isSetReq();
      boolean that_present_req = true && that.isSetReq();
      if (this_present_req || that_present_req) {
        if (!(this_present_req && that_present_req))
          return false;
        if (!this.req.equals(that.req))
          return false;
      }

      boolean this_present_reply = true && this.isSetReply();
      boolean that_present_reply = true && that.isSetReply();
      if (this_present_reply || that_present_reply) {
        if (!(this_present_reply && that_present_reply))
          return false;
        if (!this.reply.equals(that.reply))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      return 0;
    }

    public int compareTo(serve_args other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;
      serve_args typedOther = (serve_args)other;

      lastComparison = Boolean.valueOf(isSetReq()).compareTo(typedOther.isSetReq());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetReq()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.req, typedOther.req);
        if (lastComparison != 0) {
          return lastComparison;
        }
      }
      lastComparison = Boolean.valueOf(isSetReply()).compareTo(typedOther.isSetReply());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetReply()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.reply, typedOther.reply);
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
      StringBuilder sb = new StringBuilder("serve_args(");
      boolean first = true;

      sb.append("req:");
      if (this.req == null) {
        sb.append("null");
      } else {
        sb.append(this.req);
      }
      first = false;
      if (!first) sb.append(", ");
      sb.append("reply:");
      if (this.reply == null) {
        sb.append("null");
      } else {
        sb.append(this.reply);
      }
      first = false;
      sb.append(")");
      return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
      // check for sub-struct validity
      if (req != null) {
        req.validate();
      }
      if (reply != null) {
        reply.validate();
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
        read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private static class serve_argsStandardSchemeFactory implements SchemeFactory {
      public serve_argsStandardScheme getScheme() {
        return new serve_argsStandardScheme();
      }
    }

    private static class serve_argsStandardScheme extends StandardScheme<serve_args> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, serve_args struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 1: // REQ
              if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
                struct.req = new Request();
                struct.req.read(iprot);
                struct.setReqIsSet(true);
              } else { 
                org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              break;
            case 2: // REPLY
              if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
                struct.reply = new Reply();
                struct.reply.read(iprot);
                struct.setReplyIsSet(true);
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

      public void write(org.apache.thrift.protocol.TProtocol oprot, serve_args struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.req != null) {
          oprot.writeFieldBegin(REQ_FIELD_DESC);
          struct.req.write(oprot);
          oprot.writeFieldEnd();
        }
        if (struct.reply != null) {
          oprot.writeFieldBegin(REPLY_FIELD_DESC);
          struct.reply.write(oprot);
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class serve_argsTupleSchemeFactory implements SchemeFactory {
      public serve_argsTupleScheme getScheme() {
        return new serve_argsTupleScheme();
      }
    }

    private static class serve_argsTupleScheme extends TupleScheme<serve_args> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, serve_args struct) throws org.apache.thrift.TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
        BitSet optionals = new BitSet();
        if (struct.isSetReq()) {
          optionals.set(0);
        }
        if (struct.isSetReply()) {
          optionals.set(1);
        }
        oprot.writeBitSet(optionals, 2);
        if (struct.isSetReq()) {
          struct.req.write(oprot);
        }
        if (struct.isSetReply()) {
          struct.reply.write(oprot);
        }
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, serve_args struct) throws org.apache.thrift.TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
        BitSet incoming = iprot.readBitSet(2);
        if (incoming.get(0)) {
          struct.req = new Request();
          struct.req.read(iprot);
          struct.setReqIsSet(true);
        }
        if (incoming.get(1)) {
          struct.reply = new Reply();
          struct.reply.read(iprot);
          struct.setReplyIsSet(true);
        }
      }
    }

  }

  public static class serve_result implements org.apache.thrift.TBase<serve_result, serve_result._Fields>, java.io.Serializable, Cloneable   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("serve_result");


    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new serve_resultStandardSchemeFactory());
      schemes.put(TupleScheme.class, new serve_resultTupleSchemeFactory());
    }


    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
;

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
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(serve_result.class, metaDataMap);
    }

    public serve_result() {
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public serve_result(serve_result other) {
    }

    public serve_result deepCopy() {
      return new serve_result(this);
    }

    @Override
    public void clear() {
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof serve_result)
        return this.equals((serve_result)that);
      return false;
    }

    public boolean equals(serve_result that) {
      if (that == null)
        return false;

      return true;
    }

    @Override
    public int hashCode() {
      return 0;
    }

    public int compareTo(serve_result other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;
      serve_result typedOther = (serve_result)other;

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
      StringBuilder sb = new StringBuilder("serve_result(");
      boolean first = true;

      sb.append(")");
      return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
      // check for sub-struct validity
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
        read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private static class serve_resultStandardSchemeFactory implements SchemeFactory {
      public serve_resultStandardScheme getScheme() {
        return new serve_resultStandardScheme();
      }
    }

    private static class serve_resultStandardScheme extends StandardScheme<serve_result> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, serve_result struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            default:
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
          }
          iprot.readFieldEnd();
        }
        iprot.readStructEnd();

        // check for required fields of primitive type, which can't be checked in the validate method
        struct.validate();
      }

      public void write(org.apache.thrift.protocol.TProtocol oprot, serve_result struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class serve_resultTupleSchemeFactory implements SchemeFactory {
      public serve_resultTupleScheme getScheme() {
        return new serve_resultTupleScheme();
      }
    }

    private static class serve_resultTupleScheme extends TupleScheme<serve_result> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, serve_result struct) throws org.apache.thrift.TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, serve_result struct) throws org.apache.thrift.TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
      }
    }

  }

}