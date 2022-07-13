package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AndroidDeviceOwnerGlobalProxyDirect extends AndroidDeviceOwnerGlobalProxy implements Parsable {
    /** The excluded hosts */
    private java.util.List<String> _excludedHosts;
    /** The host name */
    private String _host;
    /** The port */
    private Integer _port;
    /**
     * Instantiates a new AndroidDeviceOwnerGlobalProxyDirect and sets the default values.
     * @return a void
     */
    public AndroidDeviceOwnerGlobalProxyDirect() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidDeviceOwnerGlobalProxyDirect
     */
    @javax.annotation.Nonnull
    public static AndroidDeviceOwnerGlobalProxyDirect createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidDeviceOwnerGlobalProxyDirect();
    }
    /**
     * Gets the excludedHosts property value. The excluded hosts
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getExcludedHosts() {
        return this._excludedHosts;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AndroidDeviceOwnerGlobalProxyDirect currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("excludedHosts", (n) -> { currentObject.setExcludedHosts(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("host", (n) -> { currentObject.setHost(n.getStringValue()); });
            this.put("port", (n) -> { currentObject.setPort(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the host property value. The host name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHost() {
        return this._host;
    }
    /**
     * Gets the port property value. The port
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPort() {
        return this._port;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("excludedHosts", this.getExcludedHosts());
        writer.writeStringValue("host", this.getHost());
        writer.writeIntegerValue("port", this.getPort());
    }
    /**
     * Sets the excludedHosts property value. The excluded hosts
     * @param value Value to set for the excludedHosts property.
     * @return a void
     */
    public void setExcludedHosts(@javax.annotation.Nullable final java.util.List<String> value) {
        this._excludedHosts = value;
    }
    /**
     * Sets the host property value. The host name
     * @param value Value to set for the host property.
     * @return a void
     */
    public void setHost(@javax.annotation.Nullable final String value) {
        this._host = value;
    }
    /**
     * Sets the port property value. The port
     * @param value Value to set for the port property.
     * @return a void
     */
    public void setPort(@javax.annotation.Nullable final Integer value) {
        this._port = value;
    }
}
