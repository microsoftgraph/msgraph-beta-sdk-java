package com.microsoft.graph.models.managedtenants;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of activityStatistics entities. */
public class ManagementTemplateCollectionTenantSummary extends Entity implements Parsable {
    /** The completeStepsCount property */
    private Integer _completeStepsCount;
    /** The completeUsersCount property */
    private Integer _completeUsersCount;
    /** The createdByUserId property */
    private String _createdByUserId;
    /** The createdDateTime property */
    private OffsetDateTime _createdDateTime;
    /** The dismissedStepsCount property */
    private Integer _dismissedStepsCount;
    /** The excludedUsersCount property */
    private Integer _excludedUsersCount;
    /** The excludedUsersDistinctCount property */
    private Integer _excludedUsersDistinctCount;
    /** The incompleteStepsCount property */
    private Integer _incompleteStepsCount;
    /** The incompleteUsersCount property */
    private Integer _incompleteUsersCount;
    /** The ineligibleStepsCount property */
    private Integer _ineligibleStepsCount;
    /** The isComplete property */
    private Boolean _isComplete;
    /** The lastActionByUserId property */
    private String _lastActionByUserId;
    /** The lastActionDateTime property */
    private OffsetDateTime _lastActionDateTime;
    /** The managementTemplateCollectionDisplayName property */
    private String _managementTemplateCollectionDisplayName;
    /** The managementTemplateCollectionId property */
    private String _managementTemplateCollectionId;
    /** The tenantId property */
    private String _tenantId;
    /**
     * Instantiates a new managementTemplateCollectionTenantSummary and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ManagementTemplateCollectionTenantSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managementTemplateCollectionTenantSummary
     */
    @javax.annotation.Nonnull
    public static ManagementTemplateCollectionTenantSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagementTemplateCollectionTenantSummary();
    }
    /**
     * Gets the completeStepsCount property value. The completeStepsCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCompleteStepsCount() {
        return this._completeStepsCount;
    }
    /**
     * Gets the completeUsersCount property value. The completeUsersCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCompleteUsersCount() {
        return this._completeUsersCount;
    }
    /**
     * Gets the createdByUserId property value. The createdByUserId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCreatedByUserId() {
        return this._createdByUserId;
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the dismissedStepsCount property value. The dismissedStepsCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDismissedStepsCount() {
        return this._dismissedStepsCount;
    }
    /**
     * Gets the excludedUsersCount property value. The excludedUsersCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getExcludedUsersCount() {
        return this._excludedUsersCount;
    }
    /**
     * Gets the excludedUsersDistinctCount property value. The excludedUsersDistinctCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getExcludedUsersDistinctCount() {
        return this._excludedUsersDistinctCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("completeStepsCount", (n) -> { this.setCompleteStepsCount(n.getIntegerValue()); });
        deserializerMap.put("completeUsersCount", (n) -> { this.setCompleteUsersCount(n.getIntegerValue()); });
        deserializerMap.put("createdByUserId", (n) -> { this.setCreatedByUserId(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("dismissedStepsCount", (n) -> { this.setDismissedStepsCount(n.getIntegerValue()); });
        deserializerMap.put("excludedUsersCount", (n) -> { this.setExcludedUsersCount(n.getIntegerValue()); });
        deserializerMap.put("excludedUsersDistinctCount", (n) -> { this.setExcludedUsersDistinctCount(n.getIntegerValue()); });
        deserializerMap.put("incompleteStepsCount", (n) -> { this.setIncompleteStepsCount(n.getIntegerValue()); });
        deserializerMap.put("incompleteUsersCount", (n) -> { this.setIncompleteUsersCount(n.getIntegerValue()); });
        deserializerMap.put("ineligibleStepsCount", (n) -> { this.setIneligibleStepsCount(n.getIntegerValue()); });
        deserializerMap.put("isComplete", (n) -> { this.setIsComplete(n.getBooleanValue()); });
        deserializerMap.put("lastActionByUserId", (n) -> { this.setLastActionByUserId(n.getStringValue()); });
        deserializerMap.put("lastActionDateTime", (n) -> { this.setLastActionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("managementTemplateCollectionDisplayName", (n) -> { this.setManagementTemplateCollectionDisplayName(n.getStringValue()); });
        deserializerMap.put("managementTemplateCollectionId", (n) -> { this.setManagementTemplateCollectionId(n.getStringValue()); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the incompleteStepsCount property value. The incompleteStepsCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getIncompleteStepsCount() {
        return this._incompleteStepsCount;
    }
    /**
     * Gets the incompleteUsersCount property value. The incompleteUsersCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getIncompleteUsersCount() {
        return this._incompleteUsersCount;
    }
    /**
     * Gets the ineligibleStepsCount property value. The ineligibleStepsCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getIneligibleStepsCount() {
        return this._ineligibleStepsCount;
    }
    /**
     * Gets the isComplete property value. The isComplete property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsComplete() {
        return this._isComplete;
    }
    /**
     * Gets the lastActionByUserId property value. The lastActionByUserId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLastActionByUserId() {
        return this._lastActionByUserId;
    }
    /**
     * Gets the lastActionDateTime property value. The lastActionDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastActionDateTime() {
        return this._lastActionDateTime;
    }
    /**
     * Gets the managementTemplateCollectionDisplayName property value. The managementTemplateCollectionDisplayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagementTemplateCollectionDisplayName() {
        return this._managementTemplateCollectionDisplayName;
    }
    /**
     * Gets the managementTemplateCollectionId property value. The managementTemplateCollectionId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagementTemplateCollectionId() {
        return this._managementTemplateCollectionId;
    }
    /**
     * Gets the tenantId property value. The tenantId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantId() {
        return this._tenantId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("completeStepsCount", this.getCompleteStepsCount());
        writer.writeIntegerValue("completeUsersCount", this.getCompleteUsersCount());
        writer.writeStringValue("createdByUserId", this.getCreatedByUserId());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeIntegerValue("dismissedStepsCount", this.getDismissedStepsCount());
        writer.writeIntegerValue("excludedUsersCount", this.getExcludedUsersCount());
        writer.writeIntegerValue("excludedUsersDistinctCount", this.getExcludedUsersDistinctCount());
        writer.writeIntegerValue("incompleteStepsCount", this.getIncompleteStepsCount());
        writer.writeIntegerValue("incompleteUsersCount", this.getIncompleteUsersCount());
        writer.writeIntegerValue("ineligibleStepsCount", this.getIneligibleStepsCount());
        writer.writeBooleanValue("isComplete", this.getIsComplete());
        writer.writeStringValue("lastActionByUserId", this.getLastActionByUserId());
        writer.writeOffsetDateTimeValue("lastActionDateTime", this.getLastActionDateTime());
        writer.writeStringValue("managementTemplateCollectionDisplayName", this.getManagementTemplateCollectionDisplayName());
        writer.writeStringValue("managementTemplateCollectionId", this.getManagementTemplateCollectionId());
        writer.writeStringValue("tenantId", this.getTenantId());
    }
    /**
     * Sets the completeStepsCount property value. The completeStepsCount property
     * @param value Value to set for the completeStepsCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompleteStepsCount(@javax.annotation.Nullable final Integer value) {
        this._completeStepsCount = value;
    }
    /**
     * Sets the completeUsersCount property value. The completeUsersCount property
     * @param value Value to set for the completeUsersCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompleteUsersCount(@javax.annotation.Nullable final Integer value) {
        this._completeUsersCount = value;
    }
    /**
     * Sets the createdByUserId property value. The createdByUserId property
     * @param value Value to set for the createdByUserId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedByUserId(@javax.annotation.Nullable final String value) {
        this._createdByUserId = value;
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the dismissedStepsCount property value. The dismissedStepsCount property
     * @param value Value to set for the dismissedStepsCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDismissedStepsCount(@javax.annotation.Nullable final Integer value) {
        this._dismissedStepsCount = value;
    }
    /**
     * Sets the excludedUsersCount property value. The excludedUsersCount property
     * @param value Value to set for the excludedUsersCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExcludedUsersCount(@javax.annotation.Nullable final Integer value) {
        this._excludedUsersCount = value;
    }
    /**
     * Sets the excludedUsersDistinctCount property value. The excludedUsersDistinctCount property
     * @param value Value to set for the excludedUsersDistinctCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExcludedUsersDistinctCount(@javax.annotation.Nullable final Integer value) {
        this._excludedUsersDistinctCount = value;
    }
    /**
     * Sets the incompleteStepsCount property value. The incompleteStepsCount property
     * @param value Value to set for the incompleteStepsCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncompleteStepsCount(@javax.annotation.Nullable final Integer value) {
        this._incompleteStepsCount = value;
    }
    /**
     * Sets the incompleteUsersCount property value. The incompleteUsersCount property
     * @param value Value to set for the incompleteUsersCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncompleteUsersCount(@javax.annotation.Nullable final Integer value) {
        this._incompleteUsersCount = value;
    }
    /**
     * Sets the ineligibleStepsCount property value. The ineligibleStepsCount property
     * @param value Value to set for the ineligibleStepsCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIneligibleStepsCount(@javax.annotation.Nullable final Integer value) {
        this._ineligibleStepsCount = value;
    }
    /**
     * Sets the isComplete property value. The isComplete property
     * @param value Value to set for the isComplete property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsComplete(@javax.annotation.Nullable final Boolean value) {
        this._isComplete = value;
    }
    /**
     * Sets the lastActionByUserId property value. The lastActionByUserId property
     * @param value Value to set for the lastActionByUserId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastActionByUserId(@javax.annotation.Nullable final String value) {
        this._lastActionByUserId = value;
    }
    /**
     * Sets the lastActionDateTime property value. The lastActionDateTime property
     * @param value Value to set for the lastActionDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastActionDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastActionDateTime = value;
    }
    /**
     * Sets the managementTemplateCollectionDisplayName property value. The managementTemplateCollectionDisplayName property
     * @param value Value to set for the managementTemplateCollectionDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagementTemplateCollectionDisplayName(@javax.annotation.Nullable final String value) {
        this._managementTemplateCollectionDisplayName = value;
    }
    /**
     * Sets the managementTemplateCollectionId property value. The managementTemplateCollectionId property
     * @param value Value to set for the managementTemplateCollectionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagementTemplateCollectionId(@javax.annotation.Nullable final String value) {
        this._managementTemplateCollectionId = value;
    }
    /**
     * Sets the tenantId property value. The tenantId property
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this._tenantId = value;
    }
}
