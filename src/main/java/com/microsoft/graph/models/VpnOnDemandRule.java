package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** VPN On-Demand Rule definition. */
public class VpnOnDemandRule implements AdditionalDataHolder, Parsable {
    /** VPN On-Demand Rule Connection Action. */
    private VpnOnDemandRuleConnectionAction _action;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** DNS Search Domains. */
    private java.util.List<String> _dnsSearchDomains;
    /** VPN On-Demand Rule Connection Domain Action. */
    private VpnOnDemandRuleConnectionDomainAction _domainAction;
    /** Domains (Only applicable when Action is evaluate connection). */
    private java.util.List<String> _domains;
    /** Probe Required Url (Only applicable when Action is evaluate connection and DomainAction is connect if needed). */
    private String _probeRequiredUrl;
    /** A URL to probe. If this URL is successfully fetched (returning a 200 HTTP status code) without redirection, this rule matches. */
    private String _probeUrl;
    /** Network Service Set Identifiers (SSIDs). */
    private java.util.List<String> _ssids;
    /**
     * Instantiates a new vpnOnDemandRule and sets the default values.
     * @return a void
     */
    public VpnOnDemandRule() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a vpnOnDemandRule
     */
    @javax.annotation.Nonnull
    public static VpnOnDemandRule createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VpnOnDemandRule();
    }
    /**
     * Gets the action property value. VPN On-Demand Rule Connection Action.
     * @return a vpnOnDemandRuleConnectionAction
     */
    @javax.annotation.Nullable
    public VpnOnDemandRuleConnectionAction getAction() {
        return this._action;
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
     * Gets the dnsSearchDomains property value. DNS Search Domains.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDnsSearchDomains() {
        return this._dnsSearchDomains;
    }
    /**
     * Gets the domainAction property value. VPN On-Demand Rule Connection Domain Action.
     * @return a vpnOnDemandRuleConnectionDomainAction
     */
    @javax.annotation.Nullable
    public VpnOnDemandRuleConnectionDomainAction getDomainAction() {
        return this._domainAction;
    }
    /**
     * Gets the domains property value. Domains (Only applicable when Action is evaluate connection).
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDomains() {
        return this._domains;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final VpnOnDemandRule currentObject = this;
        return new HashMap<>(7) {{
            this.put("action", (n) -> { currentObject.setAction(n.getEnumValue(VpnOnDemandRuleConnectionAction.class)); });
            this.put("dnsSearchDomains", (n) -> { currentObject.setDnsSearchDomains(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("domainAction", (n) -> { currentObject.setDomainAction(n.getEnumValue(VpnOnDemandRuleConnectionDomainAction.class)); });
            this.put("domains", (n) -> { currentObject.setDomains(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("probeRequiredUrl", (n) -> { currentObject.setProbeRequiredUrl(n.getStringValue()); });
            this.put("probeUrl", (n) -> { currentObject.setProbeUrl(n.getStringValue()); });
            this.put("ssids", (n) -> { currentObject.setSsids(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the probeRequiredUrl property value. Probe Required Url (Only applicable when Action is evaluate connection and DomainAction is connect if needed).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProbeRequiredUrl() {
        return this._probeRequiredUrl;
    }
    /**
     * Gets the probeUrl property value. A URL to probe. If this URL is successfully fetched (returning a 200 HTTP status code) without redirection, this rule matches.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProbeUrl() {
        return this._probeUrl;
    }
    /**
     * Gets the ssids property value. Network Service Set Identifiers (SSIDs).
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSsids() {
        return this._ssids;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("action", this.getAction());
        writer.writeCollectionOfPrimitiveValues("dnsSearchDomains", this.getDnsSearchDomains());
        writer.writeEnumValue("domainAction", this.getDomainAction());
        writer.writeCollectionOfPrimitiveValues("domains", this.getDomains());
        writer.writeStringValue("probeRequiredUrl", this.getProbeRequiredUrl());
        writer.writeStringValue("probeUrl", this.getProbeUrl());
        writer.writeCollectionOfPrimitiveValues("ssids", this.getSsids());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the action property value. VPN On-Demand Rule Connection Action.
     * @param value Value to set for the action property.
     * @return a void
     */
    public void setAction(@javax.annotation.Nullable final VpnOnDemandRuleConnectionAction value) {
        this._action = value;
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
     * Sets the dnsSearchDomains property value. DNS Search Domains.
     * @param value Value to set for the dnsSearchDomains property.
     * @return a void
     */
    public void setDnsSearchDomains(@javax.annotation.Nullable final java.util.List<String> value) {
        this._dnsSearchDomains = value;
    }
    /**
     * Sets the domainAction property value. VPN On-Demand Rule Connection Domain Action.
     * @param value Value to set for the domainAction property.
     * @return a void
     */
    public void setDomainAction(@javax.annotation.Nullable final VpnOnDemandRuleConnectionDomainAction value) {
        this._domainAction = value;
    }
    /**
     * Sets the domains property value. Domains (Only applicable when Action is evaluate connection).
     * @param value Value to set for the domains property.
     * @return a void
     */
    public void setDomains(@javax.annotation.Nullable final java.util.List<String> value) {
        this._domains = value;
    }
    /**
     * Sets the probeRequiredUrl property value. Probe Required Url (Only applicable when Action is evaluate connection and DomainAction is connect if needed).
     * @param value Value to set for the probeRequiredUrl property.
     * @return a void
     */
    public void setProbeRequiredUrl(@javax.annotation.Nullable final String value) {
        this._probeRequiredUrl = value;
    }
    /**
     * Sets the probeUrl property value. A URL to probe. If this URL is successfully fetched (returning a 200 HTTP status code) without redirection, this rule matches.
     * @param value Value to set for the probeUrl property.
     * @return a void
     */
    public void setProbeUrl(@javax.annotation.Nullable final String value) {
        this._probeUrl = value;
    }
    /**
     * Sets the ssids property value. Network Service Set Identifiers (SSIDs).
     * @param value Value to set for the ssids property.
     * @return a void
     */
    public void setSsids(@javax.annotation.Nullable final java.util.List<String> value) {
        this._ssids = value;
    }
}
