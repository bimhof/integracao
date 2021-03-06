/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package teste.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-8-14")
public class TesteService {

  public interface Iface {

    public boolean transmit(DadoTeste dado) throws TesteException, org.apache.thrift.TException;

  }

  public interface AsyncIface {

    public void transmit(DadoTeste dado, org.apache.thrift.async.AsyncMethodCallback resultHandler) throws org.apache.thrift.TException;

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

    public boolean transmit(DadoTeste dado) throws TesteException, org.apache.thrift.TException
    {
      send_transmit(dado);
      return recv_transmit();
    }

    public void send_transmit(DadoTeste dado) throws org.apache.thrift.TException
    {
      transmit_args args = new transmit_args();
      args.setDado(dado);
      sendBase("transmit", args);
    }

    public boolean recv_transmit() throws TesteException, org.apache.thrift.TException
    {
      transmit_result result = new transmit_result();
      receiveBase(result, "transmit");
      if (result.isSetSuccess()) {
        return result.success;
      }
      if (result.testeException != null) {
        throw result.testeException;
      }
      throw new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.MISSING_RESULT, "transmit failed: unknown result");
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

    public void transmit(DadoTeste dado, org.apache.thrift.async.AsyncMethodCallback resultHandler) throws org.apache.thrift.TException {
      checkReady();
      transmit_call method_call = new transmit_call(dado, resultHandler, this, ___protocolFactory, ___transport);
      this.___currentMethod = method_call;
      ___manager.call(method_call);
    }

    public static class transmit_call extends org.apache.thrift.async.TAsyncMethodCall {
      private DadoTeste dado;
      public transmit_call(DadoTeste dado, org.apache.thrift.async.AsyncMethodCallback resultHandler, org.apache.thrift.async.TAsyncClient client, org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.transport.TNonblockingTransport transport) throws org.apache.thrift.TException {
        super(client, protocolFactory, transport, resultHandler, false);
        this.dado = dado;
      }

      public void write_args(org.apache.thrift.protocol.TProtocol prot) throws org.apache.thrift.TException {
        prot.writeMessageBegin(new org.apache.thrift.protocol.TMessage("transmit", org.apache.thrift.protocol.TMessageType.CALL, 0));
        transmit_args args = new transmit_args();
        args.setDado(dado);
        args.write(prot);
        prot.writeMessageEnd();
      }

      public boolean getResult() throws TesteException, org.apache.thrift.TException {
        if (getState() != org.apache.thrift.async.TAsyncMethodCall.State.RESPONSE_READ) {
          throw new IllegalStateException("Method call not finished!");
        }
        org.apache.thrift.transport.TMemoryInputTransport memoryTransport = new org.apache.thrift.transport.TMemoryInputTransport(getFrameBuffer().array());
        org.apache.thrift.protocol.TProtocol prot = client.getProtocolFactory().getProtocol(memoryTransport);
        return (new Client(prot)).recv_transmit();
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
      processMap.put("transmit", new transmit());
      return processMap;
    }

    public static class transmit<I extends Iface> extends org.apache.thrift.ProcessFunction<I, transmit_args> {
      public transmit() {
        super("transmit");
      }

      public transmit_args getEmptyArgsInstance() {
        return new transmit_args();
      }

      protected boolean isOneway() {
        return false;
      }

      public transmit_result getResult(I iface, transmit_args args) throws org.apache.thrift.TException {
        transmit_result result = new transmit_result();
        try {
          result.success = iface.transmit(args.dado);
          result.setSuccessIsSet(true);
        } catch (TesteException testeException) {
          result.testeException = testeException;
        }
        return result;
      }
    }

  }

  public static class AsyncProcessor<I extends AsyncIface> extends org.apache.thrift.TBaseAsyncProcessor<I> {
    private static final Logger LOGGER = LoggerFactory.getLogger(AsyncProcessor.class.getName());
    public AsyncProcessor(I iface) {
      super(iface, getProcessMap(new HashMap<String, org.apache.thrift.AsyncProcessFunction<I, ? extends org.apache.thrift.TBase, ?>>()));
    }

