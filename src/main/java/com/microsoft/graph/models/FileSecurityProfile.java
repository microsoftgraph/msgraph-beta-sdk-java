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
public class FileSecurityProfile extends Entity implements Parsable {
    /** The activityGroupNames property */
    private java.util.List<String> _activityGroupNames;
    /** The azureSubscriptionId property */
    private String _azureSubscriptionId;
    /** The azureTenantId property */
    private String _azureTenantId;
    /** The certificateThumbprint property */
    private String _certificateThumbprint;
    /** The extensions property */
    private java.util.List<String> _extensions;
    /** The fileType property */
    private String _fileType;
    /** The firstSeenDateTime property */
    private OffsetDateTime _firstSeenDateTime;
    /** The hashes property */
    private java.util.List<FileHash> _hashes;
    /** The lastSeenDateTime property */
    private OffsetDateTime _lastSeenDateTime;
    /** The malwareStates property */
    private java.util.List<MalwareState> _malwareStates;
    /** The names property */
    private java.util.List<String> _names;
    /** The riskScore property */
    private String _riskScore;
    /** The size property */
    private Long _size;
    /** The tags property */
    private java.util.List<String> _tags;
    /** The vendorInformation property */
    private SecurityVendorInformation _vendorInformation;
    /** The vulnerabilityStates property */
    private java.util.List<VulnerabilityState> _vulnerabilityStates;
    /**
     * Instantiates a new fileSecurityProfile and sets the default values.
     * @return a void
     */
    public FileSecurityProfile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a fileSecurityProfile
     */
    @javax.annotation.Nonnull
    public static FileSecurityProfile createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FileSecurityProfile();
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
     * Gets the certificateThumbprint property value. The certificateThumbprint property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCertificateThumbprint() {
        return this._certificateThumbprint;
    }
    /**
     * Gets the extensions property value. The extensions property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getExtensions() {
        return this._extensions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final FileSecurityProfile currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("activityGroupNames", (n) -> { currentObject.setActivityGroupNames(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("azureSubscriptionId", (n) -> { currentObject.setAzureSubscriptionId(n.getStringValue()); });
            this.put("azureTenantId", (n) -> { currentObject.setAzureTenantId(n.getStringValue()); });
            this.put("certificateThumbprint", (n) -> { currentObject.setCertificateThumbprint(n.getStringValue()); });
            this.put("extensions", (n) -> { currentObject.setExtensions(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("fileType", (n) -> { currentObject.setFileType(n.getStringValue()); });
            this.put("firstSeenDateTime", (n) -> { currentObject.setFirstSeenDateTime(n.getOffsetDateTimeValue()); });
            this.put("hashes", (n) -> { currentObject.setHashes(n.getCollectionOfObjectValues(FileHash::createFromDiscriminatorValue)); });
            this.put("lastSeenDateTime", (n) -> { currentObject.setLastSeenDateTime(n.getOffsetDateTimeValue()); });
            this.put("malwareStates", (n) -> { currentObject.setMalwareStates(n.getCollectionOfObjectValues(MalwareState::createFromDiscriminatorValue)); });
            this.put("names", (n) -> { currentObject.setNames(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("riskScore", (n) -> { currentObject.setRiskScore(n.getStringValue()); });
            this.put("size", (n) -> { currentObject.setSize(n.getLongValue()); });
            this.put("tags", (n) -> { currentObject.setTags(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("vendorInformation", (n) -> { currentObject.setVendorInformation(n.getObjectValue(SecurityVendorInformation::createFromDiscriminatorValue)); });
            this.put("vulnerabilityStates", (n) -> { currentObject.setVulnerabilityStates(n.getCollectionOfObjectValues(VulnerabilityState::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the fileType property value. The fileType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFileType() {
        return this._fileType;
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
     * Gets the hashes property value. The hashes property
     * @return a fileHash
     */
    @javax.annotation.Nullable
    public java.util.List<FileHash> getHashes() {
        return this._hashes;
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
     * Gets the malwareStates property value. The malwareStates property
     * @return a malwareState
     */
    @javax.annotation.Nullable
    public java.util.List<MalwareState> getMalwareStates() {
        return this._malwareStates;
    }
    /**
     * Gets the names property value. The names property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getNames() {
        return this._names;
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
     * Gets the size property value. The size property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getSize() {
        return this._size;
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
     * Gets the vulnerabilityStates property value. The vulnerabilityStates property
     * @return a vulnerabilityState
     */
    @javax.annotation.Nullable
    public java.util.List<VulnerabilityState> getVulnerabilityStates() {
        return this._vulnerabilityStates;
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
        writer.writeStringValue("certificateThumbprint", this.getCertificateThumbprint());
        writer.writeCollectionOfPrimitiveValues("extensions", this.getExtensions());
        writer.writeStringValue("fileType", this.getFileType());
        writer.writeOffsetDateTimeValue("firstSeenDateTime", this.getFirstSeenDateTime());
        writer.writeCollectionOfObjectValues("hashes", this.getHashes());
        writer.writeOffsetDateTimeValue("lastSeenDateTime", this.getLastSeenDateTime());
        writer.writeCollectionOfObjectValues("malwareStates", this.getMalwareStates());
        writer.writeCollectionOfPrimitiveValues("names", this.getNames());
        writer.writeStringValue("riskScore", this.getRiskScore());
        writer.writeLongValue("size", this.getSize());
        writer.writeCollectionOfPrimitiveValues("tags", this.getTags());
        writer.writeObjectValue("vendorInformation", this.getVendorInformation());
        writer.writeCollectionOfObjectValues("vulnerabilityStates", this.getVulnerabilityStates());
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
     * Sets the certificateThumbprint property value. The certificateThumbprint property
     * @param value Value to set for the certificateThumbprint property.
     * @return a void
     */
    public void setCertificateThumbprint(@javax.annotation.Nullable final String value) {
        this._certificateThumbprint = value;
    }
    /**
     * Sets the extensions property value. The extensions property
     * @param value Value to set for the extensions property.
     * @return a void
     */
    public void setExtensions(@javax.annotation.Nullable final java.util.List<String> value) {
        this._extensions = value;
    }
    /**
     * Sets the fileType property value. The fileType property
     * @param value Value to set for the fileType property.
     * @return a void
     */
    public void setFileType(@javax.annotation.Nullable final String value) {
        this._fileType = value;
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
     * Sets the hashes property value. The hashes property
     * @param value Value to set for the hashes property.
     * @return a void
     */
    public void setHashes(@javax.annotation.Nullable final java.util.List<FileHash> value) {
        this._hashes = value;
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
     * Sets the malwareStates property value. The malwareStates property
     * @param value Value to set for the malwareStates property.
     * @return a void
     */
    public void setMalwareStates(@javax.annotation.Nullable final java.util.List<MalwareState> value) {
        this._malwareStates = value;
    }
    /**
     * Sets the names property value. The names property
     * @param value Value to set for the names property.
     * @return a void
     */
    public void setNames(@javax.annotation.Nullable final java.util.List<String> value) {
        this._names = value;
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
     * Sets the size property value. The size property
     * @param value Value to set for the size property.
     * @return a void
     */
    public void setSize(@javax.annotation.Nullable final Long value) {
        this._size = value;
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
    /**
     * Sets the vulnerabilityStates property value. The vulnerabilityStates property
     * @param value Value to set for the vulnerabilityStates property.
     * @return a void
     */
    public void setVulnerabilityStates(@javax.annotation.Nullable final java.util.List<VulnerabilityState> value) {
        this._vulnerabilityStates = value;
    }
}
