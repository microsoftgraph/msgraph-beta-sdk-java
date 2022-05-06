package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IpSecurityProfile extends Entity implements Parsable {
    /** The activityGroupNames property  */
    private java.util.List<String> _activityGroupNames;
    /** The address property  */
    private String _address;
    /** The azureSubscriptionId property  */
    private String _azureSubscriptionId;
    /** The azureTenantId property  */
    private String _azureTenantId;
    /** The countHits property  */
    private Integer _countHits;
    /** The countHosts property  */
    private Integer _countHosts;
    /** The firstSeenDateTime property  */
    private OffsetDateTime _firstSeenDateTime;
    /** The ipCategories property  */
    private java.util.List<IpCategory> _ipCategories;
    /** The ipReferenceData property  */
    private java.util.List<IpReferenceData> _ipReferenceData;
    /** The lastSeenDateTime property  */
    private OffsetDateTime _lastSeenDateTime;
    /** The riskScore property  */
    private String _riskScore;
    /** The tags property  */
    private java.util.List<String> _tags;
    /** The vendorInformation property  */
    private SecurityVendorInformation _vendorInformation;
    /**
     * Instantiates a new ipSecurityProfile and sets the default values.
     * @return a void
     */
    public IpSecurityProfile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ipSecurityProfile
     */
    @javax.annotation.Nonnull
    public static IpSecurityProfile createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IpSecurityProfile();
    }
    /**
     * Gets the activityGroupNames property value. The activityGroupNames property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getActivityGroupNames() {
        return this._activityGroupNames;
    }
    /**
     * Gets the address property value. The address property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAddress() {
        return this._address;
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
     * Gets the countHits property value. The countHits property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCountHits() {
        return this._countHits;
    }
    /**
     * Gets the countHosts property value. The countHosts property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCountHosts() {
        return this._countHosts;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final IpSecurityProfile currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("activityGroupNames", (n) -> { currentObject.setActivityGroupNames(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("address", (n) -> { currentObject.setAddress(n.getStringValue()); });
            this.put("azureSubscriptionId", (n) -> { currentObject.setAzureSubscriptionId(n.getStringValue()); });
            this.put("azureTenantId", (n) -> { currentObject.setAzureTenantId(n.getStringValue()); });
            this.put("countHits", (n) -> { currentObject.setCountHits(n.getIntegerValue()); });
            this.put("countHosts", (n) -> { currentObject.setCountHosts(n.getIntegerValue()); });
            this.put("firstSeenDateTime", (n) -> { currentObject.setFirstSeenDateTime(n.getOffsetDateTimeValue()); });
            this.put("ipCategories", (n) -> { currentObject.setIpCategories(n.getCollectionOfObjectValues(IpCategory::createFromDiscriminatorValue)); });
            this.put("ipReferenceData", (n) -> { currentObject.setIpReferenceData(n.getCollectionOfObjectValues(IpReferenceData::createFromDiscriminatorValue)); });
            this.put("lastSeenDateTime", (n) -> { currentObject.setLastSeenDateTime(n.getOffsetDateTimeValue()); });
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
     * Gets the ipCategories property value. The ipCategories property
     * @return a ipCategory
     */
    @javax.annotation.Nullable
    public java.util.List<IpCategory> getIpCategories() {
        return this._ipCategories;
    }
    /**
     * Gets the ipReferenceData property value. The ipReferenceData property
     * @return a ipReferenceData
     */
    @javax.annotation.Nullable
    public java.util.List<IpReferenceData> getIpReferenceData() {
        return this._ipReferenceData;
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
        writer.writeCollectionOfPrimitiveValues("activityGroupNames", this.getActivityGroupNames());
        writer.writeStringValue("address", this.getAddress());
        writer.writeStringValue("azureSubscriptionId", this.getAzureSubscriptionId());
        writer.writeStringValue("azureTenantId", this.getAzureTenantId());
        writer.writeIntegerValue("countHits", this.getCountHits());
        writer.writeIntegerValue("countHosts", this.getCountHosts());
        writer.writeOffsetDateTimeValue("firstSeenDateTime", this.getFirstSeenDateTime());
        writer.writeCollectionOfObjectValues("ipCategories", this.getIpCategories());
        writer.writeCollectionOfObjectValues("ipReferenceData", this.getIpReferenceData());
        writer.writeOffsetDateTimeValue("lastSeenDateTime", this.getLastSeenDateTime());
        writer.writeStringValue("riskScore", this.getRiskScore());
        writer.writeCollectionOfPrimitiveValues("tags", this.getTags());
        writer.writeObjectValue("vendorInformation", this.getVendorInformation());
    }
    /**
     * Sets the activityGroupNames property value. The activityGroupNames property
     * @param value Value to set for the activityGroupNames property.
     * @return a void
     */
    public void setActivityGroupNames(@javax.annotation.Nullable final java.util.List<String> value) {
        this._activityGroupNames = value;
    }
    /**
     * Sets the address property value. The address property
     * @param value Value to set for the address property.
     * @return a void
     */
    public void setAddress(@javax.annotation.Nullable final String value) {
        this._address = value;
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
     * Sets the countHits property value. The countHits property
     * @param value Value to set for the countHits property.
     * @return a void
     */
    public void setCountHits(@javax.annotation.Nullable final Integer value) {
        this._countHits = value;
    }
    /**
     * Sets the countHosts property value. The countHosts property
     * @param value Value to set for the countHosts property.
     * @return a void
     */
    public void setCountHosts(@javax.annotation.Nullable final Integer value) {
        this._countHosts = value;
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
     * Sets the ipCategories property value. The ipCategories property
     * @param value Value to set for the ipCategories property.
     * @return a void
     */
    public void setIpCategories(@javax.annotation.Nullable final java.util.List<IpCategory> value) {
        this._ipCategories = value;
    }
    /**
     * Sets the ipReferenceData property value. The ipReferenceData property
     * @param value Value to set for the ipReferenceData property.
     * @return a void
     */
    public void setIpReferenceData(@javax.annotation.Nullable final java.util.List<IpReferenceData> value) {
        this._ipReferenceData = value;
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