    protected AsyncProcessor(I iface, Map<String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase, ?>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends AsyncIface> Map<String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase,?>> getProcessMap(Map<String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase, ?>> processMap) {
      processMap.put("transmit", new transmit());
      return processMap;
    }

    public static class transmit<I extends AsyncIface> extends org.apache.thrift.AsyncProcessFunction<I, transmit_args, Boolean> {
      public transmit() {
        super("transmit");
      }

      public transmit_args getEmptyArgsInstance() {
        return new transmit_args();
      }

      public AsyncMethodCallback<Boolean> getResultHandler(final AsyncFrameBuffer fb, final int seqid) {
        final org.apache.thrift.AsyncProcessFunction fcall = this;
        return new AsyncMethodCallback<Boolean>() { 
          public void onComplete(Boolean o) {
            transmit_result result = new transmit_result();
            result.success = o;
            result.setSuccessIsSet(true);
            try {
              fcall.sendResponse(fb,result, org.apache.thrift.protocol.TMessageType.REPLY,seqid);
              return;
            } catch (Exception e) {
              LOGGER.error("Exception writing to internal frame buffer", e);
            }
            fb.close();
          }
          public void onError(Exception e) {
            byte msgType = org.apache.thrift.protocol.TMessageType.REPLY;
            org.apache.thrift.TBase msg;
            transmit_result result = new transmit_result();
            if (e instanceof TesteException) {
                        result.testeException = (TesteException) e;
                        result.setTesteExceptionIsSet(true);
                        msg = result;
            }
             else 
            {
              msgType = org.apache.thrift.protocol.TMessageType.EXCEPTION;
              msg = (org.apache.thrift.TBase)new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.INTERNAL_ERROR, e.getMessage());
            }
            try {
              fcall.sendResponse(fb,msg,msgType,seqid);
              return;
            } catch (Exception ex) {
              LOGGER.error("Exception writing to internal frame buffer", ex);
            }
            fb.close();
          }
        };
      }

      protected boolean isOneway() {
        return false;
      }

      public void start(I iface, transmit_args args, org.apache.thrift.async.AsyncMethodCallback<Boolean> resultHandler) throws TException {
        iface.transmit(args.dado,resultHandler);
      }
    }

  }

  public static class transmit_args implements org.apache.thrift.TBase<transmit_args, transmit_args._Fields>, java.io.Serializable, Cloneable, Comparable<transmit_args>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("transmit_args");

