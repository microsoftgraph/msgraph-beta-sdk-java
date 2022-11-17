package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of activityStatistics entities. */
public class AccessPackageAssignmentPolicy extends Entity implements Parsable {
    /** The access package with this policy. Read-only. Nullable. Supports $expand. */
    private AccessPackage _accessPackage;
    /** The accessPackageCatalog property */
    private AccessPackageCatalog _accessPackageCatalog;
    /** Identifier of the access package. */
    private String _accessPackageId;
    /** Who must review, and how often, the assignments to the access package from this policy. This property is null if reviews are not required. */
    private AssignmentReviewSettings _accessReviewSettings;
    /** Indicates whether a user can extend the access package assignment duration after approval. */
    private Boolean _canExtend;
    /** The createdBy property */
    private String _createdBy;
    /** The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime _createdDateTime;
    /** The collection of stages when to execute one or more custom access package workflow extensions. Supports $expand. */
    private java.util.List<CustomExtensionHandler> _customExtensionHandlers;
    /** The description of the policy. */
    private String _description;
    /** The display name of the policy. Supports $filter (eq). */
    private String _displayName;
    /** The number of days in which assignments from this policy last until they are expired. */
    private Integer _durationInDays;
    /** The expiration date for assignments created in this policy. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime _expirationDateTime;
    /** The modifiedBy property */
    private String _modifiedBy;
    /** The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime _modifiedDateTime;
    /** Questions that are posed to the  requestor. */
    private java.util.List<AccessPackageQuestion> _questions;
    /** Who must approve requests for access package in this policy. */
    private ApprovalSettings _requestApprovalSettings;
    /** Who can request this access package from this policy. */
    private RequestorSettings _requestorSettings;
    /**
     * Instantiates a new accessPackageAssignmentPolicy and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccessPackageAssignmentPolicy() {
        super();
        this.setOdataType("#microsoft.graph.accessPackageAssignmentPolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackageAssignmentPolicy
     */
    @javax.annotation.Nonnull
    public static AccessPackageAssignmentPolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageAssignmentPolicy();
    }
    /**
     * Gets the accessPackage property value. The access package with this policy. Read-only. Nullable. Supports $expand.
     * @return a accessPackage
     */
    @javax.annotation.Nullable
    public AccessPackage getAccessPackage() {
        return this._accessPackage;
    }
    /**
     * Gets the accessPackageCatalog property value. The accessPackageCatalog property
     * @return a accessPackageCatalog
     */
    @javax.annotation.Nullable
    public AccessPackageCatalog getAccessPackageCatalog() {
        return this._accessPackageCatalog;
    }
    /**
     * Gets the accessPackageId property value. Identifier of the access package.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAccessPackageId() {
        return this._accessPackageId;
    }
    /**
     * Gets the accessReviewSettings property value. Who must review, and how often, the assignments to the access package from this policy. This property is null if reviews are not required.
     * @return a assignmentReviewSettings
     */
    @javax.annotation.Nullable
    public AssignmentReviewSettings getAccessReviewSettings() {
        return this._accessReviewSettings;
    }
    /**
     * Gets the canExtend property value. Indicates whether a user can extend the access package assignment duration after approval.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCanExtend() {
        return this._canExtend;
    }
    /**
     * Gets the createdBy property value. The createdBy property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCreatedBy() {
        return this._createdBy;
    }
    /**
     * Gets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the customExtensionHandlers property value. The collection of stages when to execute one or more custom access package workflow extensions. Supports $expand.
     * @return a customExtensionHandler
     */
    @javax.annotation.Nullable
    public java.util.List<CustomExtensionHandler> getCustomExtensionHandlers() {
        return this._customExtensionHandlers;
    }
    /**
     * Gets the description property value. The description of the policy.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The display name of the policy. Supports $filter (eq).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the durationInDays property value. The number of days in which assignments from this policy last until they are expired.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDurationInDays() {
        return this._durationInDays;
    }
    /**
     * Gets the expirationDateTime property value. The expiration date for assignments created in this policy. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this._expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AccessPackageAssignmentPolicy currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("accessPackage", (n) -> { currentObject.setAccessPackage(n.getObjectValue(AccessPackage::createFromDiscriminatorValue)); });
            this.put("accessPackageCatalog", (n) -> { currentObject.setAccessPackageCatalog(n.getObjectValue(AccessPackageCatalog::createFromDiscriminatorValue)); });
            this.put("accessPackageId", (n) -> { currentObject.setAccessPackageId(n.getStringValue()); });
            this.put("accessReviewSettings", (n) -> { currentObject.setAccessReviewSettings(n.getObjectValue(AssignmentReviewSettings::createFromDiscriminatorValue)); });
            this.put("canExtend", (n) -> { currentObject.setCanExtend(n.getBooleanValue()); });
            this.put("createdBy", (n) -> { currentObject.setCreatedBy(n.getStringValue()); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("customExtensionHandlers", (n) -> { currentObject.setCustomExtensionHandlers(n.getCollectionOfObjectValues(CustomExtensionHandler::createFromDiscriminatorValue)); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("durationInDays", (n) -> { currentObject.setDurationInDays(n.getIntegerValue()); });
            this.put("expirationDateTime", (n) -> { currentObject.setExpirationDateTime(n.getOffsetDateTimeValue()); });
            this.put("modifiedBy", (n) -> { currentObject.setModifiedBy(n.getStringValue()); });
            this.put("modifiedDateTime", (n) -> { currentObject.setModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("questions", (n) -> { currentObject.setQuestions(n.getCollectionOfObjectValues(AccessPackageQuestion::createFromDiscriminatorValue)); });
            this.put("requestApprovalSettings", (n) -> { currentObject.setRequestApprovalSettings(n.getObjectValue(ApprovalSettings::createFromDiscriminatorValue)); });
            this.put("requestorSettings", (n) -> { currentObject.setRequestorSettings(n.getObjectValue(RequestorSettings::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the modifiedBy property value. The modifiedBy property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getModifiedBy() {
        return this._modifiedBy;
    }
    /**
     * Gets the modifiedDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getModifiedDateTime() {
        return this._modifiedDateTime;
    }
    /**
     * Gets the questions property value. Questions that are posed to the  requestor.
     * @return a accessPackageQuestion
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackageQuestion> getQuestions() {
        return this._questions;
    }
    /**
     * Gets the requestApprovalSettings property value. Who must approve requests for access package in this policy.
     * @return a approvalSettings
     */
    @javax.annotation.Nullable
    public ApprovalSettings getRequestApprovalSettings() {
        return this._requestApprovalSettings;
    }
    /**
     * Gets the requestorSettings property value. Who can request this access package from this policy.
     * @return a requestorSettings
     */
    @javax.annotation.Nullable
    public RequestorSettings getRequestorSettings() {
        return this._requestorSettings;
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
        writer.writeObjectValue("accessPackage", this.getAccessPackage());
        writer.writeObjectValue("accessPackageCatalog", this.getAccessPackageCatalog());
        writer.writeStringValue("accessPackageId", this.getAccessPackageId());
        writer.writeObjectValue("accessReviewSettings", this.getAccessReviewSettings());
        writer.writeBooleanValue("canExtend", this.getCanExtend());
        writer.writeStringValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeCollectionOfObjectValues("customExtensionHandlers", this.getCustomExtensionHandlers());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeIntegerValue("durationInDays", this.getDurationInDays());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeStringValue("modifiedBy", this.getModifiedBy());
        writer.writeOffsetDateTimeValue("modifiedDateTime", this.getModifiedDateTime());
        writer.writeCollectionOfObjectValues("questions", this.getQuestions());
        writer.writeObjectValue("requestApprovalSettings", this.getRequestApprovalSettings());
        writer.writeObjectValue("requestorSettings", this.getRequestorSettings());
    }
    /**
     * Sets the accessPackage property value. The access package with this policy. Read-only. Nullable. Supports $expand.
     * @param value Value to set for the accessPackage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccessPackage(@javax.annotation.Nullable final AccessPackage value) {
        this._accessPackage = value;
    }
    /**
     * Sets the accessPackageCatalog property value. The accessPackageCatalog property
     * @param value Value to set for the accessPackageCatalog property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccessPackageCatalog(@javax.annotation.Nullable final AccessPackageCatalog value) {
        this._accessPackageCatalog = value;
    }
    /**
     * Sets the accessPackageId property value. Identifier of the access package.
     * @param value Value to set for the accessPackageId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccessPackageId(@javax.annotation.Nullable final String value) {
        this._accessPackageId = value;
    }
    /**
     * Sets the accessReviewSettings property value. Who must review, and how often, the assignments to the access package from this policy. This property is null if reviews are not required.
     * @param value Value to set for the accessReviewSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccessReviewSettings(@javax.annotation.Nullable final AssignmentReviewSettings value) {
        this._accessReviewSettings = value;
    }
    /**
     * Sets the canExtend property value. Indicates whether a user can extend the access package assignment duration after approval.
     * @param value Value to set for the canExtend property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCanExtend(@javax.annotation.Nullable final Boolean value) {
        this._canExtend = value;
    }
    /**
     * Sets the createdBy property value. The createdBy property
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedBy(@javax.annotation.Nullable final String value) {
        this._createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the customExtensionHandlers property value. The collection of stages when to execute one or more custom access package workflow extensions. Supports $expand.
     * @param value Value to set for the customExtensionHandlers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomExtensionHandlers(@javax.annotation.Nullable final java.util.List<CustomExtensionHandler> value) {
        this._customExtensionHandlers = value;
    }
    /**
     * Sets the description property value. The description of the policy.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The display name of the policy. Supports $filter (eq).
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the durationInDays property value. The number of days in which assignments from this policy last until they are expired.
     * @param value Value to set for the durationInDays property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDurationInDays(@javax.annotation.Nullable final Integer value) {
        this._durationInDays = value;
    }
    /**
     * Sets the expirationDateTime property value. The expiration date for assignments created in this policy. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the expirationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._expirationDateTime = value;
    }
    /**
     * Sets the modifiedBy property value. The modifiedBy property
     * @param value Value to set for the modifiedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setModifiedBy(@javax.annotation.Nullable final String value) {
        this._modifiedBy = value;
    }
    /**
     * Sets the modifiedDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the modifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._modifiedDateTime = value;
    }
    /**
     * Sets the questions property value. Questions that are posed to the  requestor.
     * @param value Value to set for the questions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQuestions(@javax.annotation.Nullable final java.util.List<AccessPackageQuestion> value) {
        this._questions = value;
    }
    /**
     * Sets the requestApprovalSettings property value. Who must approve requests for access package in this policy.
     * @param value Value to set for the requestApprovalSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequestApprovalSettings(@javax.annotation.Nullable final ApprovalSettings value) {
        this._requestApprovalSettings = value;
    }
    /**
     * Sets the requestorSettings property value. Who can request this access package from this policy.
     * @param value Value to set for the requestorSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequestorSettings(@javax.annotation.Nullable final RequestorSettings value) {
        this._requestorSettings = value;
    }
}
