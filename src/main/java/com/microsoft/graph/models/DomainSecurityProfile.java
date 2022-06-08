package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the security singleton. */
public class DomainSecurityProfile extends Entity implements Parsable {
    /** The activityGroupNames property */
    private java.util.List<String> _activityGroupNames;
    /** The azureSubscriptionId property */
    private String _azureSubscriptionId;
    /** The azureTenantId property */
    private String _azureTenantId;
    /** The countHits property */
    private Integer _countHits;
    /** The countInOrg property */
    private Integer _countInOrg;
    /** The domainCategories property */
    private java.util.List<ReputationCategory> _domainCategories;
    /** The domainRegisteredDateTime property */
    private OffsetDateTime _domainRegisteredDateTime;
    /** The firstSeenDateTime property */
    private OffsetDateTime _firstSeenDateTime;
    /** The lastSeenDateTime property */
    private OffsetDateTime _lastSeenDateTime;
    /** The name property */
    private String _name;
    /** The registrant property */
    private DomainRegistrant _registrant;
    /** The riskScore property */
    private String _riskScore;
    /** The tags property */
    private java.util.List<String> _tags;
    /** The vendorInformation property */
    private SecurityVendorInformation _vendorInformation;
    /**
     * Instantiates a new domainSecurityProfile and sets the default values.
     * @return a void
     */
    public DomainSecurityProfile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a domainSecurityProfile
     */
    @javax.annotation.Nonnull
    public static DomainSecurityProfile createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DomainSecurityProfile();
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
     * Gets the countInOrg property value. The countInOrg property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCountInOrg() {
        return this._countInOrg;
    }
    /**
     * Gets the domainCategories property value. The domainCategories property
     * @return a reputationCategory
     */
    @javax.annotation.Nullable
    public java.util.List<ReputationCategory> getDomainCategories() {
        return this._domainCategories;
    }
    /**
     * Gets the domainRegisteredDateTime property value. The domainRegisteredDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getDomainRegisteredDateTime() {
        return this._domainRegisteredDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DomainSecurityProfile currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("activityGroupNames", (n) -> { currentObject.setActivityGroupNames(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("azureSubscriptionId", (n) -> { currentObject.setAzureSubscriptionId(n.getStringValue()); });
            this.put("azureTenantId", (n) -> { currentObject.setAzureTenantId(n.getStringValue()); });
            this.put("countHits", (n) -> { currentObject.setCountHits(n.getIntegerValue()); });
            this.put("countInOrg", (n) -> { currentObject.setCountInOrg(n.getIntegerValue()); });
            this.put("domainCategories", (n) -> { currentObject.setDomainCategories(n.getCollectionOfObjectValues(ReputationCategory::createFromDiscriminatorValue)); });
            this.put("domainRegisteredDateTime", (n) -> { currentObject.setDomainRegisteredDateTime(n.getOffsetDateTimeValue()); });
            this.put("firstSeenDateTime", (n) -> { currentObject.setFirstSeenDateTime(n.getOffsetDateTimeValue()); });
            this.put("lastSeenDateTime", (n) -> { currentObject.setLastSeenDateTime(n.getOffsetDateTimeValue()); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("registrant", (n) -> { currentObject.setRegistrant(n.getObjectValue(DomainRegistrant::createFromDiscriminatorValue)); });
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
     * Gets the lastSeenDateTime property value. The lastSeenDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastSeenDateTime() {
        return this._lastSeenDateTime;
    }
    /**
     * Gets the name property value. The name property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the registrant property value. The registrant property
     * @return a domainRegistrant
     */
    @javax.annotation.Nullable
    public DomainRegistrant getRegistrant() {
        return this._registrant;
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
        writer.writeStringValue("azureSubscriptionId", this.getAzureSubscriptionId());
        writer.writeStringValue("azureTenantId", this.getAzureTenantId());
        writer.writeIntegerValue("countHits", this.getCountHits());
        writer.writeIntegerValue("countInOrg", this.getCountInOrg());
        writer.writeCollectionOfObjectValues("domainCategories", this.getDomainCategories());
        writer.writeOffsetDateTimeValue("domainRegisteredDateTime", this.getDomainRegisteredDateTime());
        writer.writeOffsetDateTimeValue("firstSeenDateTime", this.getFirstSeenDateTime());
        writer.writeOffsetDateTimeValue("lastSeenDateTime", this.getLastSeenDateTime());
        writer.writeStringValue("name", this.getName());
        writer.writeObjectValue("registrant", this.getRegistrant());
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
     * Sets the countInOrg property value. The countInOrg property
     * @param value Value to set for the countInOrg property.
     * @return a void
     */
    public void setCountInOrg(@javax.annotation.Nullable final Integer value) {
        this._countInOrg = value;
    }
    /**
     * Sets the domainCategories property value. The domainCategories property
     * @param value Value to set for the domainCategories property.
     * @return a void
     */
    public void setDomainCategories(@javax.annotation.Nullable final java.util.List<ReputationCategory> value) {
        this._domainCategories = value;
    }
    /**
     * Sets the domainRegisteredDateTime property value. The domainRegisteredDateTime property
     * @param value Value to set for the domainRegisteredDateTime property.
     * @return a void
     */
    public void setDomainRegisteredDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._domainRegisteredDateTime = value;
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
     * Sets the lastSeenDateTime property value. The lastSeenDateTime property
     * @param value Value to set for the lastSeenDateTime property.
     * @return a void
     */
    public void setLastSeenDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastSeenDateTime = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the registrant property value. The registrant property
     * @param value Value to set for the registrant property.
     * @return a void
     */
    public void setRegistrant(@javax.annotation.Nullable final DomainRegistrant value) {
        this._registrant = value;
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