    private static final org.apache.thrift.protocol.TField DADO_FIELD_DESC = new org.apache.thrift.protocol.TField("dado", org.apache.thrift.protocol.TType.STRUCT, (short)1);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new transmit_argsStandardSchemeFactory());
      schemes.put(TupleScheme.class, new transmit_argsTupleSchemeFactory());
    }

    private DadoTeste dado; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      DADO((short)1, "dado");

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
          case 1: // DADO
            return DADO;
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
      tmpMap.put(_Fields.DADO, new org.apache.thrift.meta_data.FieldMetaData("dado", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, DadoTeste.class)));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(transmit_args.class, metaDataMap);
    }

    public transmit_args() {
    }

    public transmit_args(
      DadoTeste dado)
    {
      this();
      this.dado = dado;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public transmit_args(transmit_args other) {
      if (other.isSetDado()) {
        this.dado = new DadoTeste(other.dado);
      }
    }

    public transmit_args deepCopy() {
      return new transmit_args(this);
    }

    @Override
    public void clear() {
      this.dado = null;
    }

    public DadoTeste getDado() {
      return this.dado;
    }

    public void setDado(DadoTeste dado) {
      this.dado = dado;
    }

    public void unsetDado() {
      this.dado = null;
    }

    /** Returns true if field dado is set (has been assigned a value) and false otherwise */
    public boolean isSetDado() {
      return this.dado != null;
    }

    public void setDadoIsSet(boolean value) {
      if (!value) {
        this.dado = null;
      }
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case DADO:
        if (value == null) {
          unsetDado();
        } else {
          setDado((DadoTeste)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case DADO:
        return getDado();

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case DADO:
        return isSetDado();
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof transmit_args)
        return this.equals((transmit_args)that);
      return false;
    }

    public boolean equals(transmit_args that) {
      if (that == null)
        return false;

      boolean this_present_dado = true && this.isSetDado();
      boolean that_present_dado = true && that.isSetDado();
      if (this_present_dado || that_present_dado) {
        if (!(this_present_dado && that_present_dado))
          return false;
        if (!this.dado.equals(that.dado))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      List<Object> list = new ArrayList<Object>();

      boolean present_dado = true && (isSetDado());
      list.add(present_dado);
      if (present_dado)
        list.add(dado);

      return list.hashCode();
    }

    @Override
    public int compareTo(transmit_args other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

      lastComparison = Boolean.valueOf(isSetDado()).compareTo(other.isSetDado());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetDado()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dado, other.dado);
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
      StringBuilder sb = new StringBuilder("transmit_args(");
      boolean first = true;

      sb.append("dado:");
      if (this.dado == null) {
        sb.append("null");
      } else {
        sb.append(this.dado);
      }
      first = false;
      sb.append(")");
      return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
      // check for sub-struct validity
      if (dado != null) {
        dado.validate();
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

    private static class transmit_argsStandardSchemeFactory implements SchemeFactory {
      public transmit_argsStandardScheme getScheme() {
        return new transmit_argsStandardScheme();
      }
    }

    private static class transmit_argsStandardScheme extends StandardScheme<transmit_args> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, transmit_args struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 1: // DADO
              if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
                struct.dado = new DadoTeste();
                struct.dado.read(iprot);
                struct.setDadoIsSet(true);
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
        struct.validate();
      }

      public void write(org.apache.thrift.protocol.TProtocol oprot, transmit_args struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.dado != null) {
          oprot.writeFieldBegin(DADO_FIELD_DESC);
          struct.dado.write(oprot);
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class transmit_argsTupleSchemeFactory implements SchemeFactory {
      public transmit_argsTupleScheme getScheme() {
        return new transmit_argsTupleScheme();
      }
    }

    private static class transmit_argsTupleScheme extends TupleScheme<transmit_args> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, transmit_args struct) throws org.apache.thrift.TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
        BitSet optionals = new BitSet();
        if (struct.isSetDado()) {
          optionals.set(0);
        }
        oprot.writeBitSet(optionals, 1);
        if (struct.isSetDado()) {
          struct.dado.write(oprot);
        }
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, transmit_args struct) throws org.apache.thrift.TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
        BitSet incoming = iprot.readBitSet(1);
        if (incoming.get(0)) {
          struct.dado = new DadoTeste();
          struct.dado.read(iprot);
          struct.setDadoIsSet(true);
        }
      }
    }

  }

  public static class transmit_result implements org.apache.thrift.TBase<transmit_result, transmit_result._Fields>, java.io.Serializable, Cloneable, Comparable<transmit_result>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("transmit_result");

    private static final org.apache.thrift.protocol.TField SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("success", org.apache.thrift.protocol.TType.BOOL, (short)0);
    private static final org.apache.thrift.protocol.TField TESTE_EXCEPTION_FIELD_DESC = new org.apache.thrift.protocol.TField("testeException", org.apache.thrift.protocol.TType.STRUCT, (short)1);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new transmit_resultStandardSchemeFactory());
      schemes.put(TupleScheme.class, new transmit_resultTupleSchemeFactory());
    }

    private boolean success; // required
    private TesteException testeException; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      SUCCESS((short)0, "success"),
      TESTE_EXCEPTION((short)1, "testeException");

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
          case 0: // SUCCESS
            return SUCCESS;
          case 1: // TESTE_EXCEPTION
            return TESTE_EXCEPTION;
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
    private static final int __SUCCESS_ISSET_ID = 0;
    private byte __isset_bitfield = 0;
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      tmpMap.put(_Fields.SUCCESS, new org.apache.thrift.meta_data.FieldMetaData("success", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
      tmpMap.put(_Fields.TESTE_EXCEPTION, new org.apache.thrift.meta_data.FieldMetaData("testeException", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT)));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(transmit_result.class, metaDataMap);
    }

    public transmit_result() {
    }

    public transmit_result(
      boolean success,
      TesteException testeException)
    {
      this();
      this.success = success;
      setSuccessIsSet(true);
      this.testeException = testeException;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public transmit_result(transmit_result other) {
      __isset_bitfield = other.__isset_bitfield;
      this.success = other.success;
      if (other.isSetTesteException()) {
        this.testeException = new TesteException(other.testeException);
      }
    }

    public transmit_result deepCopy() {
      return new transmit_result(this);
    }

    @Override
    public void clear() {
      setSuccessIsSet(false);
      this.success = false;
      this.testeException = null;
    }

    public boolean isSuccess() {
      return this.success;
    }

    public void setSuccess(boolean success) {
      this.success = success;
      setSuccessIsSet(true);
    }

    public void unsetSuccess() {
      __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SUCCESS_ISSET_ID);
    }

    /** Returns true if field success is set (has been assigned a value) and false otherwise */
    public boolean isSetSuccess() {
      return EncodingUtils.testBit(__isset_bitfield, __SUCCESS_ISSET_ID);
    }

    public void setSuccessIsSet(boolean value) {
      __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SUCCESS_ISSET_ID, value);
    }

    public TesteException getTesteException() {
      return this.testeException;
    }

    public void setTesteException(TesteException testeException) {
      this.testeException = testeException;
    }

    public void unsetTesteException() {
      this.testeException = null;
    }

    /** Returns true if field testeException is set (has been assigned a value) and false otherwise */
    public boolean isSetTesteException() {
      return this.testeException != null;
    }

    public void setTesteExceptionIsSet(boolean value) {
      if (!value) {
        this.testeException = null;
      }
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case SUCCESS:
        if (value == null) {
          unsetSuccess();
        } else {
          setSuccess((Boolean)value);
        }
        break;

      case TESTE_EXCEPTION:
        if (value == null) {
          unsetTesteException();
        } else {
          setTesteException((TesteException)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case SUCCESS:
        return Boolean.valueOf(isSuccess());

      case TESTE_EXCEPTION:
        return getTesteException();

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case SUCCESS:
        return isSetSuccess();
      case TESTE_EXCEPTION:
        return isSetTesteException();
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof transmit_result)
        return this.equals((transmit_result)that);
      return false;
    }

    public boolean equals(transmit_result that) {
      if (that == null)
        return false;

      boolean this_present_success = true;
      boolean that_present_success = true;
      if (this_present_success || that_present_success) {
        if (!(this_present_success && that_present_success))
          return false;
        if (this.success != that.success)
          return false;
      }

      boolean this_present_testeException = true && this.isSetTesteException();
      boolean that_present_testeException = true && that.isSetTesteException();
      if (this_present_testeException || that_present_testeException) {
        if (!(this_present_testeException && that_present_testeException))
          return false;
        if (!this.testeException.equals(that.testeException))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      List<Object> list = new ArrayList<Object>();

      boolean present_success = true;
      list.add(present_success);
      if (present_success)
        list.add(success);

      boolean present_testeException = true && (isSetTesteException());
      list.add(present_testeException);
      if (present_testeException)
        list.add(testeException);

      return list.hashCode();
    }

    @Override
    public int compareTo(transmit_result other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

      lastComparison = Boolean.valueOf(isSetSuccess()).compareTo(other.isSetSuccess());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetSuccess()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.success, other.success);
        if (lastComparison != 0) {
          return lastComparison;
        }
      }
      lastComparison = Boolean.valueOf(isSetTesteException()).compareTo(other.isSetTesteException());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetTesteException()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.testeException, other.testeException);
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
      StringBuilder sb = new StringBuilder("transmit_result(");
      boolean first = true;

      sb.append("success:");
      sb.append(this.success);
      first = false;
      if (!first) sb.append(", ");
      sb.append("testeException:");
      if (this.testeException == null) {
        sb.append("null");
      } else {
        sb.append(this.testeException);
      }
      first = false;
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
        // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
        __isset_bitfield = 0;
        read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private static class transmit_resultStandardSchemeFactory implements SchemeFactory {
      public transmit_resultStandardScheme getScheme() {
        return new transmit_resultStandardScheme();
      }
    }

    private static class transmit_resultStandardScheme extends StandardScheme<transmit_result> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, transmit_result struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 0: // SUCCESS
              if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
                struct.success = iprot.readBool();
                struct.setSuccessIsSet(true);
              } else { 
                org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              break;
            case 1: // TESTE_EXCEPTION
              if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
                struct.testeException = new TesteException();
                struct.testeException.read(iprot);
                struct.setTesteExceptionIsSet(true);
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
        struct.validate();
      }

      public void write(org.apache.thrift.protocol.TProtocol oprot, transmit_result struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.isSetSuccess()) {
          oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
          oprot.writeBool(struct.success);
          oprot.writeFieldEnd();
        }
        if (struct.testeException != null) {
          oprot.writeFieldBegin(TESTE_EXCEPTION_FIELD_DESC);
          struct.testeException.write(oprot);
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class transmit_resultTupleSchemeFactory implements SchemeFactory {
      public transmit_resultTupleScheme getScheme() {
        return new transmit_resultTupleScheme();
      }
    }

    private static class transmit_resultTupleScheme extends TupleScheme<transmit_result> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, transmit_result struct) throws org.apache.thrift.TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
        BitSet optionals = new BitSet();
        if (struct.isSetSuccess()) {
          optionals.set(0);
        }
        if (struct.isSetTesteException()) {
          optionals.set(1);
        }
        oprot.writeBitSet(optionals, 2);
        if (struct.isSetSuccess()) {
          oprot.writeBool(struct.success);
        }
        if (struct.isSetTesteException()) {
          struct.testeException.write(oprot);
        }
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, transmit_result struct) throws org.apache.thrift.TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
        BitSet incoming = iprot.readBitSet(2);
        if (incoming.get(0)) {
          struct.success = iprot.readBool();
          struct.setSuccessIsSet(true);
        }
        if (incoming.get(1)) {
          struct.testeException = new TesteException();
          struct.testeException.read(iprot);
          struct.setTesteExceptionIsSet(true);
        }
      }
    }

  }

}
