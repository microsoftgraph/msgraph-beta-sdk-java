package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ReceiverProtocol implements ValuedEnum {
    Ftp("ftp"),
    Ftps("ftps"),
    SyslogUdp("syslogUdp"),
    SyslogTcp("syslogTcp"),
    SyslogTls("syslogTls"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ReceiverProtocol(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ReceiverProtocol forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ftp": return Ftp;
            case "ftps": return Ftps;
            case "syslogUdp": return SyslogUdp;
            case "syslogTcp": return SyslogTcp;
            case "syslogTls": return SyslogTls;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
