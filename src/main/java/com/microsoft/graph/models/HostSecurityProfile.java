package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReviewDecision entities. */
public class HostSecurityProfile extends Entity implements Parsable {
    /** The azureSubscriptionId property */
    private String _azureSubscriptionId;
    /** The azureTenantId property */
    private String _azureTenantId;
    /** The firstSeenDateTime property */
    private OffsetDateTime _firstSeenDateTime;
    /** The fqdn property */
    private String _fqdn;
    /** The isAzureAdJoined property */
    private Boolean _isAzureAdJoined;
    /** The isAzureAdRegistered property */
    private Boolean _isAzureAdRegistered;
    /** The isHybridAzureDomainJoined property */
    private Boolean _isHybridAzureDomainJoined;
    /** The lastSeenDateTime property */
    private OffsetDateTime _lastSeenDateTime;
    /** The logonUsers property */
    private java.util.List<LogonUser> _logonUsers;
    /** The netBiosName property */
    private String _netBiosName;
    /** The networkInterfaces property */
    private java.util.List<NetworkInterface> _networkInterfaces;
    /** The os property */
    private String _os;
    /** The osVersion property */
    private String _osVersion;
    /** The parentHost property */
    private String _parentHost;
    /** The relatedHostIds property */
    private java.util.List<String> _relatedHostIds;
    /** The riskScore property */
    private String _riskScore;
    /** The tags property */
    private java.util.List<String> _tags;
    /** The vendorInformation property */
    private SecurityVendorInformation _vendorInformation;
    /**
     * Instantiates a new hostSecurityProfile and sets the default values.
     * @return a void
     */
    public HostSecurityProfile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a hostSecurityProfile
     */
    @javax.annotation.Nonnull
    public static HostSecurityProfile createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HostSecurityProfile();
    }
    /**
     * Gets the azureSubscriptionId property value. The azureSubscriptionId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAzureSubscriptionId() {
        return this._azureSubscriptionId;
    }
    /**
     * Gets the azureTenantId property value. The azureTenantId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAzureTenantId() {
        return this._azureTenantId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HostSecurityProfile currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("azureSubscriptionId", (n) -> { currentObject.setAzureSubscriptionId(n.getStringValue()); });
            this.put("azureTenantId", (n) -> { currentObject.setAzureTenantId(n.getStringValue()); });
            this.put("firstSeenDateTime", (n) -> { currentObject.setFirstSeenDateTime(n.getOffsetDateTimeValue()); });
            this.put("fqdn", (n) -> { currentObject.setFqdn(n.getStringValue()); });
            this.put("isAzureAdJoined", (n) -> { currentObject.setIsAzureAdJoined(n.getBooleanValue()); });
            this.put("isAzureAdRegistered", (n) -> { currentObject.setIsAzureAdRegistered(n.getBooleanValue()); });
            this.put("isHybridAzureDomainJoined", (n) -> { currentObject.setIsHybridAzureDomainJoined(n.getBooleanValue()); });
            this.put("lastSeenDateTime", (n) -> { currentObject.setLastSeenDateTime(n.getOffsetDateTimeValue()); });
            this.put("logonUsers", (n) -> { currentObject.setLogonUsers(n.getCollectionOfObjectValues(LogonUser::createFromDiscriminatorValue)); });
            this.put("netBiosName", (n) -> { currentObject.setNetBiosName(n.getStringValue()); });
            this.put("networkInterfaces", (n) -> { currentObject.setNetworkInterfaces(n.getCollectionOfObjectValues(NetworkInterface::createFromDiscriminatorValue)); });
            this.put("os", (n) -> { currentObject.setOs(n.getStringValue()); });
            this.put("osVersion", (n) -> { currentObject.setOsVersion(n.getStringValue()); });
            this.put("parentHost", (n) -> { currentObject.setParentHost(n.getStringValue()); });
            this.put("relatedHostIds", (n) -> { currentObject.setRelatedHostIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("riskScore", (n) -> { currentObject.setRiskScore(n.getStringValue()); });
            this.put("tags", (n) -> { currentObject.setTags(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("vendorInformation", (n) -> { currentObject.setVendorInformation(n.getObjectValue(SecurityVendorInformation::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the firstSeenDateTime property value. The firstSeenDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getFirstSeenDateTime() {
        return this._firstSeenDateTime;
    }
    /**
     * Gets the fqdn property value. The fqdn property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFqdn() {
        return this._fqdn;
    }
    /**
     * Gets the isAzureAdJoined property value. The isAzureAdJoined property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsAzureAdJoined() {
        return this._isAzureAdJoined;
    }
    /**
     * Gets the isAzureAdRegistered property value. The isAzureAdRegistered property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsAzureAdRegistered() {
        return this._isAzureAdRegistered;
    }
    /**
     * Gets the isHybridAzureDomainJoined property value. The isHybridAzureDomainJoined property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsHybridAzureDomainJoined() {
        return this._isHybridAzureDomainJoined;
    }
    /**
     * Gets the lastSeenDateTime property value. The lastSeenDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastSeenDateTime() {
        return this._lastSeenDateTime;
    }
    /**
     * Gets the logonUsers property value. The logonUsers property
     * @return a logonUser
     */
    @javax.annotation.Nullable
    public java.util.List<LogonUser> getLogonUsers() {
        return this._logonUsers;
    }
    /**
     * Gets the netBiosName property value. The netBiosName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNetBiosName() {
        return this._netBiosName;
    }
    /**
     * Gets the networkInterfaces property value. The networkInterfaces property
     * @return a networkInterface
     */
    @javax.annotation.Nullable
    public java.util.List<NetworkInterface> getNetworkInterfaces() {
        return this._networkInterfaces;
    }
    /**
     * Gets the os property value. The os property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOs() {
        return this._os;
    }
    /**
     * Gets the osVersion property value. The osVersion property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsVersion() {
        return this._osVersion;
    }
    /**
     * Gets the parentHost property value. The parentHost property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getParentHost() {
        return this._parentHost;
    }
    /**
     * Gets the relatedHostIds property value. The relatedHostIds property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRelatedHostIds() {
        return this._relatedHostIds;
    }
    /**
     * Gets the riskScore property value. The riskScore property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRiskScore() {
        return this._riskScore;
    }
    /**
     * Gets the tags property value. The tags property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getTags() {
        return this._tags;
    }
    /**
     * Gets the vendorInformation property value. The vendorInformation property
     * @return a securityVendorInformation
     */
    @javax.annotation.Nullable
    public SecurityVendorInformation getVendorInformation() {
        return this._vendorInformation;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("azureSubscriptionId", this.getAzureSubscriptionId());
        writer.writeStringValue("azureTenantId", this.getAzureTenantId());
        writer.writeOffsetDateTimeValue("firstSeenDateTime", this.getFirstSeenDateTime());
        writer.writeStringValue("fqdn", this.getFqdn());
        writer.writeBooleanValue("isAzureAdJoined", this.getIsAzureAdJoined());
        writer.writeBooleanValue("isAzureAdRegistered", this.getIsAzureAdRegistered());
        writer.writeBooleanValue("isHybridAzureDomainJoined", this.getIsHybridAzureDomainJoined());
        writer.writeOffsetDateTimeValue("lastSeenDateTime", this.getLastSeenDateTime());
        writer.writeCollectionOfObjectValues("logonUsers", this.getLogonUsers());
        writer.writeStringValue("netBiosName", this.getNetBiosName());
        writer.writeCollectionOfObjectValues("networkInterfaces", this.getNetworkInterfaces());
        writer.writeStringValue("os", this.getOs());
        writer.writeStringValue("osVersion", this.getOsVersion());
        writer.writeStringValue("parentHost", this.getParentHost());
        writer.writeCollectionOfPrimitiveValues("relatedHostIds", this.getRelatedHostIds());
        writer.writeStringValue("riskScore", this.getRiskScore());
        writer.writeCollectionOfPrimitiveValues("tags", this.getTags());
        writer.writeObjectValue("vendorInformation", this.getVendorInformation());
    }
    /**
     * Sets the azureSubscriptionId property value. The azureSubscriptionId property
     * @param value Value to set for the azureSubscriptionId property.
     * @return a void
     */
    public void setAzureSubscriptionId(@javax.annotation.Nullable final String value) {
        this._azureSubscriptionId = value;
    }
    /**
     * Sets the azureTenantId property value. The azureTenantId property
     * @param value Value to set for the azureTenantId property.
     * @return a void
     */
    public void setAzureTenantId(@javax.annotation.Nullable final String value) {
        this._azureTenantId = value;
    }
    /**
     * Sets the firstSeenDateTime property value. The firstSeenDateTime property
     * @param value Value to set for the firstSeenDateTime property.
     * @return a void
     */
    public void setFirstSeenDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._firstSeenDateTime = value;
    }
    /**
     * Sets the fqdn property value. The fqdn property
     * @param value Value to set for the fqdn property.
     * @return a void
     */
    public void setFqdn(@javax.annotation.Nullable final String value) {
        this._fqdn = value;
    }
    /**
     * Sets the isAzureAdJoined property value. The isAzureAdJoined property
     * @param value Value to set for the isAzureAdJoined property.
     * @return a void
     */
    public void setIsAzureAdJoined(@javax.annotation.Nullable final Boolean value) {
        this._isAzureAdJoined = value;
    }
    /**
     * Sets the isAzureAdRegistered property value. The isAzureAdRegistered property
     * @param value Value to set for the isAzureAdRegistered property.
     * @return a void
     */
    public void setIsAzureAdRegistered(@javax.annotation.Nullable final Boolean value) {
        this._isAzureAdRegistered = value;
    }
    /**
     * Sets the isHybridAzureDomainJoined property value. The isHybridAzureDomainJoined property
     * @param value Value to set for the isHybridAzureDomainJoined property.
     * @return a void
     */
    public void setIsHybridAzureDomainJoined(@javax.annotation.Nullable final Boolean value) {
        this._isHybridAzureDomainJoined = value;
    }
    /**
     * Sets the lastSeenDateTime property value. The lastSeenDateTime property
     * @param value Value to set for the lastSeenDateTime property.
     * @return a void
     */
    public void setLastSeenDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastSeenDateTime = value;
    }
    /**
     * Sets the logonUsers property value. The logonUsers property
     * @param value Value to set for the logonUsers property.
     * @return a void
     */
    public void setLogonUsers(@javax.annotation.Nullable final java.util.List<LogonUser> value) {
        this._logonUsers = value;
    }
    /**
     * Sets the netBiosName property value. The netBiosName property
     * @param value Value to set for the netBiosName property.
     * @return a void
     */
    public void setNetBiosName(@javax.annotation.Nullable final String value) {
        this._netBiosName = value;
    }
    /**
     * Sets the networkInterfaces property value. The networkInterfaces property
     * @param value Value to set for the networkInterfaces property.
     * @return a void
     */
    public void setNetworkInterfaces(@javax.annotation.Nullable final java.util.List<NetworkInterface> value) {
        this._networkInterfaces = value;
    }
    /**
     * Sets the os property value. The os property
     * @param value Value to set for the os property.
     * @return a void
     */
    public void setOs(@javax.annotation.Nullable final String value) {
        this._os = value;
    }
    /**
     * Sets the osVersion property value. The osVersion property
     * @param value Value to set for the osVersion property.
     * @return a void
     */
    public void setOsVersion(@javax.annotation.Nullable final String value) {
        this._osVersion = value;
    }
    /**
     * Sets the parentHost property value. The parentHost property
     * @param value Value to set for the parentHost property.
     * @return a void
     */
    public void setParentHost(@javax.annotation.Nullable final String value) {
        this._parentHost = value;
    }
    /**
     * Sets the relatedHostIds property value. The relatedHostIds property
     * @param value Value to set for the relatedHostIds property.
     * @return a void
     */
    public void setRelatedHostIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._relatedHostIds = value;
    }
    /**
     * Sets the riskScore property value. The riskScore property
     * @param value Value to set for the riskScore property.
     * @return a void
     */
    public void setRiskScore(@javax.annotation.Nullable final String value) {
        this._riskScore = value;
    }
    /**
     * Sets the tags property value. The tags property
     * @param value Value to set for the tags property.
     * @return a void
     */
    public void setTags(@javax.annotation.Nullable final java.util.List<String> value) {
        this._tags = value;
    }
    /**
     * Sets the vendorInformation property value. The vendorInformation property
     * @param value Value to set for the vendorInformation property.
     * @return a void
     */
    public void setVendorInformation(@javax.annotation.Nullable final SecurityVendorInformation value) {
        this._vendorInformation = value;
    }
}
