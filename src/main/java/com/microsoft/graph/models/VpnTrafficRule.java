package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** VPN Traffic Rule definition. */
public class VpnTrafficRule implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** App identifier, if this traffic rule is triggered by an app. */
    private String _appId;
    /** Indicates the type of app that a VPN traffic rule is associated with. */
    private VpnTrafficRuleAppType _appType;
    /** Claims associated with this traffic rule. */
    private String _claims;
    /** Local address range. This collection can contain a maximum of 500 elements. */
    private java.util.List<IPv4Range> _localAddressRanges;
    /** Local port range can be set only when protocol is either TCP or UDP (6 or 17). This collection can contain a maximum of 500 elements. */
    private java.util.List<NumberRange> _localPortRanges;
    /** Name. */
    private String _name;
    /** Protocols (0-255). Valid values 0 to 255 */
    private Integer _protocols;
    /** Remote address range. This collection can contain a maximum of 500 elements. */
    private java.util.List<IPv4Range> _remoteAddressRanges;
    /** Remote port range can be set only when protocol is either TCP or UDP (6 or 17). This collection can contain a maximum of 500 elements. */
    private java.util.List<NumberRange> _remotePortRanges;
    /** Specifies the routing policy for a VPN traffic rule. */
    private VpnTrafficRuleRoutingPolicyType _routingPolicyType;
    /**
     * Instantiates a new vpnTrafficRule and sets the default values.
     * @return a void
     */
    public VpnTrafficRule() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a vpnTrafficRule
     */
    @javax.annotation.Nonnull
    public static VpnTrafficRule createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VpnTrafficRule();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the appId property value. App identifier, if this traffic rule is triggered by an app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppId() {
        return this._appId;
    }
    /**
     * Gets the appType property value. Indicates the type of app that a VPN traffic rule is associated with.
     * @return a vpnTrafficRuleAppType
     */
    @javax.annotation.Nullable
    public VpnTrafficRuleAppType getAppType() {
        return this._appType;
    }
    /**
     * Gets the claims property value. Claims associated with this traffic rule.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClaims() {
        return this._claims;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final VpnTrafficRule currentObject = this;
        return new HashMap<>(10) {{
            this.put("appId", (n) -> { currentObject.setAppId(n.getStringValue()); });
            this.put("appType", (n) -> { currentObject.setAppType(n.getEnumValue(VpnTrafficRuleAppType.class)); });
            this.put("claims", (n) -> { currentObject.setClaims(n.getStringValue()); });
            this.put("localAddressRanges", (n) -> { currentObject.setLocalAddressRanges(n.getCollectionOfObjectValues(IPv4Range::createFromDiscriminatorValue)); });
            this.put("localPortRanges", (n) -> { currentObject.setLocalPortRanges(n.getCollectionOfObjectValues(NumberRange::createFromDiscriminatorValue)); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("protocols", (n) -> { currentObject.setProtocols(n.getIntegerValue()); });
            this.put("remoteAddressRanges", (n) -> { currentObject.setRemoteAddressRanges(n.getCollectionOfObjectValues(IPv4Range::createFromDiscriminatorValue)); });
            this.put("remotePortRanges", (n) -> { currentObject.setRemotePortRanges(n.getCollectionOfObjectValues(NumberRange::createFromDiscriminatorValue)); });
            this.put("routingPolicyType", (n) -> { currentObject.setRoutingPolicyType(n.getEnumValue(VpnTrafficRuleRoutingPolicyType.class)); });
        }};
    }
    /**
     * Gets the localAddressRanges property value. Local address range. This collection can contain a maximum of 500 elements.
     * @return a iPv4Range
     */
    @javax.annotation.Nullable
    public java.util.List<IPv4Range> getLocalAddressRanges() {
        return this._localAddressRanges;
    }
    /**
     * Gets the localPortRanges property value. Local port range can be set only when protocol is either TCP or UDP (6 or 17). This collection can contain a maximum of 500 elements.
     * @return a numberRange
     */
    @javax.annotation.Nullable
    public java.util.List<NumberRange> getLocalPortRanges() {
        return this._localPortRanges;
    }
    /**
     * Gets the name property value. Name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the protocols property value. Protocols (0-255). Valid values 0 to 255
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getProtocols() {
        return this._protocols;
    }
    /**
     * Gets the remoteAddressRanges property value. Remote address range. This collection can contain a maximum of 500 elements.
     * @return a iPv4Range
     */
    @javax.annotation.Nullable
    public java.util.List<IPv4Range> getRemoteAddressRanges() {
        return this._remoteAddressRanges;
    }
    /**
     * Gets the remotePortRanges property value. Remote port range can be set only when protocol is either TCP or UDP (6 or 17). This collection can contain a maximum of 500 elements.
     * @return a numberRange
     */
    @javax.annotation.Nullable
    public java.util.List<NumberRange> getRemotePortRanges() {
        return this._remotePortRanges;
    }
    /**
     * Gets the routingPolicyType property value. Specifies the routing policy for a VPN traffic rule.
     * @return a vpnTrafficRuleRoutingPolicyType
     */
    @javax.annotation.Nullable
    public VpnTrafficRuleRoutingPolicyType getRoutingPolicyType() {
        return this._routingPolicyType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("appId", this.getAppId());
        writer.writeEnumValue("appType", this.getAppType());
        writer.writeStringValue("claims", this.getClaims());
        writer.writeCollectionOfObjectValues("localAddressRanges", this.getLocalAddressRanges());
        writer.writeCollectionOfObjectValues("localPortRanges", this.getLocalPortRanges());
        writer.writeStringValue("name", this.getName());
        writer.writeIntegerValue("protocols", this.getProtocols());
        writer.writeCollectionOfObjectValues("remoteAddressRanges", this.getRemoteAddressRanges());
        writer.writeCollectionOfObjectValues("remotePortRanges", this.getRemotePortRanges());
        writer.writeEnumValue("routingPolicyType", this.getRoutingPolicyType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the appId property value. App identifier, if this traffic rule is triggered by an app.
     * @param value Value to set for the appId property.
     * @return a void
     */
    public void setAppId(@javax.annotation.Nullable final String value) {
        this._appId = value;
    }
    /**
     * Sets the appType property value. Indicates the type of app that a VPN traffic rule is associated with.
     * @param value Value to set for the appType property.
     * @return a void
     */
    public void setAppType(@javax.annotation.Nullable final VpnTrafficRuleAppType value) {
        this._appType = value;
    }
    /**
     * Sets the claims property value. Claims associated with this traffic rule.
     * @param value Value to set for the claims property.
     * @return a void
     */
    public void setClaims(@javax.annotation.Nullable final String value) {
        this._claims = value;
    }
    /**
     * Sets the localAddressRanges property value. Local address range. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the localAddressRanges property.
     * @return a void
     */
    public void setLocalAddressRanges(@javax.annotation.Nullable final java.util.List<IPv4Range> value) {
        this._localAddressRanges = value;
    }
    /**
     * Sets the localPortRanges property value. Local port range can be set only when protocol is either TCP or UDP (6 or 17). This collection can contain a maximum of 500 elements.
     * @param value Value to set for the localPortRanges property.
     * @return a void
     */
    public void setLocalPortRanges(@javax.annotation.Nullable final java.util.List<NumberRange> value) {
        this._localPortRanges = value;
    }
    /**
     * Sets the name property value. Name.
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the protocols property value. Protocols (0-255). Valid values 0 to 255
     * @param value Value to set for the protocols property.
     * @return a void
     */
    public void setProtocols(@javax.annotation.Nullable final Integer value) {
        this._protocols = value;
    }
    /**
     * Sets the remoteAddressRanges property value. Remote address range. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the remoteAddressRanges property.
     * @return a void
     */
    public void setRemoteAddressRanges(@javax.annotation.Nullable final java.util.List<IPv4Range> value) {
        this._remoteAddressRanges = value;
    }
    /**
     * Sets the remotePortRanges property value. Remote port range can be set only when protocol is either TCP or UDP (6 or 17). This collection can contain a maximum of 500 elements.
     * @param value Value to set for the remotePortRanges property.
     * @return a void
     */
    public void setRemotePortRanges(@javax.annotation.Nullable final java.util.List<NumberRange> value) {
        this._remotePortRanges = value;
    }
    /**
     * Sets the routingPolicyType property value. Specifies the routing policy for a VPN traffic rule.
     * @param value Value to set for the routingPolicyType property.
     * @return a void
     */
    public void setRoutingPolicyType(@javax.annotation.Nullable final VpnTrafficRuleRoutingPolicyType value) {
        this._routingPolicyType = value;
    }
}
